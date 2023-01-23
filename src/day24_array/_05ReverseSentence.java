package day24_array;

import java.util.Arrays;

public class _05ReverseSentence {

    public static void main(String[] args) {

        String str = "today is Friday. Have a good weekend!";

        // reverse: weekend! good a Have Friday. is Today
        // --> The order of the words is changed, not the letters.


        // How can I separate each word? -> with split
        String[] words = str.split(" ");
        String reverse = "";

        for(int i = words.length - 1; i >= 0; i--){
            reverse += words[i] + " ";
        }

        System.out.println(reverse.trim()); // weekend! good a Have Friday. is today


    }
}












