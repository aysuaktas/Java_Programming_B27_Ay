package day29_methods;

import day29_my_utils._01StringUtil;

public class _05DuplicateCharacters {

    // Bu soruyu day21_nested_loops package'inda _10DuplicateCharactersHomework class'inda da yapmisiz
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

        System.out.println(getDuplicateCharacters("AAABCCDEEF"));  // ACE --> sorudaki buydu

        System.out.println(getDuplicateCharacters("ISJWJBwwiwqie"));  // Jwi  -> rastgele yazdik bu ornegi
    }


    public static String getDuplicateCharacters(String str){

        String duplicate ="";

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

        /*
        String str = AAABCCDEEF
        int frequency = _01StringUtil.frequencyOfChar(str, str.charAt(i));
        _01StringUtil.frequencyOfChar(str, A);
        _01StringUtil.frequencyOfChar(str, B);
        _01StringUtil.frequencyOfChar(str, C);
        _01StringUtil.frequencyOfChar(str, D);
        _01StringUtil.frequencyOfChar(str, E);
         */