package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024,1,30);
        System.out.println(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedDate = date.format(formatter);

        System.out.println(formattedDate);

        // 파싱 : 문자를 날짜로
        String input = "2030년 01월 01일";
        LocalDate parseDate = LocalDate.parse(input, formatter);
        System.out.println(parseDate);

    }
}
