package day19_loops;

import java.util.Scanner;

public class _11_SpaceProgramHomework {

    /*

    Given a String return a version of with spaces between all the letters.
    If there is already a space in the String put an underscore

	        Ex: java	-> j a v a
	        	space 	-> s p a c e
	        	more words -> m o r e _ w o r d s
     */

    public static void main(String[] args) {

        /*
        // Huseyin Isir's solution;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();
        String newWord = "";

        for (int i = 0; i <= word.length()-1; i++){
            if (word.contains(" ")){
                word = word.replace(" ", "_");
            }
            newWord += " " + word.charAt(i);  // newWord = newWord + " " + word.charAt(i);  // burada " " koymazsak kelimeyi bosluksuz yaziyor. newWord += degil de direkt newWord = dersek de sadece charAt(i)ye denk dusen tek bir letter'i print ediyor.
        }

        System.out.println(newWord.trim());

         */



        //Saim's solution:

        String s = "hello world";
        String result = "";

        for(int i = 0; i < s.length(); i++){      // i < s.length(); yerine i <= s.length() -1; de yazilabilirdi
            // int i = 0; i yani index zerodan basladik -> i < s.length(); yani length'ten kucuk oldugu surece devam ediyor, length'e esit veya buyuk olamiyor ki infinite loop olmasini da engellemis olduk. Length'ten kucuk olmasini istedik cunku length her zaman index number'dan bir fazla. Yani length - 1 = last index number. Biz last index number'da bitsin istiyoruz o yuzden by sekilde yaptik --> i++ yani one iteration at a time

            // s.charAt(i);  // i is a dynamic variable. charAt()'te i kullanirsak -> one iteration at a time

            char letter = s.charAt(i);

            if(letter == ' '){  // bosluk varsa yani bir kelimeden fazlaysa (ikisinin arasindaki bosluktan bahsediyoruz)
                result += "_ "; // result = result + "_ "  --> hem alt tire hem de sonrasinda space koyduk -> I am concatenating my String ( "_ " ) to my result --> sadece "_" seklinde yazip space koymazsam ikinci kelime ile alt tire bitisik oluyor (m o r e _w o r d s). Bunu cozmek icin bosluk koyduk.
            } else {
                result += letter + " ";
            }
        }

        System.out.println(result.trim()); // Sona da space koyuyordu. -> trim ile sonda cikan boslugu silmis olduk

        /*
        hello world
        int i = 0;       // index number start from zero
        charAt(i) ----> charAt(0) -----> h       // hello world hardcoded orneginde first index num is zero. O konumdaki de 'h'

        if(letter == ' ') h == ' ' -> false
        else -> "" + h + " "
        i++;

        int i = 1;
        charAt(i) ----> charAt(0) -----> e

        if(letter == ' ') e == ' ' -> false
        else -> "h " + e + " "
        i++;


         */




    }
}