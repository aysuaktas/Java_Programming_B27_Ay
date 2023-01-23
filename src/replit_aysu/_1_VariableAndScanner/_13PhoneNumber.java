package replit_aysu._1_VariableAndScanner;

import java.util.Scanner;

public class _13PhoneNumber {
    /*
    In this task, you will need to use multiple variables and combine them together into a phone number.
    For example it will be something like this:
    (222)-3334444
    Given two int variables areaCode and localNumber that are assigned a value from Scanner, combine them together into a phone number in the following format:
    (areaCode)-localNumber

        Ex:
    Input:
    222
    3334444

    Output:
    Calling number (222)-3334444
     */

    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINE/LINES.
        // Variables are already declared and given
        Scanner scan=new Scanner(System.in);
        int areaCode=scan.nextInt();
        int localNumber=scan.nextInt();

        //WRITE YOUR CODE BELOW:

        System.out.println("Calling number (" +areaCode + ")-" + localNumber);   // Run yap. Console'a 222 yaz enter'la. 3334444 yaz enter'la.

    }

}
