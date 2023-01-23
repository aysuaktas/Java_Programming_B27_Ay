package day12_switch;

import java.util.Scanner;

public class _07SeasonFinderHomework {

    /*

    declare and assign a month number. Bases on the below data determine what season it is and what kind of clothes to wear. You can create your own expectations of what kind of clothes to wear based on the month


	12, 1, 2 	--> Winter
	3, 4, 5 	--> Spring
	6, 7, 8 	--> Summer
	9, 10, 11 	--> Fall

    Ex:
	2
	It is winter, so wear a winter coat, gloves and a hat

     */

    public static void main(String[] args) {

        // I did not declare and assign a month number because I did it as Scanner.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month number to see what season it is and what kind of clothes to wear:");

        int monthNumber = input.nextInt();

        switch(monthNumber){

            case 1:
                System.out.println("January is in Winter. So, you can wear coat, gloves, and a hat.");
                break;

            case 2:
                System.out.println("February is in Winter. So, you can wear coat, gloves, and a hat.");
                break;

            case 3:
                System.out.println("March is in Spring. So, you can wear a dress, t-shirt and raincoat.");
                break;

            case 4:
                System.out.println("April is in Spring. So, you can wear a dress, t-shirt and raincoat.");
                break;

            case 5:
                System.out.println("May is in Spring. So, you can wear a dress, t-shirt and raincoat.");
                break;

            case 6:
                System.out.println("June is in Summer. So, you can wear a dress, bikini, and slipper.");
                break;

            case 7:
                System.out.println("July is in Summer. So, you can wear a dress, bikini, and slipper.");
                break;

            case 8:
                System.out.println("August is in Summer. So, you can wear a dress, bikini, and slipper.");
                break;

            case 9:
                System.out.println("September is in Fall. So you can wear a raincoat and waterproof shoes.");
                break;

            case 10:
                System.out.println("October is in Fall. So you can wear a raincoat and waterproof shoes.");
                break;

            case 11:
                System.out.println("November is in Fall. So you can wear a raincoat and waterproof shoes.");
                break;

            case  12:
                System.out.println("December is in Winter. So, you can wear coat, gloves, and a hat.");
                break;

            default:
                System.out.println("It is not a valid month number.");

        }




    }
}
