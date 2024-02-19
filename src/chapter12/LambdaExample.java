package chapter12;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class LambdaExample {
    public static void main(String[] args) {
        Supplier<Integer> output = () -> 13;
        System.out.println(output.get());

        Function<String, Integer> f = y -> Integer.parseInt(y);

        Predicate<Integer> p = a -> {
            boolean is = false;
            is = a % 2 == 0;
            return is;
        };

        //생성자 참조
        List<Member> members = new ArrayList<>();

        Supplier<Member> f0 = Member::new;
        members.add(f0.get());

        Function<String, Member> f1 = Member::new;
        members.add(f1.apply("ID-1"));

        BiFunction<String, String, Member> f2 = Member::new;
        members.add(f2.apply("ID-2", "NAME-2"));

        for (Member member : members) {
            System.out.println(member.getId());
        }
    }

    boolean isEven(int x) {
        return x % 2 == 0;
    }
}
