package day47_collections;

import java.util.HashMap;
import java.util.Map;

public class _05MapMethods {

    public static void main(String[] args) {

        Map<Character, Integer> gradeScale = new HashMap<>();  // key veya value, ikisi de String falan olabilir, sen ne istersen

        // put() is used for -> adding to a map
        gradeScale.put('A', 90);
        gradeScale.put('B', 80);
        gradeScale.put('C', 70);
        gradeScale.put('D', 60);
        gradeScale.put('Z', 1000);  // denemek icin yazdik bunu, gercek not gibi dusunme :D
        gradeScale.put('Z', 3000); // "using put with a key that is already in the map, will update the value" yazdi Saim. --> keys should be unique demistik. Ikinci kez Z yazdik ama. It's like we are reassigning. It will reassign it, and I will not see 1000. I will only see 3000.

        // A, B, C, D, Z characters are key here. 90, 80, 70, 60, 1000 Integers are value here.

        System.out.println(gradeScale);  // {A=90, B=80, C=70, D=60, Z=3000}  --> // HashMap oldugu icin -> random order (order is not guaranteed)


        System.out.println("================");


        // get() is used for -> reading from a map

        System.out.println(gradeScale.get('B')); // 80 --> goes to the key and returns that value
            // this get() method is unique to map types. Bunu ArrayList'teki ile karistirma. It returns the value of that key.
        System.out.println(gradeScale.get('b'));  // null -> because I don't have lowercase b. Case sensitivity matters, because keys are unique, and you have to match it exactly. Yani case sensitivity ile handle etme, onu ignore etme diye bir sey soz konusu degil bunda. Ama String util class'taki fixFormat methodundan yararlandik sonraki class'ta (_06Store), onun nedeni baska ama. User Water yerine water veya WATER yazarsa da it is in the stock'da gostermemiz gerekiyordu. Ama bunda notun B'si ile b'si de farkli aslinda bence.


        System.out.println("================");


        // remove() is used for -> removing from a map
        gradeScale.remove('Z');  // Character'imiz oldugu icin ' ' kullandik. Polymorphism allows to use all types --> // key'i vererek remove ediyoruz
        System.out.println(gradeScale);  // {A=90, B=80, C=70, D=60}


        System.out.println("================");

// We have two contains method-> containsKey() and containsValue:

        // containsKey() is used for -> contains in a map
        System.out.println(gradeScale.containsKey('C'));  // true
        System.out.println(gradeScale.containsKey('c'));  // false


        // containsValue() is also used for -> contains in a map  --> to make sure that do we still have that value
        System.out.println(gradeScale.containsValue(100));  // false
        System.out.println(gradeScale.containsValue(90));   // true



    }
}
