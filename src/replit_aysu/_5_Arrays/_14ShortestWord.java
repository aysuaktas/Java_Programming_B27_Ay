package replit_aysu._5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _14ShortestWord {

    /*
    Given a String str, find and print the shortest words. The String will have multiple words separated by commas and spaces. If there is words that have the same length, they should all be displayed at the end. Print all the shortest words in the following format:
          Input: word1, word2, word3, word4, etc...
            Output: [short1, short2, short3, etc...]
        Hint: Think about what comes between each word in the sentence

        Ex:  Input:
    olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

            Output:
    [old, cat, ray]
     */

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

        // Cozumu replitten buldum. For each loop ile yapilmis:
        // TODO: bu soruya tekrar bak

        String[] array = str.split(", "); //olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

        String shortWords = "";
        String shortestWord = array[0];

        for (String eachElement : array) {
            if (eachElement.length() < shortestWord.length()) {
                shortestWord = eachElement;
            }
        }

        for (String eachElement : array) {
            if (shortestWord.length() == eachElement.length()) {
                shortWords += eachElement+", ";
            }
        }

       // to print in array format
        String [] finalResult = shortWords.split(", ");

        System.out.println(Arrays.toString(finalResult));


    }

}
