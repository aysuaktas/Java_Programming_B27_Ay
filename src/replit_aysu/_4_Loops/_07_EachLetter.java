package replit_aysu._4_Loops;

import java.util.Scanner;

public class _07_EachLetter {

    /*
    Use a loop to print each letter of the given word on a separate line

        Ex:
            Input:
                 hello

            Output:
                  h
                  e
                  l
                  l
                  o
     */

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        //WRITE YOUR CODE BELOW

        int i = 0;

        for(i = 0; i <= word.length() -1; i++){
            System.out.println(word.charAt(i));
        }

    }
}
