package replit_aysu._1_VariableAndScanner;

import java.util.Scanner;

public class _18_SecondsConverter {

    // day11_nested package'indaki _13Dollars class'i ile benzer cozumu.

    /*
    Write a program that will take a number of seconds and converts it to a number of hours, minutes and seconds
    Create a Scanner object

    Declare four int variables: inputSeconds, hours, minutes, seconds

    Ask the user to enter the total number of seconds:

    Enter seconds:

    Taking the given number of total seconds calculate how many hours come from that many seconds, then how many left over minutes can come from those seconds and finally how many leftover seconds there is.
    Hint: Use % (remainder) and / operators to calculate the hours, minutes, and seconds

    Ex:

    Enter seconds:
     3695
    1 hours, 1 minutes, and 35 seconds
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inputSeconds;
        int hours;
        int minutes;
        int seconds;

        System.out.println("Enter seconds:");
        inputSeconds = scan.nextInt();

        hours = inputSeconds / 3600;      // 1 saatte 3600 saniye var. Bundan kalan;

        minutes = (inputSeconds % 3600) / 60;  // Dakikada 60 saniye var. Usttekinden kalani 60'a bolduk kac dakika oldugunu bulmak icin

        seconds = (inputSeconds % 3600) % 60;  // Dakikadan kalan saniyeler bize seconds'ta elimizde ne kadar olacagini verdigi icin / 60 degil bu, % 60.

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds");

        /*
        Enter seconds:
        3695   -> yazarsak
        1 hours, 1 minutes, and 35 seconds     ->  Once saat kismini alabildigi kadar (3600'e bolunebildigi kadar aliyor, sonra dakikayi alabildigi kadar (60'a bolebildigi kadar) aliyor. Kalan kismi da saniyeye yaziyor -> 3695 sayisinin icinde bir tane 3600 yani 1 saat var -> elimizde 95 kaldi -> 95'te bir tane 60 var -> yani 1 dakika. Elimizde kalan bolunmeyen kisim 35 de saniyeyi gosteriyor. O yuzden 1 saat 1 dk 35 saniye.
         */



        /*  Saim's solution:

        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = input.nextInt();

        int hours = inputSeconds / 3600; // 60 * 60 = 3600 -> 60 seconds in a minutes, 60 minutes in an hour
        inputSeconds %= 3600; // find left over number of seconds after the seconds were used for hours
        int minutes = inputSeconds / 60; // 60 seconds in a minute
        inputSeconds %= 60; // left over is how many seconds we have that weren't used for hours or minutes

        System.out.println(hours + " hours, " + minutes + " minutes, and " + inputSeconds + " seconds");

         */

    }
}
