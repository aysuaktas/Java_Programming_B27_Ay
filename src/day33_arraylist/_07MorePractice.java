package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class _07MorePractice {

    // lambda uzerine bu class. Bu class'taki Lambda methods:
    //      - removeIf
    //      - forEach

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mutasem", "Baz", "Anam", "Tina", "Manizha", "Busra", "Reem", "Farzona", "Marjan"));

        ArrayList<String> byLength = new ArrayList<>(names);
        byLength.removeIf(name -> name.length() > 5 ); // Syntax for lambda: variable -> boolean expression --> remove if the name has more than 5 characters. Yanu name'in length'i 5ten buyukse onlari siliyor, kalanlari yaziyor print edince
        System.out.println(byLength);  // [Baz, Anam, Tina, Busra, Reem]


        ArrayList<String> byFirstLetter = new ArrayList<>(names);
        byFirstLetter.removeIf( p -> p.startsWith("M") || p.startsWith("B"));  // p is traditional one. p yazdi. In this case, p represents every element-->  M veya B ile basliyorsa onlari remove yap, digerlerini yazdir dedik burada
        System.out.println(byFirstLetter); // [Anam, Tina, Reem, Farzona]


        ArrayList<String> byLastLetter = new ArrayList<>(names);
        byLastLetter.removeIf(str -> !str.endsWith("a")); // a ile bitmeyenleri remove yap demek. Sadece a ile bitenleri yazdiracak
        System.out.println(byLastLetter);  // [Tina, Manizha, Busra, Farzona]

        // ArrayList'te hep kisi isimleri yani String kullandik. O yuzden Syntax for lambda: variable -> boolean expression icin boolean expression olarak String methods kullanabildik.


        System.out.println("=========================================================");

        /*
        forEach ( lambda ) :
            variable -> statement want to run with each element
	        -> this statement is not a boolean like it was for removeIf()

         */

        System.out.println(names);

         /* First way buydu (loop'tu) tum elementleri yazdirmak icin:
        for(String each : names){
            System.out.println(each);
        }
         */

        // second way with lambda:
        names.forEach(each -> System.out.println(each));  // It will print every element from the list  --> tum elementleri yani tum isimleri alt alta yazdirdi

        names.forEach(name -> System.out.println(name.charAt(0) + " " + name.charAt(name.length() -1 )));  // tum isimlerin ilk ve son harfini aralarinda boslukla bastirdi. Loop kullanmadan lambda ile yapabiliriz boyle


    }
}
