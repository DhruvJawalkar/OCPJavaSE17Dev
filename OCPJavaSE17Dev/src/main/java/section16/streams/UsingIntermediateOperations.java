package section16.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class UsingIntermediateOperations {
    public static void main(String[] args) {
        /*
        Stream<String> names = Stream.of("John", "George", "Ben");
        names.filter(s -> s.startsWith("G"))
                .forEach(System.out::println);
        */

        /*
        Stream<String> names = Stream.of("John", "John", "Ben");
        names.distinct().forEach(System.out::println);

        Stream<Integer> numbers = Stream.iterate(1, n -> n+2);
        numbers.skip(3)
                .limit(4)
                .forEach(System.out::println);
         */

        /*
        Stream<String> names = Stream.of("John", "George", "Ben");
        names.map(s -> s.length())
                .forEach(System.out::println);
         */

        /*
        List<String> zero = List.of();
        List<String> one = List.of("John");
        List<String> two = List.of("John", "George");
        List<String> three = List.of("John", "George", "Ben");
        Stream<List<String>> flatMapStream = Stream.of(zero, one, two, three);
        flatMapStream.flatMap(list -> list.stream()).forEach(System.out::println);
         */

        /*
        Stream<String> names = Stream.of("John", "George", "Benedict");
        //names.sorted().forEach(System.out::print);
        names.sorted(Comparator.comparing(String::length)).forEach(System.out::print);
         */

        Stream<String> names = Stream.of("John", "George", "Benedict");
        long count = names.filter(s -> s.startsWith("G"))
                .peek(System.out::print)
                .count();
        System.out.println(count);

    }
}
