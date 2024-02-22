package ch07.sec08.exam01;

public class CarExample {
    public static void main(String[] args) {
        
        Car myCar = new Car();
        
        // 필드를 이용해 자동타입변환이 일어난다.
        myCar.tire = new HankookTire(); // Tire tire = new HankookTire();와 같다.
        myCar.run(); // tire.roll(); -> 오버라이드 된 메소드가 있으면 자식 클래스에 있는 메소드 사용

        myCar.tire = new KumhoTire(); // Tire tire = new KumhoTire();
        myCar.run(); // tire.roll(); -> 오버라이드 된 자식 클래스에 있는 메소드룰 사용한다.

        myCar.tire = new Tire(); // Tire tire = new Tire();
        myCar.run();
    }
}
