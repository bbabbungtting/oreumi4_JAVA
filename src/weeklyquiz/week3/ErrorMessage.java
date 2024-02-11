package weeklyquiz.week3;

public enum ErrorMessage {
    IS_NOT_MENU("없는 메뉴입니다. 다시 입력해 주세요.");

    private String message;

    ErrorMessage(String message){
        this.message = "[ERROR] " + message;
    }

    public String getMessage(){
        return message;
    }

}
