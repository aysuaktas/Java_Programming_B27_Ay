package replit_aysu._4_Loops;

import java.util.Scanner;

public class _03_Factorial {

    /*
    Use a loop to calculate the factorial of the given number n. In mathematics a factorial number is a positive integer that is the product of all the positive integers less than or equal to the n number. It is commonly written as n! In other words, a factorial value is the number multiplied to the number less than it, multiplied by the number less than it, repeating until 1. See the examples for clarification.

                 Ex:
             Input:
                  5

                Output:
                  120

             -> The calculation would be:
                  5 * 4 * 3 * 2 * 1 = 120
     */

    // bundan derste de yaptik ama onda String message ile yaptik bunda direkt print statement'e yazarak yaptim:

    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE:

        int factorial = 1;

        for(int i = n; i > 1; i--){

            factorial *= i;   //bunu for loop icine yazdik

        } System.out.println(factorial);

    }
}
