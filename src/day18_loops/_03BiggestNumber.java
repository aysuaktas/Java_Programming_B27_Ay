package day18_loops;

import java.util.Scanner;

public class _03BiggestNumber {

    public static void main(String[] args) {

        /*
        ask the user to type 5 numbers
        find the biggest number    // (( finding smallest or biggest number sorulari interview'larda da cok cikiyormus ))

        4
        142
        230
        32
        5
         */

        Scanner input = new Scanner(System.in);
        int max = -2147483648;  // Tersten dusun. MAx number icin negative deger yazdim, int'in en kucuk degerini. -> Cunku I want to smallest number possible, so all of the other numbers will be bigger than that
        int min = 2147483647; // Yine ters mantik. Minimum number'i istiyorum. Buraya en buyuk (int icin) olanini yaziyorum ki diger hepsi bundan buyuk kucuk olacak. --> It is like a default. But it is a better than using 0 (zero).

        int num = 0;   // I will start from 0. -> to keep track of the iterations


        while(num++ < 5){     // 0 is smaller than 5. Once bunu check edip sonra artirmak istedim, o yuzden post increment yaptim. ---> this is true, so this loop will run for 5 times ( start from 1 and go until <= 5 ) ---> ++ diye incrementing yapmasaydik infinite loop olurdu
            System.out.println("Enter a number");
            int inputNum = input.nextInt();

            if(inputNum > max) {
                max = inputNum;  // if the new number from the console is bigger than our current biggest number, we found a new max number and should reassign it to the variable
            }

            if(inputNum < min){
                min = inputNum;
            }

        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);


        /*

        Execution:
             int max = -2147483648;
             int min = 2147483647;
             int num = 0;

         What a number:
                > 50
            if(inputNum > max) mi diye check ediyor ->//   50 > -2147483648 -> true
            true -> means: max = inputNum ---> max becomes 50

            if(inputNum < min) mi diye check ediyor ->//   50 < 2147483647 -> true
            true -> means: min = inputNum ---> min becomes 50

          iteration 2:
                int max = 50
                int min = 50
                int num = 1;    oldu

                while(num++ < 5)  -->  1 < 5 is true --> num = 2
                Enter a number
                    > 100
                if(inputNum > max) --> 100 > 50 is true
                true means: max: inputNum  --> max becomes 100

                if(inputNum < min) --> 100 < 50 is false


            iteration 3:
                int max = 100
                int min = 50
                int num = 2;

                while(num++ < 5) -->  2 < 5 -> true ---> num = 3
                Enter a number
                    > 10
                if(inputNum > max) 10 > 100 --> false

                if(inputNum < min) --> 10 < 50 -> true
                true means: min = inputNum --> min becomes 10

            iteration 4:
                int max = 100
                int min = 10
                int num = 3;

                while(num++ < 5) --> 3 < 5 -> true ---> num = 4
                Enter a number
                    > 40
                if(inputNum > max) 40 > 100 --> false

                if(inputNum < min){ 40 < 10 -> false

             iteration 5:
                 int max = 100
                 int min = 10
                 int num = 4;

                 while(num++ < 5) --> 4 < 5 --> true --> num = 5

                 .. after
                 while(num++ < 5) --> 5 < 5 is false --> loop stops!

         */



    }
}
