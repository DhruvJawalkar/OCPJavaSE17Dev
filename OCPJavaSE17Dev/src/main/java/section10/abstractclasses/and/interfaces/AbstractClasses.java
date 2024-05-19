package section10.abstractclasses.and.interfaces;

/*
abstract class Mammal{}
class Dog extends Mammal{}
 */

/*
abstract class Mammal{
    abstract void speak();
}

class Dog extends Mammal{
    @Override
    void speak() {
        System.out.println("Woof!");
    }
}

class Cat extends Mammal{
    @Override
    void speak() {
        System.out.println("Meow");
    }
}
 */

/*
abstract class Animal{
    abstract void speak();
}

abstract class Mammal extends Animal{
    abstract void walks();
}

class Dog extends Mammal{

    @Override
    void speak() {
        System.out.println("Woof!");
    }

    @Override
    void walks() {
        System.out.println("...");
    }
}
 */

/*
abstract class Mammal{
    int i;
    public Mammal(){
        i = 10;
    }
    abstract void doSomething();
}

class Dog extends Mammal{
    public Dog(){
        super();
    }

    @Override
    public void doSomething(){
        System.out.println(i);
    }
}
 */

public class AbstractClasses {
    public static void main(String[] args) {
        /*
        Dog dog = new Dog();
        ///Mammal mammal = new Mammal();
         */

        /*
        Dog dog = new Dog();
        dog.speak();

        Cat cat = new Cat();
        cat.speak();
         */

        /*
        Dog dog = new Dog();
        dog.speak();
        dog.walks();
         */

        /*
        Dog dog = new Dog();
        dog.doSomething();
         */
    }
}
