package section7.date_and_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class PeriodsDurationsInstants {
    public static void main(String[] args) {
        /*
        Period p1 = Period.ofYears(2);
        System.out.println(p1);
        Period p2 = Period.ofMonths(3);
        System.out.println(p2);
        Period p3 = Period.ofWeeks(1);
        System.out.println(p3);
        Period p4 = Period.ofDays(11);
        System.out.println(p4);
        Period p5 = Period.of(2, 0, 15);
        System.out.println(p5);
         */

        /*
        Period period = Period.of(1, 2, 5);
        System.out.println(period);
        LocalDate date = LocalDate.of(2022, 11, 20);
        System.out.println(date);
        date = date.plus(period);
        System.out.println(date);
        date = date.minus(period);
        System.out.println(date);
         */

        /*
        Duration d1 = Duration.ofDays(3);
        System.out.println(d1);
        Duration d2 = Duration.ofHours(2);
        System.out.println(d2);
        Duration d3 = Duration.ofMinutes(45);
        System.out.println(d3);
        Duration d4 = Duration.ofSeconds(10);
        System.out.println(d4);
        Duration d5 = Duration.ofMillis(100);
        System.out.println(d5);
        Duration d6 = Duration.ofNanos(1000);
        System.out.println(d6);
         */

        /*
        Duration d0 = Duration.of(3, ChronoUnit.HALF_DAYS);
        System.out.println(d0);
        Duration d1 = Duration.of(3, ChronoUnit.DAYS);
        System.out.println(d1);
        Duration d2 = Duration.of(3, ChronoUnit.HOURS);
        System.out.println(d2);
        Duration d3 = Duration.of(3, ChronoUnit.SECONDS);
        System.out.println(d3);
        Duration d4 = Duration.of(3, ChronoUnit.MILLIS);
        System.out.println(d4);
        Duration d5 = Duration.of(3, ChronoUnit.NANOS);
        System.out.println(d5);
        Duration d6 = Duration.of(3, ChronoUnit.MINUTES);
        System.out.println(d6);
         */

        /*
        LocalTime t1 = LocalTime.of(17, 30);
        LocalTime t2 = LocalTime.of(20, 45);
        System.out.println(ChronoUnit.HOURS.between(t1, t2));
        System.out.println(ChronoUnit.MINUTES.between(t1, t2));

        LocalTime time = LocalTime.of(17, 30);
        System.out.println(time);
        Duration d3 = Duration.ofMinutes(45);
        time = time.plus(d3);
        System.out.println(time);
        time = time.minus(d3);
        System.out.println(time);
         */

        /*
        Instant now = Instant.now();
        //gives Greenwitch time, GMT TZ
        System.out.println(now);

        Instant before = Instant.now();
        for(int i=0; i<100_000; i++){
            //
        }
        Instant after = Instant.now();
        Duration dur = Duration.between(before, after);
        System.out.println(dur.toMillis());
         */

        ZoneId zone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime z = ZonedDateTime.of(2024, 5, 23, 17, 10, 0, 0, zone);
        System.out.println(z);

        Instant inst = z.toInstant();
        System.out.println(inst);
    }
}
