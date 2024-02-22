package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {

        Child child = new Child();

        // 자동 타입 변환
        Parent parent = child;

        // 메소드 호출
        // 자동타입변환이 일어나면 부모 클래스에 있는 필드와 메소드만 사용할 수 있다.
        // 단, 오버라이드 된 메소드는 예외적으로 자식 클래스에 있는 것을 사용한다.
        parent.method1();
        parent.method2();
        //parent.method3(); // 자식 클래스의 메소드는 사용할 수 없다.

        parent.field1 = 2;
        //parent.field2 = 2; // 자식 클래스의 필드도 사용할 수 없다.
    }
}
