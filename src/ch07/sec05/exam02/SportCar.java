package ch07.sec05.exam02;

public class SportCar extends Car{

    @Override
    public void speedUp() {
        speed += 10;
    }

    /*
    @Override
    public final void stop() { <- final이 붙은 stip()는 재정의 불가
        System.out.println("스포츠카를 멈춤");
        speed = 0;
    }
    */
}
