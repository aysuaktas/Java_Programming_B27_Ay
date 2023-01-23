package day31_arraylist;

import java.util.ArrayList;

public class _06ArraylistOfNameCharactersHomework {

    /*
    Create an ArrayList of Characters
        Fill the ArrayList with letters of your name. Each letter as a different element
        Print each letters on a separate line by accessing each element
     */

    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>();  // letters yerine name dedi Saim, oyle de olur

        letters.add('a');
        letters.add('y');
        letters.add('s');
        letters.add('u');
        System.out.println(letters);  // [a, y, s, u]


        // First way(with for loop):

        // get(int): returns the element at the given index number

        for(int i = 0; i < letters.size(); i++){   // letter length'e kadar degil, letter size'a kadar. Cunku bu ArrayList ve kendi methodlari var. size da arrayList method'u

            System.out.println(letters.get(i)); // alt alta a y s u yazdi. println yerine print yapinca yan yana aysu yaziyor
        }


        System.out.println("-------------");

        // Second way (with for each loop):
        for(char eachLetter : letters){
            System.out.println(eachLetter);
        }

        System.out.println("-------------");

        // Third way:   ----> Saim, ayri ayri nasil yapildigini gostermek icin kendi yaparken bunu ekledi. Ama tek tek yapmak yerine loop ile yapariz'i vurguladi. Sadece gorebilmemiz icin:

        System.out.println(letters.get(0));
        System.out.println(letters.get(1));
        System.out.println(letters.get(2));
        System.out.println(letters.get(3));


    }
}
