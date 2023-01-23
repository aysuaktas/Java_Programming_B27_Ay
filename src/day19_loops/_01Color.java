package day19_loops;

import java.util.Scanner;

public class _01Color {

    /*  It was yesterday's homework, but I did not do it

    write a program that will allow the user to select three colors for the painting. There needs to be 3 unique colors selected
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numOfColors = 0;
        String colors = "";


        while (numOfColors < 3){    // 3 kere iteration'imiz olsun istedik

            System.out.println("Enter the next color");
            String inputColor = input.nextLine().toLowerCase();  // nextLine() method kullandik cunku user'in yazdigi renk bir kelimeden fazla olabilir. Case sensitivity engellemek icin toLowerCase() methodunu da ekledik

            if(!colors.contains(inputColor)){  // if the color is unique, color String does not have the value already
                colors += " " + inputColor;
                numOfColors++;
            }
        }

        System.out.println(colors.trim());

        // :( farkli renk yazmayinca 3 haktan cok da yazdiriyor ama

    }
}
