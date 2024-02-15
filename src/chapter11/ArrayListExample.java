package chapter11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // String 객체를 저장
        list.add("Java");
        list.add("Spring");
        list.add("Servlet/JSP");
        list.add("DBMS");
        list.add("JPA");

        int size = list.size();
        System.out.println("총 객체 수: " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("Skill 2: " + skill);
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
        System.out.println();

        list.remove(2);		// 2번 인덱스(Servlet/JSP) 삭제
        list.remove(2);		// 2번 인덱스(DBMS) 삭제
        list.remove("Java");

        for (int i = 0; i < list.size(); i++) {		// 저장된 총 객체 수만큼 루핑
            String str = list.get(i);
            System.out.println(i + ": " + str);
        }
    }
}
