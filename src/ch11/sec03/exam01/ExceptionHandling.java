package ch11.sec03.exam01;

public class ExceptionHandling {
    public static void main(String[] args) {

        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i +"] : " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과됨 : " + e.getMessage());
            } catch (Exception e) { // Exception는 Exception들의 최상위 클래스
                System.out.println("숫자로 변활할 수 없음 :" + e.getMessage());
            } // 상위 예외 클래스는 가장 아래에 작성
        }
    }
}
