package day50_functional_interface;

import day34_custom_classes.student1._01Student;
import day47_collections._07Person;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class _02OtherFunctionalInterface {

    public static void main(String[] args) {


        /* BiPredicate  --> .test ile kullaniliyor.
                - defines a function that takes two objects((any object type)) as the arguments
                - returns boolean

          BiConsumer --> .accept ile kullaniliyor. two parameters but no return type

          BiFunction  --> .apply ile kullaniliyor. Two parameters var, returns a value ((any object)). BiFunction<T, U, R> dedigimizin ilk ikisi argument, ucuncusu de defines the type of return.

         */

        BiPredicate<int[], Integer> contains = (arr, num) -> {  // arr is my array. num is the number that I'm looking for. Two parameters oldugu icin bunlari parantez icine yazmamiz zorunlu. Sadece number or p and then arrow yapamayiz yani bunda, oncekilerde yani tek parameter olanlarda yapabilmistik ama, bu iki parameter'li

            for(int each : arr) {   // I can create a for each loop to iterate through my array
                if(each == num){
                    return true;
                }
            }
            return false;
        };

        int[] arr = {4, 6, 12, 5, 12, 5, 5, 6};
        System.out.println(contains.test(arr, 12));  // true
        System.out.println(contains.test(arr, 8));  // false --> 8 is not there. It never matched with 8 during the loop. Yani hic each = = num kisminda 8 olmuyor orasi. So it returns false


        System.out.println("--------------------------");


        // calculator ornegi uzerinden BiConsumer yaparsak:
        BiConsumer<Integer, Integer> multiplicationTable = (num, max) -> {
            for(int i = 1; i <= max; i++){  // sadece < yapinca son sayiyi dahil etmiyor mesela (5, 15) orneginde 14'e kadar yapiyordu, o nedenle esitlik ekledik
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        };
        // we have two parameters but no return type. Just we will print it. So, BiConsumer is the perfect way.

        multiplicationTable.accept(5, 15);

            /*
            5 x 1 = 5
            5 x 2 = 10
            5 x 3 = 15
            5 x 4 = 20
            5 x 5 = 25
            5 x 6 = 30
            5 x 7 = 35
            5 x 8 = 40
            5 x 9 = 45
            5 x 10 = 50
            5 x 11 = 55
            5 x 12 = 60
            5 x 13 = 65
            5 x 14 = 70
            5 x 15 = 75
             */


        System.out.println("--------------------------");


        // _07Person class'i day47'deydi, onu kullanalim. O class'ta name ve age vardi:

        Map<Integer, _07Person> classRoom = new HashMap<>(Map.of(
                1, new _07Person("James", 35),   // James as name. 35 as age
                2, new _07Person("Anna", 30),
                3, new _07Person("Jane", 32)
        ));

        System.out.println(classRoom);  // {1=_07Person{name='James', age=35}, 2=_07Person{name='Anna', age=30}, 3=_07Person{name='Jane', age=32}}  --> Mesela burada bastaki 1 is the key, and its value is: _07Person{name='James', age=35}

        classRoom.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));

            /*
            Key: 1 Value: _07Person{name='James', age=35}
            Key: 2 Value: _07Person{name='Anna', age=30}
            Key: 3 Value: _07Person{name='Jane', age=32}
             */


        System.out.println("--------------------------");


        BiFunction<Integer, Integer, Integer> maxNumber = (a, b) -> a > b ? a : b;  // bir tane statement olunca boyle bile yazabiliriz curly brackets olmadan
        // (a,b) -> { return a > b ? a : b;};
        System.out.println(maxNumber.apply(6, 12));   // 12


        System.out.println("--------------------------");


        // make a map of many data : keys -> set ,  value -> list

            /* BiFunction<T, U, R> dedigimizin ilk ikisi argument, ucuncusu de defines the type of return. O nedenle 3. yazilan return type olacak:

            Set<String>    - parameter 1
            List<Integer>  - parameter 2
            Map<String, Integer>  - return type
             */

        BiFunction<Set<String>, List<Integer>, Map<String, Integer>> createMap = (emails, inboxNumbers) -> {

            List<String> listEmails = new ArrayList<>(emails); // this is my list of emails
            Map<String, Integer> map = new HashMap<>();

            for(int i = 0; i < listEmails.size(); i++){
                map.put(listEmails.get(i), inboxNumbers.get(i));
            }
            return map;
        };

        // ustteki kisimda key'i emails, value'yu da inboxNumbers olarak belirlemis olduk -> bunlar parameter. Altta da argument vererek uygulamasini yapmis olduk, o yuzden o kismi alta yazdik. Verdigimiz arguments'e gore sonuc degisecek, oraya ne yazarsak onlari return edecek bize. Cunku BiFunction'da 3. sirada yazilan yer return type -> bizim ornekte bu Map<String, Integer>> createMap = (emails, inboxNumbers) kismi return type icin.


        Set<String> emails = new LinkedHashSet<>(Arrays.asList("james@007.com", "lionlover@gmail.com", "macComputers@gmail.com", "javaisfun@gmail.com"));  // Set type, so it should be unique -> ((( key de unique olmali, o yuzden Set kullandik :) Emailler de unique zaten, emailler bu ornekte key'imiz olacak))
        List<Integer> inboxNumbers = new ArrayList<>(Arrays.asList(300, 150, 200, 1000)); // kac email'leri oldugu, bunlari value olarak kullanacagiz. Mesela james'li email'in 300, lionlover olanin 150, macComputers olanin 200, javaisfun olanin 1000. Yani emails (ustte Set ile kurulanlar) keys'i ile bu inboxNumbers values'u ((value bu ornekte List ile kurulan)) iliskili

        System.out.println(createMap.apply(emails, inboxNumbers));  // {javaisfun@gmail.com=1000, lionlover@gmail.com=150, macComputers@gmail.com=200, james@007.com=300}



    }
}
