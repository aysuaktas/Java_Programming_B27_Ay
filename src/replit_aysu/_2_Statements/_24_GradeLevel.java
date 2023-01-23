package replit_aysu._2_Statements;

import java.util.Scanner;

public class _24_GradeLevel {

    /*
    Use if statements to help the student find out which grade level they will join based on their age. Use the following information to determine the results:

        less than 3   -> ineligible
        3-4           -> preschool
        5             -> kindergarten
        6-10          -> elementary school
        11-13         -> middle school
        14-18         -> high school
        19+           -> college
     */

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();


        //WRITE YOUR CODE BELOW

        if(age <3){
            System.out.println("ineligible");
        } else if (age == 3 || age == 4){
            System.out.println("preschool");
        } else if (age == 5){
            System.out.println("kindergarten");
        } else if (age >= 6 && age <= 10){
            System.out.println("elementary school");
        } else if (age >= 11 && age <= 13){
            System.out.println("middle school");
        } else if (age >= 14 && age <= 18){
            System.out.println("high school");
        } else if (age >= 19){
            System.out.println("college");
        }

    }
}

