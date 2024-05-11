package time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDataTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2015, 6,14,6,1,1);
        System.out.println(nowDt);
        System.out.println(ofDt);

        LocalDate localDate = ofDt.toLocalDate();
    }
}
