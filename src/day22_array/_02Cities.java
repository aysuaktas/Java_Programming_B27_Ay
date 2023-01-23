package day22_array;

import java.util.Arrays;

public class _02Cities {

    public static void main(String[] args) {

        // Cities as separate String variables. Not very reusable in the future:
        String city1 = "Chicago";
        String city2 = "West Palm";
        String city3 = "Miami";
        String city4 = "New York";
        String city5 = "Toronto";
        String city6 = "Houston";


        // make an array to store the cities:
        String[] cities = {"Chicago", "West Palm", "Miami", "New York", "Toronto", "Houston"};

        // access & print each city one at a time
        System.out.println(cities[0]); // Chicago   -> index number 0'da Chicago yaziyor, o yuzden it will be printed, gibi.
        System.out.println(cities[1]); // West Palm
        System.out.println(cities[2]); // Miami
        System.out.println(cities[3]); // New York
        System.out.println(cities[4]); // Toronto
        System.out.println(cities[5]); // Houston

        // print the whole array
        System.out.println(cities); // [Ljava.lang.String;@3f0ee7cb --> console'da bu cikiyor. It is like hash code, not readable, not good. I want to see the values, but I don't see them. So,

        // Arrays Class:
        System.out.println(Arrays.toString(cities));  // [Chicago, West Palm, Miami, New York, Toronto, Houston] cikiyor consola'da after we printed it.
        // Arrays.toString(cities)-> return your array object as in a String format


    }
}
