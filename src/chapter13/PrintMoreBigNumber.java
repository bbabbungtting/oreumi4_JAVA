package chapter13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrintMoreBigNumber {
    public List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();

        // 코드 작성
        /*
        int prev = array[0] - 1;
        for (int i = 0; i < n; i++) {
            if(prev < array[i]){
                answer.add(array[i]);
            }
            prev = array[i];
        }

         */
        answer.add(array[0]);
        answer.addAll(
                IntStream.range(1, array.length)
                        .filter(i -> array[i] > array[i - 1])
                        .mapToObj(i -> array[i])
                        .toList()
        );


        return answer;
    }

    public static void main(String[] args) {
        PrintMoreBigNumber printMoreBigNumber = new PrintMoreBigNumber();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        for (int x : printMoreBigNumber.solution(number, array)) {
            System.out.print(x + " ");
        }
    }
}
