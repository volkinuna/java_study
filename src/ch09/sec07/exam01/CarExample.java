package ch09.sec07.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.run1();
        car.run2();

        car.run3(new Tire() { // 한국타이어 클래스
            @Override
            public void roll() {
                System.out.println("한국타이어가 굴러갑니다.");
            }
        });
    }
}
