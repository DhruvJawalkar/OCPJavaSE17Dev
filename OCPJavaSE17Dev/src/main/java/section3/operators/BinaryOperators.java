package section3.operators;

public class BinaryOperators {
    public static void main(String[] args) {
        short a = 17;
        float b = 15;
        double c = 35;

        //a and b are promoted to double and double is returned
        System.out.println( a * b / c);

        short x = 5;
        short y = 7;
        System.out.println(x + y);
        // x and y are promoted to int, result is int

        //short z = x + y;
    }
}
