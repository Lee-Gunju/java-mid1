package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        System.out.println(localDateTime.get(ChronoField.YEAR));
        System.out.println(localDateTime.get(ChronoField.MONTH_OF_YEAR));



        // 편의 메서드 사용
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonthValue());






    }
}
