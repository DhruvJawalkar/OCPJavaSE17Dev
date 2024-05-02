package section16.streams;

import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        /*
        IntStream intStream = IntStream.of(7, 11, 21);
        OptionalDouble avg = intStream.average();
        //avg.ifPresent(System.out::println);
        System.out.println(avg.getAsDouble());
         */

        /*
        DoubleStream doubleStream = DoubleStream.of(3.14, 2.72, 1.618);
        doubleStream.forEach(System.out::println);
         */

        /*
        IntStream intStream = IntStream.range(2, 5);
        intStream.forEach(System.out::println);
         */

        /*
        IntStream intStream = IntStream.rangeClosed(2, 5);
        intStream.forEach(System.out::println);
         */

        /*
        Stream<String> objStream = Stream.of("John", "Paul", "George", "Ringo");
        objStream.mapToInt(String::length).forEach(System.out::println);
         */

        /*
        List<List<Integer>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList(1, 2, 3));
        listOfLists.add(Arrays.asList(4, 5));
        listOfLists.add(Arrays.asList(6, 7, 8, 9));
        System.out.println(listOfLists);

        IntStream intStream = listOfLists.stream().flatMapToInt(list -> list.stream().mapToInt(n-> n));
        intStream.forEach(System.out::print);
         */

        IntStream intStream = IntStream.range(2, 7);
        Stream<Integer> boxedStream = intStream.boxed();
        boxedStream.forEach(System.out::println);

        /*
        var myIntStream = IntStream.rangeClosed(2, 7);
        OptionalDouble avg = myIntStream.average();
        avg.ifPresent(System.out::println);

        System.out.println(avg.getAsDouble());
        System.out.println(avg.orElseGet(() -> Double.NaN));
         */

        /*
        var intStream = IntStream.of(7, 2, -4, 11, 27);
        IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getCount());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getSum());
         */
    }
}
