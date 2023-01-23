package day12_switch;

import java.util.Scanner;

public class _06DaysInMonthsHomework {

    /*
    Days In Month (slightly different version than before)

    Write a program that will accept a month name and outputs how many days are in that month

    data:

    February: 28 days
    April, June, September, November: 30 days
    January, March, May, July, August, October, December: 31 days
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month name to see how many days are there in that month?");

        String month = input.next();

        switch(month){

            case "January":     // String datatype oldugu icin "" icinde yazmak gerek
                System.out.println("On January, there are 31 days");
                break;

            case "February":
                System.out.println("On February, there are 28 days");
                break;

            case "March":
                System.out.println("On March, there are 31 days");
                break;

            case "April":
                System.out.println("On April, there are 30 days");
                break;

            case "May":
                System.out.println("On May, there are 31 days");
                break;

            case "June":
                System.out.println("On June, there are 30 days");
                break;

            case "July":
                System.out.println("On July, there are 31 days");
                break;

            case "August":
                System.out.println("On August, there are 31 days");
                break;

            case "September":
                System.out.println("On September, there are 30 days");
                break;

            case "October":
                System.out.println("On October, there are 31 days");
                break;

            case "November":
                System.out.println("On November, there are 30 days");
                break;

            case "December":
                System.out.println("On December, there are 31 days");
                break;

            default:
                System.out.println("It is not a valid month");

        }

        /*  Saim's method;   // TODO: pratik yol!!!

            // - Scanner ile de yapilabilirdi bu da.

        String month = "May";    // hardcoded olarak rastgele bunu sectik

        switch(month){

            case "February":
                System.out.println("28 days");
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                System.out.println("30 days");
                break;

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                System.out.println("31 days");
                break;

            default:
                System.out.println("Invalid month");

         */


    }
}
