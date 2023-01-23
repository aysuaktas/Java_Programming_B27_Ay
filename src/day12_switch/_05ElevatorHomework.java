package day12_switch;

import java.util.Scanner;

public class _05ElevatorHomework {

    /*
    declare and assign a floor number variable. The floor number represent which floor you want the elevator to go to. After getting to each floor show the information of which companies are on that floor. Use the following data:

	floor 1 --> Lobby, StarBucks, Amazon Pick Up
	floor 2 --> NASA, Cydeo, Discover
	floor 3 --> Uber, Lyft, Chase
	floor 4 --> Rooftop, Lounge

	any other floor value --> Invalid Floor Selected
     */

    public static void main(String[] args) {

        // I did not declare and assign any floor number variable because I made it with Scanner to users decide the floor number.

        Scanner input = new Scanner(System.in);
        System.out.println("Which floor you want the elevator to go to?");

        int floor = input.nextInt();   // to make it hardcoded instead of dynamic (with Scanner), I could say int floor = 2;

       switch(floor){

           case 1:
               System.out.println("Lobby, Starbucks, and Amazon Pick Up are the companies on the first floor.");
               break;

           case 2:
               System.out.println("NASA, Cydeo, and Discover are the companies on the second floor.");
               break;

           case 3:
               System.out.println("Uber, Lyft, and Chase are the companies on the third floor.");
               break;

           case 4:
               System.out.println("Rooftop, and Lounge are the companies on the fourth floor.");
               break;

           default:  // any other floor value
               System.out.println("Invalid Floor Selected.");

       }

       /*
       // Saim's method;

        int floor = 4;
       String companies;

       switch(floor){

           case 1:
                companies = "Lobby, Starbucks, Amazon Pick Up";     // print statement ile de yapabilirdik
                break;  // stops the switch

           ... seklinde devam ediyor.


           case 4:
                companies = "Rooftop, Lounge";
                break;

           default:  // it can be placed anywhere in the switch, but it will be the case executed if no other case matches
                companies = "Invalid Floor Selected";
       }

         System.out.println("Floor " + floor + ": " + companies);

         when the int floor = 4 -----> in console -----> Floor 4: Rooftop, Lounge
         when the int floor = 7 -----> in console -----> Floor 7: Invalid Floor Selected
        */



    }
}
