package day10_if_statements;

public class _02LetterType {
    /*
    create a char variable letter. Find and print if the character is a letter, number, or special character

	ex: p
		letter

	ex:
		6
		number

	ex:
		$
		special character

     */

    public static void main(String[] args) {

        char c = 'p';     // c variable letter mi number mi special character mi nasil anlarim? c -> A ile Z (uppercase) veya a ile z (lowercase) arasinda mi diye expression kullanirim;

        boolean isLetter = c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
        boolean isNumber = c >= '0' && c<= '9';

        if(isLetter){
            System.out.println(c+ " is a letter");
        }

        if (isNumber){
            System.out.println(c+ " is a number");
        }

        if(!isLetter && !isNumber){     // letter degilse ve number degilse;
            System.out.println(c + " is a special character");     // special character'dir, diye yazdik.
        }

        // All 3 single if statements are checked. But why we check all of them if we need only one? Bu durumda, multi-branch if statement kullanirsak we do not always need to check all of them if we have one true. Sometimes, if all the others are false, then the last one also is checked, but it is not like that all the time.

        /*
        char c = 'p'; icin console'da
        p is a letter   cikiyor

        char c = '6'; icin console'da
        6 is a number

        char c = '#'; icin console'da
        # is a special character

         */

    }
}
