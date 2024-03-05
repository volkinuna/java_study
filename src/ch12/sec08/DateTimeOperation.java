package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperation {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now(); // 현재 날짜 시간
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println(now.format(dft));

        LocalDateTime result1 = now.plusYears(1); // 1년 뒤
        System.out.println(result1.format(dft));

        LocalDateTime result2 = now.minusMonths(2); // 2개월 전
        System.out.println(result2.format(dft));

        LocalDateTime result3 = now.plusDays(7); // 7일 뒤
        System.out.println(result3.format(dft));
    }
}
