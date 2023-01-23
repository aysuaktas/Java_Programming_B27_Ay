package day25_array;

import java.util.Arrays;

public class _05BinarySearch {

    /* Konuyla ilgili not:

    - Arrays.binarySearch(arr, element): returns the index of the element in the array		-> in order for this method to work, the array must be in sorted order
		-> if the array is not sorted, the result is random
     */

    public static void main(String[] args) {

        int[] arr = {6, 23, 100, 240, 2000};
                  // 0   1   2    3    4

        System.out.println(Arrays.binarySearch(arr, 240)); // 3 --> element I'm looking for is 240. O yuzden Arrays.binarySearch(arr, 240) dedik. Ilk siraya name of the element's array yaziliyor. Aradigimiz neyse o ikinci sirada yaziliyor.

        System.out.println(Arrays.binarySearch(arr, 2000));  // 4

        System.out.println(Arrays.binarySearch(arr, 6)); // 0


        // Usttekiler valid'di. What if I write an invalid element?
        System.out.println(Arrays.binarySearch(arr, 25));  // -3 --> If we have 25, it would be in position 2. O yuzden sonucu -3 ama anlamak zorunda degilsin bunu.
        System.out.println(Arrays.binarySearch(arr, 500)); // -5  --> 500 olsaydi position fourth'ta olmaliydi. O yuzden sonucu -5


        System.out.println();  // for empty line in the console

        int[] b = {6, 2, -1, 4, 20, -14}; // order'da olmayan numbers verirsek;
                // 0  1   2  3   4    5
        System.out.println(Arrays.binarySearch(b, 4));  // 3 --> randomly correct
        System.out.println(Arrays.binarySearch(b, 6));  // -5
        System.out.println(Arrays.binarySearch(b, -14));  // -1
        // binary search method does not work if the array is not sorted. Then. let's sort it:

        Arrays.sort(b);
        System.out.println(Arrays.toString(b)); // [-14, -1, 2, 4, 6, 20] -> sorted version. Kucukten buyuge dizildiler
        System.out.println(Arrays.binarySearch(b, 4));  // 3
        System.out.println(Arrays.binarySearch(b, 6));  // 4
        System.out.println(Arrays.binarySearch(b, -14)); // 0
        System.out.println(Arrays.binarySearch(b, 0)); // -3 --> Zero yok elimizde, ama olsaydi negative degerlerle positive degerlerin arasinda olmasi gerekirdi.


        System.out.println();  // for empty line in the console

        String[] words = {"hello", "world", "zebra", "water"};
        // I need to sort them, because they are not in the correct order (alphabetically)
        Arrays.sort(words);
        System.out.println(Arrays.toString(words)); // [hello, water, world, zebra]  -> sorted version

        System.out.println(Arrays.binarySearch(words, "hello")); // 0
        System.out.println(Arrays.binarySearch(words, "World")); // -1 -> Case sensitivity does matter. Uppercase ile olani yok elimizde. Olsaydi it should be in the first position because uppercase comes first as we learned.
        System.out.println(Arrays.binarySearch(words, "yellow")); // -4 -> anytime we see negative means it does not exist.


    }
}

