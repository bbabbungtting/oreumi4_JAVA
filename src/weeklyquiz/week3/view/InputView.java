package weeklyquiz.week3.view;

import java.util.Scanner;

public class InputView {
    Scanner sc = new Scanner(System.in);

    public String inputMenu(){
        System.out.println("메뉴를 선택해주세요: ");

        return sc.nextLine();
    }

}
