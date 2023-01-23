package day10_if_statements;

public class _08FizzBuzz {

    /*  todo: THIS EXAMPLE IS COMMON FOR INTERVIEWS;

        [IQ]  Given a number n, print the output based on the following conditions:

        if the number is divisible by 3, print Fizz
        if the number is divisible by 5, print Buzz
        if the number is divisible by 3 and 5, print FizzBuzz
        if the number is not divisible by any, print just the number

        Ex:
        n= 10
        Buzz

        n = 12
        Fizz

        n = 15
        FizzBuzz

        n = 13
        13

     */

    public static void main(String[] args) {

       int n = 4;

        if ( n % 3 == 0 && n % 5 == 0){       // TODO: once ikisine de tam bolunuyor mu diye bakariz cunku tek tek bakarsak first one dogru olunca digerlerine bakmiyor.
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0){
            System.out.println("Fizz");
        } else if (n % 5 == 0){
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }

        /*
        int n = 4; ise console'da -> 4 -> Cunku 4 sayisi 3e ve 5e tam bolunmez.
         */


    }
}
