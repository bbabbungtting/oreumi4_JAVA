package weeklyquiz.week3;

import weeklyquiz.week3.view.InputView;
import weeklyquiz.week3.view.OutputView;

public class Controller {
    private InputView inputView;
    private OutputView outputView;

    Controller(){
        inputView = new InputView();
        outputView = new OutputView();
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
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
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

    }

    private void addPersonalContact(){

    }


}
