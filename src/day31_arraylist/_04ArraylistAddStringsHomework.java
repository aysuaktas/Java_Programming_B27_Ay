package day31_arraylist;

import java.util.ArrayList;

public class _04ArraylistAddStringsHomework {

    /*

    Practice flow:

            Create an ArrayList of Strings
                add these elements:
                     add Hat
                     add Shoes
                     add Jacket in middle of Hat and Shoes
                     add Towel in the beginning
                     add Car between Towel and Hat

      Print the ArrayList after each action to see how the change is made

     */

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Hat");
        System.out.println(words);  // [Hat]

        words.add("Shoes");
        System.out.println(words);  // [Hat, Shoes]

        // add(int, element):  adds the element at the given index number. All the other elements move position:
        words.add(1, "Jacket");
        System.out.println(words);  // [Hat, Jacket, Shoes]

        words.add(0, "Towel");
        System.out.println(words);  // [Towel, Hat, Jacket, Shoes]

        words.add(1, "Car");
        System.out.println(words);  // [Towel, Car, Hat, Jacket, Shoes]


    }
}
