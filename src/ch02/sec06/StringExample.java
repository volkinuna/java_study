package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {

        char var1 = 'A'; // char타입은 큰따옴표 사용불가
        String var2 = "홍"; // char타입은 문자를 1개만 사용할 수 있다.

        String name = "홍길동";
        String job = "프로그래머";

        System.out.println(name + "은 " + job + "입니다.");

        // 쌍따옴표 출력
        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);

        // tab만큼 띄어쓰기
        str = "번호\t이름\t직업";
        System.out.println(str);

        // 줄바꿈
        System.out.println("나는\n자바를\n배웁니다.");
    }
}
