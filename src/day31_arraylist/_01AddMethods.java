package day31_arraylist;

import java.util.ArrayList;

public class _01AddMethods {

    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>();  // this creates an empty ArrayList  -->  ArrayList only uses object (non-primitive) types (( only used with object types )). —> ((o yuzden wrapper class onem kazandi))
        System.out.println(letters.size());  // 0 -> empty cunku basta empty ArrayList olusturmustuk, onun size'i bu. --> (( size, how many elements are there'i veriyor bize))

        // add(element):  adds the element to the end of the ArrayList
        letters.add('j');
        letters.add('a');
        letters.add('v');
        letters.add('z');
        System.out.println(letters);  // [j, a, v, z] --> karakterleri ekleyince boyle oldu --> bunlar bir word degil, 4 separate elements.
        System.out.println(letters.size()); // 4 --> number of elements is 4 --> Karakterleri ekledikten sonraki size.


        // How to read elements?

        // reading from array: arrayName[index]

        // Reading elements from the ArrayList:
        //get(int): return the element at the given index number ---> returns to element
        System.out.println(letters.get(0));  // j --> first character ((index zero)) icin
        System.out.println(letters.get(1));  // a --> second character icin
        System.out.println(letters.get(2));  // v
        System.out.println(letters.get(3));  // z
        //  System.out.println(letters.get(4));  // IndexOutOfBoundsException

        // sona degil de basa veya ortaya falan bir letter eklemek istersem:
        // add(int, element):  adds the element at the given index number. All the other elements move position

        letters.add(0, '$');  // dollar sign da bir character
        System.out.println(letters);  // [$, j, a, v, z]
        System.out.println(letters.get(0)); // $
        System.out.println(letters.get(1)); // j

        letters.add(3, '8');
        System.out.println(letters);  // [$, j, a, 8, v, z]

    }
}
