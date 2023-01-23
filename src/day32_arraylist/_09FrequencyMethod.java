package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _09FrequencyMethod {

    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('a', 'e', 'e', 'a', 'e', 't', 'p', 'i', 'o', 'o'));

        // frequency of letter 'e'? yani --> how many times I have letter 'e':
        System.out.println(Collections.frequency(letters, 'e'));  // 3

        System.out.println(Collections.frequency(letters, 'a')); // 2
        System.out.println(Collections.frequency(letters, 'o')); // 2
        System.out.println(Collections.frequency(letters, 'z')); // 0 --> how many times I have letter z? zero.
        System.out.println(Collections.frequency(letters, 'E')); // 0 --> case sensitivity var. e elimde var ama E yok, frequency of E = 0

        System.out.println("-----------------");

        // Given a String determine how many times the letter 'a' is in the String:

        String s = "aabbbabeiffca";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split(""))); // "" aslinda bir empty space -> all the elements separate characters
        System.out.println(list); // [a, a, b, b, b, a, b, e, i, f, f, c, a]   --> ust tarafta s.split("") yerine yanlislikla s.split(" ") yapinca [aabbbabeiffca] diye print etmisti

                /* Burada ne yapmis olduk:
                s.split("") --> converts the String to a String[]  ---> ((string array))
                Arrays.asList(s.split("")) --> converts the String[] to ArrayList<String>
                new ArrayList<>(Arrays.asList(s.split(""))); --> creates an ArrayList of each character as its own element
                 */

        System.out.println(list);
        System.out.println(Collections.frequency(list, "a"));  // 4 --> 4 tane a var

        // frequency 1'den cok cikarsa it's duplicate anlamina geliyor


    }
}
