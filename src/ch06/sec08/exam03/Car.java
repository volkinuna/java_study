package ch06.sec08.exam03;

public class Car {

    // 필드
    int gas; // 기름양

    // 메소드
    // 1. 기름 주유하는 메소드
    void setGas(int gas) {
        this.gas = gas;
    }

    // 2. 기름양이 있는지 없는지 출력하는 메소드
    boolean isLeftGas() {
        if (gas == 0) {
            System.out.println("기름이 없습니다.");
            return false;
        } else {
            System.out.println("기름이 있습니다.");
            return true;
        }
    }

    // 3. 자동차가 달리면서 기름을 소진하는 메소드
    void run() {
        while (true) {
            if (gas > 0) {
                System.out.println("달립니다. (gas 잔량 : " + gas + ")");
                // 차가 달리때마다 기름을 1씩 소진시킴
                gas -= 1;
            } else { // 기름이 없으면
                System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
                return; // void 메소드를 종료시키고 싶을때 사용
            }
        }
    }
}
