package replit_aysu._4_Loops;

import java.util.Scanner;

public class _08_Vowels {

    /*
    Use a loop to print each vowel( a, e, i, o, u) from the given word

        Ex:
            Input:
                 apple

             Output:
                 ae
     */

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        //WRITE YOUR CODE BELOW

        for (int i = 0; i <= word.length() - 1; i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u') {
                System.out.print(word.charAt(i));
            }
        }


    }
}
