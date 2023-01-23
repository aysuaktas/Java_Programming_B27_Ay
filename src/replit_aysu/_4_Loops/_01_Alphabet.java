package replit_aysu._4_Loops;

public class _01_Alphabet {

    public static void main(String[] args) {

        /*
        Use a loop to print the alphabet from A to Z. Print all the characters in one line, with no spaces between them.
        Also use another loop to print the alphabet from z to a. Print all the character in one line, with no spaces between them.
            Note: There will be two lines in the output. One of the uppercase letters from A to Z, and a second line for the lowercase letter from z to a.
         */

        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i);
        }

        System.out.println();

        for(char j = 'z'; j >= 'a'; j--){
            System.out.print(j);
        }

    }
}
