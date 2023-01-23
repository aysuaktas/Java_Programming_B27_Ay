package day08_scanner;

import java.util.Scanner;

public class _02Revenue {

    /*
    Create a program that will ask the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);   // ismi scan olarak verdik.
        System.out.println("Enter the items price");
        double price = scan.nextDouble();    // isim bu sefer input degil de scan oldugu icin scan.nextDouble(); oldu.

        // double price = scan.nextDouble();  // price dynamic bunda. ((Scanner ile yaptik o yuzden))

        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();

        System.out.println("Revenue: " + price * quantity);  // price ile quantity arasinda carpi yerine arti olsaydi -> kod soldan saga gidiyor -> After String, o artik concatenation olurdu -> addition olmazdi. -> ((group_15_practices package'inda _01_Variables class'inda David'in anlattigi gibi))  // todo: be careful with that

    }
}
