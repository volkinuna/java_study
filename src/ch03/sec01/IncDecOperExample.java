package ch03.sec01;

public class IncDecOperExample {
    public static void main(String[] args) {

        int x = 10;
        int y = 10;
        int z;

        // 값 자체는 전위, 후위든 증가와 감소를 한다.
        x++;
        System.out.println("x = " + x); // 11
        ++x;
        System.out.println("x = " + x); // 12

        y--;
        System.out.println("y = " + y); // 9
        --y;
        System.out.println("y = " + y); // 8

        System.out.println("=======================");

        // 후위 연산자 : 선대입 후증가 (z에 x값을 먼저 대입 후 x값을 증가시킨다.)
        z = x++;
        System.out.println("z = " + z); // 12
        System.out.println("x = " + x); // 13

        // 전위 연산자 : 선증가 후대입 (x값을 증가시킨 후 z에 값을 대입한다.)
        z = ++x;
        System.out.println("z = " + z); // 14
        System.out.println("x = " + x); // 14

        z = ++x + y++;
        System.out.println("z = " + z); // 23
        System.out.println("x = " + x); // 15
        System.out.println("y = " + y); // 9
    }
}
