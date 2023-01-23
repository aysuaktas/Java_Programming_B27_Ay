package replit_aysu._2_Statements;

import java.util.Scanner;

public class _29_ComputerBuilder {

    /*
    Create a program that will build a custom computer by selecting each part and computing the total price. Use the following requirements for each section:
    First ask the user about the screen size

    Select screen size:

    For a screen size of 13.3, add $200 to the total price
    For a screen size of 15.0, add 300 to the total price
    For screen size of 17.3, add $400 to the total price
    Then ask the user about the CPU

    Select CPU type:

    For a CPU of i3, add $150 to the total price
    For a CPU of i5, add $250 to the total price
    For a CPU of i7, add $350 to the total price
    Then ask the user about the RAM size

    Select RAM size:

    Add $50 to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4
    Then ask the user about the storage type and amount

    Select storage type:

    Select storage size:

    For HDD, add $50 to the total price for every 500GB
    For SSD, add $100 to the total price for every 500GB
    Then ask the user about the screen resolution

    Select screen resolution:

    For FULLHD, add $100 to the total price
    For 4K, add $200 to the total price
    ** At the end display the total price of the custom computer**

     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalPrice = 0;

        System.out.println("Select screen size:");
        double screenSize = input.nextDouble(); // switch'te double olmadigi icin bunu if ile yaptim

        if (screenSize == 13.3){
            totalPrice =+ 200; // totalPrice = totalPrice + 200;
        } else if (screenSize == 15.0){
            totalPrice =+ 300;
        } else if (screenSize == 17.3){
            totalPrice =+ 400;
        }

        System.out.println("Select CPU type:");
        String cpuType = input.next();

        switch(cpuType){
            case "i3":
                totalPrice += 150;
                break;
            case "i5":
                totalPrice += 250;
                break;
            case "i7":
                totalPrice += 350;
                break;
        }


        System.out.println("Select RAM size:");
        int ramSize = input.nextInt();

        totalPrice += (ramSize / 4) * 50;  //TODO: neden? ogren?


        // Add $50 to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4



        System.out.println("Select storage type:");
        String storageType = input.next();



        System.out.println("Select storage size:");
        int storageSize = input.nextInt();


        /*
        Select storage type:

        Select storage size:

        For HDD, add $50 to the total price for every 500GB
        For SSD, add $100 to the total price for every 500GB
         */

        switch (storageType){
            case "HDD":
                totalPrice += (storageSize/500)*50;
                break;
            case "SSD":
                totalPrice += (storageSize/500)*100;
        }

            // TODO: neden? ogren?



        System.out.println("Select screen resolution:");
        String screenResolution = input.next();

        switch(screenResolution){
            case "FULLHD":
                totalPrice += 100;
                break;
            case "4K":
                totalPrice += 200;
                break;
        }



        System.out.println("Final price is: $" + totalPrice);

    }
}


