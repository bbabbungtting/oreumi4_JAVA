package chapter11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("요소1");
        stringSet.add("요소2");
        stringSet.add("요소3");
        stringSet.add("요소1");

        System.out.println(stringSet);

        Iterator<String> iterator = stringSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
