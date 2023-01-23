package day46_collections;

import java.util.*;

public class _01ReadFromSet {  // just to read some elements


    public static void main(String[] args) {

        /*
        Set<Integer> set = new HashSet<>();  // HashSet-> random order
        set.add(4);
        set.add(5);
        set.add(-1);
        set.add(9);
        System.out.println(set); // [-1, 4, 5, 9] // numbers looks like sorted but don't trick by that. Cunku garantisi yok. mesela ekleme yapip yeniden yazalim:
         */

        Set<Integer> set = new HashSet<>();  // HashSet-> random order
        set.add(4);
        set.add(5);
        set.add(12);
        set.add(34);
        set.add(-1);
        set.add(9);
        System.out.println(set); // [-1, 34, 4, 5, 9, 12]

        // set.get(); --> there is no get method, how do you access the elements? --> get methodu set list'lerde yok cunku set'lerde index number yok. Elements'e nasil erisiriz? for each loop ile erisebiliriz:

        for(int each : set){
            if(each > 10){
                System.out.println(each);
            }
        }
                 // alt alta 34
                 //          12 yazdirir

        System.out.println("---------");

        Set<String> handles = new HashSet<>();  // HashSet-> random order
        handles.add("daad2141124");
        handles.add("dsauehui223");

        for(String each : handles){
            if(!each.equalsIgnoreCase("daad2141124")){
                // switch to the other handle
            }
        }

        System.out.println("---------");

        Set<String> set3 = new HashSet<>();  // HashSet-> random order
        set3.add("hello");
        set3.add("bye");
        set3.add("java");
        set3.add("world");
        System.out.println(set3);  // [java, world, hello, bye]

        // I can convert set type to the list type. And then I can use indexes to access the elements. I can use get method, for ex.:
        List<String> list = new ArrayList<>(set3);
        System.out.println(list);  // [java, world, hello, bye] -> bu order degismedi gorunurde ama artik indexes'i kullanabiliriz
        System.out.println(list.get(0));  // java --> 0.index'te olani print edebildik bu sayede

        System.out.println("---------");

        // Remove duplicate occurrences of each character:
        String s = "AAAABBBBCCCCDDDD";
        System.out.println(new LinkedHashSet<>(new ArrayList<>(Arrays.asList(s.split("")))));  // [A, B, C, D]  --->// LinkedHashSet-> maintains insertion order. To maintain the order, we use LinkedHashSet. // asList method return you list back

        System.out.println(new LinkedHashSet<>(new ArrayList<>(Arrays.asList(s.split(""))))
                .toString().replace(", ", "").replace("[", "").replace("]", "")
        );  // ABCD

        System.out.println("---------");


    }
}
