package day11_nested;

import java.util.Scanner;

public class _17PinCodeSsnHomework {

    /*
    declare and assign two expected numbers:
	pincode: 1234
	ssn: 1111

    ask the user to enter the two numbers and compare them with the system values defined above. If they match print Authentication successful

    if they don't match print all the reasons that authentication failed:

	if the pincode was incorrect print: Pin Code is incorrect
	if the ssn was incorrect print: Last 4 SSN numbers are incorrect
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int validPincode = 1234;
        int validSsn = 1111;

        System.out.println("Enter the two numbers");
        int userPincode = input.nextInt();
        int userSsn = input.nextInt();

        if((validPincode == userPincode) && validSsn == userSsn){
            System.out.println("Authentication successful");
        } else if((validPincode != userPincode) || validSsn != userSsn){
            System.out.println("Authentication failed");
                                                 // authentication olup olmadigini gorduk, eger yoksa olasi nedenleri de alta yazdik;

            if (validPincode != userPincode) {
                System.out.println("Pincode is incorrect");
            }

            if (validSsn != userSsn) {
                System.out.println("Last 4 SSN numbers are incorrect");
            }
        }

        /*

        //Saim named this class name as "Verify".
        Saim's method;

        int systemPin = 1234;
        int systemSsn = 1111;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your pincode:");  // same line icin println yerine print kullanabiliriz'i hatirlatti
        int inputPin = input.nextInt();
        System.out.print("Please enter your last 4 digits of SSN:");
        int inputSsn = input.nextInt();

        if(systemPin == inputPin && systemSsn = inputSsn){
            System.out.println("Authentication successful");
        } else {

            if(systemPin != inputPin){
                System.out.println("Pin Code is incorrect");
            }    // TODO: bunlari single if yaptik, multiple statement yapmadik cunku iki sonuc da yanlis olabilir. Ama multiple kullansak sadece ilkini bulunca digerini run etmeyecek

            if(systemSsn != inputSsn){
                System.out.println("Last 4 SSN numbers are incorrect");
             }

         */


    }
}
