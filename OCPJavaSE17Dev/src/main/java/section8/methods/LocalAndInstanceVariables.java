package section8.methods;

import java.util.Arrays;

class Item {
    public double tax = 0.2;
    public double getPrice(double inputPrice) {
        //double margin = 0.05;
        final double margin;
        margin = 0.05;

        return inputPrice * (1 + tax) * (1 + margin);
    }

    public void printSomething(){
        final int[] a = {1, 3, 5};
        a[1] = 7;

        System.out.println(Arrays.toString(a));
    }
}
public class LocalAndInstanceVariables {
    public static void main(String[] args) {
        Item item = new Item();
        System.out.println(item.getPrice(100));
        Item specialItem = new Item();
        specialItem.tax = 0.1;
        System.out.println(specialItem.getPrice(100));
    }
}
