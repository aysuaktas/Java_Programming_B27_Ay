package day16_string;

import java.util.Scanner;

public class _06FixName {
    /*
    ask the user to enter their first name
    ask the user to enter their last name
        print both names in proper format --> // TODO: only first letter will be uppercase, rest of them will be lowercase
                                                    // see this practice again
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next().toLowerCase(); // TODO: this is method chaining. Methodlari birbirine bagladik.

        /*
        String firstName = input.next();
        firstName = firstName.toLowerCase(); seklinde ayirarak da yapabiliriz bunu ama Saim method chaining ile gosterdi, methodlari birbirine bagladi
         */

        System.out.println("Enter your last name");
        String lastName = input.next().toLowerCase();

        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1); //firstName.substring(0,1).toUpperCase() kismi -> first letter'i buyuk kalanlari kucuk yapmak istedigimiz icin bu String method'u kullandik. Geri kalan kismi yazmak icin de + firstName.substring(1); yaptik ki 1'den sonuna kadar yazsin. Soyad icin de aynisini yapalim:

        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);

        System.out.println(firstName);
        System.out.println(lastName);

        /*
        Enter your first name
        bruCe   -> yazdigimda
        Enter your last name
        WAYNE    -> yazdigimda ilk harflerini uppercase sonrakileri lowercase olarak yazdi;

        Bruce
        Wayne

         */


    }
}
