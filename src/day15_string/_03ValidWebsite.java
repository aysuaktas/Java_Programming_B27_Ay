package day15_string;

import java.util.Scanner;

public class _03ValidWebsite {

    public static void main(String[] args) {

        /*
        declare a String for the website and check if it is valid

             website should start with: www.

             website should end with one of the following:
                 .com
                 .edu
                 .gov
                 .net

                 valid website or invalid website
                 bonus: why the website is invalid
         */

        String website = "www.amazon.com";

        if(website.startsWith("www.") && website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net")){
            System.out.println("It is a valid website");
        } else {
            System.out.println("It is an invalid website");
           /* if(!website.startsWith("www.")){
                System.out.println("It must start with www.");
            } else {
                System.out.println("It must end with \".com\", \".edu\", \".gov\" or \".net\"");

               // if else ile nested if yapmistim ama websitenin hem basi hem sonu da yanlis olabilir. O yuzden bu yanlis, iki ayri if statement yapmak lazim. Duzelttigim haliyle;
            */
            if(!website.startsWith("www.")) {
                System.out.println("It must start with www.");
            }
            if(!website.endsWith(".com") || website.endsWith(".edu") || website.endsWith(".gov") || website.endsWith(".net")){
                System.out.println("It must end with \".com\", \".edu\", \".gov\" or \".net\"");
            }
            }


        // it was my method

        System.out.println("------------------------------");



        // Saim's method:

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your website");
        String webSite = input.next();

        // TODO: bunu boolean ile yapmak da iyi;
        boolean validStart = webSite.startsWith("www.");
        boolean validEnd = webSite.endsWith(".com") || webSite.endsWith(".edu") || webSite.endsWith(".gov") || webSite.endsWith(".net");

        if(validStart && validEnd){
            System.out.println(webSite + " is valid");
        } else {
            System.out.println(webSite + " is invalid");
        }

        //todo:  If they are invalid, why? --> Iki ayri if statement olarak yapti cunku sadece biri degil, ikisi birden de invalid olmasina sebep olmus olabilir

        if(!validStart){
            System.out.println("Website should start with www.");
        }

        if(!validEnd){
            System.out.println("Website should end with .com or .edu or .gov or .net");
        }





    }
}
