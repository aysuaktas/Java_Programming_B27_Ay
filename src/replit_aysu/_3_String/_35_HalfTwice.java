package replit_aysu._3_String;

import java.util.Scanner;

public class _35_HalfTwice {

    /*
    Use String methods to print the first half of the given word, twice. Find the beginning half of the String and concatenation it twice.
------------------
      Ex:
     Input:
       java

     Output:
       jaja
  ------------------
          Ex:
     Input:
       unity

     Output:
      unun
     */

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE



        int lengthOfWord = word.length();
        int halfOfLength = word.length() /2; //kelimenin uzunlugunun yarisini aldim

        System.out.print(word.substring(0, halfOfLength)); //yan yana yazmasi icin print method kullandim --> ilk harften kelimenin yarisina kadar gelmesi icin 0, halfOfLength seklinde yaptim
        System.out.println(word.substring(0, halfOfLength));



        /* Baskasinin paylastigi cozum;

        word = word.substring(0, word.length() /2);
        System.out.println(word+word);

         */







    }
}
