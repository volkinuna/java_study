package ch11.sec02.exam02;

public class ExceptionHandling {
    public static void main(String[] args) {

        // 일반 예외는 반드시 예외처리 코드(try-catch문)를 작성해줘야 한다.
        try {
            Class.forName("java.lang.String"); // 해당 클래스가 존재하는지 찾는다.
            System.out.println("java.lang.String 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println();

        try {
        Class.forName("java.lang.String2");
            System.out.println("java.lang.String2 클래스가 존재합니다.");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
