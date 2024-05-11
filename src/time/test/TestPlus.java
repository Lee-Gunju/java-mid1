package time.test;

//기준 시각: 2024-01-01T00:00
//        1년 2개월 3일 4시간 후의 시각: 2025-03-04T04:00

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.of(2024, 01,01, 00,00);
        LocalDateTime future = now.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println(now);
        System.out.println(future);
    }
}
