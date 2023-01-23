package day18_loops;

import java.util.Scanner;

public class _07HowManyPositiveOrNegativeHomework {

    public static void main(String[] args) {

        /*
        write a program that will ask the user to enter 5 numbers and print how many were positive and how many were negative
         */

        // Merve'nin cozumu uzerinden yaptim, kendim yapmadim;

        Scanner input = new Scanner(System.in);

        int count = 0;
        int positive = 0;
        int negative = 0;
        int zero = 0;


        while(count++ < 5) {

            System.out.println("Please enter 5 numbers!");
            int numberInput = input.nextInt();   // user input 5 times because it is inside the while loop. --> Kac kere numara olacagi condition'a bagli oldugu icin while loop'tan once degil de buraya yazdik. ((For loop'u ogrenince onunla daha iyi olurmus bu, Furkan'a gore))


            if (numberInput > 0) {
                positive += 1;  // positive = positive + 1;    // TODO: neden positive = positive++ olmadigini sot, ogren

            } else if (numberInput < 0) {
                negative += 1;
            } else {
                zero += 1;
            }

        }


        System.out.println("Positive number count: " + positive);

        System.out.println("Negative number count: " + negative);

        System.out.println("Zero number count: " + zero);


    }
}
