import java.util.*;

public class FirstMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("손흥민");
        list.add("이강인");
        list.add("황희찬");
        list.add("박용우");
        list.remove("박용우");
        list.add("조현우");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
