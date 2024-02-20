package ch06.sec14;

public class Car {

    private int speed;
    private boolean stop; // 자동차의 멈춤여부

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        //this.speed = speed;
        if(speed < 0) {
            // speed가 0 미만이면 필드의 값을 0으로 변경
            this.speed = 0;
            return; // 메소드를 끝낸다.
        } else {
            // speed가 0 이상이면 필드의 값을 매개변수 speed 값으로 변경
            this.speed = speed;
        }
    }

    public boolean isStop() { // boolean타입의 getter는 is로 생긴다.
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;

        // 차가 멈추면 speed를 0으로 만듬
        if(stop) this.speed = 0;
    }
}
