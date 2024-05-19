package section14.math.apis;

public class MathAPIMethods {
    public static void main(String[] args) {
        int mim = Math.min(3, 4);
        int max = Math.max(3, 4);

        int a = 3;
        long b = 4;
        long result = Math.max(a, b);
        int resultInt = (int) Math.max(a, b);

        float c = 3.14f;
        double d = 3.14;
        int roundedInt = Math.round(c);
        long roundedLong = Math.round(d);

        float e = 3.14f;
        double ceilPi = Math.ceil(e);
        double floorPi = Math.floor(e);
        System.out.println(ceilPi);
        System.out.println(floorPi);

        double pow = Math.pow(5, 2);
        double sqrt = Math.pow(25, 0.5);

        double rand = Math.random();
        System.out.println(rand);
    }
}
