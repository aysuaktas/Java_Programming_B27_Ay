package replit_aysu._3_String;

import java.util.Scanner;

public class _33_FirstAndLastCharacter {

    /*
    Use String methods to find the first and last character of the given word. The value of the word will be input from a Scanner, but you only need to interact with the String variable.
     */

    public static void main(String[] args) {

        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE


        // for first character, we use charAt(0) -> because index numbers starts from zero
        // for last character, kelimenin length'inden 1 cikaririz. Bunu sayisal deger olarak hesaplamamak icin "" ile concatenation yapmak lazim.

        int lengthOfWord = word.length();

        System.out.println("" + word.charAt(0) + word.charAt(lengthOfWord-1));

        // console'a aysu yazarsam -> first and last letter -> au



    }
}
