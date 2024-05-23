package section15.beyond_classes;

public class SealedClasses {
    sealed class Car permits Ford, Renault, Fiat{}
    final class Ford extends Car{}
    non-sealed class Renault extends Car{}
    sealed class Fiat extends Car permits Uno, Punto{}
    final class Uno extends Fiat{}
    final class Punto extends Fiat{}

    sealed interface Mammal permits Cat, Dog, Eats{}
    non-sealed interface Eats extends Mammal{}
    //final interface Cat extends Mammal{}
    final class Cat implements Mammal{}

    sealed interface Dog extends Eats, Mammal permits GermanShepherd {}
    final class GermanShepherd implements Dog{}
    public static void main(String[] args) {

    }
}
