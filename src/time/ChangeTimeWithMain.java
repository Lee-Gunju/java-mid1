package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018,1,1,1,39,43);
        System.out.println(dt);

        LocalDateTime changedt1 = dt.with(ChronoField.YEAR, 2020);
        System.out.println(changedt1);

        LocalDateTime with = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(dt);
        System.out.println(with);

        LocalDateTime with2 = dt.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println(with2);
    }
}
