package weeklyquiz.week3;

import weeklyquiz.week3.domain.*;
import weeklyquiz.week3.view.*;

public class Controller {
    private InputView inputView;
    private OutputView outputView;
    private AddressBook addressBook;

    Controller(){
        inputView = new InputView();
        outputView = new OutputView();
        addressBook = new AddressBook();
    }

    public void start(){
        while(true){
            if(function(selectMenu())){
                break;
            }
        }
    }

    private int selectMenu(){
        outputView.printMenu();
        return Integer.parseInt(inputView.inputMenu());
    }

    private boolean function(int menuNum){
        switch (menuNum){
            case 1:
                addBusinessContact();
                break;
            case 2:
                addPersonalContact();
                break;
            case 3:
                //addressBook.displayContacts();
                outputView.displayContacts(addressBook.getContacts());
                break;
            case 4:
                searchContact();
                break;
            case 5:
                return true;
            //1 ~ 5 이외의 숫자를 입력했을 경우
            default:
                outputView.printError(ErrorMessage.IS_NOT_MENU.getMessage());
                break;
        }
        return false;
    }

    private void addBusinessContact(){
        String name = inputView.inputName();
        String phoneNumber = inputView.inputPhoneNumber();
        String company = inputView.inputCompanuy();

        BusinessContact newContact = new BusinessContact(name,phoneNumber,company);

        addressBook.addContact(newContact);
    }

    private void addPersonalContact(){
        String name = inputView.inputName();
        String phoneNumber = inputView.inputPhoneNumber();
        String relationship = inputView.inputRelationship();

        PersonalContact newContact = new PersonalContact(name,phoneNumber,relationship);

        addressBook.addContact(newContact);
    }

    private void searchContact(){
        String name = inputView.inputSearchName();
        outputView.displaySearchContacts(addressBook.searchContact(name));
    }

}
