package section3.operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 5;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        int c = 5;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);

        int e = 5;
        e = e++;
    }
}
