package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _02SwitchPairs {

    /*  It was yesterday's homework:
    Switch Pairs

    Given an ArrayList of words switch position for each pair in the List. A pair is an element and the element next to it.

    The given ArrayList will always have an even number of elements so each element will always have a single pair.

        Ex:
        Input: {"Cat", "in", "the", "hat"}

        There is two pairs:
        "Cat" and "in"
        "the" and "hat"

        Output: {"in", "Cat", "hat", "the”}
     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("cat", "in", "the", "hat", "hello", "world"));
        System.out.println(switchPairs(list)); // [in, cat, hat, the, world, hello]

        System.out.println(switchPairs(list));  // [cat, in, the, hat, hello, world]


    }


    public static ArrayList<String> switchPairs(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i += 2) {   // i ++ degil de i +=2 yaptik ki first one of each pair'e gitsin
            // System.out.println("pairs: " + list.get(i) + " & " + list.get(i + 1));

                    /* System.out.println("pairs: " + list.get(i) + " & " + list.get(i + 1)); switchPairs methodunda bunu comment almadan once run edince, return list yerine de return null yazarken console'da:
                         pairs: cat & in
                         pairs: the & hat
                         pairs: hello & world
                         null  yaziyordu
                     */

            String temp = list.get(i);   // ((temp dedigi temporary)). Bu temp'e gelen element temporary yani degisecek olan oluyor
            list.set(i, list.get(i + 1)); // Once ilk pair'i alalim. cat ve in idi. second word become the first word. First word changed now.
            list.set(i + 1, temp);
        }
        return list;
    }

    // Interview'larda sorarlarsa ustteki yontemi kullanip problem-solving'ini gostermen lazim.
    // Ama collections utility class method ile de cozulebilirdi diye alternatif soyleyebilirsin, o da alttaki. Ama usttekini kullan interview'da

    public static ArrayList<String> switchPairs2(ArrayList<String> list) {

        for(int i = 0; i < list.size(); i += 2){
            Collections.swap(list, i, i+1);
        }
        return list;
    }



}
