package section12.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MapInterface {
    public static void main(String[] args) {
        /*
        Map<Integer, String> map = Map.of(1, "John", 2, "George", 3, "Luke");
        System.out.println(map);
        //map.put(4, "Ben");
        //System.out.println(map);
         */

        /*
        Map<Integer, String> map = new HashMap<>();
        map = Map.ofEntries(
          Map.entry(1, "John"), Map.entry(2, "George"), Map.entry(3, "Luke")
        );
        //System.out.println(map);
        //map.put(4, "Ben");

        map.forEach((k,v) -> System.out.println("Key: "+k + " Value: " + v));
        map.values().forEach(System.out::println);

        map.entrySet().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
         */

        /*
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "John");

        String oldName = map.replace(1, "George");
        System.out.println(oldName);
        System.out.println(map);

        map.putIfAbsent(2, "Luke");
        map.putIfAbsent(1, "Ben");
        System.out.println(map);
         */

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "John");
        map.put(2, "George");
        System.out.println(map);

        BiFunction<String, String, String> biFunction = (s1, s2) -> s1.length() >= s2.length() ? s1 : s2;
        map.merge(1, "Joe", biFunction);
        map.merge(2, "George II", biFunction);
        System.out.println(map);
    }
}
