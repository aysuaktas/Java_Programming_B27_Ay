package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class _05BulkMethods2 {

    public static void main(String[] args) {

        /*  Bulk Operation Methods2 - konunun devami:

        containsAll( collection type ): checks if every elements from the given argument is in the ArrayList

        retainAll( collection type ): keeps all the defined elements, but deletes all the others

         */

        System.out.println("----------containsAll method:");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4, 1, 1, 2, 3, 4, 5, 1, 4, 14, 4, 5, 123));
        System.out.println("contains 4: " + nums.contains(4));  // contains 4: true
        System.out.println("contains 4 & 5: " + (nums.contains(4) && nums.contains(5)));  // contains 4 & 5: true
        System.out.println("checking with containsAll: " + nums.containsAll(Arrays.asList(4, 3, 5, 1)));  // checking with containsAll: true
        System.out.println("checking with containsAll: " + nums.containsAll(Arrays.asList(4, 3, 5, 6)));  // checking with containsAll: false

        System.out.println("-------------retainAll method:");

        nums.retainAll(Arrays.asList(123, 4, 14, 0));  // everything else will be deleted aslinda bunda---> retain an element that does not exist: the method will just return false
        System.out.println(nums);  // [4, 4, 4, 14, 4, 123]

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('c', 'a', 'c', 'e', 'a', 'z'));
        letters.retainAll(Arrays.asList('a', 'z'));  // a ve ze olmayanlar silinecek
        System.out.println(letters);  // [a, a, z]

        System.out.println("-------------\nHow many vowels: ");

        // A task: ---> Given a String determine how many vowels it has:

        String s = "implementation";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(""))); // converts the String to an ArrayList where each character a different element
        list.retainAll(Arrays.asList("a", "e", "i", "o", "u"));
        System.out.println(list.size()); // 6
        System.out.println(list);  // [i, e, e, a, i, o]


    }
}
