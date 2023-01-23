package day18_loops;

import java.util.Scanner;

public class _05Atm {

    public static void main(String[] args) {

        int validPin = 1234;
        int userPin;
        int attempts = 0;
        Scanner input = new Scanner(System.in);
        // purpose of this loop was to allow reattempts logic

        do {
            System.out.println("Enter your pin");
            userPin = input.nextInt();
            attempts++;

        } while (attempts < 3  && userPin != validPin);  // Bu false olunca program duruyor. User pin ile valid pin esit olmazsa durumunu girdik cunku bu false oldugunda yani bunlar esit oldugunda program duracak. --> attempts 3ten kucuk de olmali o yuzden && operatoru ile bunlari bagladik ---> keep running the loop if the attempt has been less than 0 and the pin is the matching yet.

        if(attempts <= 3 && userPin == validPin){  //3. attempte dogru girersek yine kabul edip logged in olsun diye esitlik de koyduk ve <= 3 dedik
            System.out.println("Logged in");
        } else {
            System.out.println("Locked account, too many attempts");
        }


        //  while (userPin != validPin); yazsaydim gecerli pin'i girene kadar istedigim kadar girebiliyodum. Ancak validPin olan 1234'u userPin olarak girebildigimde, yani bunlar eslesince duruyordu. Ama attempts < 3 kosulunu da saglamasi lazim, 3ten cok giremem


    }
}
