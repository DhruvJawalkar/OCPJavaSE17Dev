package Section2.building.blocks;

public class DataTypes {
    public static void main(String[] args) {
        float pi = 3.14f;
        long bigNum = 298374612936L;
        int octal = 017;
        int hex = 0xFF;
        int binary = 0b00; //0B11

        int a = 1_000_000; // normal usage
        int b = 1_2; // OK, but not very useful
        int c = 1_______2; // even less useful, but still OK
        double d = 1_000_000.000_001; // OK and makes sense

        /*
        double x = _10.1; // NOK
        double y = 10.1_; // NOK
        double z = 10_.1; // NOK
        double w = 10._1; // NOK
         */

        Integer a1 = Integer.valueOf(1);

        // valueOf() can be used to convert String into wrapper class
        Integer n = Integer.valueOf("12");
        // wrapper classes come with some useful methods, e.g.
        int m = Integer.parseInt("101");
        // before Java 9, this was possible (might appear on OCA exam)
        //Integer p = new Integer(5);

        Double d1 = Double.valueOf(314.67);
        System.out.println(d1.byteValue()); // 58 (wrap: 314-256=58)
        System.out.println(d1.intValue()); // 314
        System.out.println(d1.doubleValue()); // 314.67

        // Strings (e.g. "Hello World") are not primitive types in Java
        // but they are commonly use like primitives
        String greeting = "Hello";
        String name = "John Wayne";
        System.out.println(greeting + ", " + name + "!"); // Hello, John Wayne!
    }
}
