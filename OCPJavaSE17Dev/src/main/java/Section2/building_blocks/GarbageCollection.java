package Section2.building_blocks;

public class GarbageCollection {
    public static void main(String[] args) {
        String a, b;
        a = new String("Emperor");
        b = new String("King");
        a = b;
        String c = a;
        a = null;

        System.gc();
    }
}
