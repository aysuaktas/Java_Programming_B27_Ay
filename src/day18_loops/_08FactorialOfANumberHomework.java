package day18_loops;

import java.util.Scanner;

public class _08FactorialOfANumberHomework {

    /*
    write a program that calculates the factorial of a number:
    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120
     */

    public static void main(String[] args) {

        // Kendim yapamadim;  // todo: neden boyle cozmusler, ogren, anlamadim
        // Saim'in yaptigi day19'da

        // Kristina Gaidamovic's solution;
    /*
        int start = 1;
        int end = 5;
        int factorial = 1;  // 1 because if you put zero, it will multiply by 0, result 0

        while(end >= start){
            factorial *= end;
            end--;
        }
        System.out.println("Factorial: " + factorial);
    */

        // Huseyin Isir's solution  --> dynamic (with Scanner)

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scan.nextInt();
        int factorial = 1;

        while(num > 1){
            factorial *= num-- ;
        }

        System.out.println("factorial = " + factorial);



    }
 }

