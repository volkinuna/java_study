package ch07.sec08.exam01;

public class Car {
    
    // 필드로 다형성(오버라이드 + 자동타입변환)을 구현하는 방법
    // 필드에서 자동타입변환이 발생되도록 한다.
    public Tire tire; // 타입이 클래스인 필드
    
    public void run() {
        tire.roll();
    }
}
