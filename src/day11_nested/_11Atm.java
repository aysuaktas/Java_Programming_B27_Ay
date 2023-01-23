package day11_nested;

import java.util.Scanner;

public class _11Atm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int validPasscode = 7021;                 // it is just a random number // passcode we need to give to be able to log in
        System.out.println("Welcome to the ATM. Enter your card and enter your passcode");
        int userPasscode = input.nextInt();   // passcode the user inputs

        if(userPasscode == validPasscode){
            System.out.println("Logged In!\nSelect a number\n\t1)Check Balance\n\t2)Withdraw\n\t3)Deposit");       // If we don't type 1, 2 or 3 -> bunlarin hicbiri yazilmayacak
            int selection = input.nextInt();    // Everytime we used scanner method (here is nextInt), user will enter sth.

            if(selection == 1){
                System.out.println("Your balance is: $1,000,000");
            } else if(selection == 2){
                System.out.println("How much do you want to withdraw?");
                System.out.println("Withdrawing $" + input.nextInt());  // whatever user types as withdraw number will be also here automatically. // normalde money icin double kullanmamiz lazim, boyle kullanmis bulununca degistirmedik ama..
            } else if (selection == 3){
                System.out.println("Enter the amount you want to deposit");
                System.out.println("Depositing $" + input.nextInt()); // whatever user types as deposit number will be also automatically here
            }

        } else {    // this 'else' belongs to the if on line 14
            System.out.println("Invalid passcode");
        }


        /*
        Welcome to the ATM. Enter your card and enter your passcode
        7021    // ---> yukarida belirledigimiz sayiyi yazdik validPasscode = userPasscode olmasi gerektigi icin. Baska bir sey yazarsak console'da -> Invalid passcode yaziyor
        Logged In!
        Select a number
	        1)Check Balance
	        2)Withdraw
	        3)Deposit    // burada olmayan mesela 5 vs dersek console'da devamina hicbir sey yazmiyor

	        3  -> dersek
	        Enter the amount you want to deposit
            1000 -> dersek
            Depositing $1000

         */

    }
}
