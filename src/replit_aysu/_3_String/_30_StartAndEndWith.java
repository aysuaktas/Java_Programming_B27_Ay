package replit_aysu._3_String;

import java.util.Scanner;

public class _30_StartAndEndWith {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        String word = s.next();

        //WRITE YOUR CODE BELOW

        System.out.println("Starts with a: " + word.startsWith("a"));
        System.out.println("Ends with e: " + word.endsWith("e"));


    }
}
