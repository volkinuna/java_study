package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {

        Korean k1 = new Korean("130112-3123456", "최볼키");

        System.out.println(k1.nation);
        System.out.println(k1.ssn);
        System.out.println(k1.name);

        // final(상수) 필드는 값을 변경할 수 없다.
        //k1.nation = "USA"; <- 에러
        //k1.ssn = " 121029-3123456"; <- 에러
    }
}
