package day41_exceptions._3_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _13FinallyExample {

    // finally block konusuyla ilgili bu class

    public static void main(String[] args) {

        /*

            Scanner input = new Scanner(System.in);

            System.out.println("Enter number 1");
            int num1 = input.nextInt();

            System.out.println("Enter number 2");
            int num2 = input.nextInt();

            System.out.println(num1 + num2);

            // print edince console'da ikisine de bir int number girersem sorun yok ama -> hello falan gibi bir int olmayan bir sey girersem -> InputMismatchException verdi
         */


/*
        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter number 1");
            int num1 = input.nextInt();

            System.out.println("Enter number 2");
            int num2 = input.nextInt();

            System.out.println(num1 + num2);
        } catch (InputMismatchException e) {
            System.out.println("Need to type number inputs");
        } finally {  // this block of code will always run
            System.out.println("FINALLY RUN");
            input.close(); // closes the Scanner object
        }


        // Bunu run edince console'da 3 ve 7 yazarsam:

        Enter number 1
        3
        Enter number 2
        7
        10
        FINALLY RUN

        print edince int olmayan bir sey mesela hello yazarsam:

        Enter number 1
        hello
        Need to type number inputs
        FINALLY RUN
         */


        System.out.println("-----------------");

        /* Even I didn't handle the NullPointerException, my program stops and cause NullPointerException. Ama ne olursa olsun finally block will always run. FINALLY BLOCK IS ALWAYS EXECUTED AFTER TRY & CATCH BLOCK, WHETHER AN EXCEPTION OCCURS OR NOT. Bunu gormemiz icin usttekine:
                    String s = null;
                    s.trim();
         ekledi. Ben o halini alta yazdim

         */



        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter number 1");
            int num1 = input.nextInt();

            System.out.println("Enter number 2");
            int num2 = input.nextInt();

            String s = null;  // String doesn't have any characters, it's null
            s.trim();  // null olan bir seyi trim etmeye calisiyorum -> NullPointerException

            System.out.println(num1 + num2);
        } catch (InputMismatchException e) {
            System.out.println("Need to type number inputs");
        } finally {  // this block of code will always run
            System.out.println("FINALLY RUN");
            input.close(); // closes the Scanner object
        }


      /* Bunu run edince console'da 3 ve 7 yazarsam:

        Enter number 1
        3
        Enter number 2
        7
        10
        FINALLY RUN
        Exception in thread "main" java.lang.NullPointerException
	        at day41_exceptions._3_try_catch._13FinallyExample.main(_13FinallyExample.java:84)

        print edince int olmayan bir sey mesela hello yazarsam:

        Enter number 1
        hello
        Need to type number inputs
        FINALLY RUN
         */




    }
}
