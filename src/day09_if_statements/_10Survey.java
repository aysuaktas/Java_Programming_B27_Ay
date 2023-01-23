package day09_if_statements;

import java.util.Scanner;

public class _10Survey {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Are you a student? T/F");
        boolean isStudent = input.nextBoolean();
        String report = ""; // empty space, no character is in yet, but it is still a String type

        if(isStudent){
            System.out.println("What are you studying?");
            String subject = input.next();  // multiple word de olabilir ama to keep it simple, one word cevap veririz dedik ve next(); method ile yaptik. Eger are you a student sorusuna true derse bu soruyu soruyoruz, false derse direkt bu soruyu atliyoruz.
            report += "Studying: " + subject;
        }

        System.out.println("Do you live in a city? T/F");
        // boolean inCity = input.nextBoolean;
        // if(inCity)
        if(input.nextBoolean()){   // using the boolean from Scanner right away instead of storing into a boolean variable
            System.out.println("Cool, cities are loud and fun"); // true, city'de yasiyorum derse
        } else {
            System.out.println("How many years have you leaved in the suburb?");  // false, city'de yasamiyorum derse.
            int years = input.nextInt();
            report += "\nLiving in suburb for " + years + " years";
        }

        System.out.println(report);

        /*
        Run et. Console'da:
        Are you a student? T/F
         true dersek
         What are you studying?
        java dersek
        Do you live in a city? T/F
        true dersek
        Cool, cities are loud and fun

        Tekrar run et. Console'da:
        Are you a student? T/F
        true dersek
        What are you studying?
        math dersek
        Do you live in a city? T/F
        false dersek
        How many years have you leaved in the suburb?
        4 dersek
        4

        Tekrar run et. Console'da
        Are you a student? T/F
        false dersek what are you studying sorusunu sormuyor, atliyor.
        Do you live in a city? T/F
        true dersek
        Cool, cities are loud and fun
         */

        input.close();  // Scanner'i kapatmak icin bunu kullanabilirsin, IntelliJ'de cok problem yok ama.

    }
}
