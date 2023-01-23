package day07_scanner;

import java.util.Scanner;  // bunu biz ekledik

public class _07FirstScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // how to make a Scanner variable/object
        // name olarak istedigini kullanabilirsin ama genelde input vs kullaniliyor -> common names for the object: scan, scanner, input, in, keyboard

        System.out.println("Plese enter a number");

        int number = input.nextInt();   //This is end of the statement oldugu icin ; koyduk sonuna, her zaman boyle olmuyor.
        // Syntax to call method:  Object.method()
        // name'imiz input oldugu icin once onu yazdik.

        System.out.println("This is your number: " + number);

    }
}
