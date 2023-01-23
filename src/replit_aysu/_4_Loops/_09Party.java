package replit_aysu._4_Loops;

import java.util.Scanner;

public class _09Party {

    /*
    Use a loop to create a guest list for the party. Ask the user to enter the name of the first guest, store the name into the guest list and ask if they want to enter another guest name.
        If the user says yes then ask them for the next guest's name and repeat the process
        If the user says no then stop asking for names and display the final guest list

        For ex:
        Please enter the guest's name:
        Nick
        Do you want to enter another guest's name?
        yes
        Please enter the guest's name:
        Linda
        Do you want to enter another guest's name?
        no
        Guests' list: Nick, Linda
     */

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);

        //WRITE YOUR CODE BELOW

        String guestList="";

        while(true){

            System.out.println("Please enter the guest's name:");
            guestList += input.nextLine()+", ";
            System.out.println("Do you want to enter another guest's name?");

            if(input.nextLine().equalsIgnoreCase("no")){
                break;
            }
        }

        System.out.println("Guests' list: " + guestList.substring(0, guestList.length()-2));  // bunda -2 yaptik cunku yapmazsak son karakteri yazdirinca en sonda da vitgul koyuyor. Last index icin normalde length()-1 yapiyorduk, ama last index'i de almak istemedigimiz icin -2 yaptik


    }
}
