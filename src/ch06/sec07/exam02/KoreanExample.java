package ch06.sec07.exam02;

public class KoreanExample {
    public static void main(String[] args) {

        // 객체가 생성이 될때 생성자가 실행이 되고 필드에 값이 할당된다.
        Korean k1= new Korean("최볼키", "121029-3123456"); // 첫번째 사람
        System.out.println("최볼키의 nation : " + k1.nation);
        System.out.println("최볼키의 name : " + k1.name);
        System.out.println("최볼키의 ssn : " + k1.ssn);
        System.out.println("-------------------------------");

        Korean k2= new Korean("최코코", "090509-4123456"); // 두번째 사람
        System.out.println("최코코의 nation : " + k2.nation);
        System.out.println("최코코의 name : " + k2.name);
        System.out.println("최코코의 ssn : " + k2.ssn);
    }
}
