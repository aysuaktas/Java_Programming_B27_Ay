package day24_array;

import java.util.Arrays;

public class _07ArraysMethods {

    public static void main(String[] args) {

        /*  konuyla ilgili notlarim:
        Arrays Class

	Arrays.toString(arr) -> returns the array as a String format

	Arrays.sort(arr): sort the elements of the array in natural order(smallest to largest):
		String: ascii: spacial char -> number -> uppercase -> lowercase  ———> genel siralamasi bu. Ilk karakterlerine bakılir ve bunlardan hangisi once geliyorsa onunla baslayan once print edilir

	Arrays.equals(arr1, arr2): are the arrays the same? Do the arrays have the same exact elements
         */


        int[] nums = {32, 5, -9, 3, 1, 20};
        System.out.println(Arrays.toString(nums));  // [32, 5, -9, 3, 1, 20]
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));  // [-9, 1, 3, 5, 20, 32]

        // max & min  ---> ((after we sorted));
        System.out.println("Min: " + nums[0]);    // Min: -9
        System.out.println("Max: " + nums[nums.length -1]);  // Max: 32


        System.out.println("---------------");

        String [] strs = {"Hello", "world", "4four", "abc", "#Zebra", "apple", "1aaaaa"};  // lowercase ile baslayan, uppercase ile baslayan, special character ile baslayan, rakamla baslayan vs farkli sekilde denemis olalim diye rastgele bu degerleri verdi

        System.out.println(Arrays.toString(strs));  // [Hello, world, 4four, abc, #Zebra, apple, 1aaaaa]
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs)); // [#Zebra, 1aaaaa, 4four, Hello, abc, apple, world] --> sort yaptiktan sonraki order'lari ((sort ya alfabetik yapar ya kucukten buyuge gider))


        System.out.println("---------------");

        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 4};
        int[] d = {3, 2, 1};

        System.out.println(Arrays.equals(a, b));  // true  -> to compare actual values, we use this equals method

        System.out.println(Arrays.equals(a, c));  // false
        System.out.println(Arrays.equals(a, d));  // false
        Arrays.sort(d); // sort yapinca elements'i smallest'tan largest'a siralamis olduk yani 1, 2, 3 oldu. O yuzden altta (Arrays.equals(a, d)'i print edince true cikti cunku value'su a ile same olmus oldu sort kullaninca.
        System.out.println(Arrays.equals(a, d));  // true

    }
}
