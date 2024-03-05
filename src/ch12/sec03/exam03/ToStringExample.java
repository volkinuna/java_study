package ch12.sec03.exam03;

public class ToStringExample {
    public static void main(String[] args) {

        SmartPhone myPhone = new SmartPhone("apple", "ios");

        System.out.println(myPhone); // toString()을 오버라이드 하지 않으면 객체의 주소를 찍는다.
        System.out.println(myPhone.toString());

    }
}
