package replit_aysu._3_String;

import java.util.Scanner;

public class _39_BurgerOrChicken {

    /*
    Use String methods and if statements for the fast food company's menu. There is two main orders: A Burger meal or a Chicken meal. The cashier will have an input order that will be used to determine the price. Use the following information to determine the price of the order:
    burger: $12.50
    chicken: $9.75
     */

    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINE/LINES.
        Scanner s = new Scanner(System.in);
        String order = s.next();

        //WRITE YOUR CODE BELOW THIS LINE:


        if(order.equals("burger")){
            System.out.println("Your total is $12.50");
        }else if(order.equals("chicken")){
            System.out.println("Your total is $9.75");
        }

        // if statements ile String'deki equal method'u birlestirdim

        /* --> switch method ile de yapilabilir
    switch (order) {
            case "burger":
                System.out.println("Your total is $12.50");
                break;
            case "chicken":
                System.out.println("Your total is $9.75");
        }
         */


    }
}


