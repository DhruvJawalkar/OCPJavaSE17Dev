package section7.date_and_time;

import java.time.*;

public class CreatingDatesAndTimes {
    public static void main(String[] args) {
        /*
        LocalDate now1 = LocalDate.now();
        LocalTime now2 = LocalTime.now();
        LocalDateTime now3 = LocalDateTime.now();
        ZonedDateTime now4 = ZonedDateTime.now();

        System.out.println(now1);
        System.out.println(now2);
        System.out.println(now3);
        System.out.println(now4);
         */

        /*
        LocalDate d1 = LocalDate.of(2024, Month.OCTOBER, 12);
        LocalDate d2 = LocalDate.of(2024, 11, 12);
        System.out.println(d1);

        LocalTime t1 = LocalTime.of(12, 15);
        LocalTime t2 = LocalTime.of(12, 15, 30);
        LocalTime t3 = LocalTime.of(12, 15, 30, 10);
        System.out.println(t3);
         */

        LocalDateTime dt1 = LocalDateTime.of(2024, Month.OCTOBER, 12, 12, 15, 30);
        LocalDate d1 = LocalDate.of(2024, Month.OCTOBER, 12);
        LocalTime t1 = LocalTime.of(12, 15, 30);
        LocalDateTime dt2 = LocalDateTime.of(d1, t1);
        System.out.println(dt2);

        ZoneId zone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime z1 = ZonedDateTime.of(2024, 10, 12, 12, 15, 30, 10, zone);
        System.out.println(z1);
    }
}
