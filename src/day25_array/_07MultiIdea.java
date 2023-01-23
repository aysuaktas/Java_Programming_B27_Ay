package day25_array;

import java.util.Arrays;

public class _07MultiIdea {

    public static void main(String[] args) {

        // "multi-dimensional array" is basically array inside of array

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = {7, 8, 9};

        int[][] all = {a, b, c}; // create a 2d array ((d: dimension))
        // what are the elements for all array: 1d array ( normal array)

        System.out.println(all[0]);  // [I@3f0ee7cb -> sonucu vermiyor bize. Arrays.toString ile yaparsak, o zaman sonucu veriyor;
        System.out.println(Arrays.toString(all[0])); // [1, 2, 3]
        System.out.println(Arrays.toString(all[1])); // [4, 5, 6]
        System.out.println(Arrays.toString(all[2])); // [7, 8, 9]

        System.out.println("First element of each inner array");
        System.out.println(all[0][0]);  // 1
        System.out.println(all[1][0]);  // 4
        System.out.println(all[2][0]);  // 7 --> first element icin ikinci siraya (( [] derken )) index0'a ithafen 0 yazdik. Ilk siraya da multi-dimensional. Yani ilk siraya hangi array oldugunu yazdik, mesela bunda second array icin


    }
}
