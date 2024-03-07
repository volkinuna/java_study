package ch14.sec03.exam01;

import java.awt.*;

public class BeepPrintExample {
    public static void main(String[] args) throws InterruptedException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        for (int i = 0; i < 5; i++) {
            toolkit.beep(); // 비프음 발생
            Thread.sleep(500); // 1초 = 1000
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            Thread.sleep(500);
        }
    }
}
