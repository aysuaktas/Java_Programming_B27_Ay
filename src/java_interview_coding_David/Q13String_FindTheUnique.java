package java_interview_coding_David;

import java.util.*;

public class Q13String_FindTheUnique {

    /*
    Q13: String -- Find the unique
        Write a return method that can find the unique characters from the String • Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */

    public static void main(String[] args) {

        System.out.println(findUniqueElements("AAABBBCCCDEF"));   // DEF
    }


    public static String findUniqueElements(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {    // it will go each character one by one
            int count = 0;

            for (int j = 0; j < str.length(); j++) {      // inner for loop -> go each character one by one again
                if (str.charAt(i) == str.charAt(j)) {    // if the characters matches -> increase count
                    count++;
                }
            }

            if (count == 1) {    // count 1 -> means unique
                result += str.charAt(i);
            }
        }
        return result;
    }
}






        /*  Second way:

        // LinkedHashMap because -> it does not accept duplicate values ,and it has insertion order


        String[] arr = str.split("");
        Map<String, Integer> mapStr = new LinkedHashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(!mapStr.containsKey(arr[i])){
                mapStr.put(arr[i], 1);
            } else {
                mapStr.put(arr[i], mapStr.get(arr[i])+1);
            }
        }

        for(Map.Entry<String,Integer> map: mapStr.entrySet()){
            if(map.getValue() == 1){
                System.out.print(map.getKey());
            }
        }

        }
}
         */


    /*
    // David's solution:

       int counter3;
        String dummy4 = "";
        String str4 = scan.next();
        for (int i = 0; i < str4.length(); i++) {   //java
            counter3 = 0;
            for (int j = 0; j < str4.length(); j++) {
                if (str4.charAt(i) == str4.charAt(j)) {
                    counter3++;
                }
            }
            if (counter3 == 1)
                dummy4 += str4.charAt(i);
        }
        System.out.println("unique chars-> "+dummy4);
     */



