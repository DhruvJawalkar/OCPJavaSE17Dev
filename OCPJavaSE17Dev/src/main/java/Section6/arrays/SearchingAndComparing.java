package Section6.arrays;

import java.util.Arrays;

public class SearchingAndComparing {
    public static void main(String[] args) {
        /*
        int[] nums = {3, -1, 17};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.binarySearch(nums, -1));
        System.out.println(Arrays.binarySearch(nums, 3));
        //-ve numbers indicate does not exist in array but placement position would be n if returns -n
        //ex: -1 indicates, doesn't exist but placement position would be 1st in the array
        System.out.println(Arrays.binarySearch(nums, -2));
        System.out.println(Arrays.binarySearch(nums, 0));
        System.out.println(Arrays.binarySearch(nums, 2));
        System.out.println(Arrays.binarySearch(nums, 4));
        System.out.println(Arrays.binarySearch(nums, 16));
        System.out.println(Arrays.binarySearch(nums, 18));
         */

        /*
        System.out.println(Arrays.compare(new int[]{3, 7}, new int[]{3}));
        System.out.println(Arrays.compare(new int[]{3, 7}, new int[]{3, 7}));
        System.out.println(Arrays.compare(new String[]{"ab", "John Wayne"}, new String[]{"abc", "Hey!"}));
        System.out.println(Arrays.compare(new String[]{"xy", "John Wayne"}, new String[]{"abc", "Hey!"}));
        System.out.println("xy".compareTo("abc"));
        System.out.println(Arrays.compare(new String[]{"John", "Wayne"}, new String[]{"john", "Doe"}));
        System.out.println(Arrays.compare(new String[]{"ab", "John Wayne"}, null));
         */

        // Arrays.mismatch()
        // returns -1 if arrays are equal, otherwise the first index where they differ
        System.out.println(Arrays.mismatch(new String[]{"John", "Wayne"}, new String[] {"John", "Doe"}));

        String[] arr1 = new String[]{"John", "Wayne"};
        String[] arr2 = new String[]{"John", "Wayne", "The Duke"};
        System.out.println(Arrays.mismatch(arr1, arr2));

        System.out.println(Arrays.mismatch(new int[]{3, -2, 7}, new int[]{3, -2, 7}));
    }
}
