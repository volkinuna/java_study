package ch07.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {

        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        //Car car = new Car();
        //driver.drive(car);
        driver.drive(new Car());

    }
}
