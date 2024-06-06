package section15.beyond_classes;

/*
class Dog {
    public boolean canRun() { return true; }
}
interface CanRun { boolean canRanFast(); }
class ShihTzu extends Dog implements CanRun {
    public boolean canRanFast() { return false; }
    public int weight = 6;
}
 */

/*
class Dog {
    public static int getSpeed() { return 20; }
    public void printSpeed() {
        System.out.println(this.getSpeed());
    }
}
public class GreatDane extends Dog {
    public int getSpeed() {
        return 35;
    }
    public static void main(String[] args) {
        new GreatDane().printSpeed();
    }
}
 */

// final example
class Cat {
    protected int age = 5;
    public static boolean isWild() { return false; }
}
class Tiger extends Cat {
    protected int age = 7;
    public static boolean isWild() { return true; }
}
public class Polymorphism {
    public static void main(String[] args) {
        /*
        ShihTzu shihTzu = new ShihTzu();
        System.out.println(shihTzu.weight);
        Dog dog = shihTzu;
        System.out.println(dog.canRun());
        CanRun canRun = shihTzu;
        System.out.println(canRun.canRanFast());
         */

        /*
        CanRun canRun = new ShihTzu();
        System.out.println(canRun.weight);

        Dog dog = new ShihTzu();
        System.out.println(dog.canRunFast());
         */

        /*
        ShihTzu shihTzu = new ShihTzu();
        Dog dog = shihTzu;
        ShihTzu secondShihTzu = (ShihTzu) dog;
        //you cannot put larger in smaller without the explicit cast
        //ShihTzu thirdShihTzu = dog;
         */

        Tiger dave = new Tiger();
        Cat rave = dave;
        System.out.println(dave.isWild());
        System.out.println(rave.isWild());
        System.out.println(dave.age);
        System.out.println(rave.age);
    }
}
