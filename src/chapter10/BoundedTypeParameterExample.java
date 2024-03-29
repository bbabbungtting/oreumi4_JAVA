package chapter10;

public class BoundedTypeParameterExample {
    public static void main(String[] args) {
        int result1 = compare(1, 2);
        System.out.println(result1);

        int result2 = compare(4.5, 3);
        System.out.println(result2);

    }

    public static <T extends Number> int compare(T t1, T t2){
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return Double.compare(v1, v2);
    }
}
