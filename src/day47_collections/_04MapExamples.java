package day47_collections;

import java.util.*;

public class _04MapExamples {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();   // HashMap -> random order (order is not guaranteed). Here, my key is integer, my value is String
        // keys are Integer
        // values are String

 //       map1.add();  ==> there is no add method in map, to do that, we need to use "put" method in map:

        map1.put(4, "four");  // // my key is integer, my value is String. So, in this example: key = 4, value = "four". Key is equal to value olarak gozukecek console'da yani 4=four olacak bu mesela
        map1.put(1, "one");
        map1.put(7, "seven");
        map1.put(10, "ten");
        map1.put(-2, "negative two");
        map1.put(5, "five");
        map1.put(null, "empty"); // HashMap accepts null

        System.out.println(map1);  // {null=empty, 1=one, -2=negative two, 4=four, 5=five, 7=seven, 10=ten}  --> it is basically a random order with HashMap. There is an internal algorithm. Almost sorted order but we cannot guarantee that. O nedenle once 1 sonra -2 seklinde olabildi.  Sorted order'dan emin olmak istiyorsak baska bir sey kullanmamiz gerekir.


        System.out.println("==========================");


        Map<Integer, String> map2 = new LinkedHashMap<>();   // LinkedHashMap -> maintains insertion order
        map2.put(4, "four");  // // my key is integer, my value is String. So, in this example: key = 4, value = "four". Key is equal to value olarak gozukecek console'da yani 4=four olacak bu mesela
        map2.put(1, "one");
        map2.put(7, "seven");
        map2.put(10, "ten");
        map2.put(-2, "negative two");
        map2.put(5, "five");
        map2.put(null, "empty");  // LinkedHashMap accepts null

        System.out.println(map2);  // {4=four, 1=one, 7=seven, 10=ten, -2=negative two, 5=five, null=empty}


        System.out.println("==========================");


        Map<Integer, String> map3 = new TreeMap<>();   // TreeMap -> maintains natural ((sorted)) order for the keys
        map3.put(4, "four");  // // my key is integer, my value is String. So, in this example: key = 4, value = "four". Key is equal to value olarak gozukecek console'da yani 4=four olacak bu mesela
        map3.put(1, "one");
        map3.put(7, "seven");
        map3.put(10, "ten");
        map3.put(-2, "negative two");
        map3.put(5, "five");
 //       map3.put(null, "empty");  // Null not allowed in TreeMap

        System.out.println(map3);  // {-2=negative two, 1=one, 4=four, 5=five, 7=seven, 10=ten}


        System.out.println("==========================");


        Map<Integer, String> map4 = new Hashtable<>();   // Hashtable -> maintains random order
        map4.put(4, "four");  // // my key is integer, my value is String. So, in this example: key = 4, value = "four". Key is equal to value olarak gozukecek console'da yani 4=four olacak bu mesela
        map4.put(1, "one");
        map4.put(7, "seven");
        map4.put(10, "ten");
        map4.put(-2, "negative two");
        map4.put(5, "five");
    //  map4.put(null, "empty");  // Null not allowed in Hashtable  --> NullPointerException verdi
    //  map4.put(9, null); // null values also not allowed in Hashtable. Hashtable biraz daha old version oldugu icin bunda key de null olamaz, value da null olamaz. Digerlerinden biraz daha farkli

        System.out.println(map4);  // {10=ten, 7=seven, 5=five, 4=four, 1=one, -2=negative two}


    }
}

    // Benim mantikla hatirlamak icin:
         // hashtable - gelenekci bunak - value yoksa da go diyor --> yani null'u hem key'de hem value'da kabul etmiyor, eski kafali
        // tree'li olan -> genc -> anahtar (key) olsun da value olmasa da sallaa diyor gelenekci degil -> yani null'u key'de kabul etmiyor