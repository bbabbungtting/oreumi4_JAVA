package chapter13;

import java.util.stream.IntStream;

public class Processor1 {
    public static void main(String[] args) {
        /*
        IntStream intStream = IntStream.of(1, 2, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10);
        //of 를 통해서 stream 생성
        intStream
                //중간 연산 (0 ~ n 번)
                .distinct().limit(5).sorted()
                //최종 연산(0 ~ 1번)
                .forEach(System.out::println);
         */

        //모든 과정을 나열했을 경우
        IntStream intStream = IntStream.of(1,2,2,2,3,3,4,5,6,7,8,9,10);
        IntStream distinct = intStream.distinct();
        IntStream limit = distinct.limit(5);
        IntStream sorted = limit.sorted();
        sorted.forEach(System.out::println);
    }
}
