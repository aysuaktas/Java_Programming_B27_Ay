package replit_aysu._2_Statements;

import java.util.Scanner;

public class _26_FindMiddleNumber {

    /*
    Using if statements and Scanner write a program that will read three number inputs. Then using those number determine which number is the middle number. Follow the exact flow from the examples below.
        Hint:

        1. Create an object of Scanner class.
        2. Declare int 3 variables
        3. Use Scanner to assign numbers from console into the variables
        4. Use if statements to find the middle number
     */

    public static void main(String[] args) {
        //WRITE YOUR CODE BELOW:

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int first = input.nextInt();
        System.out.println("Enter second number:");
        int second = input.nextInt();
        System.out.println("Enter third number:");
        int third = input.nextInt();

        if ((first > second && first < third) || first < second && first > third) {
            System.out.println("middle number is: " + first);
        } else if ((second > first && second < third) || second < first && second > third) {
            System.out.println("middle number is: " + second);
        } else if ((third > first && third < second) || third < first && third > second) {
            System.out.println("middle number is: " + third);
        }

    }
}