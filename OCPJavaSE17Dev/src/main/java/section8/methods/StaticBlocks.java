package section8.methods;
import static java.lang.Math.pow;

class MetalBlock{
    public static final double MASS_IN_KILOS;
    public static final double VOLUME_IN_CUBIC_METERS;
    public static final double DENSITY_IN_KILOS_PER_CUBIC_METER;

    static{
        MASS_IN_KILOS = 100;
        VOLUME_IN_CUBIC_METERS = 0.01;
    }

    static{
        DENSITY_IN_KILOS_PER_CUBIC_METER = MASS_IN_KILOS / VOLUME_IN_CUBIC_METERS;
    }
}
public class StaticBlocks {
    public static void main(String[] args) {
        System.out.println(pow(2, 5));
    }
}
