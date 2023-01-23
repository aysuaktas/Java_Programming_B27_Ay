package day09_if_statements;

import java.util.Scanner;

public class _04EvenOrOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is even");
        }
        // bir number'i alip 2'ye bolunce no leftover ise yani remains zero ise -> our number is even because our number is evenly divisible

        if(num % 2 ==1){           // != 0
            System.out.println(num + " is odd");
        }

        /*
        Console'a any number giriyorum. Mesela 9.
        9 is odd   --> yaziyor console'da. Tekrar run edip mesela 6 yaziyorum.
        6 is even  --> yaziyor.
        100 is even
        101 is odd
         */

    }
}
