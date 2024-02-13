package ch04.sec03;

public class SwitchNoBreakCase {
    public static void main(String[] args) {

        int time = (int) (Math.random() * 4) + 8; // 8~11시까지 랜덤한 시간
        System.out.println("[현재시간 : " + time + "시]");

        switch (time) { // switch(값) => 실수형, boolean 사용X
            case 8:
                System.out.println("출근합니다.");
                break;
            case 9:
                System.out.println("회의를 합니다.");
                break;
            case 10:
                System.out.println("업무를 봅니다.");
                break;
            default:
                System.out.println("외근을 나갑니다.");
        }
    }
}
