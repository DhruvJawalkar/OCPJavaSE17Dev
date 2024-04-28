package section12.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class CommonCollectionMethods {
    public static void main(String[] args){
        /*
        List<String> name = new ArrayList<>();
        //var can do local variable type inference
        var names2 = new ArrayList<>();
         */

        /*
        Collection<String> names = new ArrayList<>();
        System.out.println(names.add("John"));
        System.out.println(names.add("John"));

        Collection<String> namesSet = new HashSet<>();
        System.out.println(namesSet.add("John"));
        System.out.println(namesSet.add("John"));
         */

        /*
        Collection<String> names = new ArrayList<>();
        names.add("John");
        names.add("George");
        names.add("John");

        System.out.println(names);
        System.out.println(names.remove("John"));
        System.out.println(names.remove("Luke"));
         */

        /*
        Collection<String> names = new ArrayList<>();
        System.out.println(names.isEmpty());

        names.add("John");
        names.add("George");
        names.add("Luke");
        System.out.println(names.size());
         */

        /*
        Collection<String> names = new ArrayList<>();
        names.add("John");
        names.add("George");
        names.add("John");

        names.clear();
        System.out.println(names.size());

        names.add("John");
        names.add("George");
        names.add("John");
        System.out.println(names.contains("George"));
        System.out.println(names.contains("Luke"));
         */

        /*
        Collection<String> names = new ArrayList<>();
        names.add("John");
        names.add("George");
        names.add("Luke");

        names.removeIf(s -> s.length() > 4);
        System.out.println(names);
         */

        Collection<String> names = new ArrayList<>();
        names.add("John");
        names.add("George");
        names.add("Luke");

        names.forEach(s -> System.out.print(s + ", "));
    }
}
