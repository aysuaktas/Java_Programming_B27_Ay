package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class _08SeparateParts {

    /* ((It was yesterday's homework. Saim solved it with different way))

    Separate Parts:
        Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters

         Ex:
            str = "ABCD123$%#@&456EFG!"
            list1: {$, %, #, @, &, !}
            list2: {A, B, C, D, E, F, G}
            list3: {1, 2, 3, 4, 5, 6}
     */

    public static void main(String[] args) {

        String s = "ABCD123$%#@&456EFG!";

        ArrayList<String> letters = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(letters);  // [A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]

        letters.removeIf(p -> !Character.isLetter(p.charAt(0))); // --> p is every element (each character) of the String. But those characters were String type, so in order to get a char type, we did charAt(0). Character methods needed char type -----> // String'i char'a cevirebilir miyim? I can use charAt method, than I will get char type, a character. --> !Character.isLetter yani if the character is not a letter demek.
        System.out.println(letters); // [A, B, C, D, E, F, G]

        System.out.println("-------------------------");

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(numbers); // [A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !] --> this is the starting point, the original arrayList

        // still a String type bunlar. Split yapinca -> every element here is a String demekti. Everything is a still String element

        numbers.removeIf(str -> !Character.isDigit(str.charAt(0)));   // to concert String to char, we used charAt(0) to read the only element there   --> //each element is str here. Each element is String type but I need character type for using Character.isDigit method. In order to get this method work, str kullanmak yetmez. str.charAt(0) kullaniriz. --> Character.isDigit seklinde yazarsak digit yani number olanlari remove yapiyor, digerlerini print ediyor. !Character.isDigit seklinde yaparsan ise digit olmayanlari siliyor/remove yapiyor, bize sadece digit olanlari print ediyor
        System.out.println(numbers); // [1, 2, 3, 4, 5, 6]


        System.out.println("-------------------------");

        ArrayList<String> special = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(special);  // [A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !] -> original arrayList'i veriyor bize
        special.removeAll(letters);
        special.removeAll(numbers);
        System.out.println(special);  // [$, %, #, @, &, !]
        // Bunda da bu method yerine lambda ile de yapabilirdik



        /*
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Hello", "World", "Friday"));    // String olunca Arrays.asList yazabildik ama digerlerini String'den char'a cevirmek gerekiyordu, onlarda bunu yazamadik

        words.forEach(e -> System.out.println(e.charAt(0)));  // alt alta H W F yazdiriyor bu.
         */


    }
}
