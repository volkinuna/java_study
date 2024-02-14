package ch05.sec09;

public class ArrayCopy {
    public static void main(String[] args) {
        
        // 배열의 길이를 3에서 5로 바꾸기
        int[] oldIntArray = {1, 2, 3};  // length : 3
        //oldIntArray[3] = 4; <- 에러 발생
        int[] newIntArray = new int[5]; // length : 5

        // 배열 항목 복사
        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }

        newIntArray[3] = 4;

        // 배열 항목 출력
        for (int i = 0; i < newIntArray.length; i++) {
            System.out.println(newIntArray[i]);
        }


    }
}
