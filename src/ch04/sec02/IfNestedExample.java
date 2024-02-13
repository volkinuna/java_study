package ch04.sec02;

public class IfNestedExample {
    public static void main(String[] args) {

        /*
        * 랜덤한 숫자를 구하는 공식
        * start부터 n개의 정수를 랜덤한 숫자로 구한다.
        * (int) (Math.random() * n) + start;
        */
        int sorce = (int) (Math.random() * 20) + 81; // 81~100까지의 랜덤한 숫자를 구한다.
        System.out.println("랜덤한 점수 : " + sorce);

        String grade;

        if (sorce >= 90) {
            if (sorce >= 95) grade = "A+";
            else grade = "A";
        } else {
            if (sorce >= 85) grade = "B+";
            else grade = "B";
        }

        System.out.println("학점 : " + grade);
    }
}
