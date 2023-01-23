package day15_string;

import java.util.Scanner;

public class _07Address_Saim_NewMethodForHomework {

    /*
    ask the user to enter their address as one input
    check which street the house is on and which side of street
    handle any extra spaces in the beginning or at the end of input address
    at the end, also print the address as all uppercase letters

	houses that have a house number starting with the numbers 500 are on the right side of the street while the address that start with the number 600 are on the left side of the street

	the street they are on is given in the address

		print the street by checking for these streets:

			drive: house on drive

			lane: house on lane

			ave: house on avenue

	Ex:

		Input:
			500312 road w drive, 98404

		Output:
			500312 ROAD W DRIVE, 98404
			house on the right side
			house on drive

	Ex:

		Input:
			600134 South lane, 500415

		Output:
			600134 SOUTH LANE, 500415
			house on the right side
			house on drive

     */

    // Ben yapmadim bunu. -> Saim's method:

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your address");
        String address = input.nextLine();

        address = address.toUpperCase();  // user all uppercase, all lowercase, veya first one uppercase rest of them lowercase olarak yazabilir. Case sensitivity-i kaldirmak icin bu methodu kullandi once. Soruda all uppercase istedigi icin uppercase kullandik

        address = address.trim();  // to handle any extra spaces in the beginning or end of input address

        System.out.println(address);

        /*
        at this point, we create the address from the console
        made all the character uppercase
        and remove extra spaces from the beginning and end

       TODO:     to do all the above steps at the same time, we could also chain our methods
                     String address = input.nextLine().toUppercase.trim();
                                              string -> string -> string
         However;
         Invalid use of chaining:
            String s = "abc"
            s.equals("abc").trim()
                boolean --> trying to use a String method
                X INVALID --> we cannot use String methods on a boolean type

             */


        if(address.startsWith("500")){
            System.out.println("House is on the right side");
        } else if(address.startsWith("600")){
            System.out.println("House is on the left side");
        }

        if(address.contains("DRIVE")){  // everything'i uppercase yapacaktik, o yuzde DRIVE seklinde yazdik
            System.out.println("We are on Drive");
        } else if(address.contains("LANE")){
            System.out.println("We are on Lane");
        } else if(address.contains("AVE")){
            System.out.println("House on Avenue");
        }

        /*
        Please enter your address
        500123 S DRIVE, 31333  ---> console'da bunu yazarsak;
        500123 S DRIVE, 31333
        House is on the right side
        We are on Drive

         */

        System.out.println("----------------------------");


        /* Merve'nin method:

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your address:");
        String address = input.nextLine();
        address = address.trim();

        boolean drive = address.contains("drive");
        boolean lane = address.contains("lane");
        boolean avenue = address.contains("ave");

        boolean left = address.startsWith("600");
        boolean right = address.startsWith("500");

        if(drive){
            if(left){
                System.out.println(address.toUpperCase());
                System.out.println("house on the left side");
                System.out.println("house on drive");
            }else{    // right side
                System.out.println(address.toUpperCase());
                System.out.println("house on the right side");
                System.out.println("house on drive");
            }
        }else if (lane){
            if(left){
                System.out.println(address.toUpperCase());
                System.out.println("house on the left side");
                System.out.println("house on lane");
            }else{
                System.out.println(address.toUpperCase());
                System.out.println("house on the right side");
                System.out.println("house on lane");
            }
        }else if (avenue){
            if(left){
                System.out.println(address.toUpperCase());
                System.out.println("house on the left side");
                System.out.println("house on avenue");
            }else {
                System.out.println(address.toUpperCase());
                System.out.println("house on the right side");
                System.out.println("house on avenue");
            }
        }
         */











    }
}
