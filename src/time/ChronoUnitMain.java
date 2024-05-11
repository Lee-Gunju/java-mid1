package time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain {


    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.println(value);
        }

        System.out.println(ChronoUnit.NANOS);
        System.out.println(ChronoUnit.HOURS);
        System.out.println("ChronoUnit.HOURS.getDuration().getSeconds() = " + ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("ChronoUnit.HOURS.getDuration().getSeconds() = " + ChronoUnit.HOURS.getDuration());

        LocalTime lt1 = LocalTime.of(1,10,0);
        LocalTime lt2 = LocalTime.of(1,5,0);

        long secondsBetween = ChronoUnit.SECONDS.between(lt1, lt2);
        System.out.println(secondsBetween);
    }
}
