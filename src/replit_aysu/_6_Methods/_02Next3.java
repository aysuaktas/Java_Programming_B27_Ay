package replit_aysu._6_Methods;

import java.util.Scanner;

public class _02Next3 {

    /*
    Create a method called next3() that will take an int argument and print the three numbers that come after the given number. The next3() method is already called in the main method. Print in the following format:
            $number1 $number2 $number3

    The three next numbers are printed on the same line with spaces between them
    This is a void method with an int parameter

    Ex:
    next3(10)

    output:
     11 12 13
     */

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number:");
        int num = inp.nextInt();

        next3(num);
    }

    // DO NOT TOUCH ABOVE:

    public static void next3(int number){


        for(int i = number + 1; i < number + 4 ; i++){  // number 10 ise 11den baslasin, 13te yani en son number +3'u yazip bitsin. number +4 dahil degil cunku esitlik yok ya da i <= number + 3
            System.out.print(i + " ");
        }


   /*  Second way:
    System.out.print(number+1+" ");
    System.out.print(number+2+" ");
    System.out.println(number+3);
  */

    }



}
