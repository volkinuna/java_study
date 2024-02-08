package ch03.sec08;

public class BitLogical {
    public static void main(String[] args) {

        System.out.println(45 & 25);
        System.out.println(45 | 25);
        System.out.println(45 ^ 25);
        System.out.println(~45);

        // 온도측정기에서 전송받은 데이터
        // 실제로는 136이지만 JAVA에서는 음수부호때문에 아래처럼 보임
        byte receiveData = -120;

        int unsignedInt = receiveData & 255; // 비트 논리곱 연산으로 데이터 복원
        System.out.println(unsignedInt);

        // 그래서 JAVA에서 이런 기능을 아예 제공해주는 메소드가 존재
        int unsignedInt2 = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2);
    }
}
