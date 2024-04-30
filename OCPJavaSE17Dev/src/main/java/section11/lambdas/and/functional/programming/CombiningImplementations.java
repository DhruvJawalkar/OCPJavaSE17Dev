package section11.lambdas.and.functional.programming;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class CombiningImplementations {
    public static void main(String[] args){
        /*
        Consumer<String> greet1 = (s) -> System.out.println("Hello " + s);
        Consumer<String> greet2 = (s) -> System.out.println("Bye " + s);

        Consumer<String> combined = greet1.andThen(greet2);
        combined.accept("John");

        greet1.andThen(greet2).accept("John");
         */

        /*
        Function<Integer, Integer> square = n -> n*n;
        Function<Integer, Integer> triple = n -> 3*n;

        Function<Integer, Integer> fnCombined = square.andThen(triple);
        System.out.println(fnCombined.apply(5));

        Function<Integer, Integer> fnCompose = square.compose(triple);
        System.out.println(fnCompose.apply(5));
         */

        /*
        Predicate<Integer> gt10 = n -> n > 10;
        Predicate<Integer> lt20 = n -> n < 20;
        Predicate<Integer> p1 = gt10.and(lt20);
        Predicate<Integer> p2 = gt10.or(lt20);
        Predicate<Integer> p3 = gt10.negate();

        System.out.println(" " + p1.test(15) + " " + p2.test(9) + " " + p3.test(15));
         */
     }
}
