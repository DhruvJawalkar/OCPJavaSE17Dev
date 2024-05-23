package section11.lambdas_and_functional_programming;

@FunctionalInterface
interface Animal2{
    public void speak(String s);
}

@FunctionalInterface
interface Calculator{
    public int min(int a, int b);
}

@FunctionalInterface
interface Calculator2{
    public double path(double t);
}

@FunctionalInterface
interface Checker{
    public boolean check();
}

@FunctionalInterface
interface Checker2{
    public boolean check(String s);
}

@FunctionalInterface
interface Teller{
    public String tellName(String s);
}

class Gravity{
    final static double g = 9.81;
    static double freeFall(double t){
        return 0.5 * g * t * t;
    }
}

public class MethodReferences {
    private static void shout(String s, Animal2 animal){
        animal.speak(s);
    }

    public static void main(String[] args){
        /*
        //Animal2 myAnimal = (s) -> System.out.println(s);
        Animal2 myAnimal = System.out::println;
        shout("Woof!", myAnimal);
         */

        /*
        Calculator lambda = (a, b) -> Math.min(a, b);
        Calculator methodRef = Math::min;

        System.out.println(lambda.min(3, -1));
        System.out.println(methodRef.min(3, -1));
         */

        /*
        Calculator2 methodRef = Gravity::freeFall;
        System.out.println(methodRef.path(10));
         */

        /*
        String s  = "John Wayne";
        Checker methodRef = s::isEmpty;
        System.out.println(methodRef.check());
         */

        /*
        String s2  = "John Wayne";
        Checker2 methodRef2 = String::isBlank;
        System.out.println(methodRef2.check(s2));
         */

        /*
        Teller mRef = String::new;
        System.out.println(mRef.tellName("John Wayne"));
         */
    }
}
