package java_interview_coding_David;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Q11String_SameLetters {

    /*
    Q11: String -- Same letters
        Write a return method that check if a string is build out of the same letters as another
        string.
        Ex: same("abc", "cab"); -> true
        same("abc", "abb"); -> false
     */


    public static void main(String[] args) {
        System.out.println(isSameLetter("abc", "cab"));  // true
        System.out.println(isSameLetter("abc", "abb"));  // false
    }

    public static boolean isSameLetter(String word1, String word2){

        if(word1.length() == word2.length()) {  //check if length is same

            // convert Strings to char array
            char[] charArrayWord1 = word1.toCharArray();
            char[] charArrayWord2 = word2.toCharArray();

            // sort char Arrays:
            Arrays.sort(charArrayWord1);
            Arrays.sort(charArrayWord2);

            return Arrays.equals(charArrayWord1, charArrayWord2);  // checks if sorted arrays are equal  --> if equal, return true

        }    // else -> word1.length() != word2.length()

        return false;
    }
}



    /*
    This question is also means check whether two Strings are anagram of each other -> anagram: anagram of a string is another string that contains the same characters, only the order of characters can be different -> like: abcd - dcba


     */
    /* Last part can be:


     if (Arrays.equals(charArrayWord1, charArrayWord2)){
                return true;
            }
        } // else -> word1.length() != word2.length()
        return false;
     */



    /* //Merve's solution

    public static void sameLetters(String str1, String str2){

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str1.split("")));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(str2.split("")));

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println(list1.equals(list2) ? "true" : "false");
    }

     */


    /*
    // David's solution:

    String word1 = scan.next();//abc
        String word2 = scan.next();//***
        char[] arr1 = word1.toCharArray();
        String dummy2 = "";
        for (char char1 : arr1) {
            if (word2.contains(char1 + "")) {
                word2 = word2.replace(char1, '*');//word2.replace(char1+"","");
            }
            dummy2 += "*";
        }
        System.out.println("2 Strings made up of same chars-> "+ word2.equals(dummy2));
     */










