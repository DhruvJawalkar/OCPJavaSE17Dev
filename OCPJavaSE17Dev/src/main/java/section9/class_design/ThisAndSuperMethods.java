package section9.class_design;
/*
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Dog() {
        //this();
        this("Chip", 1);
        System.out.println("Woof!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
 */
/*
class Mammal {
    public int age;
    public Mammal(int age) { this.age = age; }
}

class Dog extends Mammal {
    private String name;
    public Dog(String name, int age) {
        //super(); will not work since super class does not have a default constructor
        // if there is no this() or super() in the first line
        // then the compiler will insert super() automatically
        super(age);
        this.name = name;
        System.out.println("Woof!");
    }
}
 */
public class ThisAndSuperMethods {
    public static void main(String[] args) {
        /*
        Dog dog = new Dog();
        System.out.println("Name: " + dog.getName() + ", " + "Age: " + dog.getAge());
         */


    }
}
