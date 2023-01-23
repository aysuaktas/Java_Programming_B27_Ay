package day47_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _02RemoveNumber {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(4, 1, 5, 2, 6, 8, 2, 5, -1, 19, 20, 23, 2, 13, 5, 3, 2));

        // remove all numbers less than 5   -->(( traditional loop ((for loop)) will not work because it will remove 4 but everything moves over)). --> Onceden bunu cozerken lambda yapiyorduk ama simdi baska yoldan yapacagiz. Zaten lambda is not so readable ve gorece yeni eklenen bir sey oldugu icin karsindaki syntax'i bilmiyor falan olabilir. Removing an element/s icin iterator kullanmayi oneriyor Saim.

        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){   // hasNext method checks if there is any element next to the current position of the iterator(pin). --> hasNext yani element varsa I want to keep checking it. I need to check, and I need to move, because I did not move it yet. ---> While loop o condition false olunca duruyordu. hasNext de son elemente gelip onu yapacak, sonra devaminda yani sonrasinda baska element olmadigi icin false verecek ve loop will stop
            if(it.next() < 5){  // if my number less than 5, I want to remove --> remove() :  removes the element at the current iterator position. Bunun icin it.remove yapariz:
                it.remove();
            }
        }
        System.out.println(nums);

        System.out.println("========== another solution ==========");  // bu alttaki kisim Zeynep'ten:

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(4, 1, 5, 2, 6, 8, 2, 5, -1, 19, 20, 23, 2, 13, 5, 3, 2));

        Iterator<Integer> iterator = nums2.iterator();
        nums2.removeIf(p -> p <5); // lambda already has Iteration interface implemented
        System.out.println(nums2);

    }
}

    // we are working on with iterator object. Sadece onun methodlarini (hasNext(), next(), remove()) kullanabiliriz, add methodu falan kullanamayiz cunku onlar ArrayList'in methodlari, iterator'da olmaz.

    // moves and returns dedigi method hangisi?? kizlara sor. Ustteki while loop'u anlatirken bir yerde soyledi ama neresi?..