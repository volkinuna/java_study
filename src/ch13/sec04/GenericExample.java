package ch13.sec04;

public class GenericExample {
    public static void main(String[] args) {
        boolean result1 = compare(10, 20);
        System.out.println(result1);

        boolean result2 = compare(4.5, 4.5);
        System.out.println(result2);
    }

    public static <T extends Number> boolean compare(T t1, T t2) {
        double v1 = t1.doubleValue(); // Integer 클래스 안의 doubleValue() // doubleValue() : double 타입으로 변경
        double v2 = t2.doubleValue(); // Double 클래스 안의 doubleValue()

        return (v1 == v2);
    }
}
