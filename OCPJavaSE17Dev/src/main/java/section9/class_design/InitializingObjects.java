package section9.class_design;

/*
class Mammal {
    static { System.out.println("Hello."); }
}

class Dog extends Mammal {
    public static void main(String[] args) {
        System.out.println("Good afternoon.");
        new Dog();
        new Dog();
        new Dog();
    }
    static { System.out.println("Woof!"); }
}
 */

/*
// final instance variables must assume the value
// by the time the constructor completes !!
// (final local variables must have value only if used)
class Item {
    private final double TAX;
    private final double price;
    public Item() {
        this.price = 12.5;
    }
    { TAX = 0.2; }
}
 */

/*
public class InitializingObjects {
    public static void main(String[] args) {
    }
}
 */

/*
class Mammal {
    static { System.out.println("Hello!"); }
    { System.out.println("Good Afternoon."); }
}
class Dog extends Mammal {
    private String name = "Rex";
    { System.out.println("Name: " + name); }
    private static int i = 0;
    static { System.out.println(i); }
    { i++;
        System.out.println(i); }
    public Dog() {
        System.out.println("Woof!");
    }
    public static void main(String[] args) {
        System.out.println("I am the main one.");
        Dog dog = new Dog();
    }
}
 */