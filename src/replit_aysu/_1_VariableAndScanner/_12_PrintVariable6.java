package replit_aysu._1_VariableAndScanner;

import java.util.*;

public class _12_PrintVariable6 {

    /*
    Given two variables num and cost with values (from Scanner), write a statement to print those values following the example below.
    Note: You don't need to do anything with the Scanner. Use the variable as done before.

    Ex:
       Input:
         2
         5

       Output:
         num = 2
         cost = 5.0
    */

    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINE/LINES.
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        double cost = in.nextDouble();

        //WRITE YOUR CODE BELOW THIS LINE:

        System.out.println("num = " + num);
        System.out.println("cost = " + cost);

        /* bunu run edince console'a 2 yazip enter'layip 5 yazip enter'larsan sonuc:
        num = 2
        cost = 5.0 olur.
         */

    }

}
