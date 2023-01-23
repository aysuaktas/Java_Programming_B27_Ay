package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _08UsingCollections {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(126, 578, 270, 323, 23, 809, 817, 610, 435, 435, 398));

        System.out.println(Collections.max(list));  // 817
        System.out.println(Collections.min(list));  // 23


        System.out.println("Before: " + list); // Before: [126, 578, 270, 323, 23, 809, 817, 610, 435, 435, 398]  --> sort yapmadan once
        Collections.sort(list);
        System.out.println("After: " + list); // After: [23, 126, 270, 323, 398, 435, 435, 578, 610, 809, 817]  ---> sort yaptiktan sonra


        System.out.println("2nd min: " + list.get(1)); // 2nd min: 126  --> ikinci minimum number -> 1. indexteki. Cunku en kucugu 0. indexte after we sort it
        System.out.println("2nd max: " + list.get(list.size()-2));  // 2nd max: 809  --> size-1 son indexteki icin. Sondan ikinciyi istedigimiz icin -2 yaptik

        /*
        // Alternative way:
         list.remove(Collection.max(list))
         then use Collection.max(list) --> to find 2nd max
         */

        Collections.shuffle(list); // shuffle -> means randomize it. Randomly changes our elements -> moves your elements in a random order

        System.out.println(list);  // [435, 578, 323, 23, 610, 126, 270, 817, 435, 809, 398] -> bir kere print edince bu cikti mesela ama her seferinde farkli cikiyor. Sonraki run etmede [578, 323, 270, 23, 435, 610, 126, 398, 817, 809, 435] cikti, gibi. Randomize olarak dagitiyor o elementleri cunku.

    }
}
