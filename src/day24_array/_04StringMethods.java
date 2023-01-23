package day24_array;

import java.util.Arrays;

public class _04StringMethods {

    /* // Konu ile ilgili notlarim:

    These are;
    String methods :  methods in the String class

	toCharArray():  converts the String to a char array
			returns char[]

		Ex:

			String s = “java”;
			s.toCharArray() —> [ ‘j’, ‘a’, ‘v’, ‘a’]


	split():  break String into parts, where each part is a different element in a String array
			return String [ ]

		common use case:

			String str = “today is friday”;
			str.split(“ ”) —> [today, is, friday]
				   [0] -> today ->  ((zero index -> [0] ))
				   [1]  -> is
			       [2] -> friday
     */

    public static void main(String[] args) {

        String s = "hello world";
        char[] letters = s.toCharArray();
        System.out.println(letters);   // hello world  --> String uses array internally, so it prints as String
        System.out.println(Arrays.toString(letters));  // [h, e, l, l, o,  , w, o, r, l, d]

        System.out.println(s.length());  // 11  --> counts the number of characters
        System.out.println(letters.length);  // 11  --> counts the number of elements

        System.out.println(letters[0]);  // h

        for(char eachLetter : s.toCharArray()){   // : letters (      ---> bu sekilde variable name'ini yaziyorduk normalde : sonrasinda. Ama toCharArray kullanirken once letters vs hic demeden ilk bu loop'u yazsak da calisiyor, kizlarla denedik bunu
            System.out.println(eachLetter);  // alt alta  h e l l o   w o r l d  print ediyor
        }
        System.out.println();

        String str = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        // System.out.println(str.split(",")); // [Ljava.lang.String;@75bd9247 -> hatali cikar boyle yaparsan
        System.out.println(Arrays.toString(str.split(",")));  // [monday, tuesday, wednesday, thursday, friday, saturday, sunday]

        for(String eachDay : str.split(",")){
            System.out.println(eachDay);  // Boyle olunca gunleri alt alta yazdiriyor -> (( It is loop calling from String array.))
        }

        String str2 = "Jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";
        String[] months = str2.split("-");   // split method takes every single separate elements and dash (tire yani bu sembol: - ) is splitting the characters

        for(String eachMonth : months){
            System.out.println(eachMonth);  // Boyle olunca aylari alt alta yazdiriyor
        }

        String str3 = "mississippi";
        System.out.println(Arrays.toString(str3.split("si")));  // [mis, s, ppi]

        String str4 = "java";
        System.out.println(Arrays.toString(str4.toCharArray()));  // char []   --> [j, a, v, a] console'da
        System.out.println(Arrays.toString(str4.split("")));  // String [] --> [j, a, v, a] console'da
        // biri String type biri char type ama characters the same


    }
}
