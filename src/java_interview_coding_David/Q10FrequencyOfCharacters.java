package java_interview_coding_David;

import java.util.*;

public class Q10FrequencyOfCharacters {

    /*
    Q10: String -- Frequency of Characters:
        Write a return method that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public static void main(String[] args) {

        frequencyOfCharacters("AAABBCDD");     // {A=3, B=2, C=1, D=2}
        frequencyOfCharacters("AAaBbbCCCddd");  // {A=2, a=1, B=1, b=2, C=3, d=3}

    }

    public static void frequencyOfCharacters(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();   //  insertion order
        // key = Character (unique)  - value = Integer

        for (int i = 0; i < str.length(); i++) {    // str : AAABBCDD

            char key = str.charAt(i);   // if & else -> re-usability

            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);  // get(key) -> returns value that is linked to the given key --> Do I have this key? Yes, add 1 to the value -> like reassigning key's value
            } else {   // not in map yet
                map.put(key, 1);  // -> value will be 1
            }
        }
        System.out.println(map);
    }


    // sorting de olabilir


    /*
    // David's solution:

        String str = scan.next();
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
      //  System.out.println(Arrays.toString(ch));
        String dummy = "";
        int counter;
        for (int i = 0; i < ch.length; i++) {
            counter = 0;
            if (!dummy.contains(ch[i] + "")) {
                for (int j = 0; j < ch.length; j++) {
                    if (ch[j] == ch[i])
                        counter++;
                }
                dummy += "" + ch[i] + counter;
            }
        }
        System.out.println(dummy);
     */









    /*  // Zeynep's solution:

    public static void frequencyOfCharacters(String word) {

        String str = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (str.indexOf(word.charAt(i)) == -1)
                str += word.charAt(i) + "" + count;
        }
        System.out.print(str);    // A3B2C1D2
    }
     */

}

