package replit_aysu._3_String;

import java.util.Scanner;

public class _31_BadWord {

    public static void main(String[] args) {

        /*
        Use String methods to take the given str, which has a bad word, and change the bad word into something nice. Print the fixed String
        Change the bad word dumb into cool

        Ex:
        Input:
          You are so dumb

        Output:
         You are so cool

     Ex:
        Input:
         I'm dumb for failing the quiz

        Output:
          I'm cool for failing the quiz
         */

        //DO NOT TOUCH THIS PART
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        //WRITE YOUR CODE HERE

        System.out.println(word.replace("dumb", "cool"));


    }
}
