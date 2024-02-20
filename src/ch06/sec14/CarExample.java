package ch06.sec14;

public class CarExample {
    public static void main(String[] args) {

        Car myCar = new Car();

        //myCar.speed = -50;
        myCar.setSpeed(-50);
        System.out.println("현재 속도 : " + myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재 속도 : " + myCar.getSpeed());

        // 멈춤
        if(!myCar.isStop()) {
            // 차가 달리고 있다면 멈춘다.
            myCar.setStop(true);
        }
        System.out.println("현재 속도 : " + myCar.getSpeed());
    }
}
