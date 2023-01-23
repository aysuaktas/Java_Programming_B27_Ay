package replit_aysu._3_String;

import java.util.Scanner;

public class _38_LongestWord {

    /*
    Use String methods and if statements to find which of the given words is the longest one. Compare the two inputs word1 and word2 and print the word with more characters.
     */

    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINE/LINES.
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        //WRITE YOUR CODE BELOW:

        int lengthOfFirst = word1.length();
        int lengthOfSecond = word2.length();

        if(lengthOfFirst > lengthOfSecond){
            System.out.println(word1);
        } else if(lengthOfSecond > lengthOfFirst){
            System.out.println(word2);
        } else {
            System.out.println("Their length are equal");
        }  // if they are equal

    }
}
