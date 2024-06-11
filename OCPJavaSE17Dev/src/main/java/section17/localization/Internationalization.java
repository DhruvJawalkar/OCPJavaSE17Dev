package section17.localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Internationalization {
    public static void main(String[] args) {
        /*
        Locale myLocale = Locale.getDefault();
        System.out.println(myLocale);

        System.out.println(Locale.ITALIAN);
        System.out.println(Locale.ITALY);
        Locale newLocale = new Locale("hi", "IN");
        System.out.println(newLocale);
         */

        /*
        Locale myLocale = new Locale.Builder()
                .setLanguage("hi")
                .setRegion("IN")
                .build();
        System.out.println(myLocale);

        System.out.println(Locale.getDefault());

        //Locale.setDefault(myLocale);
        System.out.println(Locale.getDefault());
         */

        /*
        //formatting numbers
        double num = 1234.567;
        NumberFormat f1 = NumberFormat.getInstance(Locale.US);
        System.out.println(f1.format(num));

        NumberFormat it = NumberFormat.getInstance(Locale.ITALY);
        System.out.println(it.format(num));
        NumberFormat cf = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        System.out.println(cf.format(num));
         */

        /*
        //formatting currencies
        double price = 12.3;

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(us.format(price));
        NumberFormat uk = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println(uk.format(price));
        NumberFormat ge = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(ge.format(price));
        NumberFormat ch = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(ch.format(price));
         */

        /*
        //formatting percentages
        double discount = 0.151;
        NumberFormat us = NumberFormat.getPercentInstance(Locale.US);
        System.out.println(us.format(discount));
        NumberFormat ge = NumberFormat.getPercentInstance(Locale.GERMANY);
        System.out.println(ge.format(discount));
         */

        /*
        // parsing numbers
        String num = "12.34";
        //NumberFormat us = NumberFormat.getNumberInstance(Locale.US);
        NumberFormat fr = NumberFormat.getPercentInstance(Locale.FRANCE);
        // (in France, decimal point is not a dot, but a comma)
        try {
            //System.out.println(us.parse(num));
            System.out.println(fr.parse(num));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        String price = "$12,345.67";
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        try {
            double priceValue = (double) us.parse(price);
            System.out.println(priceValue);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
         */

        /*
        //using CompactNumberFormat (new in Java 17)
        int myNum = 8_765_432;
        NumberFormat f1 = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        System.out.println(f1.format(myNum));
        NumberFormat f2 = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        System.out.println(f2.format(myNum));
        NumberFormat f3 = NumberFormat.getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.SHORT);
        System.out.println(f3.format(myNum));
        NumberFormat f4 = NumberFormat.getCompactNumberInstance(Locale.GERMANY, NumberFormat.Style.LONG);
        System.out.println(f4.format(myNum));
         */

        /*
        //Localizing dates and times
        var dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        var fr = new Locale("fr", "FR");
        LocalDateTime dt = LocalDateTime.of(2024, 6, 11, 7, 59, 0);
        System.out.println(dtf.withLocale(fr).format(dt));

        var dtf2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        var us = Locale.US;
        System.out.println(dtf2.withLocale(us).format(dt));
         */

        /*
        // displaying locale
        var hr = new Locale("hr", "HR");
        var price = 4.32;
        System.out.println(hr.getDisplayLanguage());
        System.out.println(hr.getDisplayCountry());
        System.out.println(NumberFormat.getCurrencyInstance(hr).format(price));
         */
    }
}
