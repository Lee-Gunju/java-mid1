package time;

import java.time.*;

public class PeriodMain {

    public static void main(String[] args) {

        int age = 10;
        Period period = Period.ofDays(10);
        System.out.println(period);
        System.out.println(System.identityHashCode(period));
        System.out.println(period.hashCode());

        LocalDate currentDate = LocalDate.of(2030, 1, 1); LocalDate plusDate = currentDate.plus(period);

        System.out.println("현재 날짜: " + currentDate); System.out.println("더한 날짜: " + plusDate);
//기간 차이
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        System.out.println(System.identityHashCode(startDate));
        LocalDate endDate = LocalDate.of(2023, 4, 2);
        System.out.println(System.identityHashCode(endDate));
        System.out.println(System.identityHashCode(age));


        Period between = Period.between(startDate, endDate);
        System.out.println("기간: " + between.getMonths() + "개월 " +  between.getDays() + "일"); }
}
