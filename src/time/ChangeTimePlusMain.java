package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2017, 1, 1, 13, 30, 49);
        System.out.println(localDateTime);

        LocalDateTime localDateTime2 = localDateTime.plus(10, ChronoUnit.DAYS);
        System.out.println(localDateTime2);



    }
}
