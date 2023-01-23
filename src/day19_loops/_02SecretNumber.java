package day19_loops;

import java.util.Scanner;

public class _02SecretNumber {

    public static void main(String[] args) {

        /*

    write a program that will allow you to guess a secret number.
        Define a number in the code in a specific range, for example 1-100. Then the program is for the user to guess that number
        They will guess a number and get a response. They can keep guessing until they get is right
        give hints:
            number is bigger
            number is smaller

         bonus: keep track of the number of attempts it took to guess the number

         */

        int secretNumber = 87;
        int inputNumber;
        int attempts = 0;

        Scanner input = new Scanner(System.in);

        do{

            System.out.println("Guess a number");
            inputNumber = input.nextInt();

            if(inputNumber < secretNumber){
                System.out.println("Secret number is higher");  // Number will be bigger -> secret number is higher anlaminda
            } else if (inputNumber > secretNumber){
                System.out.println("Secret number is lower");   // secret number is lower anlaminda
            }

            attempts++;

        } while(secretNumber != inputNumber);  // secretNumber ile inputNumber is NOT matching oldugu surece it will run.

        System.out.println("Congrats! You guessed the number!");  // secretNumber = inputNumber olunca this will run

        System.out.println("You guessed the number in " + attempts + " attempts");  // limit koymadik, sadece ne kadar denemede bulduklarini soyledik


    }    // -> this is main method's closing brackets
}
