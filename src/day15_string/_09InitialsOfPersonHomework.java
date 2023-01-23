package day15_string;

import java.util.Scanner;

public class _09InitialsOfPersonHomework {

    /*
    Create a program to ask the user to enter their first name and last name.
    Then print the initials of the person in uppercase format.
    The initials are made up of the first letters of the first and last names.

	Ex:
		james
		bond

		JB

	Ex:
		anna
		lee

		AL

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name and last name");
        String firstName = input.next();
        String lastName = input.next();


       firstName = firstName.toUpperCase();
       lastName = lastName.toUpperCase();

        System.out.println("" + firstName.charAt(0) + lastName.charAt(0)); //  TODO: initials of person'daki ismin ilk harfleri gibi durumlar icin bu sekilde yaparsin. First character icin -> charAt(0) yapariz cunku index numbers start from zero.


        /// System.out.println(firstName.charAt(0) + "" + lastName.charAt(0));  // bu sekilde "" aradayken de oluyor en bastayken de. Ikinci variable'den once olmali ama.


        // System.out.println(firstName.charAt(0) + lastName.charAt(0));  // ---> boyle yaparsan console'da sayi cikiyor cunku addition olarak aliyor. Concatenation olmasi icin aralarinda "" kullanmak gerekiyor



        /* Saim's method;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = input.next();
        System.out.println("Please enter your last name");
        String lastName = input.next();

        String initials = "" + firstName.charAt(0) + lastName.charAt(0);
        System.out.println("First name " + firstName);
        System.out.println("Last name " + lastName);
        System.out.println(initials.toUpperCase());

        */


    }
}
