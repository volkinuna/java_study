package ch02.sec02;

public class IntergerLiteralExample {
    public static void main(String[] args) {

        // 2진수(0과 1로 작성) = 1011 -> 0b를 붙여서 작성
        int var1 = 0b1011; // 10진수 = 11
        System.out.println(var1);

        // 8진수(0~7사이의 숫자로 작성) = 206 -> 0을 붙여서 작성
        int var2 = 0206; // 10진수 = 134
        System.out.println(var2);

        // 16진수(0~9사이의 숫자와 a~f까지의 문자로 작성) = B3 -> 0x를 붙여서 작성
        int var3 = 0xB3; // 10진수 = 179
        System.out.println(var3);
    }
}
