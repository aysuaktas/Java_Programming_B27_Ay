package day28_methods;

import org.w3c.dom.ls.LSOutput;

public class _07PalindromeMethodHomework {

    /*
    create a method that will accept a String and find if it is Palindrome or not (boolean)

        (( Palindrome means the String is read the same forwards and backwards  // bastan ve sondan okuyunca ayni olan seyler palindrome
                 ex:
                     anna
                     racecar
                     maam
                     abcba ))
     */

/*
    public static void main(String[] args) {
        String str = "anna";
        System.out.println(isPalindrome(str));

    }

    public static boolean isPalindrome(String str){

        String reverse = "";
        // reverse my String, read it back from last index to first, backwards

        for (int i = str.length() - 1; i >= 0; i--) {   // i is just a number, but using length - 1 allows me to find the last index of the String, that means we can use that index to read characters
            reverse += (str.charAt(i));  // if I concatenate to my reverse variable --> reverse = reverse + s.charAt(i);   i -> whatever the character
        }

        System.out.println(reverse);


        if (str.equals(reverse)) {
            System.out.println("Palindrome");
            return true;
        } else {
            System.out.println("Not Palindrome");
            return false;
        }


    }
// System.out.println(s.equals(reverse) ? "Palindrome" : "Not Palindrome");  --> if statement yerine ternary ile de yapabiliriz boyle

 */


        /* Degisimi gormek icin hardcoded olarak -> String s = "abcde"; dersek console'da:
        edcba
        Not Polindrome
        false

        // anna dersek -> console'da : anna
                                       Polindrome
                                       true
         */



    // Merve's solution :

      public static void main(String[] args) {
        System.out.println(isPalindrome("merve"));  // false
        System.out.println(isPalindrome("Anna"));   // true
        System.out.println(isPalindrome("racacar"));   // true
    }

    public static boolean isPalindrome(String str){
        String strReversed = "";
        for (int i = str.length()-1; i >= 0; i--) {
            strReversed+=str.charAt(i);

        }
        return str.equalsIgnoreCase(strReversed);
    }


}
