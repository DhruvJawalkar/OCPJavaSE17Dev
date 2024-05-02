package section16.streams;

import java.util.List;
import java.util.stream.Collectors;

public class PuttingThePipelineTogether {
    public static void main(String[] args) {
        var list = List.of("John", "George", "Paul", "Ringo");
        /*
        list.stream()
                .filter(s -> s.length()==4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
         */

        long count = list.stream()
                .filter(s -> s.length() == 4)
                .collect(Collectors.toList())
                .stream()
                .count();
        System.out.println(count);
    }
}
