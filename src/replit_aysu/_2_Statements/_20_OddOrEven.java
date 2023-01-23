package replit_aysu._2_Statements;

import java.util.Scanner;

public class _20_OddOrEven {

    /*
    Use an if statement to determine if the given int number is even or odd.
     */

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        //WRITE YOUR CODE BELOW

        if(number % 2 == 0){
            System.out.println(number + " is even");
        } else if (number % 2 == 1) {
            System.out.println(number + " is odd");
        } else if (number % 2 == -1){
            System.out.println(number + " is odd");
        }


    }
}
