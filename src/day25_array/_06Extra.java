package day25_array;

import java.util.Arrays;

public class _06Extra {

    public static void main(String[] args) {

        // int[] nums = {4, 2, 1, 51}; bunu yazinca olmadi, kelimelerle yapalim
        String [] strs = {"hello", "world", "monday", "java"};
        System.out.println(Arrays.toString(strs)); // [hello, world, monday, java]

        System.out.println(String.join("#", strs));  // hello#world#monday#java
        System.out.println(String.join(" ", strs));  // hello world monday java
        System.out.println(String.join(" MIDDLE ", strs)); // hello MIDDLE world MIDDLE monday MIDDLE java

        System.out.println("---------------------");

        int[] aa = new int[]{1, 5, 2, 5};   // this is another syntax to create an array -> normally used when you don't need a reference
        System.out.println(Arrays.toString(new int[]{3, 5, 2, 6})); // [3, 5, 2, 6]  -> it creates array, prints it, doesn't have a reference to it after in the program ((reusable degil yani, sanirim onu kastediyor)) --> It is just a different index, that's it. //--> this is making an array and printing at the same time


    }
}
