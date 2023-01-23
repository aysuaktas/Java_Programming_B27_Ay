package day21_nested_loops;

public class _10DuplicateCharactersHomework {

    /*
    [IQ] Duplicate characters

    Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

    Ex:
        Input:
            AAABCCDEEF
        Output:
            ACE

        -> the characters A C and E are found in the String multiple times, so they are duplicates

     */

    public static void main(String[] args) {

        // Saim's solution:  // TODO: anlamadim, ogren

        String str = "AAABCCDEEF";
        String checked = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            if (checked.contains("" + str.charAt(i))) {  // if the character was already checked and counted, it should skip the rest of the code because it doesn't need to count those characters again
                continue;
            }

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > 1) { // any amount of characters more than 1 means it was duplicate. We don't care how many times it was repeated, only that it was repeated
                System.out.print(str.charAt(i));
            }

            checked += str.charAt(i); // after counting the character once, we don't need to check it again
        }



// alternative without continue:
/*
        String str = "AAABCCDEEF";
        String checked = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if (!checked.contains("" + str.charAt(i))) {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                if (count > 1) { // any amount of characters more than 1 means it was duplicate. We don't care how many times it was repeated, only that it was repeated
                    System.out.print(str.charAt(i));
                }
                checked += str.charAt(i); // after counting the character once we don't need to check it again
            }
            */


        System.out.println();
        System.out.println("----------------------");


        // Zeynep's solution

        String word = "AAABCCDEEF";
        String duplicate = "";
        String unique = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int count = 0;

            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += ch;
            }
            if (count > 1) {
                if (duplicate.indexOf(ch) == -1) {
                    duplicate += ch;
                }
            }
        }
        System.out.println(duplicate); // ACE -> duplicated characters
        System.out.println(duplicate.charAt(0)); // A -> first duplicated character
        System.out.println(word.indexOf(unique.charAt(0))); // 3 -> index number of the first unique character


    }
}


