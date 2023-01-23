package day49_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class _11BuiltInExamples {

    public static void main(String[] args) {

        // Predicate is good when you have one argument and return boolean.  --> .test kullaniliyor
        // Consumer is great when you have one argument and does NOT return anything.  --> .accept kullaniliyor
        // Function is good when you have one argument and return a value (any object).  --> .apply kullaniliyor


        // Build in Function Interface : PREDICATE implementation --> represents a function which takes one argument (any object) and returns BOOLEAN --> Returns: true if the input argument matches the predicate, otherwise false

        Predicate<Integer> isPrime = p -> {  // predicate implementation olanda using p as parameter is very common

            if(p<2) return false;

            for(int i = 2; i <= p/2; i++) {  // bunda <= degil de < 2 deyince 4'u de prime gibi cikardi, <= yapinca duzeldi
                if(p % i == 0){  // if all the numbers are evenly divisible diye check ediyoruz.
                    return false;  // If a number is NOT evenly divisible, it returns false
                }
            }
            return true;
        };

        System.out.println(isPrime.test(8));   // false --> 8 is not prime because it is divisible by 2
        System.out.println(isPrime.test(-4));  // false  --> if(p<2) return false; yani if the number is smaller than 2, return false. No need to check this.
        System.out.println(isPrime.test(11));  // true  --> 11 is prime number


        System.out.println("--------------------------");


        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 5, 21, 6, 12, 4, 15, 1, 2, 5, 1, 2, 4, 1, 5, 12, 3, 5, 12, 32, 5, 15, 2));

                // the parameter of the removeIf method is Predicate

        // First way:
        nums.removeIf(isPrime);

        System.out.println(nums);  // [1, 21, 6, 12, 4, 15, 1, 1, 1, 12, 12, 32, 15] --> sadece non-prime numbers olanlari print etti cunku isPrime olanlari remove et dedik removeIf methodu ile


        // Second way: --> remove yapilmamis haliyle baslayalim diye nums variable'ini reassign ettik yine ilk haline:
        nums = new ArrayList<>(Arrays.asList(1, 5, 21, 6, 12, 4, 15, 1, 2, 5, 1, 2, 4, 1, 5, 12, 3, 5, 12, 32, 5, 15, 2));

        nums.removeIf(p -> p < 10);  // 10'dan kucuk olanlari cikardik
        System.out.println(nums);  // [21, 12, 15, 12, 12, 32, 15]  ---> sadece 10'dan buyuk olanlari print etmis olduk

        System.out.println("--------------------------");

        // Consumer Interface:

        Consumer<int[]> printArray = arr -> {   // int olmaz object type gerektigi icin, ama int[] yani int array olur
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " - ");
            }
        };

     //   printArray.test  --> Predicate olanda .test oluyordu ama Consumer implementation'inda keyword olarak .test degil .accept var.
        printArray.accept(new int[]{3, 5, 1, 2, 5});

        System.out.println("--------------------------");   // 3 - 5 - 1 - 2 - 5 - --------------------------

        List<String> words = new ArrayList<>(Arrays.asList("java", "soft skills", "house", "shed", "garden", "emoji", "fun"));

        // words.forEach(each -> System.out.println(each));  // boylece java'dan baslayip fun'a kadar kelimeleri alt alta print eder

        words.forEach(each -> {
            System.out.println("" + each.charAt(0) + each.charAt(each.length() -1 ));  // kelimelerin ilk ve son harfini print etmek icin
            System.out.println(each.length());  // kelimelerin uzunlugunu bulmak icin
        });
                /* on the console:
                ja
                4
                ss
                11
                he
                5
                sd
                4
                gn
                6
                ei
                5
                fn
                3
                 */

        System.out.println("--------------------------");

        words.forEach(each -> System.out.println(each.substring(0,3)));  // 3. index dahil degil ,0-1-2 dahil.

                /* on the console:
                jav
                sof
                hou
                she
                gar
                emo
                fun
                 */


        System.out.println("--------------------------");


        // Function implementation:  --> return a value istiyorsan bunu kullanacaksin. ((Cunku predicate will only return boolean, and consumer does not return anything))

        Function<int[], List<Integer>> convertToList = (arrNums) -> {  // int array and I want to work on int array and I want to get ((return)) list --> // nums, or (arrNums here) for ex, is how I want to call/name my array

            List<Integer> list = new ArrayList<>();

            for(int each : arrNums){
                list.add(each);
            }
            return list;
        };

        int[] arr1 = {3, 4, 1, 5, 12, 5};
        List<Integer> list1 = convertToList.apply(arr1);  // Function icin .apply kullaniliyor  --> converting to an ArrayList type
        System.out.println(list1);  // [3, 4, 1, 5, 12, 5]

        System.out.println("--------------------------");

        Function<int[], int[]> swapElements = array -> {

            int temp = array[0];  // int temp ((variable)) is holding the value of first element of array
            array[0] = array[array.length - 1];
            array[array.length -1] = temp;
            return array;
        };

        System.out.println(Arrays.toString(swapElements.apply(new int[]{4, 1, 5, 12, 5, 2, 69, 120, 249})));  // [249, 1, 5, 12, 5, 2, 69, 120, 4] --> sadece ilk element ile son element'in yerleri degisti (swap), kalanlari ayni, tam olarak yapmak istedigimiz sey buydu



    }   // end of the main method

        // ustteki methodlarin hepsi in the main method. Bu nedenle reusable degil. Reusable olmasi icin baska method olusturup o method'u main method altinda cagirmamiz gerekirdi, mesela:

    public static Predicate<Integer> lessThan5 = p -> p < 5;
    // boyle ayri method olustursam main method icinde nasil cagirirdim? -> Bu sekilde:
    // BuiltInExamples.lessThan5.test();

}
