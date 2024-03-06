package ch13.sec02.exam02;

import ch08.sec10.exam01.C;

public class CarAgency implements Rentable<Car> {
    @Override
    public Car rent() {
        return new Car();
    }
}
