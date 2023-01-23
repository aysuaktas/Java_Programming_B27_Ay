package java_interview_coding_David;

public class Q7PrimeNumber {

    /*
    Write a method that can check if a number is prime or not
     */

    // A prime number is a number that is only divisible by 1 and itself. It starts from 2 --> (( 2, 3, 5, 7, 11,...))


    public static void main(String[] args) {


        System.out.println("isPrime(2) = " + isPrime(2));  // true
        System.out.println("isPrime(1) = " + isPrime(1));  // false
        System.out.println("isPrime(-9) = " + isPrime(-9));  // false
        System.out.println("isPrime(99) = " + isPrime(99));  // false
        System.out.println("isPrime(0) = " + isPrime(0));  // false
        System.out.println("isPrime(7) = " + isPrime(7)); // true
        System.out.println("isPrime(6) = " + isPrime(6)); // false

    }


    public static boolean isPrime(int num) {

        if(num < 2) {   // prime numbers start from 2
            return false;  // not prime
        }

        for (int i = 2; i < num; i++) {  // check if it is divisible by any num ( i in loop ) except 1 and number itself (so, not <= )

            if (num % i == 0) {    // divisible - remainder operator
                return false;  // not prime
            }
        }
        return true;  // prime
    }
}


















    /* // David's answer:

    public static boolean primeNumber(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
     */



















 /*
    public static void isPrime(int num){


        int i = 2;
        while(i < num) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number");
                break;
            }
            i++;
        }

        if( i == num){
            System.out.println(num + " is a prime number");
        }

        if( i > num){  // else -> 0,1...
            System.out.println(num + " is not a prime number");
        }

    }
}  // not finished code

     */




/*
    public static void isPrime(int num) {

        boolean isPrime = true;

        if(num < 2){
            isPrime = false;
        }

        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is NOT a prime number");
        }
    } // not finished code
}

 */




