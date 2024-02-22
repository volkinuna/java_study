package ch07.sec10.exam02;

public class Dog extends Animal {

    // 추상메소드는 반드시 오버라이드 해야한다.
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
