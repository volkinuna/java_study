package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {

        // 자동타입변환
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        // 자동타입변환시 자식 클래스의 필드와 메소스는 사용할 수 없다.
//        parent.field2 = "data2";
//        parent.method3();

        // 자식 클래스에 있는 멤버를 사용하기위해 강제타입변환 진행
        Child child = (Child) parent;

        child.field2 = "data3";
        child.method3();

        // 강제타입변환시 부모 클래스에 있는 것도 사용 가능
        child.field1 = "data1";
        child.method1();
        child.method2();
    }
}
