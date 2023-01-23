package day31_arraylist;

import java.util.ArrayList;

public class _03BooleanMethods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        // System.out.println(list.isEmpty()); // true --> in the beginning, nothing is there, so it is empty
        System.out.println("is empty: " + list.isEmpty());  // is empty: true --> console'da rahat gormek icin bilgi ekledik sadece

        list.add(4);
        list.add(5);
        list.add(41);
        list.add(5512);
        list.add(413);
        System.out.println(list);  // [4, 5, 41, 5512, 413]
        // System.out.println(list.isEmpty());  // false --> cunku artik empty degil
        System.out.println("is empty: " + list.isEmpty());  // is empty: false

        // contains methods check if the given argument is an element in the ArrayList:
        System.out.println("contains 41: " + list.contains(41));  // contains 41: true
        System.out.println("contains 5000: " + list.contains(5000));  // contains 5000: false
        System.out.println("contains 1: " + list.contains(1));  // contains 1: false

        System.out.println("-------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(4);
        list2.add(5);
        list2.add(41);
        list2.add(5512);
        list2.add(413);

        System.out.println("equals: " + list.equals(list2));  // equals: true --> same exact arrayList idi, so they were the same here

        System.out.println("list2: " + list2);  // list2: [4, 5, 41, 5512, 413]

        list2.remove(0);
        System.out.println("list2 after we removed index 0: " + list2);  // list2 after we removed index 0: [5, 41, 5512, 413]

        System.out.println("equals: " + list.equals(list2));  // equals: false --> After I remove the first element (sifirinci index) which is 4, they are not the same anymore

        System.out.println("-------------------");

        ArrayList<Integer> list3 = new ArrayList<>();

        list3.add(1);
        list3.add(2);
        list3.add(3);

        ArrayList<Integer> list4 = new ArrayList<>();

        list4.add(3);
        list4.add(2);
        list4.add(1);

        System.out.println("list3 : " + list3);  // list3 : [1, 2, 3]
        System.out.println("list4 : " + list4);  // list4 : [3, 2, 1]
        System.out.println(list3.equals(list4));  // false  --> same elements var ama siralamalari farkli, bu nedenle they are not the same (equal)


    }
}
