package ch16.sec01;

public class LamdaExample {
    public static void main(String[] args) {
        action((x, y) -> { //구현부
            int result = x + y;
            System.out.println(result);
        });

        action((x, y) -> {
            int result = x - y;
            System.out.println(result);
        });
    }

    public static void action(Calculable calculable) {
        int x = 10;
        int y = 4;

        calculable.calculate(x, y); //구현부 실행
    }
}
