package day31_arraylist;

import java.util.ArrayList;

public class _02RemovingMethod {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);  // [today, raining, java, flying]

        // 1) removing by index:

        words.remove(2);  // returns the element that you remove --> removing by index
        System.out.println(words);  // [today, raining, flying]

        System.out.println(words.remove(0));  // today
        System.out.println(words);  // [raining, flying]

        // clear(): removes all the elements from the ArrayList
        words.clear();  // emptys the whole ArrayList
        System.out.println(words);  // []


        // 2) use the removing by object:

        words.add("jumping");
        words.add("barn");
        words.add("chicken");
        words.add("cow");
        System.out.println(words);  // [jumping, barn, chicken, cow]

        words.remove("barn");   // removing by object  --> uppercase Barn deneseydi remove olmazdi cunku case sensitivity matters ve oyle bir character'imiz yok.
        System.out.println(words);  // [jumping, chicken, cow]

        System.out.println(words.remove("Cow")); // false --> returns boolean. Case sensitivity var, bizde lowercase cow var, Cow is false
        System.out.println(words);  // [jumping, chicken, cow]  --> cow remove olamadi bu nedenle

        System.out.println(words.remove("chicken"));  // true --> returns boolean. Element olarak elimizde chicken var, bu true.
        System.out.println(words); // [jumping, cow]  --> true oldugu icin chicken remove edilebildi

        System.out.println("--------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(5);
        nums.add(0);
        nums.add(2);
        nums.add(4);
        System.out.println(nums); // [4, 5, 0, 2, 4]

        nums.remove(0);  // removing the first index ---> 0 is int so it removes by index
        System.out.println(nums); // [5, 0, 2, 4]

        Integer a = 0;
        nums.remove(a); // this one removes index or element? I'm removing the actual number here, not the element. --> a is Integer ((type)) so it removed by element, the element it removes 0
        System.out.println(nums); // [5, 2, 4]

        nums.remove((Integer) 2); // some kind of casting --> casting the 2 to an Integer type, so I can remove the element 2, not the index 2
        System.out.println(nums);  // [5, 4]


        nums.add(0, 4);
        System.out.println(nums); // [4, 5, 4]

        nums.remove((Integer) 4);
        System.out.println(nums); // [5, 4]

    }
}
        /*
        String s = "hello";
        s.charAt(0);
        System.out.println(s.charAt(0));  // h
         */