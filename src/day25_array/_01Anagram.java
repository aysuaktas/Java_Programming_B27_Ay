package day25_array;

import java.util.Arrays;

public class _01Anagram {

    /* (( Yesterday's homework but I did not do it ))

    [IQ] Given two Strings determine if they are anagram or not. Anagram is when the character of the words can be reordered to get a different word.Ex:
	    listen
	    silent

    The letters of the two words are the same, so they are anagram

     ((Anagram olmasi icin kelimelerin length'inin de same olmasi lazim. Farkliysa anagram olmaz))
     */

    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "silent";

        // how can we turn a String to CharArray? :

        char[] first = word1.toCharArray();
        char[] second = word2.toCharArray();

        System.out.println(Arrays.toString(first));   // [l, i, s, t, e, n]
        System.out.println(Arrays.toString(second));   // [s, i, l, e, n, t]

        // If we use sort, they will be in an alphabetic (alfabetik) order.
        Arrays.sort(first);
        Arrays.sort(second);
        // If we print them:
        System.out.println(Arrays.toString(first));  // [e, i, l, n, s, t]
        System.out.println(Arrays.toString(second));  // [e, i, l, n, s, t]

        if(Arrays.equals(first, second)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
        // It will print Anagram because after we sort them, they become in alphabetic order. So, if they are anagram, their characters will be same ((in the same indexes)). But case sensitivity does matter. Yani Listen'in l'si uppercase ama silent'in l'si lowercase ise -> Not Anagram would be printed on the console.

        // We can use also ternary instead of if statement:
        System.out.println(Arrays.equals(first, second) ? "Anagram" : "Not Anagram");   // Anagram

    }
}
