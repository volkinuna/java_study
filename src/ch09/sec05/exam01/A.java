package ch09.sec05.exam01;

public class A {
    // A클래스의 인스턴스 필드, 메소드
    int field1;

    void method1() {}

    // A클래스의 정적 필드, 메소드
    static int field2;

    static  void method2() {}

    // 인스턴스 멤버 클래스
    class B {
        void method() {
            field1 = 10;
            method1();
            field2 = 10;
            method2();
        }
    }

    // 정적 멤버 클래스
    static class C {
        void method() {
            // 정적 멤버 클래스에서 바깥 클래스에 있는 인스턴스 필드, 메소드 접근 불가
            //field1 = 10;
            //method1();
            field2 = 10;
            method2();
        }
    }
}
