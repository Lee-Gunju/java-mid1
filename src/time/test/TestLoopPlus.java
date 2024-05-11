package time.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 1, 1);
        for (int i = 1; i < 5; i++) {
            LocalDate newDate = localDate.plus(i * 2, ChronoUnit.WEEKS);
            System.out.println("날짜  " + (i + 1) + ":" + newDate);

        }
    }
}
