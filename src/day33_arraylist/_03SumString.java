package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class _03SumString {

    /* It was yesterday's homework:
    String Sum

    Create a method that will accept an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList. Return the ArrayList of summed numbers
        Ex:
        Input:
            “123”, “34”, “513”   // Soru: 123 giriyorsak 1+2+3u istiyor. 34 ise 3+4 istiyor. 513 ise 5+1+3 istiyor.
        Output:
            [ 6, 7, 9 ]
     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "34", "513", "4913", "1248"));
        System.out.println(list);  // [123, 34, 513, 4913, 1248]
        System.out.println(sumDigits(list));  // [6, 7, 9, 17, 15]
    }

    public static ArrayList<Integer> sumDigits(ArrayList<String> list) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (String each : list) {  // each is every whole number as String format

            int sum = 0;

            for (String eachDigit : each.split("")) {  // splits the each into a String array where each digit is a separate element
                sum += Integer.parseInt(eachDigit);
            }
            nums.add(sum);
        }
        return nums;
    }



}
