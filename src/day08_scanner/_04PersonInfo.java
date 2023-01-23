package day08_scanner;

import java.io.Console;
import java.util.Scanner;

public class _04PersonInfo {

    /*
    ask for first name
    ask for last name
    ask for address
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = input.next();  // tek kelime oldugu icin next() kullandik

        System.out.println("Please enter your last name");
        String lastName = input.next(); // tek kelime oldugu icin next() kullandik

        input.nextLine(); // for the enter input. nextLine() kullanmadan once baska method kullandiysak, nextLine()'a gecmeden bir tane bos nextLine method daha gerekiyor ki onceki kullandigimiz enter'lar sonraki methodda sorun olmasin.

        System.out.println("Please enter your address");
        String address = input.nextLine();  // one word'den fazla oldugu icin nextLine() kullandik.

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(address);

        /*
        Console 'a sirasiyla bilgileri girince
        James
        Bond
        102192 39 lane yazarsak enterlayinca bu bilgiler cikiyor.
         */


    }
}
