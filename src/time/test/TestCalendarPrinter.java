package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 연도: ");
        int year = scanner.nextInt();
        System.out.print("Enter 월: ");
        int month = scanner.nextInt();
        
        printCalender(year, month);
    }

    private static void printCalender(int year, int month) {
        LocalDate firstDate = LocalDate.of(year, month, 1);
        LocalDate lastDate = firstDate.plusMonths(1);

        int offsetWeekDays = firstDate.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa ");
        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");

        }

        LocalDate dayIterator = firstDate;
        while (dayIterator.isBefore(lastDate)) {
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }

            dayIterator = dayIterator.plusDays(1);


        }


    }
}
