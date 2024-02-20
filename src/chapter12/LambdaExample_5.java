package chapter12;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.Stream;

public class LambdaExample_5 {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(IntBinaryOperator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.applyAsInt(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(
                (a, b) -> a > b ? a : b
                //Math::max
        );
        System.out.println("최대값 : " + max);

        int min = maxOrMin(
                (a, b) -> a < b ? a : b
                //Math::min
        );
        System.out.println("최소값: " + min);

        Integer[][] arr2 = {{1,2}, {2,3}};
        Stream<Integer> arr1 = Arrays.stream(arr2)
                .flatMap(Arrays::stream);

        arr1.forEach(System.out::println);

    }


}
