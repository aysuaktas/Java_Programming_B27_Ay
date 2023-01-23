package replit_aysu._2_Statements;

import java.util.Scanner;

public class _27_ConfirmationBot {

    public static void main(String[] args) {

        /*
        Use a switch statement to create a confirmation bot. Given a response value as a char, output a message based on the following:
        if the response is y print the message: Your request is being processed
        if the response is n print the message: Thank you for your consideration
        if the response is h print the message: Sorry, no live agents are currently available
        if the response is anything other than y, n, or h print: Invalid entry, please try again
         */

        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);
        //WRITE YOUR CODE BELOW

        switch (response){

            case 'y':
                System.out.println("Your request is being processed");
                break;

            case 'n':
                System.out.println("Thank you for your consideration");
                break;

            case 'h':
                System.out.println("Sorry, no live agents are currently available");
                break;

            default:
                System.out.println("Invalid entry, please try again");

        }


    }
}
