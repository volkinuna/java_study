package ch06.sec07.exam04;

public class Car {
    
    // 1. 필드
    String company = "현대자동차";
    String model = "업무용";
    String color;
    int maxSpeed;

    // 2. 생성자
    Car() {}
    Car(String model) {
        this(model, "은색", 250);
    }
    Car(String model, String color) {
        this(model, color,250);
    }
    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // 3. 메소드
}
