package section9.class_design;
/*
// calling method with "super" keyword
class Mammal {
    public void speak() {
        System.out.println("Mammal is making a sound.");
    }
}
class Dog extends Mammal {
    @Override
    public void speak() {
        System.out.println("Woof!");
        super.speak();
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.speak();
    }
}
 */

/*
// covariant return types
class Item {
    protected Number calculatePrice (float price) {
        return price + price * 0.2;
    }
}
class Shoe extends Item {
    @Override
    public Double calculatePrice (float shoePrice) {
        return (shoePrice + shoePrice * 0.2) * 1.05;
    }
    public static void main(String[] args) {
        System.out.println(new Item().calculatePrice(100));
        System.out.println(new Shoe().calculatePrice(100));
    }
}
 */

/*
import java.io.FileNotFoundException;
import java.io.IOException;

// exceptions
// checked exception FileNotFoundException is subclass of IOException
class A {
    public void greet() throws IOException { }
    public void sayHello() { }
    public void leave() throws FileNotFoundException {}
}
public class B extends A {
    public void greet() throws FileNotFoundException { }
    public void sayHello(){ }

    //NOK since IOException is super type of FileNotFoundException
    public void leave() throws IOException { }
}
 */

/*
// hiding a static method
class A {
    public static void greet() { System.out.println("Hello."); }
}
class B extends A {
    public static void greet() { System.out.println("Good afternoon."); }
    public static void main(String[] args) {
        A.greet();
        B.greet();
    }
}
 */

// variables cannot be overriden, only hidden
class Mammal {
    public String name = "Unknown";
}
class Dog extends Mammal {
    public String name = "Rex";
    public static void main(String[] args) {
        Dog d = new Dog();
        Mammal m = d;
        System.out.println(d.name);
        System.out.println(m.name);
    }
}
public class InheritingMembers {

}
