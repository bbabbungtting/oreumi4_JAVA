package weeklyquiz.week3.domain;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void display(){
        System.out.print("이름: " + name + ", 전화번호: " + phoneNumber);
    }

    public String getName() {
        return name;
    }
}
