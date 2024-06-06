package section7.date_and_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeMethods {
    public static void main(String[] args) {
        /*
        LocalDate date = LocalDate.of(2022, Month.SEPTEMBER, 15);
        System.out.println(date);
        date = date.plusDays(4);
        System.out.println(date);
        date = date.plusWeeks(2);
        System.out.println(date);
        date = date.plusMonths(3);
        System.out.println(date);
        date = date.plusYears(1);
        System.out.println(date);
         */

        /*
        LocalDate date = LocalDate.of(2022, Month.NOVEMBER, 15);
        System.out.println(date);
        LocalTime time = LocalTime.of(17, 30);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);
        dateTime = dateTime.plusDays(2);
        System.out.println(dateTime);
        dateTime = dateTime.plusHours(3);
        System.out.println(dateTime);
        dateTime = dateTime.plusSeconds(15);
        System.out.println(dateTime);
         */

        /*
        LocalDateTime dateTime = LocalDateTime.of(2022, Month.NOVEMBER, 15, 17, 30);
        System.out.println(dateTime);
        dateTime = dateTime.minusDays(2).plusHours(3).minusSeconds(45);
        System.out.println(dateTime);

        // date and time classes are immutable !!
        LocalDate date = LocalDate.of(1980, 4, 1);
        date.plusDays(20);
        System.out.println(date);

        //fix
        date = date.plusDays(20);
        System.out.println(date);
         */

        LocalDate date1 = LocalDate.of(2022, 11, 3);
        LocalDate date2 = LocalDate.of(2022, 12, 3);
        System.out.println(date1.isBefore(date2));
        System.out.println(date1.isAfter(date2));
    }
}
