package weeklyquiz.week3.view;

import java.util.Scanner;

public class InputView {
    Scanner sc = new Scanner(System.in);

    public String inputMenu(){
        System.out.print("메뉴를 선택해주세요: ");

        return sc.nextLine();
    }

    public String inputName(){
        System.out.print("이름을 입력하세요: ");
        return sc.nextLine();
    }

    public String inputPhoneNumber(){
        System.out.print("전화번호를 입력하세요: ");
        return sc.nextLine();
    }

    public String inputCompanuy(){
        System.out.print("회사명을 입력하세요: ");
        return sc.nextLine();
    }

    public String inputRelationship(){
        System.out.print("관계를 입력하세요: ");
        return sc.nextLine();
    }

    public String inputSearchName(){
        System.out.print("검색할 이름을 입력하세요: ");
        return sc.nextLine();
    }

}
