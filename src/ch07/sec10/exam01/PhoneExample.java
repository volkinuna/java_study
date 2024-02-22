package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {

        //Phone phone = new Phone(); <- Phone 클래스가 abstract 클래스라 객체를 생성할 수 없다.

        SmartPhone smartPhone = new SmartPhone("볼키");
        smartPhone.turnOn(); // Phone의 메소드
        smartPhone.internetSearch(); // SmartPhone의 메소드
        smartPhone.turnOff(); // Phone의 메소드
    }
}
