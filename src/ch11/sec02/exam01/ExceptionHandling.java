package ch11.sec02.exam01;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("[프로그램 시작]");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("[프로그램 종료]");

    }

    // 문자열의 길이 출력
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수 : " + result);
    }
}
