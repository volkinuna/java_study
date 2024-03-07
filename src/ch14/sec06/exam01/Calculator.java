package ch14.sec06.exam01;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory1(int memory) throws InterruptedException { // 동기화 메소드
        this.memory = memory;
        Thread.sleep(2000);
        // 현재 실행되고있는 스레드의 이름과 memory 필드 값 출력
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
   }

    public void setMemory2(int memory) throws InterruptedException { 
        synchronized (this) { // 동기화 블록
            this.memory = memory;
            Thread.sleep(2000);
            // 현재 실행되고있는 스레드의 이름과 memory 필드 값 출력
            System.out.println(Thread.currentThread().getName() + " : " + this.memory);
        }
    }
}
