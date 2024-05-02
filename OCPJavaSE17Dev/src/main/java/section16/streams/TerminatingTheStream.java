package section16.streams;

import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminatingTheStream {
    public static void main(String[] args){
        /*
        Stream<String> names = Stream.of("John", "George", "Ben");
        System.out.println(names.count());
        */

        /*
        Stream<String> names = Stream.of("John", "George", "Ben");
        Optional<String> min = names.min((s1, s2) -> s1.length() - s2.length());
        min.ifPresent(System.out::println);

        Optional<?> minEmpty = Stream.empty().min((s1,s2) -> 0);
        System.out.println(minEmpty.isPresent());
         */

        /*
        Stream<String> names = Stream.of("John", "George", "Ben");
        Stream<String> infStream = Stream.generate(() -> "Luke");
        names.findAny().ifPresent(System.out::println);
        infStream.findAny().ifPresent(System.out::println);
         */

        /*
        Stream<String> names = Stream.of("John", "21", "Ben");
        Stream<String> infStream = Stream.generate(() -> "Luke");
        Predicate<String> predicate = s -> s!=null && s.length() > 0 && Character.isLetter(s.charAt(0));

        //System.out.println(names.anyMatch(predicate));
        //System.out.println(names.allMatch(predicate));
        //System.out.println(names.noneMatch(predicate));

        //System.out.println(infStream.anyMatch(predicate));
        //System.out.println(infStream.allMatch(predicate));
        */

        /*
        Stream<String> names = Stream.of("John", "George", "Ben");
        names.forEach(System.out::print);
         */

        /*
        Stream<String> myStream = Stream.of("L", "u", "k", "e");
        //String result = myStream.reduce("", (s1,s2)-> s1+s2);
        String result = myStream.reduce("", String::concat);
        System.out.println(result);

        Stream<Integer> stream = Stream.of(1,3,7,10);
        Integer mult = stream.reduce(1, (a,b) -> a*b);
        System.out.println(mult);
         */

        /*
        BinaryOperator<Integer> op = (a, b) -> a*b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> one = Stream.of(1);
        Stream<Integer> three = Stream.of(3, 7 ,10);

        empty.reduce(op).ifPresent(System.out::println);
        one.reduce(op).ifPresent(System.out::println);
        three.reduce(op).ifPresent(System.out::println);
         */

        /*
        Stream<String> names = Stream.of("John", "George", "Luke");
        int len = names.reduce(0, (c, s) -> c+s.length(), Integer::sum);
        System.out.println(len);
         */

        /*
        Stream<String> myStream = Stream.of("L", "u", "k", "e");
        StringBuilder result = myStream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);
        System.out.println(result.toString());
         */

        /*
        Stream<String> myStream = Stream.of("L", "u", "k", "e");
        TreeSet<String> result = myStream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(result.toString());
         */

        /*
        Stream<String> myStream = Stream.of("L", "u", "k", "e");
        TreeSet<String> result = myStream.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result.toString());
         */

        Stream<String> myStream = Stream.of("L", "u", "k", "e");
        Set<String> result = myStream.collect(Collectors.toSet());
        System.out.println(result.toString());
    }
}
