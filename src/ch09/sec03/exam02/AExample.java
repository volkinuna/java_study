package ch09.sec03.exam02;

public class AExample {
    public static void main(String[] args) {
        // B객체 생성
        A.B b = new A.B();
        
        // 정적 멤버 클래스의 인스턴스 필드, 인스턴스 메소드 사용
        System.out.println(b.field1);
        b.method1();
        
        // 정적 멤버 클래스의 정적 필드, 정적 메소드 사용
        System.out.println(A.B.field2);
        A.B.method2();
    }
}
