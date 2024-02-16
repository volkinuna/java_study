package ch06.sec08.exam04;

public class Calculator {

    // 정사각형의 너비를 구하는 메소드
    double areaRactangle(double width) {
        return width * width;
    }

    // 메소드 오버로딩
    // 직사각형의 너비를 구하는 메소드
    double areaRactangle(double width, double height) {
        return width * height;
    }
}
