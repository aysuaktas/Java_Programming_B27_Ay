package replit_aysu._3_String;

import java.util.Scanner;

public class _36_WithoutX {

    /*
    Use String methods to modify the given word based on the following rules:
    If word starts with or ends with x or X print the String without those x characters
    If there is no x or X as the first or last character print the word untouched
     */

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE


        // Baskasinin cozumu

        boolean beginsX= word.startsWith("x") || word.startsWith("X");
        boolean endX= word.endsWith("x") || word.endsWith("X");

        if (beginsX && endX) {
            System.out.println(word.substring(1, word.length()-1)); //length'ten 1 cikarinca son karakteri veriyor, onu dahil etmek istemedigimiz icin -1 yazip biraktik, zaten substring'de ikinci yazilan dahil olmuyordu
        } else if (beginsX) {
            System.out.println(word.substring(1));
        } else if (endX) {
            System.out.println(word.substring(0, word.length()-1));
        } else {
            System.out.println(word);
        }

        /* Ben asagidaki gibi denedim ama bir iki durumda hata verdi, replitten gecmedi. Ustteki cozum guzel.

        if (word.startsWith("x") || word.startsWith("X") && (word.endsWith("x") || word.endsWith("X"))){
            System.out.println(word.substring(1, word.length()));
        } else if (word.startsWith("x") || word.startsWith("X") && (!word.endsWith("x") || !word.endsWith("X"))){
            System.out.println(word.substring(1));
        } else if(word.endsWith("x") || word.endsWith("X") && (!word.startsWith("x") || !word.startsWith("X"))){
            System.out.println(word.substring(0, word.length()));
        } else if (!word.startsWith("x") || !word.endsWith("x") || !word.startsWith("X") || !word.endsWith("X")){
            System.out.println(word);
        }

         */



    }
}
