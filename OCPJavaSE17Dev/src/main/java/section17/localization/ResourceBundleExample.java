package section17.localization;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args) {
        ResourceBundle enRb = ResourceBundle.getBundle("Museum", new Locale("en", "US"));
        ResourceBundle itRb = ResourceBundle.getBundle("Museum", new Locale("it", "IT"));

        System.out.println(enRb.getString("greeting") + "! " + enRb.getString("open"));
        System.out.println(itRb.getString("greeting") + "! " + itRb.getString("open"));

        //String greet = itRb.getString("greetByName");
        //String result = MessageFormat.format(greet, "Dhruv", itRb.getString("open"));
        //System.out.println(result);

        String greet = enRb.getString("greetByName");
        String result = MessageFormat.format(greet, "Dhruv", enRb.getString("open"));
        System.out.println(result);

        // using Properties class to define properties outside rb file
        var p = new Properties();
        p.setProperty("name", "Natural Museum");
        System.out.println("Welcome to " + p.getProperty("name"));
    }
}
