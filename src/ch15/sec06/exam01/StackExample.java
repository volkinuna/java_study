package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>(); // Stack<E> extends Vector<E>

        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));

        // 동전 빼기
        while (!coinBox.isEmpty()) { // 비어있지 않으면 반복
            Coin coin = coinBox.pop();
            System.out.println("꺼낸 동전 : " + coin.getValue()); // 10, 500, 50, 100순으로 출력된다.
        }
    }
}
