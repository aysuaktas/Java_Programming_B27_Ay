package day09_if_statements;

import java.util.Scanner;

public class _13ThreeNumbersHomework {

    /*
    Create three number variables
    Find and print which number is bigger between the three

	ex:
		50
		45
		100

		output:
		100 is the biggest
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        if(first > second && first > third){
            System.out.println(first + " is the biggest");
        } else if(second > first && second > third){
            System.out.println(second + " is the biggest");
        } else {                            // else if(third > first && third > second){  da olur
            System.out.println(third + " is the biggest");
        }


    }
}
