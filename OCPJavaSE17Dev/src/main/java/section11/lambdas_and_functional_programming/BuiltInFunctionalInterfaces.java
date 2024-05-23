package section11.lambdas_and_functional_programming;

import java.time.*;
import java.util.function.*;

public class BuiltInFunctionalInterfaces {

    public static void main(String[] args){
        /*
        Supplier<LocalDateTime> dateTimeImpl = LocalDateTime::now;
        System.out.println(dateTimeImpl.get());
         */

        /*
        Consumer<String> consumerImpl = (s) -> System.out.println("Hello " + s + "!");
        consumerImpl.accept("John");

        BiConsumer<String, Integer> biConsumerImpl = (s, n) -> System.out.println("Hello " + s + ", age " + n +".");
        biConsumerImpl.accept("John", 32);
         */

        /*
        Predicate<Integer> gt10 = n -> n > 10;
        System.out.println(gt10.test(7) + " " + gt10.test(12));

        BiPredicate<Integer, Integer> gt = (n,m) -> n > m;
        System.out.println(gt.test(3, 2));
         */

        /*
        Function<Integer, Double> sq = (n) -> (double) n*n;
        System.out.println(sq.apply(2));

        BiFunction<String, Integer, String> concat = (name, age) -> name + age;
        System.out.println(concat.apply("John", 32));
         */

        /*
        UnaryOperator<Integer> negative = n -> -n;
        UnaryOperator<String> shout = String::toUpperCase;

        System.out.println(negative.apply(7));
        System.out.println(shout.apply("John"));

        BinaryOperator<Integer> sum = Integer::sum;
        BinaryOperator<String> con = String::concat;
        System.out.println(sum.apply(2, 3));
        System.out.println(con.apply("John", "Wayne"));
         */
    }
}
