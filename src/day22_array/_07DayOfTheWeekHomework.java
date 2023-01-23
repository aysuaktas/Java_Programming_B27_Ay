package day22_array;

import java.util.Scanner;

public class _07DayOfTheWeekHomework {

    /*
    Create a program that will ask the user to enter a number for the day of the week. Print the day of the week based on:

    1 - Monday
    2 - Tuesday
    ...
    7 - Sunday

        --> Use array, not if statement or switch
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Please enter a number for the day of the week");
        int number = input.nextInt();

        if(number >= 1 && number <= 7){  // valid days from 1 to 7
            System.out.println(days[number -1]);  // We used -1 because -> to convert the input number to a day index, we can subtract by 1 which means if the number was 1 --> 1 - 1 = 0 which means index 0 value will be returned.
            // ---> -1 yaptik cunku bize index number lazim ama users girmek istedigi day'i yaziyor, index number'i degil. Index number icin 1 cikarmamiz lazim cunku index number'lar 0dan basliyor ama gunler 1den basliyor
        } else {
            System.out.println("This is an invalid day. It must be between 1-7.");
        }






    }
}
