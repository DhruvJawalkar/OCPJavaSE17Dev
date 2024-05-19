package section10.abstractclasses.and.interfaces;

/*
interface Car{
    int distanceWithFullTank(int tankVolume);
    int MAXIMUM_WEIGHT = 2000;
}

interface Ford{
    String getColor();
}

class FordModelT implements Car, Ford{
    @Override
    public int distanceWithFullTank(int tankVolume) {
        return tankVolume * 9;
    }

    @Override
    public String getColor() {
        return "black";
    }
}
 */

/*
interface Mammal{
    public void eats();
}

interface CanSwim extends Mammal{
    void swim();
}

class Elephant implements CanSwim{
    @Override
    public void eats() {
        System.out.println("1");
    }

    @Override
    public void swim() {
        System.out.println("2");
    }
}
 */

/*
interface Mammal{
    public void eats();
}

interface Tetrapod{
    public void eats();
}

class Dog implements Mammal, Tetrapod{
    @Override
    public void eats(){
        System.out.println("1");
    }
}
 */

/*
interface Mammal{
    public int eats();
}

interface Tetrapod{
    public void eats();
}

class Dog implements Tetrapod, Mammal{
    public void eats(){
        System.out.println("1");
    }
}
 */

/*
interface Mammal{
    public void walks();
    public void eats();
    default void sleeps(){
        System.out.println("Mammal sleeps");
    }
}

class Dog implements Mammal{

    @Override
    public void walks() {
        System.out.println("Dog walks");
    }

    @Override
    public void eats() {
        System.out.println("Dog eats");
    }
}

class Cat implements Mammal{

    @Override
    public void walks() {
        System.out.println("Cat walks");
    }

    @Override
    public void eats() {
        System.out.println("Cat eats");
    }
}
 */

/*
interface Car{
    public default int getMaxSpeed(){ return 100;}
}

interface Truck{
    public default int getMaxSpeed(){return 70;}
}

class Van implements Truck, Car{
    @Override
    public int getMaxSpeed() {
        return 80;
    }

    public int getMaxSpeedCar(){
        return Car.super.getMaxSpeed();
    }

    public int getMaxSpeedTruck(){
        return Truck.super.getMaxSpeed();
    }
}\
 */

/*
interface Car{
    public static int getMaxSpeed(){return 100;}
}

class Ford implements Car{
    public int getMaxSpeedCar(){
        return Car.getMaxSpeed();
    }
    public int getMaxSpeed(){return 0;}
}
 */

/*
interface Car{
    private static int calculateSpeed(){
        int speed = 70 * 2;
        return speed;
    }
    public default int getMaxSpeed(){return calculateSpeed();}

    public default int getRecommendedSpeed(){return (int) (0.8 * calculateSpeed());}
}
 */

interface Car{
    int getMaxSpeed();
    int getHorsePower();

    default void printCarFeatures(){
        System.out.println("Max speed: " + getMaxSpeed() + " | " + "Horse power: " + getHorsePower());
    }
}
public class Interfaces {
    public static void main(String[] args) {
        /*
        Cat cat = new Cat();
        cat.walks();
        cat.eats();
        cat.sleeps();
         */

        /*
        Van van = new Van();
        System.out.println(van.getMaxSpeed());
        System.out.println(van.getMaxSpeedCar());
        System.out.println(van.getMaxSpeedTruck());
         */

        /*
        Ford ford = new Ford();
        System.out.println(ford.getMaxSpeed());
         */
    }
}
