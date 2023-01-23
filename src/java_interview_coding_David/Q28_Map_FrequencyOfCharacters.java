package java_interview_coding_David;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q28_Map_FrequencyOfCharacters {

    /*
    Map -- Frequency of Characters
        Write a method that prints the frequency of each character from a String
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

    /*  // Lauren's answer
     public static Map<Character, Integer> frequencyOfChars(String s){
        Map<Character, Integer> chars=new TreeMap<>(); //LinkedHashMap to maintain insertion order
        for(int i=0; i<s.length(); i++){
            if(!chars.containsKey(s.charAt(i))){
                chars.put(s.charAt(i), 1);
            }
            else{
              int frequency= chars.get(s.charAt(i));
              chars.put(s.charAt(i), ++frequency);
            }
        }
        return chars;
    }

    public static void main(String[] args) {
        System.out.println("frequencyOfChars(\"CYDEO BATCH 27 GROUP 14\") = " + frequencyOfChars("CYDEO BATCH 27 GROUP 14"));
    }
     */


}

















    // Q10'daki cevabimla ayni ->  aynisini yapistirdim