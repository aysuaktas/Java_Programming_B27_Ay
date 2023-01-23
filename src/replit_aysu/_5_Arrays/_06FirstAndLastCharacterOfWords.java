package replit_aysu._5_Arrays;

import java.util.Scanner;

public class _06FirstAndLastCharacterOfWords {

    /*
   Given a String [] words print the first and last character of each String element in the array. Print the first and last character in the same line with no spaces.
        Note: The loop used in the given code is to dynamically create the String array. You don't need to fully understand this part yet, focus only on having access to an array.

        Ex:
        Input:
        ["hello", "why", "by", "apple" , "note"]

        Output:
         ho
         wy
         by
         ae
         ne
     */

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        //WRITE YOUR CODE BELOW:


        String result = "";
        for (int i = 0; i < words.length; i++) {
            result = words[i];

            // First way:
            System.out.println("" + result.charAt(0) + result.substring(result.length() - 1));
        }


            // Second way:
            // System.out.println(result.substring(0,1) + result.substring(result.length()-1));


        /*
            // Third way: for each ile de yapilabilir:  --> Anam Zahra's solution:

        for(String eachWord :words){
            String firstLast = eachWord.charAt(0) + "" + eachWord.charAt(eachWord.length()-1);
            System.out.println(firstLast);
        }

         */


        /*
        // 4th way:  --> Busra Yagiz's solution:
        char first = ' ';
        char last = ' ';
        for(String d : words){
            first = d.charAt(0);
            last = d.charAt(d.length()-1);
            System.out.println(first + "" + last);
        }

         */


    }
}
