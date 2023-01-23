package day20_loops;

public class _09RemoveDuplicates {

    /*
    Remove Duplicates
    Write a program that can remove duplicates from a String
        Ex:
            Input: abcabc
            Output: abc
     */

    public static void main(String[] args) {

        // Saim's solution:

        String s = "abcabc";
        String unique = "";

        for(int i = 0; i < s.length(); i++){
            if(!unique.contains("" + s.charAt(i))){
                unique += s.charAt(i);
            }
        }

        System.out.println(unique);   // abc


        // alternative:

        /*
        String s = "abcabcce";
        String unique = "";

        for(int i = 0; i < s.length(); i++){
            if(unique.contains(s.substring(i, i + 1))){
                continue;
            }
            unique += s.charAt(i);
        }

       System.out.println(unique);
         */


        // Asli's solution:

        String str="abcaaccccccvvvvvvvbc";
        String result="";

        while(str.length()>1) {
            result+=str.substring(0,1);
            // if(str.substring(1).contains(str.substring(0,1))) {
            str = str.replaceAll(str.substring(0,1), "");

        }
        System.out.println(result);  // abcv


    }
}
