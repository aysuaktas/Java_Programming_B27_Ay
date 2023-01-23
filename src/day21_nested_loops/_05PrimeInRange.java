package day21_nested_loops;

import java.util.Scanner;

public class _05PrimeInRange {

    public static void main(String[] args) {

        /*
        Prime: number is only divisible by 1 and itself

             print all the prime numbers up to a certain number -> for ex: 50
             For ex: Print all the prime numbers from 2 - (to) 50
             2 3 5 7 11 13 17 23 29 ... 47
         */

        Scanner input = new Scanner(System.in);
        System.out.println("What number do you want to go to?");
        int range = input.nextInt();

        // outer loops checks all the numbers from 2 to range
        for(int i = 2; i <= range; i++ ) {   // If I will go to until 50, I will write 50 instead of range --> I am starting from 2 and going until the range number

            boolean isPrime = true;  // bunu buraya koyduk cunku isPrime about those numbers. In the outer loop'a koyduk ki -> every time the outer loops runs, the boolean variable has a value of true, it means for every number in the range, we start from true. -> I assume it is true and check it in my inner loop. When it is not, I say false

            for (int j = 2; j < i; j++ ) { // I'm starting from 2 because I want to check divisibility of the number from 2 to the number itself. ((Asal sayilar 2den baslar))

                if(i % j == 0){   // if i is evenly divisible by j --> the number we are checking (i) is evenly divisible by the j values (from 2 to the number), it means it is not prime (cunku prime number kendisinden ve 1'den baska sayiya bolunemez) -> then, boolean expression is false;
                    isPrime = false;
                    break;  // break stops the inner loop  --> break olmazsa same result but more execution time

                }
            }  // end of the inner loop

            if(isPrime){
                System.out.println(i);
            }
        }   // end of the outer loop


    }
}
