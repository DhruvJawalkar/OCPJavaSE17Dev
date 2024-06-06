package section8.methods;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        /*
        //Explicit
        int a = 1;
        Integer b = Integer.valueOf(a);

        int c = b.intValue();
         */

        /*
        //Implicit
        int a = 1;
        Integer b = a;

        int c = b;
         */

        /*
        // Java will also autocast a smaller primitive into the larger one
        // BUT Java will not do both automatic operations at the same time!!
        int x = 1;
        long y = x;
        Long z = y;
        //NOK z = x;
         */

        /*
        int x = 1;
        //Long z = Long.valueOf(x);
        //Long z = (long) x;
        Long z = Long.valueOf((long) x);//auto cast and auto box
         */

        //Long x = 1;
        Long x = 1L;
    }
}
