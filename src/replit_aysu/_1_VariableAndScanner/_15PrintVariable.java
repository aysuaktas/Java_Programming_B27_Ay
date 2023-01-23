package replit_aysu._1_VariableAndScanner;

import java.util.Scanner;

public class _15PrintVariable {

    /*
    Given two String variables topic1 and topic2 with values (from Scanner), write a statement to display the topics we will learn as a full sentence:
    I will learn $topic1 and $topic2 at Cydeo.

    Ex:

     Input:
     Java
     SQL

    Output:
    I will learn "Java" and "SQL" at Cydeo.
     */

    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINE/LINES.
        // Variables are already declared and given
        Scanner scan = new Scanner(System.in);
        String topic1 = scan.nextLine();
        String topic2 = scan.nextLine();

        //WRITE YOUR CODE BELOW THIS LINE:

        System.out.println("I will learn " + "\"" + topic1 + "\"" + " and " + "\"" + topic2 + "\"" + " at Cydeo.");

    }

}
