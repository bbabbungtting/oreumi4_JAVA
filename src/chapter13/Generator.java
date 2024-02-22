package chapter13;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.nio.file.Files.list;

public class Generator {
    public static void main(String[] args) throws IOException {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<String> strStream = Stream.of("a","b","c");
        Stream<Double> randomStream = Stream.generate(Math::random);

        //스트림만들기 - 컬렉션
        List<Integer> integerList = Arrays.asList(1,2,3,4,5);
        Stream<Integer> integerStream = list.stream();

        integerStream.forEach(System.out::print);

        //재생성 후에 스트림 재사용 가능하다.
        integerStream = list.stream();
        integerStream.forEach(System.out::print);


        //스트림만들기 - 배열
        //Stream<T>
        Stream<String> stringStream1 = Stream.of("a", "b", "c");//가변인자
        Stream<String> stringStream2 = Stream.of(new String[] {"a", "b","c"});
        Stream<String> stringStream3 = Arrays.stream(new String[]{"a","b","c"});

        //IntStream
        IntStream intArr1 = IntStream.of(1, 2, 3, 4);
        int[] intArr = {1, 2, 3, 4};
        IntStream intArr2 = IntStream.of(intArr);
        IntStream intArr3 = Arrays.stream(intArr);

        System.out.println("-------------------");

        //스트림만들기 - 파일과 빈스트림
        Stream<Path> files = Files.list(Paths.get("./resources/"));
        files.map(Path::getFileName)
                .forEach(System.out::println);

        Stream<String> fileStream = Files.lines(Paths.get("./resources/1.txt"), Charset.forName("UTF-8"));
        fileStream.forEach(System.out::println);


    }
}
