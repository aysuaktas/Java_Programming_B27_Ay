package day29_my_utils;

public class _01StringUtil {

    /*
    This class will be used to create String utility methods
     */

    // Bu class'takileri -> day29_methods package'indaki _03CallingStringMethods class'inda run ettik.

    public static String reverse(String str){

        String reverse = "";

        for(int i = str.length() -1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }


    // palindrome means the String is the same forward and backwards

    public static boolean isPalindrome(String str){

        return reverse(str).equalsIgnoreCase(str);   // I'm calling my method "reverse". Ustte yaptigim yani same file'daki method'u cagirmak istiyorum ---> I reverse my String and I'm checking is it equal to.. ((tersten ve normal okuyunca equals mi? diye baktim))
    }


    /* it was yesterday's homework
                   -Fix Format-
    create a method will accept a String and return a String in proper format. Proper format is:
    First character starting as uppercase and the rest as lowercase

    Ex:
    	Input:
	    	jamES

	    Output:
	    	James
     */

    public static String fixFormat(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();     // first character uppercase olsun istiyoruz, o yuzden str.substring(0,1).toUpperCase() dedik. Kalani lowercase olacak. O yuzden str.substring(1).toLowerCase() dedik ki ilk harf (sifirinci index) sonrasinda yani birinci indexten baslayip sona kadar lowercase olsun
    }

    /* it was yesterday's homework
            -Camel Case-
    create a method that will accept a String, of words separated by spaces, and return a camel case version of the String where the first letter of each word is Uppercase and the rest of the word is in lowercase.
    Exception: First word starts with lowercase

    Ex:
    	Input:
	    	JAVA will ruLE tHe wORLd

	    Output:
	    	javaWillRuleTheWorld
     */

    public static String camelCase(String str) {

        String[] allWords = str.split(" ");  // String array -> cunku 1 sentence'im var ve onu split yapacagim. I'm splitting them by the space --> separate words are separate elements olacak boylece.

        String camelCase = allWords[0].toLowerCase();  // allWords[0] dedigim array'in ilk elementi yani ilk kelime -> lowercase olacak

        for (int i = 1; i < allWords.length; i++) { // I'm starting from index 1 because I already used the first word
            camelCase += fixFormat(allWords[i]);
        }
        return camelCase;
    }


    /*
     bunu day29_methods package'inda _04FrequencyOfCharacters class'inda da yazdik:

    given a String and char determine how many times the given char is found in the String

          For ex:  "java" is my word ise a specific character'in how many times olduguna bakacagim, mesela a karakterine bakalim
               a  >>>>> 2
     */

    public static int frequencyOfChar(String str, char letter){  // int dedik cunku frequency of characters sonucu int olacak yani I'm looking for int
        int count = 0;  // 0 is a good default value because if there is not any, it will print 0 for a character's frequency
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == letter){  // mesela kelime java ise gelip bu kelimenin karakterlerini tek tek charAt(i)'deki i icinde dusunursek; j == a mi, NO. a == a mi? YES, count became 1. v == a degil, geciyoruz. a == a --> count 2 olur bu sayede
                count++;
            }
        }
        return count;
    }

    /*   Bu day29_methods package'inda _05DuplicateCharacters'te de var.

    [IQ] Duplicate characters

    Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

    Ex:
        Input:
            AAABCCDEEF
        Output:
            ACE

        -> the characters A C and E are found in the String multiple times, so they are duplicates
     */

    public static String getDuplicateCharacters(String str){

        String duplicate = "";

        for(int i = 0; i < str.length(); i++){
            // str.charAt(i) --> give every character

            if(duplicate.contains("" + str.charAt(i))){
                continue;   // eger onceden check ettiyse exaggeration olmayacak, sonrakine devam edecek
            }

            int frequency = _01StringUtil.frequencyOfChar(str, str.charAt(i));  // _01String util class'indan cagiriyorum bu methodu -> orada yazanlari tek tek yine yazmak yerine. // -> str.charAt(i) yazip dynamically yaptik

            if(frequency > 1) {  // if my frequency is more than 1 -> which also means it is duplicated
                duplicate += str.charAt(i);
            }
        }
        return duplicate;
    }



}
