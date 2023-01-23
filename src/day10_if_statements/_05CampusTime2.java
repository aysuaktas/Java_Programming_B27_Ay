package day10_if_statements;

import java.util.Scanner;

public class _05CampusTime2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a time from 0-23 in 24H format, where 0 is midnight");
        int time = input.nextInt();
        String message = ""; // TODO: declaring and assigning a String with value empty space "". Default starting value


        if(time >= 6 && time <= 11){
            message = "Good morning";
        } else if (time >=12 && time <= 16){
            message = "Good evening";
        } else if ((time >= 17 && time <= 23) || (time >= 0 && time <= 5)){  // bunda en basa iki parantez acip en sona iki tane kapatmayinca hata veriyor
            message = "Good night";
        } else {
            message = "Not in 24h range"; // 23'ten buyuk bir deger verilirse bu. 24 de bunda cunku 24 demiyoruz, 00 diyoruz gece.
        }

        System.out.println(message);

        // bu da onceki alistirmanin verileriyle Scanner'a donusturdugumuz durum. Bunda da kullanici gibi console'a deger verip enter'liyoruz.

        /*
        Run edince
        Enter a time from 0-23 in 24H format, where 0 is midnight -> yazisinin altina
        12 -> yazarsak
        Good evening -> yaziyor
         */

    }
}


