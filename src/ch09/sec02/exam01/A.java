package ch09.sec02.exam01;

public class A {
    // 인스턴스 멤버 클래스
    class B {
        // 필드, 메소드, 생성자
        public void method2() {}
    }

    // 필스(B객체 대입)에서 사용
    B field = new B();

    // 생성자(B객체 생성)에서 사용
    A() {
        B b = new B();
    }

    // 메소드(B객체 생성)에서 사용
    void method() {
        B b = new B();
    }
}
