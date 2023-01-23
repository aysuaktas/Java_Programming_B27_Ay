package day18_loops;

import java.util.Scanner;

public class _02Bot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean run = true;  // now, it is infinite because it's always true
        System.out.println("Bot is awake.\nTo turn off, say: \"shutdown\"");

        while(run){
            System.out.println("Enter your message");
            String msg = input.nextLine().toLowerCase();   // msg = message anlaminda kullandik. Sona .toLowerCase method'u ekledik ve alta lowercase olarak yazdik. User uppercase olarak da gorse calisacak bu sayede

            switch (msg){
                case "hello":
                    System.out.println("how are you?");  // bot will say this
                    break;

                case "what is your age?":
                    System.out.println("I was programmed in July");
                    break;

                case "what do you like?":
                    System.out.println("I like java");
                    break;

                default:  // eger bot burada dediklerimizden baska bir sey gorurse ne cevap versin?;
                    System.out.println("Sorry, I didn't get that");
                    break;  // buraya break koyduk, bu nedenle bunu dedikten sonra direkt kendini kapatmayacak, user'in bir sey yazmasini beklemesi lazim. Burada break olmazsa alttaki case'i de dahil ediyor, bu nedenle bot dururdu biz shutdown yazmasak da.

                case "shutdown":  // kullanici console'a shutdown yazana kadar devam edecek, kac kere repeat edecegini (how many iteration oldugunu) soyleyemeyiz bu nedenle
                    System.out.println("SHUTTING DOWN");
                    run = false; // false yaptik yoksa infinite olacakti
            }

        }



    }
}


