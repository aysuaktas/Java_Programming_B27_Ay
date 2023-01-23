package replit_aysu._3_String;

import java.util.Scanner;

public class _45_Email {

    /*
    Use String methods to divide the given email into separate parts. The email will always be in this format:

    firstName_lastName@domain.com

    Pull apart and print the first name, last name, and domain. When printing the values all three should be in proper capitalization format - The first letter of each word is uppercase and the rest are lowercase.

    Ex: input -> jeff_bezos@amazon.us
        output -> First name: Jeff
                  Last name: Bezos
                  Domain: Amazon
     */

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //WRITE YOUR CODE BELOW

        int indexOfUnderscore = email.indexOf('_');

        int indexOfAt = email.indexOf('@');

        int indexOfDot = email.indexOf('.');


        String name = email.substring(0, indexOfUnderscore);
        name = name.substring(0,1).toUpperCase() + name.substring(1);  // ilk harfi uppercase yapmak icin index number 0 ile 1 arasini (1 dahil degil substring'de) toUpperCase method ile yazdik, + name.substring(1); deyip kalan kismi yazdirdik
        System.out.println("First name: " + name);


        String lastName = email.substring(indexOfUnderscore +1, indexOfAt);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
        System.out.println("Last name: " + lastName);


        String domain = email.substring(indexOfAt +1, indexOfDot);
        domain = domain.substring(0,1).toUpperCase() + domain.substring(1);
        System.out.println("Domain: " + domain);



    }
}

