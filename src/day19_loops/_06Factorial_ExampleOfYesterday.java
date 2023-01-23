package day19_loops;

import java.util.Scanner;

public class _06Factorial_ExampleOfYesterday {

     /*
    write a program that calculates the factorial of a number:
    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120
     */

    public static void main(String[] args) {

        int num = new Scanner(System.in).nextInt();
        int factorial = 1;  // factorial number should start from 1. It cannot be zero because there will be multiplication
        String message = num + "! = ";  // to display sth, we wanted to use String. Each iteration is building up with a message


        for(int i = num; i > 1; i--){    // i > 0 degil de i > 1 dedik.
            factorial *= i;  // 5 * 1 = 5, sonra next iteration -> i-- dedigimiz icin 4 * 1 = 4 ... seklinde gidecek.
            message += i + " * ";  // I am adding multiply in every iteration
        }


        message += "1 = " + factorial;  // We added 1 because 1 is not included (ustte). Because I did not get multiply by 1. So, hardcoded olarak yazmaya karar verdim cunku 1 her zaman en sonda olacak. --> Bunu yazmayip message += factorial; seklinde yazsaydim console'da 5! = 5 * 4 * 3 * 2 * 120 seklinde cikar. Ama factorial'de 1'e kadar gitmesi lazim math acisindan.
        System.out.println(factorial);
        System.out.println(message);

        /*
        Console'da -> 5 -> yazarsam
        120
        5! = 5 * 4 * 3 * 2 *  = 120

         */




    }
}
