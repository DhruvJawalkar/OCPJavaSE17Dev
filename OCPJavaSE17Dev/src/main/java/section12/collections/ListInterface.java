package section12.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        /*
        String[] names = new String[]{"John", "George", "Luke"};
        List<String> namesList = Arrays.asList(names);
        //names[0] = "John 2";
        //namesList.set(0, "John 2");
        //namesList.add("Ben");

        System.out.println(Arrays.toString(names));
        System.out.println(namesList.toString());
         */

        /*
        List<String> namesList = List.of("John", "George", "Luke");
        namesList.add("Ben");
         */

        /*
        List<String> namesList = new ArrayList<>();
        namesList.add("John");
        List<String> namesListCopy = List.copyOf(namesList);
        namesListCopy.add("George");
         */

        /*
        List<String> namesList = List.of("John");
        List<String> copy = new ArrayList<>(namesList);
        copy.add("George");
        System.out.println(copy.toString());

        List<String> newList = new ArrayList<>(5);
         */

        /*
        List<String> namesList = new ArrayList<>();
        namesList.add("John");
        namesList.replaceAll(s -> s+" A.");

        System.out.println(namesList.toString());
         */

        /*
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(7);
        nums.add(11);

        nums.remove(2);
        System.out.println(nums.toString());

        nums.remove(Integer.valueOf(2));
        System.out.println(nums.toString());
         */

        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(4);

        Object[] objArray = myList.toArray();
        System.out.println(Arrays.toString(objArray));

        Integer[] intArray = myList.toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArray));
    }
}
