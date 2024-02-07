package chapter9;

public class AccountExample {
    public static void main(String[] args) {
        Account sender = new Account();
        Account receiver = new Account();

        // 예금하기
        sender.deposit(30000);
        System.out.println("예금액: " + sender.getBalance());

        // 출금하기
        try {
            sender.withdraw(100000);
        } catch (BalanceInsufficientException e) {
            // 예외 발생 경로를 추적
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        //송금하기
        try{
            receiver.deposit(10000L);
            sender.withdraw(10000L);
        }catch(BalanceInsufficientException e){
            System.out.println(e.getMessage());
        }
    }
}
