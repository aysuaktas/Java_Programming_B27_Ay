package replit_aysu._2_Statements;

import java.util.Scanner;

public class _19_GreaterNumber {

    /*
    Use an if statement to determine if the given number a is greater than the other given number b. Print out which is the biggest in the following format:
    $number is greater
    Note: The two given numbers will not be equal
     */

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        //WRITE YOUR CODE HERE:

        if (a > b){
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }


        /*
        9
        4      -> 9 ve 4 degerlerini verirsek console'da;
        9 is greater
         */


    }
}
