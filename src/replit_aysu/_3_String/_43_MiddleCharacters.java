package replit_aysu._3_String;

import java.util.Scanner;

public class _43_MiddleCharacters {

    /*
    Use String methods and if statements to find the middle character/s of the given word variable. The value of the word will be input from a Scanner, but you only need to interact with the String variable. Output in the following format:

    Note: Odd length words will have one middle character, but even length words will have two middle character, so use the length of the Strings to determine what the output should be.

    Ex: input -> oak        output -> a
    Ex: input -> java       output -> av
    Ex: input -> apples     output -> pl
     */

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW

        int lengthOfWord = word.length();
        int halfLength = lengthOfWord /2;

        if(lengthOfWord % 2 == 0){
            System.out.println(word.substring(halfLength -1, halfLength +1));  // ilkinden -1 yapip cikarmayi unutmustum, ona dikkat et.
        } else {  // lengthOfWord % 2 != 0;
            System.out.println("" + word.charAt(halfLength));
        }



    }
}
