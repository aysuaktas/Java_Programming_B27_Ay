package day47_collections;

import java.util.HashMap;
import java.util.Map;

public class _08GroupOfPeople {

    public static void main(String[] args) {


        Map<Integer, _07Person> residents = new HashMap<>();   // My value is _07Person, not String. Person: my custom type. Cunku Person has everything that I want to find: name and age.

                // idea: we have an apartment which is key. The actual person who are the resident will be our value.

        residents.put(201, new _07Person("James", 40));  // in room 201 icin -> value'da -> Person is my type. O nedenle once object olusturmamiz lazim
        residents.put(202, new _07Person("Anna", 20));
        residents.put(203, new _07Person("Faith", 35));
        residents.put(204, new _07Person("James", 40));  // duplicate for "values" are okay, "keys" are unique so there is no problem. Room 201'de de 204'te de ayni value var 40 yasindaki James. Ama keys birinde 201 birinde 204 oldugu icin sorun yok.

        System.out.println(residents);  // {201=_07Person{name='James', age=40}, 202=_07Person{name='Anna', age=20}, 203=_07Person{name='Faith', age=35}, 204=_07Person{name='James', age=40}}   -----> normalde bunu print etmek icin loop kullanirdik ama simdi altindaki mantigi da gostermek istedi bize bunda

        System.out.println(residents.get(202));  // _07Person{name='Anna', age=20}  --> get method icine key yazdik ve onun value'sunu verdi bize --> Saim's note: it returns the value of key 202 -> value is a Person object
        System.out.println(residents.get(202).name);  // Anna  --> Saim's note: accessing the name variable from the person object

        System.out.println(residents.get(202).name.substring(0,2));  // An  --> substring(0,2) dediginde ikinci siradaki dahil olmadigi icin Anna'nin sadece 0. ve 1. index'ini alacak, 2. indexini almayacak

    }
}

    // Map practice'i icin CodingBat'e bak, guzel practice'leri var basic olarak nasil isledigini ve logic'ini gormek icin oneriyor Saim