package day13_switch_string;

import java.util.Scanner;

public class _01VendingMachine {

    /*
    In the vending machine, there will be some snacks and drinks. Each snacks and drinks will have some numbers.
        snacks
            1
            2
            3

         drinks
            4
            5
            6

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Vending Machine. Select the menu you want to see:\n\tSnacks\n\tDrinks");

        String menu = input.next();

        switch (menu){

            case "Snacks":
                System.out.println("Pick the snack number:\n1)Chips 2)Cookies 3)Pretzels 4)Candy");
                int snackOption = input.nextInt();

                if(snackOption == 1){
                    System.out.println("Chips are selected");
                } else if (snackOption == 2){
                    System.out.println("Cookies are my favourite");
                } else if (snackOption == 3){
                    System.out.println("Pretzels dispensing");
                } else if (snackOption == 4){
                    System.out.println("Candy is coming right up");
                } else {
                    System.out.println("It is not a valid item.");
                }
                // TODO: these are conditional statements. So, if I want, I can use switch inside of switch. This time, we see how it goes with if statement inside of the switch.

                break;   // this break belongs to the "Snacks" case

            case "Drinks":
                System.out.println("Pick the drink number:\n1)Juice 2)Soda");
                int drinkOption = input.nextInt();

                if (drinkOption == 1){
                    System.out.println("Giving juice");
                } else if(drinkOption == 2){
                System.out.println("Giving soda");
                 } else {
                System.out.println("It is an invalid drink number.");
                 }
        }



    }
}
