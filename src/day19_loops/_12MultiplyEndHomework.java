package day19_loops;

import java.util.Scanner;

public class _12MultiplyEndHomework {

    /*
    Given a String and a number return a String that has the ending character duplicated and attached by the number amount of times

	Ex:
		Input:
			Hello?
			3
		Output:
			Hello????

	Ex:
		Input:
			java
			5
		Output:
			javaaaaaa
     */

    public static void main(String[] args) {

        /* Huseyin Isir's solution;


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();
        System.out.println("Enter a number");
        int number = scan.nextInt();

        for (int i = number; i > 0; i--) {                  // Ilk siraya yazdigimiz nereden baslayacagimiz -> int i = number yani user kac kere tekrarlanmasini istiyorsa o number. Oradan basliyoruz ve her seferinde birer azaltiyoruz ve i > 0 dedik ki infinite loop olmasin
            word += "" + word.charAt(word.length()-1);  // word.charAt(word.length()-1); kismi last character'i tespit etmek icin. Cunku user'in yazdigi number kadar ayni harften yazacagimiz harf -> sondaki
        }

        System.out.println(word);


            // Enter'layinca console'da;
        Enter a word
        love  --> yazinca
        Enter a number
        3  --> yazinca
        loveeee
         */


        // Saim's solution:

        String str = "hello";
        int end = 3;

        for(int i = 0; i < end; i++){    // int i = 1; i <= end
            str += str.charAt(str.length() -1); // the character at the last index
        }

        System.out.println(str);

    }
}
