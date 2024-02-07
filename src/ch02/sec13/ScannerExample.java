package ch02.sec13;

import java.util.Scanner; // 이게 있어야 Scanner 사용가능

public class ScannerExample {
    public static void main(String[] args) {

        // 1. Scanner 객체 생성
        // 자바에서 객체 생성시 new라는 키워드를 사용하여 객체를 생성한다.
        // 참조타입 변수명 = new 객체 <- 객체를 저장할 수 있는 모든 타입은 참조타입이다.
        Scanner scanner = new Scanner(System.in);

        // 2. scanner에서 값 입력받기
        System.out.print("x값 입력 : ");
        String strX = scanner.nextLine();

        System.out.print("y값 입력 : ");
        String strY = scanner.nextLine();

        int result = Integer.parseInt(strX) + Integer.parseInt(strY);
        System.out.println("x + y = " + result);
        
        // q를 입력했을때 프로그램이 끝나도록 만들기
        while (true) {
            System.out.print("입력 문자열 : ");
            String data = scanner.nextLine();
            
            // data에 입력된 값이 q인가?
            if(data.equals("q")) {
                break; // while문 중단
            }

            System.out.println("출력 문자열 : " + data);
        }
        
        // while문 탈출 후 찍는 문자
        System.out.println("프로그램 종료");
    }
}
