package day28_methods;

import java.util.Scanner;

public class _02Numbers {

    /* It was yesterday's homework;

    create a method that will accept a number. Find and print if it is a positive number, negative number, or zero
     */

    public static void checkNum(int n) {

        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {

        checkNum(51);  // Positive
        checkNum(0);   // Zero
        checkNum(-14); // Negative

        System.out.println("-------with scanner: ---------");

        // How can I do it with scanner?
        Scanner input = new Scanner(System.in);
        checkNum(input.nextInt());// Bunu yazinca console deger yaziyoruz, Positive mi Zero mu Negative mi bize sonucu veriyor

        System.out.println("----------- int n = 3----------- checkNum(n): ");

        int n = 3;
        checkNum(n);  // Positive

    }
}
