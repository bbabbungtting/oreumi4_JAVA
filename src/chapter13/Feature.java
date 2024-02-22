package chapter13;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Feature {
    public static void main(String[] args) {
        //feature1
        List<Integer> list = new ArrayList<>(Arrays.asList(3,1,5,4,2));
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());

        System.out.println(list);
        System.out.println(sortedList);

        //컬렉션 같은 경우
        list.remove(1);
        System.out.println("list = " + list);
        list.add(1000);
        System.out.println("list = " + list);

        //feature2
        Stream<String> strStream = Stream.of("a", "b", "c");
        strStream.forEach(System.out::println);

        strStream = Stream.of("a","b","c");
        long numOfStr = strStream.count();
        System.out.println(numOfStr);

        //feature3
        IntStream intStream1 = new Random().ints(1,46);
        intStream1.distinct().limit(6).sorted()  //중간 연산
                .forEach(i->System.out.print(i+","));   //최종 연산

        //feature4
        IntStream intStream2 = new Random().ints(1,46);
        intStream2.distinct()
                .limit(6)
                .peek(System.out::println)
                .sorted();

        //feature5
        List<String> list5 = Arrays.asList("홍길동", "오르미", "자바");
        Iterator<String> iterator = list5.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Stream<String> stream5 = list5.stream();
        stream5.forEach(System.out::println);
    }
}
