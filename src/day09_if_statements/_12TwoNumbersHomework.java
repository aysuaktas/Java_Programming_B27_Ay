package day09_if_statements;

import java.util.Scanner;

public class _12TwoNumbersHomework {

    /*
    Create two number variables
    Find and print which number is bigger between the two

	ex:
		50
		45

		output:
		50 is bigger
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int first = input.nextInt();
        int second = input.nextInt();

        if (first > second){
            System.out.println(first + " is bigger");
        } else {                 // else if (second > first){   de diyebiliriz
            System.out.println(second + " is bigger");
        }


    }
}
