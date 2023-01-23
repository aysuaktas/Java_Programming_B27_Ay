package replit_aysu._5_Arrays;

import java.util.Scanner;

public class _13SplitSentence {

    /*
    Given a String sentence use the split() method to divide each word from the sentence and print them in separate lines
        Hint: Think about what comes between each word in the sentence

        Ex: Input:
            Java is fun

            Output:
            Java
            is
            fun
     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TYPE YOUR CODE BELOW:

        // Cozumu replitten buldum. For each loop ile yapilmis:

        String[] words = sentence.split(" ");
        for (String eachWord : words) {
            System.out.println(eachWord);
        }

    }
}
