package day19_loops;

import java.util.Scanner;

public class _10_PrimeNumberHomework {

    /*
    Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

    (( prime number = asal sayi yani kendisinden ve 1den baska sayiya bolunemeyen 1den buyuk tam sayi ))


    Ex:
    	Input:
	    	11
	    Output:
	    	prime
    --------------------
    Ex:
	    Input:
	    	10
	    Output:
		    not prime
     */

    public static void main(String[] args) {

        /* Huseyin Isir'in solution'a gore;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        int count = 0;
        String message = "";

        for (int i = number; i > 0; i--) {  // i-- yapmis ki bir yerde dursun. Infinite loop olmasin. Cunku mesela i = 10 olursa sonrakinde 9'a sonrakinde 8'e bakacak vs. i > 0 olacagi icin en son 1'e bakip bitirecek
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {    // prime number sadece kendine ve 1'e bolunebilir. Count = 2 derken sadece iki sayiya bolunebiliyorsa prime (asal), if statement will be executed. Daha fazlaysa yani farkliysa asal degil, else statement will be executed.
            message = "Number is prime";
        } else {
            message = "Number is not prime";
        }
        System.out.println(message);

         */


        // Saim's solution:

        int n = 11;    // n = my number
        boolean isPrime = true;

        /*
        if(n < 2){
            System.out.println("Not Prime");
            System.exit(0);   // it stops the program
        }
                    ----> bu araya bunu da ekleyebilirmisiz
         */

        for(int i = 2; i < n; i++ ){   // start from 2 because we don't check the divisibility of 0 or 1, and we want to check until the number which is done with i < n

            if(n % i == 0){     // 11 % 2      11 % 3        11 %4.. seklinde tek tek bakiyor
                isPrime = false;
            }
        }

        System.out.println(isPrime ? "Prime" : "Not Prime");  // ternary kullandik hizlica



    }
}
