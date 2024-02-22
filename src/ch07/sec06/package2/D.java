package ch07.sec06.package2;

import ch07.sec06.package1.A;

public class D extends A {

    public D() {
        super(); // 부모 클래스의 생성자 호출
    }

    public void method1() {
        // 상속관계일때 protected 접근제한자가 있는 필드와 메소드를 사용할 수 있다.
        this.field = "value"; // super.field = "value";로 사용할 수도 있다.
        this.method(); // super.method();로 사용할 수도 있다.
    }

    public void method2() {
        // ★protected는 직접 객체를 생성해서 사용할 수는 없다.
//        A a = new A();
//        a.field = "value";
//        a.method();
    }
}
