package ch12.sec05;

import java.util.Arrays;

public class ByteToStringExample {
    public static void main(String[] args) {

        String data = "자바";

        // 네트워크에서 문자열을 전송시 byte 단위로 쪼개서 전송하기때문에 추후 많이 사용하게 됨.
        // String -> byte 배열(utf-8로 인코딩)
        byte[] arr1 = data.getBytes();
        System.out.println("arr1 : " + Arrays.toString(arr1)); // Arrays.toString() <- 배열의 내용을 문자열로 출력하는 메소드

        // byte 배열 -> String
        String str1 = new String(arr1);
        System.out.println("str1 : " + str1);
    }
}
