package day48_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class _03FrequencyOfCharacters {    // bu konuyu onceden baska yollarla cozmustuk, simdi Map ile yapacagiz

    /*
    Frequency Of Characters mesela apple kelimesi icin: a is 1:
        a-1, p-2, l-1, e-1 kere var
     */

    public static void main(String[] args) {

        String str = "apple";
        Map<Character, Integer> counter = new LinkedHashMap<>(); // key is Character, value is Integer part  --> HashMap yapinca random order. LinkedHashMap olunca order'da olacak, o yuzden onu yapalim dedik


        /*

       // Alttaki for loop'ta tek tek ne oluyor, logic'i ne?  -> apple kelimesine bakiyorduk:

            map:
                a - 1  // does my map contain the key a? No. Henuz bos. O zaman else block'ta ekleyecegiz, 1 olacak
                p - 1  // does my map contain the key p? No. Henuz bos. O zaman else block'ta ekleyecegiz, 1 olacak
                p - 2 // // does my map contain the key p? Yes. Add 1 more.
                ...
         */


        for (int i = 0; i < str.length(); i++) {
            char key = (str.charAt(i));  // bunu hem if hem else block'ta kullanacagimiz icin reusable olsun diye a variable olusturalim buna dedik
            if(counter.containsKey(str.charAt(i))) {    // counter is my map. Map name'im.
                // count
                counter.put(key, counter.get(key) + 1);  // burada key dedigimiz char key = (str.charAt(i)); variable'indaki (str.charAt(i)) aslinda, reusable olsun diye bu variable'i belirlemistik -->// Saim's explanation: get method will read the current counter value, then it adds 1 to the value, so the new value after adding one get stored as the new value for the same key - which is basically reassigning the value for that key
            } else {
                // this is the first time seeing this character, it is not in the map yet. ((So, I need to add it. I need to initialize it)
                counter.put(key, 1);  // / burada key dedigimiz char key = (str.charAt(i)); variable'indaki (str.charAt(i)) aslinda
            }
        }

        System.out.println(counter);  // {a=1, p=2, l=1, e=1}  ---> ustteki apple kelimesini degistirirsek bu sonuc degisecek, case sensitivity de var tabii.

    }
}
