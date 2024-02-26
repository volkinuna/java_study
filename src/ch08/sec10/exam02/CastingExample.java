package ch08.sec10.exam02;

public class CastingExample {
    public static void main(String[] args) {

        Vehicle vehicle = new Bus(); // 자동타입변환
        vehicle.run();
        //vehicle.checkFare(); // 자식 고유의 메소드는 실행할 수 없다.

        // 자식 클래스의 메소드를 호출하기위해 강제타입변환
        Bus bus = (Bus) vehicle;
        bus.run();
        bus.checkFare();
    }
}
