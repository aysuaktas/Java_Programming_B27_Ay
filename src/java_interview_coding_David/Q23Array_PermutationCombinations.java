package java_interview_coding_David;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q23Array_PermutationCombinations {

    /*
    Q23: Array -- permutation combinations
        Given an array of 3 characters print all permutation combinations from the given characters
     */   //--> bu soruyu ben cozmedim, yine bak, YouTube'dan falan da izle


    // David's solution:
    private static void permutationCombinationOf3Chars(char[] ch) {
        //XXX
        String str = "";
        for (char c : ch) {
            if (!str.contains(c + "")) {
                str += c;
            }
        }

        if (str.length() == 1) {
            System.out.println(Arrays.toString(str.toCharArray()));
        } else if (str.length() == 2) {  //XY
            System.out.println(Arrays.toString(str.toCharArray()));
            str = str.substring(1) + str.substring(0, 1);
            System.out.println(Arrays.toString(str.toCharArray()));
        } else {  //  X  Y  Z
            for (int i = 0; i < str.length(); i++) {
                String str2 = "";
                for (int j = 0; j < str.length(); j++) {
                    if (!(i == j)) {
                        str2 += str.charAt(j);
                    }
                }                     //X        // YZ
                String str3 = (str.charAt(i) + str2);

                System.out.println(Arrays.toString(str3.toCharArray()));

                System.out.println(Arrays.toString((str3.substring(0, 1) + str3.substring(2) + str3.substring(1, 2)).toCharArray()));

            }
        }
    }

    // David's solution2:
        //PERMUTATION COMBINATION
    public static Set<String> permute(String chars) {
        // Use sets to eliminate semantic duplicates (aab is still aab even if you switch the two 'a's)
        // Switch to HashSet for better performance
        Set<String> set = new TreeSet<String>();

        // Termination condition: only 1 permutation for a string of length 1
        if (chars.length() == 1) {
            set.add(chars);
        } else {
            // Give each character a chance to be the first in the permuted string
            for (int i = 0; i < chars.length(); i++) {
                // Remove the character at index i from the string
                String pre = chars.substring(0, i);
                String post = chars.substring(i + 1);
                String remaining = pre + post;

                // Recurse to find all the permutations of the remaining chars
                for (String permutation : permute(remaining)) {
                    // Concatenate the first character with the permutations of the remaining chars
                    set.add(chars.charAt(i) + permutation);
                }
            }
        }
        return set;
    }





    /*
    // Saim's solution:
    public static void printPermutation(char[] ch) {
        for (String s : permutation(ch)) {
            System.out.println(Arrays.toString(s.toCharArray()));
        }
    }

    public static Set<String> permutation(char[] ch) {
        String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", "");

        Set<String> set = new LinkedHashSet<>();
        if (str.length() == 1) {
            set.add(str);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String a3 = str.substring(0, i) + str.substring(i + 1);
                char[] ch2 = a3.toCharArray();
                for (String permutation : permutation(ch2)) {
                    set.add(str.charAt(i) + permutation);
                }
            }
        }
        return set;
    }
     */


}







// We can replace all commas (,) and all angle brackets to empty String.
//Then create a LinkedHashSet to