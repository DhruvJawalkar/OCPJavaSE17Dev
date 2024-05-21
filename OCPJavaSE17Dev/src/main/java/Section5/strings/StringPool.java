package Section5.strings;

public class StringPool {
    public static void main(String[] args) {
        /*
        String name = "John Wayne";
        String theName = "John Wayne";
        System.out.println(name==theName);
         */

        /*
        //tricky example 1
        //trim() is evaluated at runtime
        String name = "John Wayne";
        String theName = "  John Wayne".trim();
        System.out.println(name==theName);
         */

        /*
        //tricky example 2
        //string concatenation happens at compile time
        String name = "John Wayne";
        String theName = "John"+" "+"Wayne";
        System.out.println(name==theName);
         */

        /*
        // you can instruct the compiler to use the pool even with runtime methods
        //forces it to be evaluated at compile time
        String s1 = "John";
        String s2 = " John ".trim().intern();
        System.out.println(s1 == s2);
         */

        /*
        // this also works (but it doesn't make much sense)
        //still creates same string at 2 different memory locations, no optimization achieved
        String s1 = "John";
        String s2 = " John ".trim();
        System.out.println(s1 == s2.intern());
         */

        String name = "John Wayne";
        String theName = new String("John Wayne");
        System.out.println(name == theName);
    }
}
