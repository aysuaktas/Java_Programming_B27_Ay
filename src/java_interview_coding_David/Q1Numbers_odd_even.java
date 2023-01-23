package java_interview_coding_David;

public class Q1Numbers_odd_even {

    /* Q1: Write a method which can identify and print if the given number is even or odd

        Ex:  identify(5) -> "Odd"       Ex:  identify(6) -> "Even"
    */

    public static void main(String[] args) {

        evenOrOdd(5);   // argument inside paranthesis
        evenOrOdd(6);
        evenOrOdd(0);
        evenOrOdd(-9);
        evenOrOdd(-22);
    }

    public static void evenOrOdd(int number){

        if(number % 2 == 0) {  // if our number evenly divisible by zero ((no leftover)) --> % is remainder operator   and  == is: "equal" operator
            System.out.println("Even");
        } else {  // if(number % 2 == 1){   // which is also != 0  --> != is: "not equal" operator
            System.out.println("Odd");
        }

    }
}

    // bu soruda if you now "remainder" operator or not'i anlamak istiyorlar. Modulus falan deme, javada remainder diyoruz bu % operator'una.

        /* // David's answer:

        private static String oddOrEven(int n) {
        return n % 2 == 0 ? "Even" : "odd";
        }

         */