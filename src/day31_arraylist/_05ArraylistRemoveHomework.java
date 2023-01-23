package day31_arraylist;

import java.util.ArrayList;

public class _05ArraylistRemoveHomework {

    /*
    Practice flow:

        Create an ArrayList of Strings
            add these elements:
                Iron Man, Spider Man, Thor, Captain America, Hawkeye
                      remove Thor by index
                      remove Iron Man by element
                      remove the first index
    Print the ArrayList after each action to see how the change is made
     */

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();  // words yerine avengers yazdi Saim

        words.add("Iron Man");
        words.add("Spider Man");
        words.add("Thor");
        words.add("Captain America");
        words.add("Hawkeye");
        System.out.println(words);  // [Iron Man, Spider Man, Thor, Captain America, Hawkeye]


             // remove(index): removes the element at the given index ((number)). All elements shift over ----> returns the element that is removed --> if you try to remove an index that doesn’t exist: out of bounds ((( IndexOutOfBoundsException ))

             // remove(element) :  remove the element that was defined from the arrayList ---> returns boolean ----> true: if the element was removed ----> false: if the element was not removed / if the element didn't exist



        /* Bas kismi icin (remove Thor by index icin) first way:
        // indexOf(element):  returns the index of the given element. The index returned will be the first occurrence of the element —> returns int

        System.out.println("======= Saim's addition ========");

        int indexOfThor = words.indexOf("Thor");
        System.out.println(indexOfThor);   // 2  // TODO: indexOfThor seklinde yani indexOf method ile de yapabildik

        words.remove(indexOfThor); // remove(2) -> but more dynamic
        System.out.println(words);  // [Iron Man, Spider Man, Captain America, Hawkeye]

        System.out.println("====== Saim's end =========");

         */

        // Bu kisimi farkliydi, sonrasi ayni. Bu kisim yerine ben soyle yapmistim:
        // remove Thor by index:  ((second way))
        words.remove(2);  // 2. indextekini cikar dedik
        System.out.println(words);  // [Iron Man, Spider Man, Captain America, Hawkeye]


                /* removing Thor by element would be:
                     words.remove("Thor");
                     System.out.println(words);  // [Iron Man, Spider Man, Captain America, Hawkeye]
                 */

        // remove Iron Man by element:
        words.remove("Iron Man");
        System.out.println(words); // [Spider Man, Captain America, Hawkeye]


        // remove the first index:
        words.remove(0);
        System.out.println(words);  // [Captain America, Hawkeye]


        System.out.println("------------Saim talks about another example:: ------------------------");


        // removing in Integer ArrayList // TODO: how to remove in Integer ArrayList:

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(800);
        nums.add(300);
        nums.add(400);
        nums.add(300);
        System.out.println(nums);  // [800, 300, 400, 300]

        // nums.remove(300); the 300 is an int here, so it is trying to remove index 300
        nums.remove((Integer) 300);  // 300 is being cast to Integer, so it will remove the element
        System.out.println(nums);  // [800, 400, 300]


    }
}
