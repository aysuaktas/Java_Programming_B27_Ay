package day14_string;

import javax.swing.text.html.BlockView;

public class _02UpperOrLowercaseHomework {

    /*
    Declare and assign a String
    print the String in all uppercase format and
    print the String in all lowercase format
     */

    public static void main(String[] args) {

        String word = "Love";
        System.out.println(word);  // Love

        word = word.toUpperCase(); // we reassigned word
        System.out.println(word);  // LOVE

        word = word.toLowerCase(); // we reassigned word
        System.out.println(word);  // love


        System.out.println("------------------------"); // for empty line between examples


        // If I give another example:

        // First way:  If I will use a String method only once, I can write directly in print statement:
        String str = "I love you baby";
        System.out.println(str.toUpperCase());  // I LOVE YOU BABY
        System.out.println(str.toLowerCase());  // i love you baby
        System.out.println(str);  // I love you baby --> reassign etmedigim icin bu original text'i yazdi, because String is immutable

        // Second way:  If I make a new String:
        String s = str.toUpperCase();
        System.out.println(s);  // I LOVE YOU BABY
        String s1 = str.toLowerCase();
        System.out.println(s1);  // i love you baby

        // Third way:  I can reassign it:
        str = str.toUpperCase();  // I LOVE YOU BABY
        System.out.println(str); //   --> reassign edince old value degismis oldu
        str = str.toLowerCase(); // bununla onceden uppercase olarak reassign ettigimiz degeri all lowercase olarak yeniden assign ettik, artik print edince degerimiz lowercase ile yazmaya devam edecek.
        System.out.println(str); // i love you baby


    }
}
