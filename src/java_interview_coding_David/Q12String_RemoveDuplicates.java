package java_interview_coding_David;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Q12String_RemoveDuplicates {

    /*
    Q12: String -- Remove Duplicates.
        Write a return method that can remove the duplicated values from String
        Ex: removeDup("AAABBBCCC") ==> ABC
     */


    public static void main(String[] args) {
        removeDuplicates("AAABBBCCC");  // ABC
    }

    public static void removeDuplicates(String str) {  // I will declare a method with one String parameter
        LinkedHashSet<Character> set = new LinkedHashSet<>();   // LinkedHashMap -> to maintain insertion order

        for(int i = 0; i < str.length(); i++){
            set.add(str.charAt(i));  // A(AA)B(BB)C(CC)
        }

        for(Character each : set)
            System.out.print(each);  // ABC
    }
}


    // split -> ekle


    /*
    // Merve's solution:

    public static void removeDuplicates(String str){
        Set<String> set = new LinkedHashSet<>(Arrays.asList(str.split("")));
        String result = set.toString().replace("[","").replace("]","").replace(", ","");
        System.out.println(result);
    }
     */


    /*
    // David's solution:

     String str3=scan.next();
        String dummy3="";
        for (int i = 0; i < str3.length(); i++) {
            if (!dummy3.contains(str3.charAt(i)+"")){
                dummy3+=str3.charAt(i);
            }
        }
        System.out.println("duplicates removed -> "+dummy3);

     */







