package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class _12RemoveCountriesHomework {

    /*

    Remove Countries
        Create a method that will take an ArrayList of countries and returns an ArrayList of countries that have a length of less than 7
            @param nums - The given ArrayList of numbers
            @return - ArrayList of numbers

                Ex:
                    Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
                    Output: "Japan", "Korea", "Turkey", "Canada"
     */

    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));

        ArrayList<String> byLength = new ArrayList<>(countries);
        byLength.removeIf(name -> name.length() >= 7);  // Syntax for lambda: variable -> boolean expression
        System.out.println(byLength);  // [Japan, Korea, Turkey, Canada]

    }
}
