package java_interview_coding_David;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q30_Map_UniqueCharacterFromString {

    /*
    Map -- Unique character from String
        Find Unique Characters of a string and put them in a map with the number of occurrences as 1
        For example:
            “aabccddeffft”
            {b=1,e=1,t=1}
     */

// Lauren's answer:
public static Map<Character, Integer> uniqueCharsInAString(String s) {

    Map<Character, Integer> mapOfChars = new LinkedHashMap<>();
    Map<Character, Integer> uniqueChars = new LinkedHashMap<>();
    for (int i = 0; i < s.length(); i++) {
        if (!mapOfChars.containsKey(s.charAt(i))) {
            mapOfChars.put(s.charAt(i), 1);
        } else {
            int frequency = mapOfChars.get(s.charAt(i));
            mapOfChars.put(s.charAt(i), ++frequency);
        }
    }

    for (Character each : mapOfChars.keySet()) {
        if (mapOfChars.get(each) == 1) {
            uniqueChars.put(each, 1);
        }

    }
    return uniqueChars;
}

    public static void main(String[] args) {
        System.out.println(uniqueCharsInAString("Harry Potter and the Chamber of Secrets"));
    }

}
