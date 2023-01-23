package replit_aysu._3_String;

import java.util.Scanner;

public class _46_Sandwich {

    /*
    Use String methods and if statements to find what is inside of the sandwich. A sandwich is two pieces of bread with something between them. We want to see what is between our bread pieces. There will have only one input str. Inside of the str String we will look for the first occurrence of the text 'bread' and the last occurrence of the text 'bread'. Using those two points we will pull out the text between them.

    If there is not two pieces of bread print the text: nothing

       Ex: input  ->  breadjambread
           output ->  jam
     */

    public static void main(String[] args) {


        // Ben bitirmedim. Discord'da Zirwan Ahmed Salih'in cevabi


        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW


        int lengthOfWord = str.length();
        int breadFirst = str.indexOf("bread");
        int breadSecond = str.lastIndexOf("bread");


        if(breadFirst < lengthOfWord/2 && breadSecond > lengthOfWord/2){
            String ingredient = str.substring(str.indexOf("d") + 1, str.lastIndexOf("b"));  // ingredient iki bread arasinda. Bu nedenle ilk bread'in d'sine +1 ekledik ki index number'i sonraki olandan baslasin ingredient'i almaya. Sonra ikinci bread'in b'sinde bitirdik ki bitirdigimiz dahil degil, ingredient'in sonunda bitmis oluyor
            System.out.println(ingredient);
        } else {  // two pieces of bread yoksa
            System.out.println("nothing");
        }



    }
}
