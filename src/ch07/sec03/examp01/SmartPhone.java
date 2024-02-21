package ch07.sec03.examp01;

public class SmartPhone extends Phone{

    public SmartPhone(String model, String color) {
        // 부모 객체의 생성자를 실행해준다.(부모 생성자에 매개변수가 없다면 생략 가능) : 생략하면 컴파일시 자동 추가됨
        // 부모 생성자에 매개변수가 있다면 생략 불가
        super(model, color);

//        this.model = model;
//        this.color = color;
        System.out.println("SmartPhone(String model, String color) 생성자 실행");
    }
}
