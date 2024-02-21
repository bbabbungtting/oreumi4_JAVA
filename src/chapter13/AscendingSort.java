package chapter13;

import java.util.*;
import java.util.stream.IntStream;

public class AscendingSort {
    public int[] solution(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        // 코드 작성
        /*
        int resultIndex = 0;
        for (int i = 0; i < array1.length; i++) {
            result[resultIndex] = array1[i];
            resultIndex++;
        }
        for (int i = 0; i < array2.length; i++) {
            result[resultIndex] = array2[i];
            resultIndex++;
        }

        Arrays.sort(result);

         */
        result = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .sorted()
                .toArray();


        List<Integer> list = new ArrayList();
        list.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(Integer::intValue)
                .max()
                .ifPresent(System.out::println);

        return result;
    }

    public static void main(String[] args) {
        AscendingSort ascendingSort = new AscendingSort();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = scanner.nextInt();
        }

        for (int x : ascendingSort.solution(array, array2)) {
            System.out.print(x + " ");
        }
    }
}
