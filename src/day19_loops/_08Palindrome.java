package day19_loops;

import java.util.Scanner;

public class _08Palindrome {

    /*
    given a String determine if it is palindrome
    palindrome means the String is read the same forwards and backwards  // bastan ve sondan okuyunca ayni olan seyler palindrome

    ex:
        anna
        racecar
        maam
        abcba
     */

    public static void main(String[] args) {


        /*  // todo: denerken yarim kaldi, bitir bunu, muhtemelen yanlis yoldan denemeye basladin ama :D

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word");
        String word = input.next();
        int length = word.length();
        int halfOfLength = word.length() /2 ;

        for (int i = 0; i < halfOfLength ; i++) {
            System.out.println(word.substring(0, halfOfLength +1) + word.substring(halfOfLength, length));
            System.out.println(word);
        }
         */


        // Saim's solution:

        String s = "anna";
        String reverse = "";
        // reverse my String, read it back from last index to first, backwards

        for(int i = s.length() -1; i >= 0; i--){   // i is just a number, but using length - 1 allows me to find the last index of the String, that means we can use that index to read characters
            reverse += (s.charAt(i));  // if I concatenate to my reverse variable --> reverse = reverse + s.charAt(i);   i -> whatever the character
        }

        System.out.println(reverse);


        if (s.equals(reverse)){
            System.out.println("Polindrome");
        } else {
            System.out.println("Not Polindrome");
        }

        // System.out.println(s.equals(reverse) ? "Palindrome" : "Not Palindrome");  --> if statement yerine ternary ile de yapabiliriz boyle


        /* Degisimi gormek icin hardcoded olarak -> String s = "abcde"; dersek console'da:
        edcba
        Not Polindrome

        // anna dersek -> console'da : anna
                                       Polindrome


         */







    }
}
