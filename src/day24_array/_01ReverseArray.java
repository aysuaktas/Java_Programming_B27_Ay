package day24_array;

import java.util.Arrays;

public class _01ReverseArray {

    /*  Yesterday's homework -> yapmadim
    Reverse Array

	Write a program that will reverse the order of any given array
		Ex:
		Input:
			[1, 2, 3, 4, 5]
		Output:
			[5, 4, 3, 2, 1]
     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] reverse = new int[arr.length]; // sondaki [] icinde size'i belirliyoruz. Daha dynamic yapmak icin [arr.length] yazdik direkt 5 vs yazmak yerine, o hardcoded olurdu cunku

        for(int i = arr.length -1, y = 0; i >= 0; i--, y++){   // i goes backwards
        //    System.out.println(i); yazarsak console'da alt alta 4   3   2   1   0  veriyor
            reverse[y] = arr[i];
        }
        System.out.println(Arrays.toString(reverse));  // [5, 4, 3, 2, 1]

        // use i variable that is going backwards to read from the original array - index for arr array
        // use y variable that is going forwards to store into the reverse array - index for reverse array


 /*

    int i = last index
    int y = 0;

    while(i >=  0){
        i--
        y++
     }
 */


    }
}

