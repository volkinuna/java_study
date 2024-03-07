package ch14.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        SumThread sumThread = new SumThread();
        sumThread.start(); // sumThread 실행 대기상태(Runnable)

        sumThread.join(); // join() 메소드를 호출한 스레드(JoinExample의 main)가 일시정지 상태가 됨

        // sumThread가 실행 상태(run)

        // sumThread가 실행 종료(terminate)가 되면 main의 일시정지 상태가 풀린다. -> 실행 대기상태

        System.out.println("1~100의 합 : " + sumThread.getSum());
    }
}
