package section17.localization;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingValues {
    public static void main(String[] args) {
        /*
        double num = 12345.6789;
        NumberFormat f1 = new DecimalFormat("###,###,###.0");
        System.out.println(f1.format(num));

        NumberFormat f2 = new DecimalFormat("000,000.00000");
        System.out.println(f2.format(num));

        NumberFormat f3 = new DecimalFormat("My Balance: $#,###,###.##");
        System.out.println(f3.format(num));
         */

        /*
        LocalDate date = LocalDate.of(2023, Month.SEPTEMBER, 14);
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());\
         */

        /*
        // to display standard formats
        LocalDate date = LocalDate.of(2023, Month.SEPTEMBER, 14);
        LocalTime time = LocalTime.of(9, 6, 24);
        LocalDateTime dt = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
         */

        /*
        // creating custom formats
        var dt = LocalDateTime.of(2022, Month.SEPTEMBER, 14, 19, 6, 14);
        //DateTimeFormatter.ofPattern("dd.MM.yyyy. hh.mm.ss");
        var f1 = DateTimeFormatter.ofPattern("d.M.yyyy. hh:mm:ss a");
        System.out.println(dt.format(f1));
        //DateTimeFormatter.ofPattern("MMM-dd-yy HH:mm:ss");
        var f2 = DateTimeFormatter.ofPattern("MMM-dd-yy HH:mm:ss");
        System.out.println(dt.format(f2));
        //DateTimeFormatter.ofPattern("MMMM-dd-yy hh:mm:ss a");
        var f3 = DateTimeFormatter.ofPattern("MMMM-dd-yy hh:mm:ss a B");
        System.out.println(dt.format(f3));
        // alternative
        System.out.println(f3.format(dt));
         */

        var dt = LocalDateTime.of(2022, Month.SEPTEMBER, 14, 19, 6, 14);
        // to insert text values use single quotes
        var f4 = DateTimeFormatter.ofPattern("'Date:' dd.MM.yy. '| Time:' hh:mm:ss a");
        System.out.println(dt.format(f4));
        var f5 = DateTimeFormatter.ofPattern("MMM-dd-yyyy 'at' HH'h'm'm'ss's'");
        System.out.println(dt.format(f5));
        // NOTE: spaces can be added within or out of the single quotes
    }
}
