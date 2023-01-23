package day25_array;

import java.util.Arrays;

public class _03ArraysCopy {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int[] other = nums;   // it is not creating a new array, it is pointing to the same array as line 8
        System.out.println("BEFORE");  // biz anlayalim diye before-after yazdi. After olanda index 0 ile index 2'yi reassign ediyoruz. Before ise original halleri olan 1 (for index zero) ve 3 (for index two).
        System.out.println(Arrays.toString(nums));  // [1, 2, 3]
        System.out.println(Arrays.toString(other)); // [1, 2, 3]


        System.out.println("AFTER");
        nums[0] = 10;   // reassign the first index to 10
        other[2] = 25;  // my original ones icin second index 3'tu ama we reassigned it to 25.

        System.out.println(Arrays.toString(nums));  // [10, 2, 25]
        System.out.println(Arrays.toString(other)); // [10, 2, 25]
        // which reference oldugu fark etmeksizin they have same object

        other[2] = 25;
        System.out.println("AFTER W/ other");
        System.out.println(Arrays.toString(nums)); // [10, 2, 25]
        System.out.println(Arrays.toString(other)); // [10, 2, 25]


        System.out.println("-----------------------");


        int [] arr = {3, 4, 1, 5, 12, 5, -10};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  // [-10, 1, 3, 4, 5, 5, 12] --> we changed the elements
        // String is immutable, you cannot change it. But array is changeable.



        /*
        - Arrays.copyOf() : create a new copy of an array with the same values from a different array size can be flexible -> flexible derken ->  define the size of the new array you want to make
		        (array, size)
			        returns array
         */

        // copyOf :

        int[] a = {5, 10, 15};
        int[] b = Arrays.copyOf(a, 3);   // It is completely a new array (with size 3) --> a = array. (neyi kopyalamak istiyorsan o. Bunda a array'ini kopyaladik)    3 = size ((size starts from 1 but indexes starts from 0))
        System.out.println("BEFORE");
        System.out.println(Arrays.toString(a)); // [5, 10, 15]
        System.out.println(Arrays.toString(b)); // [5, 10, 15]
        a[1] = 100;
        System.out.println("AFTER");
        System.out.println(Arrays.toString(a)); // [5, 100, 15]
        System.out.println(Arrays.toString(b)); // [5, 10, 15]

        // We have two arrays, but we only change the middle element of the first array, but because they were separate arrays, the second one is untouched ---> b is a completely different array. O yuzden a'nin ikinci element'ini degistirip 10dan 100 yapsak da b'nin ikinci element'ini de degistirmedi bu. Cunku they are different.

    }
}
