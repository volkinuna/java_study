package ch03.sec06;

public class CompareOperator {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 10;

        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);

        char char1 = 'A'; // 65
        char char2 = 'B'; // 66

        boolean result4 = (char1 < char2); // int타입으로 자동타입변환

        System.out.println("result4 : " + result4);

        int num3 = 1;
        double num4 = 1.0;

        boolean result5 = (num3 == num4); // double타입으로 자동타입변환

        System.out.println("result5 : " + result5);

        // float와 double 비교시 주의사항
        float num5 = 0.1f;
        double num6 = 0.1;

        boolean result6 = (num5 == num6);

        System.out.println("result6 : " + result6);

        // 해결책 : 강제타입변환을 시켜서 타입을 같게 만든다.
        boolean result7 = (num5 == (float) num6);

        System.out.println("result7 : " + result7);

        // 문자열 비교
        String str1 = "자바";
        String str2 = "Java";

        boolean result8 = str1.equals(str2);
        boolean result9 = !str1.equals(str2);

        System.out.println("result8 : " + result8);
        System.out.println("result9 : " + result9);

    }
}
