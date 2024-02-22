package chapter13;

import java.util.*;
import java.util.stream.IntStream;

public class Distinct {
    public static void main(String[] args) {
        //distinct
        IntStream intStream = IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);
        intStream.distinct().forEach(n -> System.out.print(n + ", "));

        //filter
        IntStream intStream1 = IntStream.rangeClosed(1,10);
        intStream1.filter(i->i%2==0).forEach(n->System.out.print(n+ ","));

        System.out.println();
        System.out.println("filter 예제 2");

        IntStream intStream2 = IntStream.rangeClosed(1,10);
        intStream2
                .filter(i->i%2!=0 && i%3!=0)
                .forEach(n->System.out.print(n+", "));

        //filter 2번 사용이랑 filter 안에서 and 사용이랑 같은 결과를 나타낸다.
        System.out.println();
        System.out.println("filter 예제 3");
        IntStream intStream3 = IntStream.rangeClosed(1,10);
        intStream3
                .filter(i->i%2!=0)
                .filter(i->i%3!=0)
                .forEach(n-> System.out.println(n+","));

    }
}
