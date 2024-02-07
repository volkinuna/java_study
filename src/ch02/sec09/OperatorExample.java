package ch02.sec09;

public class OperatorExample {
    public static void main(String[] args) {

        byte result1 = 10 + 20; // 컴파일 단계에서 연산을 수행하므로 byte result1 = 30;과 같다.
        System.out.println("result1 : " + result1);

        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2; // int 타입으로 변환 후 연산됨 -> int타입으로 바꿈
        // byte result3 = v1 + v2; <-는 불가, byte result2 = (byte) (v1 + v2);로 강제타입변환시 가능
        System.out.println("result2 : " + result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result4 = v3 + v4 + v5; // long타입으로 변환 후 연산됨 -> 값의 허용범위가 큰 타입으로 변환된다.
        System.out.println("result4 : " + result4);

        // 실수 + 실수 케이스
        float f1 = 1.2f;
        double d1 = 3.4;
        double result5 = f1 + d1; // double타입으로 변환 후 연산됨 -> 실수끼리 연산도 허용범위가 큰 타입으로 변환된다.
        System.out.println("result5 : " + result5);

        // 실수 + 정수 케이스
        int v9 = 10;
        double result6 = v9 / 4.0; // double타입(실수)으로 변환 후 연산됨
        float result7 = v9 / 4.0f; // float타입(실수)으로 변환 후 연산됨
        // 자바에서는 실수 리터럴을 double타입으로 인식하므로 4.0은 double타입
        System.out.println("result6 : " + result6);

        // char와 int의 연산
        char v6 = 'A'; // A의 유니코드 값은 65
        char v7 = 1;
        int result8 = v6 + v7; // int타입으로 변환 후 연산됨
        System.out.println("result8 : " + result8);
        System.out.println("result8 : " + (char)result8); // 유니코드 값 66은 B

        int x = 1;
        int y = 2;
        double result = x / y; // 정수 연산의 결과는 항상 정수
        System.out.println("result : " + result);

        // 0.5를 얻기위한 방법 1
        double result9 = (double) x / y;
        System.out.println("result9 : " + result9);

        // 0.5를 얻기위한 방법 2
        double result10 = x / (double) y;
        System.out.println("result10 : " + result10);

        // 0.5를 얻기위한 방법 3
        double result11 = (double) x / (double) y;
        System.out.println("result11 : " + result11);
    }
}
