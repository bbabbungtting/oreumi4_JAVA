package weeklyquiz.week3.view;

public class OutputView {
    public void printMenu(){
        StringBuilder builder = new StringBuilder();

        builder.append("1. 비즈니스 연락처 추가\n");
        builder.append("2. 개인 연락처 추가\n");
        builder.append("3. 연락처 출력\n");
        builder.append("4. 연락처 검색\n");
        builder.append("5. 종료");

        System.out.println(builder.toString());
    }

    public void printError(String errorMessage){
        System.out.println(errorMessage);
    }

}
