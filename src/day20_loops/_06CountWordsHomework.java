package day20_loops;

import java.util.Scanner;

public class _06CountWordsHomework {

    /*
    Given a sentence determine how many words are in the String.
        Ex:
            Input:
                This has multiple words
            Output:
                4
     */

    //Saim'in Github'a yukledigi solution: //TODO: cok anlamadim, tekrar bak

    public static void main(String[] args) {


        String s = "This has multiple words";
        int spaces = 1; // the number of words would be "1 more" than the total number of spaces, so we can start from 1

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                spaces++;
            }
        }

        System.out.println(spaces);


        // Alternative:

        String str = "This has multiple words";;
        int count = 1;

        while(str.contains(" ")){
            count++;
            str = str.replaceFirst(" ", "");
        }
        System.out.println(count);



        /* Huseyin's solution:

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String word = scan.nextLine();
        int numberOfWords = 0;

        if (word.length() > 0) {
            numberOfWords = 1;
        }

        for (int i = 0; i < word.length(); i++) {
            char eachWord = word.charAt(i);
            if (eachWord == ' ') {
                numberOfWords++;
            }
        }
        System.out.println("numberOfWords = " + numberOfWords);

         */


        // Zeynep's solution:
        String sentence = "This has multiple words";
        int numberOfTheWords = 1;

        for (int i = 0; i < sentence.length(); i++) {
            char space = sentence.charAt(i);
            if (space == ' ') {
                numberOfTheWords++;
            }
        }
        System.out.println(numberOfTheWords);


    }
}

