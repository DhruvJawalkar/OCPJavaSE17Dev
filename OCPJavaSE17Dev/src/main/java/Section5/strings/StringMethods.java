package Section5.strings;

public class StringMethods {
    public static void main(String[] args) {
        //String name = new String("John Wayne");

        //System.out.println("John" + 3 + 8);
        //System.out.println("John" + null);
        //System.out.println(null+"John");

        //System.out.println("John Wayne".indexOf('n', 5));

        //System.out.println("John Wayne".equalsIgnoreCase("john wayne"));

        //System.out.println("John Wayne".startsWith("Jo"));

        //Returns a string whose value is this string, with all leading and trailing white space removed.
        //System.out.println(" John Wayne ".strip());

        //Returns a string whose value is this string, with all leading and trailing space removed, where space is defined as any character whose codepoint is less than or equal to 'U+0020' (the space character).
        //System.out.println(" John Wayne ".trim());

        // whitespaces also includes \t (tab), \n (new line), \r (carriage return)

        /*
        String str = "    John\n D.\n Wayne";
        System.out.println("--");
        System.out.println(str);
        System.out.println("--");
        System.out.println(str.indent(2));
        System.out.println("--");
        System.out.println(str.indent(-2));
        System.out.println("--");
        System.out.println(str.stripIndent());
        System.out.println("--");
         */

        /*
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
         */

        /*
        String name = "John";
        int numberOfMarbles = 5;

        System.out.println(String.format("%s has %d marbles", name, numberOfMarbles));
        System.out.println("%s has %d marbles".formatted(name, numberOfMarbles));
         */

        /*
        String name = " John Wayne ";
        System.out.println(name.trim().toUpperCase().replace('Y', 'R'));
         */
    }
}
