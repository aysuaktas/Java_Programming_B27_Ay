package day14_string;

import java.util.Scanner;

public class _04ScannerTrimHomework {

    /*
    Use scanner to read a String from the console
    Remove extra spaces in the beginning or end
    Print in all lowercase
    Print the number of characters
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence with putting extra spaces at the beginning and/or in the middle and/or and at the end");
        String sentence = input.nextLine();

        System.out.println(sentence.length()); // space'li halinin length'i

        sentence = sentence.trim();
        System.out.println(sentence); // bastaki ve sondaki extra bosluklari cikaran trim methoduyla reassign ettikten sonra print ettik

        sentence = sentence.toLowerCase();  // lowercase'e reassing ettik
        System.out.println(sentence);  // lowercase olarak reassign ettikten sonra print ettik

        System.out.println(sentence.length());   // trim'lenmis halinin length'i

        /*
        Run edince console'da;

             I    LoVe    YOU !     -> yazdim (basta, sonda, ortada space var
             31                     -> bastaki length
             I    LoVe    YOU !     -> trim ile begining ve end'deki space'ler cikarildi
             i    love    you !     -> all lowercase oldu
             18                     -> bastaki ve sondaki spacelerin cikarilmis halinin length'i
         */


    }
}
