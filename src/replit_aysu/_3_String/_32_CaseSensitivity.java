package replit_aysu._3_String;

import java.util.Scanner;

public class _32_CaseSensitivity {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        String word = s.next();

        //WRITE YOUR CODE BELOW

        System.out.println("word: " + word);
        System.out.println("uppercase: " + word.toUpperCase());
        System.out.println("lowercase: " + word.toLowerCase());

        /*
        jAVa -> run edince console'a bunu yazarsak;
        word: jAVa
        uppercase: JAVA
        lowercase: java
         */

    }
}
