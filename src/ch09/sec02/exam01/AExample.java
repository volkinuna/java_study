package ch09.sec02.exam01;

public class AExample {
    public static void main(String[] args) {
        // A객체 생성
        A a = new A();
        
        // B객체 생성
        // A객체를 생성해야 B객체를 생성할 수 있다.
        A.B b = a.new B();
    }
}
