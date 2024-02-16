package ch06.sec08.exam01;

public class Calculator {

    // 필드 생략
    // 생성자 생략

    // 메소드(기능)
    // 메소드의 앞에 return값의 타입을 명시

    // 전원 켜기
    // 리턴해줄 값이 없을때는 void 키워드를 사용
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    // 전원 끄기
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    // 더하기
    int plus(int x, int y) {
        int result = x + y;
        return result; // int형
    }

    // 나누기
    double divide(int x, int y) {
        double result = (double) x / y;
        return result;
    }

    // 빼기
    int minus(int x, int y) {
        int result = x - y;
        return result;
    }

    // 곱하기
    int multiply(int x, int y) {
        int result = x * y;
        return result;
    }

    // 내부 클래스에서도 메소드 호출 가능 => 객체 생성 필요없음
    void innerMethod() {
        powerOn();
        int result = plus(3, 5);
        System.out.println("내부 클래스 plus 결과 : " + result);
        powerOff();
    }
}
