package replit_aysu._3_String;

import java.util.Scanner;

public class _41_ReverseIt {

    /*
    Use String methods and if statements to reverse a String that is five characters long. If the given word is not five characters long, it will not be reversed. Use the following to output a value:
        If the word is less than 5 characters: print Too short!
        If the word is more than 5 characters: print Too long!
        If the word is 5 characters: print the reversed version of the String. Reading characters from the end to the beginning.

        Ex: input -> cat             output: Too short!
        Ex: input -> singularity     output: Too long!
        Ex: input -> apple           output: elppa
     */

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW

        int lengthOfWord = word.length();

        if(lengthOfWord < 5){
            System.out.println("Too short!");
        } else if(lengthOfWord > 5){
            System.out.println("Too long!");
        } else {  // lengthOfWord == 5
            System.out.println("" + word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));
        }  // basta "" yapmazsak concatenation olarak degil addition olarak alip console'da sayisal deger veriyor. Bunu engellemek icin basa "" yaptim.




    }
}
