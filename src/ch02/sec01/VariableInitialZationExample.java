package ch02.sec01;

public class VariableInitialZationExample {
    public static void main(String[] args) {
        
        // 변수 선언(메모리에 값이 할당되지 않는다.)
        int value;

        value = 20; // 메모리에 값이 할당된다.
        
        // 변수 선언과 동시에 값 할당
        // 변수 선언과 동시에 메모리에 값이 할당된다.
        int value2 = 10;

        // ctrl + d = 라인 복사
        System.out.println("value 값: " + value);
        System.out.println("value2 값: " + value2);

    }
}
