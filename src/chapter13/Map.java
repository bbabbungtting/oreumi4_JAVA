package chapter13;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class Map {
    public static void main(String[] args) {
        //map
        File[] fileArr = {new File("Ex1.java"), new File("Ex1.bak"),new File("Ex1")};
        Stream<File> fileStream = Stream.of(fileArr);

        fileStream.map(File::getName)
                .peek(s->System.out.printf("filename1 = %s%n",s))
                .filter(s->s.indexOf('.')!=-1) //확장자 없는 것 제외
                .peek(s->System.out.printf("filename2 = %s%n",s))
                .map(s->s.substring(s.indexOf('.')+1))//확장자만 추출
                .peek(s->System.out.printf("extension = %s %n",s))
                .map(String::toUpperCase) //모두 대문잘 ㅗ변환
                .distinct()
                .forEach(s->System.out.printf("최종연산 = %s%n",s));

        //내부에서 순차적으로 진행된다.

        //flatMap
        Stream<String[]> strArrStrm = Stream.of(
                new String[]{"a","b","c"},
                new String[]{"A","B","C"}
        );
        Stream<String> stringStream = strArrStrm.flatMap(Arrays::stream);
        stringStream.forEach(System.out::println);
    }
}
