package section12.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(set.add("John"));
        System.out.println(set.add("George"));
        System.out.println(set.add("John"));

        System.out.println(set.toString());

        Set<String> set2 = new TreeSet<>();
        set2.add("John");
        set2.add("George");
        set2.add("Ben");

        System.out.println(set2.toString());
    }
}
