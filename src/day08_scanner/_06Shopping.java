package day08_scanner;

import java.util.Scanner;

public class _06Shopping {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the item name");
        // String item = "Water";
        String item = input.nextLine();

        System.out.println("What is the item price");
        // double price = 3.99;  //hard-coding. Veriyi cod'da versek boyle kullanirdik ama Scanner yapiyoruz.
        double price = input.nextDouble();

        System.out.println("How many " + item + " do you want?");
        // int quantity = 5;
        int quantity = input.nextInt();

        String order = "Your total for " + quantity + " " + item + " is " + quantity * price;
        System.out.println(order);


        /*
         String item = "Water";
         It is also flexible.
         double price = 3.99
         int quantity = 5;
         Boyle de verileri degistirdikce console'da degisiyor.
         */


        /* Bunu scanner ile yapinca console'a sunu yazdik;

        apples ((Enter the item name))
        2.99   ((What is the item price))
        10      ((How many apples do you want?))

        Then, it says:
        Your total for 10 apples is 29.900000000000002

         */

    }
}
