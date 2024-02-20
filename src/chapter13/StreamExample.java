package chapter13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //1번
        List<Integer> integerList = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);

        List<String> stringList = integerList.stream()
                .distinct()
                .map(Object::toString)
                .collect(Collectors.toList());

        System.out.println(stringList);

        //2번
        List<Member> memberList = new ArrayList<>();

        memberList.add(new Member("손흥민", "white", 31));
        memberList.add(new Member("박지성", "red", 42));
        memberList.add(new Member("차범근", "black", 65));

        List<Person> personList = memberList.stream()
                .map(e -> new Person(e.getName(),e.getAge()))
                .collect(Collectors.toList());
        System.out.println(personList);


    }

    public static class Person{
        private String name;
        private int age;

        public Person(String anme, int age){
            this.name = name;
            this.age = age;
        }
    }

    public static class Member {
        private String name;
        private String favoriteColor;
        private int age;

        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Member(String name, String favoriteColor, int age) {
            this.name = name;
            this.favoriteColor = favoriteColor;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getFavoriteColor() {
            return favoriteColor;
        }

        public int getAge() {
            return age;
        }

    }


}
