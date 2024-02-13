package ch04.sec08;

public class ContinueExample {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) continue; // 홀수일때 아래 코드 실행하지 않고 다시 돌아간다.
            System.out.println("짝수 : " + i);
        }
    }
}
