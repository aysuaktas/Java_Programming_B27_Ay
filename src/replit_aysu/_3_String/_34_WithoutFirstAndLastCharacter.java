package replit_aysu._3_String;

import java.util.Scanner;

public class _34_WithoutFirstAndLastCharacter {

    /*
    Use String methods to print the given word without the first character and another output of the word without the last character.

    Ex:
    Input:
      adobe

    Output:
     without first letter: dobe
     without last letter: adob
     */

    public static void main(String[] args) {

        //DO NOT TOUCH THIS PART
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE



        System.out.println("without first letter: " + word.substring(1));

        int lengthOfWord = word.length();
        int lastLetter = lengthOfWord -1;

        System.out.println("without last letter: " + word.substring(0, lastLetter));






    }
}
