package section11.lambdas_and_functional_programming;

@FunctionalInterface
interface Animal{
    public void speak();
}

@FunctionalInterface
interface Multiplicable{
    public int multiply(int a, int b);
}

class Dog implements Animal{
    public void speak(){
        System.out.println("Woof!");
    }
}
public class FunctionalInterfaces {
    public static void main(String[] args){
        /*
        Dog dog = new Dog();
        dog.speak();
         */

        /*
        Animal dog = new Animal(){
            public void speak() {
                System.out.println("Woof!");
            }
        };
        dog.speak();
         */

        /*
        Animal dog = () -> System.out.println("Woof!");
        dog.speak();
         */

        /*
        Animal dogImplementation = () -> System.out.println("Woof!");
        Animal catImplementation = () -> System.out.println("Meow!");
        Animal cowImplementation = () -> System.out.println("Moo!");

        dogImplementation.speak();
        catImplementation.speak();
        cowImplementation.speak();
         */

        Multiplicable multiplyImpl = (a, b) -> a*b;

        /*
        Multiplicable multiplyImpl = (a, b) -> {return a*b;};
         */

        System.out.println(multiplyImpl.multiply(2,2));
    }
}
