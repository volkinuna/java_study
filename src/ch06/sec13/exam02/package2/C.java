package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.A;

public class C {

    // 필드 선언
    A a1 = new A(true);
    //A a2 = new A(1); <- 다른 패키지에서 접근 불가능
    //A a3 = new A("문자열"); <- 다른 클래스이므로 접근 불가능
}
