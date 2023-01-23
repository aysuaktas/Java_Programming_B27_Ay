package day45_polymorphism._2_learn_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class _10ListObjects {   // list types ile ilgili

    public static void main(String[] args) {

        // ArrayList:
        List<Character>  list1 = new ArrayList<>();  // <Character> dedigimiz wrapper class cunku sadece object types demistik, bunda da char primitive datatype'ini wrapper class'a donusturmus olduk Character diye yazarak

        list1.add('a');  // tek tirnak icinde yazdik cunku bu Character type ((( char )))
        list1.add('b');
        list1.add(null);  // ArrayList allows null. But some collection types do not allow null. O yuzden bu ornegi verdi, ArrayList'te oluyor'u gostermek icin
        list1.add('c');
        list1.add('c');
        System.out.println(list1);  // [a, b, null, c, c]

        // ArrayList -> ordered. Sirasiyla ekliyor yani. Ama mesela set types'ta order yok, gorecegiz


        System.out.println("--------");


        // LinkedList:
        List<Character>  list2 = new LinkedList<>();  // <Character> dedigimiz wrapper class cunku sadece object types demistik, bunda da char primitive datatype'ini wrapper class'a donusturmus olduk Character diye yazarak

        list2.add('a');  // tek tirnak icinde yazdik cunku bu Character type ((( char )))
        list2.add('b');
        list2.add(null);  // ArrayList allows null. But some collection types do not allow null. O yuzden bu ornegi verdi, ArrayList'te oluyor'u gostermek icin
        list2.add('c');
        list2.add('c');
        System.out.println(list2);  // [a, b, null, c, c]


        System.out.println("--------");


        // Vector:
        List<Character>  list3 = new Vector<>();  // <Character> dedigimiz wrapper class cunku sadece object types demistik, bunda da char primitive datatype'ini wrapper class'a donusturmus olduk Character diye yazarak

        list3.add('a');  // tek tirnak icinde yazdik cunku bu Character type ((( char )))
        list3.add('b');
        list3.add(null);  // ArrayList allows null. But some collection types do not allow null. O yuzden bu ornegi verdi, ArrayList'te oluyor'u gostermek icin
        list3.add('c');
        list3.add('c');
        System.out.println(list3);  // [a, b, null, c, c]

        // ArrayList, LinkedList, ve Vector -> ucu de list type oldugu icin hepsi ordered. O yuzden bunlari ayni degerlerle print ettigimizde sonuclari ayni gozukuyor, ama internally fark var.

        // Gulbeyaz diyor ki: Add ve remove linkedList'te daha kolay oluyormus. Daha cok internally oluyor fark, goremiyoruz ondan.

        // —> Set types almost like opposite of list types. List types ordered’di ama set types ordered degil

    }
}
