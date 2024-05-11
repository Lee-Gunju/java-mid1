package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2018, 1, 1);
        System.out.println(nowDate);
        System.out.println(ofDate);


        ofDate = ofDate.plusDays(1);
        System.out.println(ofDate);


    }
}
