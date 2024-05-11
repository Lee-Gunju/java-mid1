package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2024, 12, 31, 13, 30, 50);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDate = localDateTime.format(formatter);
        System.out.println(formattedDate);

        System.out.println(localDateTime);

        // 파싱 - 문자를 날짜와 시간으로
        String dateTimeString = "2030-01-01 11:30:00";
        LocalDateTime parseDateTime  = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println(parseDateTime);



    }
}
