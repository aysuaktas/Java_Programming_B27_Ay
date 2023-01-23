package day50_functional_interface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class _01Practice {

    public static void main(String[] args) {    // bu ornekleri dunun odevinden aldi ((dunku odevleri yapmadim daha))

        /*
          Use Predicate Functional interface to:
          1.1 Create a function that can verify if a number contains duplicate digits

           (( --> duplicate digits derken mesela 1234'te duplicate yok, ama 1233344'te var ))

           1123 ---> 1, 2, 3 will be allowed (( no duplicates, hepsi sadece bir kez ))
           1234 ---> 1, 2, 3, 4
        */

        Predicate<Integer> duplicateDigits = p -> {

            String strNum = String.valueOf(p); // "" + p --> convert the Integer into a String

            Set<String> set = new HashSet<>(Arrays.asList(strNum.split("")));  // splits the digits to their elements as converts all of them into a collection type to then make a HashSet -> Set type does not allow duplicates
                    // --> hashset kullandik cunku order onemli degil, set'in functionality'sinden yararlanmak istiyorum sadece. I want to use set's functionality, because Set does NOT allow duplicates; so it will remove duplicates automatically

            return strNum.length() != set.size();
        };

        System.out.println(duplicateDigits.test(1234));   // false  ---> original length still same. Original size != duplicate'lerin cikarmis hali ise true olacak, ama bunda duplicate olmadigi icin degisiklik yok, bu nedenle false print etti
        System.out.println(duplicateDigits.test(12343));  // true  --> original length 5 idi ama duplicate'ler cikarilinca 4 oldu, yani eski/original hali ile sonraki hali esit degil. O nedenle return strNum.length() != set.size(); uzerinde true'ya dondu

        System.out.println("===========================");



        // Consumer: 1.2 Create a function that prints the middle character/s of a String

        Consumer<String> middleChars = str -> {
            int len = str.length();  // len variable dedigimiz length kisaltmasi gibi anlaminda
            if(len % 2 == 0){  // banana olsun mesela kelimemiz
                System.out.println(str.substring(len/2 -1, len/2 + 1 ));   // kelimedeki harflerin toplami cift sayi ise ikiye bolunce ortada iki tane harf olacak, ikisini de alabilmek icin -1 ve +1 yaptik (sonuncusu sayilmadigi icin +1. yani yariya bolunce onceki ve o yariya boldugumuz print olacak)

            } else {
                System.out.println(str.charAt(len/2));
            }
        };

        middleChars.accept("panda");  // n -> bunda middle character is n
        middleChars.accept("banana"); // na -> bunda iki tane middle character var cunku cift sayi toplami.

        System.out.println("===========================");



        // Function: 1.1 Create a function that can return the sum of digits from a string that contains number digits

            // String - parameter type & Integer - return type
        Function<String, Integer> sumOfDigits = s -> {
            int sum = 0;

            for (int i = 0; i < s.length(); i++){
                sum += Integer.parseInt(s.substring(i, i+1));  // convert each digit(String) to an Integer we add to the sum
            }  // charAt() + ""
            return sum;
        };

        System.out.println(sumOfDigits.apply("425"));   // 11
        System.out.println(sumOfDigits.apply("9184"));  // 22



    }
}
