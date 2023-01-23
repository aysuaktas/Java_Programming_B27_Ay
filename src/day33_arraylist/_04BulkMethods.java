package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class _04BulkMethods {

    /*
    Bulk Operation Methods:
	    the arguments of each methods are collection types

	    addAll( collection type ): add all the elements from the given argument to the ArrayList

	    removeAll( collection type ): removes every occurrence of every elements from the given argument

	    containsAll( collection type ):

	    retainAll( collection type ):
     */

    public static void main(String[] args) {

        System.out.println("Integer example:");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);

        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(6, 1, 5, 1224));

        nums.addAll(other);
        System.out.println("added from other to nums:");   // console'da rahat gorebolmek icin bunlari ekledik
        System.out.println(nums);  // [4, 6, 1, 5, 1224]

        nums.addAll(Arrays.asList(9, 2, 6, 35));
        System.out.println("added number using addAll:");
        System.out.println(nums);  // [4, 6, 1, 5, 1224, 9, 2, 6, 35]

        nums.addAll(0, Arrays.asList(4, 1, 5, 125));  // virgul oncesine 0 yazdik, 0. indexten baslatti bunlari
        System.out.println("added to the first index:");
        System.out.println(nums);  // [4, 1, 5, 125, 4, 6, 1, 5, 1224, 9, 2, 6, 35]

        nums.removeAll(Arrays.asList(1));  // tum 1'leri cikardik
        System.out.println("removed all occurrence of 1:");
        System.out.println(nums); // [4, 5, 125, 4, 6, 5, 1224, 9, 2, 6, 35]

        nums.removeAll(Arrays.asList(4, 5, 6));   // tum 4'leri, 5'leri ve 6'lari cikardik
        System.out.println("removed all the 4, 5, and 6:");
        System.out.println(nums);  // [125, 1224, 9, 2, 35]


        System.out.println("------------\nString example:");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("one", "two", "three", "one", "one", "Two", "One"));
        System.out.println(words);  // [one, two, three, one, one, Two, One]

        words.removeAll(Arrays.asList("one"));
        System.out.println("removed all 'one' with lowercase");
        System.out.println(words);  // [two, three, Two, One]


    }
}
