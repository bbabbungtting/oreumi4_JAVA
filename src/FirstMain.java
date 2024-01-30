import java.util.*;

public class FirstMain {
    public static void main(String args[]) {
        int numberToGuess = new Random().nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        int startNum = 1;
        int endNum = 100;
        int chance = 7;
        do {
            System.out.print("숫자를 추측해보세요 (" + startNum + "-" + endNum + "): ");
            guess = scanner.nextInt();
            // 조건문 입력해보기.
            if (guess < numberToGuess) {
                System.out.println(guess + "보다 큰 수 입니다!");
                startNum = guess + 1;
            }
            if (guess > numberToGuess) {
                System.out.println(guess + "보다 작은 수 입니다!");
                endNum = guess - 1;
            }
            if(guess != numberToGuess){
                System.out.println("남은 기회 :" + --chance);
            }
        } while (guess != numberToGuess && chance != 0); // 조건문 입력해보기
        if(chance == 0){
            System.out.println("실패입니다! 다시 도전하세요.");
        }else {
            System.out.println("축하합니다! 정답입니다.");
        }

        scanner.close();
    }
}
