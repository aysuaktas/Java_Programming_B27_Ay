package day45_polymorphism._2_learn_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class _11SetObjects {  // set types ile ilgili

    /*
    - Set types: unordered (no indexes), not allow duplicates
    Three set types are: ((farklari random, insertion or sorted ordered olmalari))
	- HashSet -> random order
	- LinkedHashSet -> insertion order
	- TreeSet -> sorted order ((automatically in sorted order )) it does NOT accept the null value
     */

    public static void main(String[] args) {

        // HashSet:
        Set<String> set1 = new HashSet<>();  // HashSet-> random order
        set1.add(null);
        set1.add("hello world");
        set1.add("5.0");
        set1.add("#zebra");
        set1.add("hello world");  // duplicate olunca ne oldugunu gormek icin aynisini tekrar yazdik
        set1.add("Java");

        System.out.println(set1);  // [null, Java, #zebra, 5.0, hello world]  --> Set'te: duplicate olsa da run edebildik,intelliJ duplicate olanlarin rengini degistirip bizi uyardi ama sorun cikmiyor. Print edince duplicate print etmiyor ama, duplicate olanlari bir kez print ediyor --> HashSet ile yaptik, bunda print edince random order'da cikiyorlar. ((random derken her seferinde farkli sonuc cikmiyor ama yazma siramiza gore falan degil yani randomly bu, internal algorithm'e gore)) -> For set types, order does not matter, the point is -> storing does matter. Storing the information/data purpose'i var set types'ta, ordered olma purpose'i yok ve ordered degiller.

        // Benefit of HashSet -> no duplicates. Bunu kullanirsak duplicate olmadigini bilecegiz yani.


        System.out.println("--------");


        // LinkedHashSet:
        Set<String> set2 = new LinkedHashSet<>();  // LinkedHashSet-> maintains insertion order
        set2.add(null);
        set2.add("hello world");
        set2.add("5.0");
        set2.add("#zebra");
        set2.add("hello world");  // duplicate olunca ne oldugunu gormek icin aynisini tekrar yazdik
        set2.add("Java");

        System.out.println(set2);  // [null, hello world, 5.0, #zebra, Java]


        System.out.println("--------");


        // TreeSet:
        Set<String> set3 = new TreeSet<>();  // TreeSet-> maintains natural order (( which means sorted order ))
//      set3.add(null);   // null is not allowed in TreeSet -> (TreeSet does not work with null -> compiling'de degil ama running'de sorun cikariyor: NullPointerException)
        set3.add("hello world");
        set3.add("5.0");
        set3.add("#zebra");
        set3.add("hello world");  // duplicate olunca ne oldugunu gormek icin aynisini tekrar yazdik
        set3.add("Java");

        System.out.println(set3);  // [#zebra, 5.0, Java, hello world] --> sorted order'da print oldu -> sorted orderda once special characters, sonra numbers, sonra uppercase, sonra lowercase)

//      set3.get(0);  // no indexes in set types, so there is no get method -> set types'ta indexes yok, o yuzden boyle kullanamayiz.


    }
}
