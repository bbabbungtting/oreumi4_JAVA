package weeklyquiz.week3.domain;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook(){
        contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact newContact){
        contacts.add(newContact);
    }

    public List<Contact> searchContact(String name){
        List<Contact> matchContacts = new ArrayList<Contact>();

        for(Contact contact : contacts){
            if(name.equals(contact.getName())){
                matchContacts.add(contact);
            }
        }

        return matchContacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    /*
    //원래 주어진 출력 방식
    public void displayContacts(){
        if(contacts.isEmpty()){
            System.out.println("연락처가 비어있습니다.");
        }
        else{
            for(Contact contact : contacts){
                contact.display();
            }
        }
    }
     */
}
