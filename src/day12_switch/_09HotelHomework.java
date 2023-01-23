package day12_switch;

import java.util.Scanner;

public class _09HotelHomework {

    /*
    Ask the user how many days they will stay at the hotel
    Then ask the user how many people are in their party (how many people are staying in the room)

    Use those two information to determine the price and room type for the hotel based on the below data:

	party size: 1
	room type: single room
	price: number of days * 100

	party size: 2
	room type: double room
	price: number of days * 125

	party size: 3 or 4
	room type: large room
	price: number of days * number of people * 150

	party size: 5, 6, or 7
	room type: suite
	price: number of days * 5000

	any other party size:
		Display one message:
			Sorry we don't have any available rooms for that size party

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Java hotel!");
        System.out.println("How many days you will stay at the hotel?");
        int numberOfDays = input.nextInt();
        System.out.println("How many people there will be in your party? (How many people will stay in your room?)");
        int partySize = input.nextInt();    // party size = number of people
        String roomType = "0";
        double price = 0;

        switch(partySize) {

            case 1:
                roomType = "single room";
                price = numberOfDays * 100;
                break;

            case 2:
                roomType = "double room";
                price = numberOfDays * 125;
                break;

            case 3:
                roomType = "large room";
                price = numberOfDays * partySize * 150;
                break;

            case 4:
                roomType = "large room";
                price = numberOfDays * partySize * 150;
                break;

            case 5:
                roomType = "suite";
                price = numberOfDays * 5000;
                break;

            case 6:
                roomType = "suite";
                price = numberOfDays * 5000;
                break;

            case 7:
                roomType = "suite";
                price = numberOfDays * 5000;
                break;

            }

            if(partySize < 1 || partySize > 7){
                System.out.println("Sorry we don't have any available rooms for that size party.");
            } else
                System.out.println("In our hotel, our room type is " + roomType + " with the price of " + price + " for the " + partySize + " people for " + numberOfDays + " days.");


            /* Saim's method -> // o da Scanner ile yapti, basini yamadim ayni diye

            String roomType = "0";
            double price = 0;

        switch(partySize) {

            ......

            case 3:
            case 4:
                roomType = "Large room";
                price = numberOfDays * partySize * 150;
                break;
                // same thing yazilacagi icin bu ikisini birlikte ele aldi. Ayni sekilde, case 5, 6 ve 7yi de kendi iclerinde birlikte ele alip bu sekilde yazdi.

            case 5:
            case 6:
            case 7:
                roomType = "Suite";
                price = numberOfDays * 5000;
                break;

            default:
                roomType = "Sorry we don't have any available rooms for that size party.";
                price = 0;    // price ve roomType bir yerde mutlaka assign edilmeli. Saim price'i basta assign etmedi ama burada etti. If they do not value, Java cannot use it, so you need to assign it somewhere in the code.

            }

            System.out.println(roomType);
            System.out.println(price);

             */


        }
    }
