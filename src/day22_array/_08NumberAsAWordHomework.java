package day22_array;

import java.util.Scanner;

public class _08NumberAsAWordHomework {

    /*
    Create a program that will ask the user to enter a number and print the number as a word. Set a range from 0 - 15 and any number not in the range should get an invalid number message

    Ex:
         1 ise
        one

        10 ise
        ten

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String [] numbersAsWord = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen"};  // zero da dahil, eklemeyi unutma

        System.out.println("Please enter a number from 0 to 15 to see the number in word format");
        int num = input.nextInt();
        // Saim -> String [] numbersAsWord = {"zero", ... , "fifteen"}; kismini buraya yazdi, o da olabilirmis demek ki

        if(num >= 0 && num <= 15){
            System.out.println(numbersAsWord[num]);
        } else {
            System.out.println("Sorry, this is an invalid number. Your number should be between 0 and 15.");
        }

        // Burada if else kullanmak onemli. Cunku bu olmasa 0-15 arasinda olmayan invalid bir value girsek OutOfBounds exception'ini alirdik.


    }
}
