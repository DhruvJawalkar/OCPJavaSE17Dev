package section16.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingResults {
    public static void main(String[] args) {
        /*
        var names = Stream.of("John", "George", "Luke");
        //String joined = names.collect(Collectors.joining("-"));
        //System.out.println(joined);

        double avg = names.collect(Collectors.averagingInt(String::length));
        System.out.println(avg);
         */

        /*
        var names = Stream.of("John", "George", "Luke", "Joe");
        TreeSet<String> treeset = names
                .filter(s -> s.startsWith("J"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(treeset);
         */

        /*
        var names = Stream.of("John", "George", "Luke", "Joe");
        //Map<String, Integer> map = names.collect(Collectors.toMap(s -> s, String::length));
        //Map<Integer, String> map = names.collect(Collectors.toMap(String::length, s -> s, (s1, s2) -> s1 + ";" + s2));
        Map<Integer, String> map = names.collect(Collectors.toMap(String::length, s-> s, (s1, s2) -> s1 + ";" + s2, TreeMap::new));
        System.out.println(map);
        System.out.println(map.getClass());
         */

        /*
        var names = Stream.of("John", "George", "Luke", "Joe");
        //Map<Integer, List<String>> map = names.collect(Collectors.groupingBy(s -> s.length()));
        //Map<Integer, Set<String>> map = names.collect(Collectors.groupingBy(s -> s.length(), Collectors.toSet()));
        //Map<Integer, Set<String>> map = names.collect(Collectors.groupingBy(s -> s.length(), TreeMap::new, Collectors.toSet()));
        Map<Boolean, List<String>> map = names.collect(Collectors.partitioningBy(s -> s.length() <= 4, Collectors.toList()));

        System.out.println(map);
         */

        record myData(int sum, double avg){};
        var numbers = Stream.of(1,2,3,4,5);
        myData data = numbers.collect(Collectors.teeing(Collectors.summingInt(n -> n), Collectors.averagingDouble(n -> n), myData::new));
        System.out.println(data);
    }
}
