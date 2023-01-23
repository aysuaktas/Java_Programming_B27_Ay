package day09_if_statements;

import java.util.Scanner;

public class _01SignUp {

    /*
    signing up to join newsletter
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");  // more than one word -> nextLine()
        String fullName = input.nextLine();

        System.out.println("Enter your email");
        String email = input.next();    // e-mailde no spaces -> so, one word seklinde -> next() methodunu kullanabiliriz. NextLine kullanmak istersen o da sorun olmaz ama next(); kullanman yeterli.

        System.out.println("Enter your age");
        int age = input.nextInt();    // buraya int yazip console'a bir karakter/kelime yazarsam, console'a farkli variable ile yazinca hata verir.

        System.out.println("Do you want to sign up for the extra newsletter? T/F");   // true or false
        boolean extra = input.nextBoolean();

        System.out.println("How did you hear about us?");
        input.nextLine();  // todo: nextLine olmayan methodlardan sonra nextLine kullanacagimiz icin araya bos bir nextLine() method koyduk. Bunun variable ile baslamasi gerekmiyor -> take the enter from the nextBoolean input
        String hearAboutUs = input.nextLine();

        String confirm = fullName + " you signed up with email: " + email + ". We are glad to get readers at age: " + age + ". You signed up for extra newsletter: " + extra + ". Credit goes to " + hearAboutUs;
        System.out.println(confirm);

        /*
        Nelly Joe
        javalover@gmail.com
        30
        true
        friend
        Bunlari yazip enterlayinca;
        Nelly Joe you signed up with email: javalover@gmail.com. We are glad to get readers at age: 30. You signed up for extra newsletter: true. Credit goes to friend
         */

    }

}
