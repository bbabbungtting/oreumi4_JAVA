import java.util.*;

public class FirstMain {
    public static void main(String[] args) {
        int start_num = 3;
        int end_num = 10;

        int gap = end_num - start_num;

        int[] answer = new int[gap + 1];

        for (int i = 0; i <= gap; i++) {
            answer[i] = i + start_num;
        }


    }
}
