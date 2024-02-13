package ch04.sec03;

public class SwitchValueExample {
    public static void main(String[] args) {

        // java11 이전 switch 문법
        int score1 = 0;
        String grade = "A";

        switch (grade) {
            case "A":
                score1 = 100;
                break;
            case "B":
                int result = 100 - 20;
                score1 = result;
                break;
            default:
                score1 = 60;
        }

        // java12부터 가능
        int score2 = switch (grade) {
            case "A" -> 100; // 단일 값 저장시
            case "B" -> {
                int result = 100 - 20;
                yield result; // 연산식이나 다른 코드 실행 후 값을 저장해야할시 yield를 사용
            }
            default -> 60;
        };

        System.out.println("score2 : " + score2);
    }
}
