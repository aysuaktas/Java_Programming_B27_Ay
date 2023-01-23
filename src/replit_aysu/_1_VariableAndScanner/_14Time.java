package replit_aysu._1_VariableAndScanner;

import java.util.Scanner;

public class _14Time {

    /*
    In this task, you will need to use multiple variables and combine them together into the time of the day.
    For example it will be something like this:
    12:24:33 PM
    In the beginning of the code, declare three int variables: hour, minute, second and declare a String variable: amOrPm.
    You only need to declare, no assignment.

    In the middle of the code, the variables will be assigned a value using Scanner.
    Do not touch anything in this section.

    In the end of the code, use the variables to put together and print the time of the day using the following format:
    hours:minutes:seconds amOrPm
     */

    public static void main(String[] args) {
        //1. WRITE YOUR CODE HERE:

        int hour;   // sadece variables'i declare etmemizi istemis ilk adimda.
        int minute;
        int second;
        String amOrPm;

        //DO NOT TOUCH BELOW LINES.
        Scanner sc = new Scanner(System.in);
        hour = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        amOrPm = sc.next();
        //#############################

        //2. WRITE YOUR CODE HERE:

        System.out.println(hour + ":" + minute + ":" + second + " " + amOrPm);

    }
}
