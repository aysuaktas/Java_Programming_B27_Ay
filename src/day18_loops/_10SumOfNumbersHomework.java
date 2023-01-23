package day18_loops;

import java.util.Scanner;

public class _10SumOfNumbersHomework {

    /*
    Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
     */

    public static void main(String[] args) {

        // Ben yapmadim. Merve'nin cozumu:

        int sum = 0;
        int number;
        boolean run = true;

        Scanner input = new Scanner(System.in);

        while(run){
            System.out.println("Enter a number:");
            number = input.nextInt();
            if(number >= 0){
                sum += number;
            } else {
                System.out.println("You entered a negative number");
                run = false;
            }
        }





    }
}
