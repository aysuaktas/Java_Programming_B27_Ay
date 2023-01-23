package replit_aysu._6_Methods;

import java.util.Scanner;

public class _01FindCube {

    /*
    Finish the given method cube() to print the cubed value of the given n number. Print the result. Also call the cube() method in the main method to display result.
           This is a void method with no parameters
           Hint: cube of a number is n^3 = n * n * n

    For ex:
    input:
     5

    output:
     125

    -> our method would have done 5 * 5 * 5 to print the final value of 125
     */

    public static void cube(){

        int n = new Scanner(System.in).nextInt();

        //TYPE YOUR CODE BELOW:

        System.out.println(n*n*n);

       //  System.out.println(Math.pow(n,3));  --> Furkan yazdi. Pow yani power -> hangi sayinin kacinci power'ini (kuvvetini) alacaksan o. Ilk siradaki = sayi. Ikinci siradaki o sayiyi kac kere kendisiyle carpacagin yani kuvvet. Bu soruda 5*5*5 uzerinden 3 kere carptik -> o yuzden 3

    }


    public static void main(String[] args) {
       cube();

    }
}


