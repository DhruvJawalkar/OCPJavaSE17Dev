package section16.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Spliterator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("one", "two", "three", "four", "five");
        Stream<String> stream = names.stream();
        java.util.Spliterator<String> originalSpliterator = stream.spliterator();
        java.util.Spliterator<String> newSpliterator = originalSpliterator.trySplit();

        /*
        originalSpliterator.forEachRemaining(System.out::println);
        System.out.println("-------------------");
        newSpliterator.forEachRemaining(System.out::println);
         */
        originalSpliterator.tryAdvance(System.out::println);
        System.out.println("-------------------");
        originalSpliterator.forEachRemaining(System.out::println);
        System.out.println("-------------------");

        newSpliterator.tryAdvance(System.out::println);
        System.out.println("-------------------");
        newSpliterator.forEachRemaining(System.out::println);
    }
}
