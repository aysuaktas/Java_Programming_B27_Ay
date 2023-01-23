package day31_arraylist;

import java.util.ArrayList;

public class _07ArraylistOfLettersA_ZHomework {

    /*
    Try to loop:

        Create an ArrayList of Characters
        Fill the ArrayList with letters from a-z
        Print the ArrayList of all the characters

        Manually remove each vowels and print the new ArrayList
     */

    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>();

        for(char i = 'a'; i <= 'z'; i++){
            letters.add(i);
        }
        System.out.println(letters);

        // Manually remove each vowels ((unlu harf)):

        letters.remove((Character) 'a');
        letters.remove((Character) 'e');
        letters.remove((Character) 'i');
        letters.remove((Character) 'o');
        letters.remove((Character) 'u');
        System.out.println(letters); // [b, c, d, f, g, h, j, k, l, m, n, p, q, r, s, t, v, w, x, y, z]

        /*
        Normalde index'e gore veya element'e (yani object'e) gore remove yapiyorduk. Ama Character bir primitive type oldugu icin ve ArrayList onu desteklemedigi icin direkt letters.remove('a') falan yapinca hata verdi. O yuzden wrapper class olarak Character yazip sonra remove yapmak istedigim character'leri single quotation icinde yazdim.

        Derste yaptigimiz bir ornekte de soyle demistik:
        nums.remove((Integer) 2); // some kind of casting --> casting the 2 to an Integer type, so I can remove the element 2, not the index 2
         */


    }
}
