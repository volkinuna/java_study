package ch04.sec04;

public class FloatCount {
    public static void main(String[] args) {

        // 반복문에서 초기화식 타입에 실수형 X => 부동소수점은 정확한 계산을 하지 못한다.
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
            System.out.println(x);
        }
    }
}
