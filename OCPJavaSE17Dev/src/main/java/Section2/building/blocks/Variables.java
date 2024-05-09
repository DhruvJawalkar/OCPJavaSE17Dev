package Section2.building.blocks;

public class Variables {
    private static int a;
    private int b;
    static final int[] MY_NUMBERS = new int[5];
    public static void main(String[] args) {
        /*
        Identifier rules
        1. Must begin with a letter, currency symbol ($, €, £), or underscore (_)
        2. Can include numbers, but not start with a number
        3. Single underscore (_) is not allowed as an identifier
        4. You cannot use the reserved words
        */

        int $, _1, $myVAR12, _€name_, __someName1$_, BIG_NAME, _12x;

        /*
        1. local variables - exist only within the block of code { ... }
        2. instance variables (fields) - defined within the specific instance of the object
        3. class variables - belong to a class and is shared with all instances of the class
            • marked with keyword static
            • instance and class variables don't require initialization
            • assume the default values of their type

        • instance and class variables don't require initialization
        • assume the default values of their type
        // local variables must be initialized before use
        */

        System.out.println(a);

        Variables v = new Variables();
        System.out.println(v.b);

        //int localVariable;
        //System.out.println(localVariable);

        /*
        // final variables (constants)
        final int MAX_HEIGHT = 100;
        // final can be applied to a reference:
        final int[] MY_NUMBERS = new int[5];
        // reference cannot be modified, but the content of the object can:
        MY_NUMBERS[2] = 13; // OK
        MY_NUMBERS = null; // DOES NOT COMPILE
        * */

        MY_NUMBERS[2] = 13;
        //MY_NUMBERS = null;

        /*
        • variables can go out of scope ("cease to exist")
        1. Local variables: in scope from { to }
        2. Method parameters: in scope for the duration of the method
        3. Instance variables: in scope from declaration until the object is eligible for
        garbage collector
        4. Class variables: in scope from declaration until the program ends
        * */
    }
}
