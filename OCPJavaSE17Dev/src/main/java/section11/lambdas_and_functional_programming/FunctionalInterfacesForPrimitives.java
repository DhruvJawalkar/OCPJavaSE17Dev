package section11.lambdas_and_functional_programming;

import java.util.Random;
import java.util.function.*;

public class FunctionalInterfacesForPrimitives {
    public static void main(String[] args){
        IntSupplier twice = () -> new Random().nextInt(10);
        System.out.println(twice.getAsInt());

        IntConsumer greet = (n) -> System.out.println("Hello, age:" + n);
        greet.accept(24);

        LongPredicate gt10 = (n) -> n > 10;
        System.out.println(gt10.test(11));

        IntFunction<Double> square = (n) -> Math.pow(n, 2);
        System.out.println(square.apply(3));

        ToDoubleFunction<Integer> cube = (n) -> Math.pow(n, 3);
        System.out.println(cube.applyAsDouble(3));

        DoubleToIntFunction truncate = n -> (int) Math.floor(n);
        System.out.println(truncate.applyAsInt(2.3));
    }
}
