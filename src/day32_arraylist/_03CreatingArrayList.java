package day32_arraylist;

import java.util.ArrayList;

public class _03CreatingArrayList {

    public static void main(String[] args) {


        ArrayList<String> list1 = new ArrayList<>();

        list1.add("friday");
        list1.add("java");
        list1.add("movies");
        list1.add("sports");
        System.out.println(list1);  // [friday, java, movies, sports]

        System.out.println("-------------");

        ArrayList<String> list2 = list1;  // making another reference for the same object
        list2.add("soft skills");

        System.out.println(list1);  // [friday, java, movies, sports, soft skills]
        System.out.println(list2);  // [friday, java, movies, sports, soft skills]
        // they are 'same exact objects'. Bu yuzden bunlari print edince ayni sey karsimiza cikti  --->Cunku ustte list2 = list1 diye esitlemistik. ((Array'de de oyleydi -> )) Esitlenince ikisi de etkileniyor, ne degisiklik yaparsan yap

        System.out.println("-------------");

        /*
        ArrayList<type> name = new ArrayList<>(collection type);
		collection type as a general —> we will understand better in the future
		so far, we only know one collection type: ((which is)) ArrayList
            ((( Grouping of data structures gibi dusun -> collection. ArrayList is a collection type.)))
         */

        // collection type ile olusturma:
        ArrayList<String> list3 = new ArrayList<>(list1); // creating a new ArrayList object with the same values as the list 1:
        System.out.println(list3);  // [friday, java, movies, sports, soft skills]
        list3.remove(0);

        System.out.println("list 1: " + list1); // list 1: [friday, java, movies, sports, soft skills]
        System.out.println("list 3: " + list3); // list 3: [java, movies, sports, soft skills]


    }
}
