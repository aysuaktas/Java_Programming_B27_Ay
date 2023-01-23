package day24_array;

import java.util.Arrays;

public class _06ReverseEachWord {

    /*
    today is Friday. Have a good weekend!

        reverse each word:
     yadoT si .yadirF evaH a doog !dnekeew  -> her kelimeyi tersten yazdir
     */


    public static void main(String[] args) {

        String str = "today is Friday. Have a good weekend!";

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));  // [today, is, Friday., Have, a, good, weekend!]
        String reverse = "";

        for(String each: words) {   // goes through one element at a time in the array

            String eachReverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                eachReverse += each.charAt(i);
            }
            reverse += eachReverse + " ";
        }
        System.out.println(reverse.trim());  // yadot si .yadirF evaH a doog !dnekeew  // sonunda da trim yaptik cunku bir ustte + " " oldugu icin for each loop'ta surekli bosluk aliyor. Bunu yapmazsak en sondaki kelimeden sonra da space oluyor ama bunu istemiyoruz


    }
}


