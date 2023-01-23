package replit_aysu._1_VariableAndScanner;

import java.util.*;

public class _11_PrintVariable5 {

    /*
    Given two int variables first and second with values (from Scanner), write a statement that will print the values in a single line. See the example below.

    Ex:
        Input:
    55
    123

        Output:
    first is 55 and second is 123

    Note: You don't need to do anything with the Scanner. Use the variable as done before.
     */

    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINE/LINES.
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt(); // do not change
        int second = scan.nextInt(); // do not change

        //WRITE YOUR CODE BELOW:

        System.out.println("first is " + first + " and second is " + second);

        // bunu run edince console'da:55 yaz, enter'la. 123 yaz, enter'la. Cikacak sonuc -> first is 55 and second is 123

    }

}
