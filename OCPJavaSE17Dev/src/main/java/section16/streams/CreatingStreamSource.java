package section16.streams;

import java.util.List;
import java.util.stream.Stream;


public class CreatingStreamSource {
    public static void main(String[] args){
        /*
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1,2,3);

        var list = List.of("1","2","3");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();
         */

        /*
        Stream<Double> randoms = Stream.generate(Math::random);
        randoms.forEach(System.out::println);

        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n+2);
        oddNumbers.forEach(System.out::println);
        */

        Stream<Integer> oddNumbersUnder50 = Stream.iterate(1, n -> n < 50, n-> n+2);
        oddNumbersUnder50.forEach(System.out::println);
    }
}
