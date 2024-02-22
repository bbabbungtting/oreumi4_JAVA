package chapter13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FinalCalculate {
    public static void main(String[] args) {
        //forEach
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream()
                .filter(n->n%2==0)
                .forEach(System.out::println);

        System.out.println("-------------");
        //collect
        //toList()
        List<Integer> list2 = Arrays.asList(1,2,2,3,4,5);
        List<Integer> newList = list2.stream()
                .filter(n->n%2==0)
                .toList();
        newList.forEach(System.out::println);

    }
}
