package chapter13;

import java.util.Arrays;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,4,2,8,11);

        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
