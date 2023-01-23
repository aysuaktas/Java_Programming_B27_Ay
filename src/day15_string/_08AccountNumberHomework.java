package day15_string;

import java.util.Scanner;

public class _08AccountNumberHomework {

    /*
    ask the user enter an account number and check if the account number is valid. Accounts are valid if:
    handle empty inputs. If there is an empty input, do not check anything else and print: "Empty input given"

	- If the account number begins with a "2" the account number should be 7 characters long
		Print: "Valid 7-digit account number"
		Otherwise: "Invalid 7-digit account number"

	- If the account number begins with a "5" the account number should be 10 characters long
		Print: "Valid 5-digit account number"
		Otherwise: "Invalid 5-digit account number"

	— If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “Invalid account number”

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an account number");
        String accountNumber = input.nextLine();

        int accountNumLength = accountNumber.length();
        boolean startsWith2 = accountNumber.startsWith("2");  // TODO -> bunlarda boolean kullanirsin
        boolean startsWith5 = accountNumber.startsWith("5");

        if(accountNumber.isEmpty()){  // Merve bunu if(length == 0) seklinde yapmis
            System.out.println("Empty input given");
        }

        if(startsWith2){
            if(accountNumLength == 7){
                System.out.println("Valid 7-digit account number");
            } else {
                System.out.println("Invalid 7-digit account number");
            }
        } else if(startsWith5){
            if(accountNumLength == 10){
                System.out.println("Valid 5-digit account number");
            } else {
                System.out.println("Invalid 5-digit account number");
            }
        } else {  // account number does not start with 2 or 5
            System.out.println("Invalid account number");
        }


    }
}
