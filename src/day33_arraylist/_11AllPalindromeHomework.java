package day33_arraylist;

import day29_my_utils._01StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class _11AllPalindromeHomework {

    /*
    All Palindrome
        Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings
        Ignore case sensitivity

            Ex:    Input:
                       "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
                   Output:
                      Anna, Racecar, Level, Eye
     */

    // palindrome means the String is read the same forwards and backwards --> bastan ve sondan okuyunca ayni olan seyler palindrome

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(Arrays.asList("Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"));
        // System.out.println(words);  // [Anna, Java, Python, Racecar, Level, Cydeo, Eye]  -> ArrayList tam hali



        // First way:

        words.removeIf(each-> !each.equalsIgnoreCase(_01StringUtil.reverse(each)));
        System.out.println(words);  // [Anna, Racecar, Level, Eye]



        // Second way:  // TODO: baska yontem ile de yap, usttekini interview'da falan kullanamam...



    }
}

