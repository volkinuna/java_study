package ch05.sec05;

public class EqulsExample {
    public static void main(String[] args) {

        // 문자열 객체(홍길동이라는 데이터를 가지고 있음)
        String strVar1 = "홍길동"; // 주소 : x01
        String strVar2 = "홍길동"; // 주소 : x01
        String strVar3 = new String("홍길동"); // 주소 : x02
        String strVar4 = new String("홍길동"); // 주소 : x03

        if (strVar1 == strVar1) { // 객체를 비교하는 것은 주소를 비교하는 것이다.
            System.out.println("strVar1과 strVar2의 참조가 같습니다.");
        } else {
            System.out.println("strVar1과 strVar2의 참조가 다릅니다.");
        }

        if (strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2의 문자열이 같습니다.");
        } else {
            System.out.println("strVar1과 strVar2의 문자열이 다릅니다.");
        }

        if (strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4의 참조가 같습니다.");
        } else {
            System.out.println("strVar3과 strVar4의 참조가 다릅니다.");
        }

        if (strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4의 문자열이 같습니다.");
        } else {
            System.out.println("strVar3과 strVar4의 문자열이 다릅니다.");
        }

        if (strVar2 == strVar3) {
            System.out.println("strVar2과 strVar3의 참조가 같습니다.");
        } else {
            System.out.println("strVar2과 strVar3의 참조가 다릅니다.");
        }

        if (strVar2.equals(strVar3)) {
            System.out.println("strVar2과 strVar3의 문자열이 같습니다.");
        } else {
            System.out.println("strVar2과 strVar3의 문자열이 다릅니다.");
        }
    }
}
