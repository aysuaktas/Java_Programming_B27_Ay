package day08_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _01AddNumbers {

    /*
    Create a program that will ask the user to enter two numbers. Add the numbers and print the result
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  // Scanner object

        System.out.println("Enter number 1");
        int num1 = input.nextInt();
        System.out.println("Enter number 2");
        int num2= input.nextInt();

        System.out.println(num1 + num2);  // input.nextInt() + input.nextInt();

    }
}
