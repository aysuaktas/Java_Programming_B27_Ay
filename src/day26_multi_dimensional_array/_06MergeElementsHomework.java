package day26_multi_dimensional_array;

import java.util.Arrays;

public class _06MergeElementsHomework {

    /* Merging -> possible interview question

    Given a 2D int array merge the elements into one 1D array

    Ex:
       int [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };

       Output:
              [ 10, 20, 30, 5, 10, 15 ]

     */

    public static void main(String[] args) {

        /*

        int [][] nums = {
                {10, 20, 30}, {5, 10, 15}
        };

        int[] newArray = new int[6]; //Yeni bir array olusturup size'ini 6 yaptim. Cunku istedigimiz output 6 elementli. Ama bu hardcoded olmus oldu

        int count = 0;

        for(int[] number : nums){    // bu nums olan array'in ismiydi. Bu kisim 'outer for loop'. Bunda iki arrays'ten olusan multidimensional array'e bakiyoruz
            for (int each : number){  // bunda ise array'deki each element'e bakiyoruz. number is -> name of inner arrays. each is -> each element in array
                newArray[count++] += each;  // for loop ile de yapilir ama bu for each loop daha kisa. Bunda [count++]'yi bu sekilde belirtebilirim, yani array kutucugu icinde artirma yapabilirim, cunku array kalibinda yazacagimiz sayiyi [] icinde yaziyoruz. Her loop'ta bastan sona giderken onu bir artirip belli bir sayiyi yazmis oluyoruz aslinda [] icine
            }
        }
        System.out.println(Arrays.toString(newArray)); // [10, 20, 30, 5, 10, 15]

         */

        System.out.println("----------------- Saim's way -----------------");

        int[][] nums = {
                {10, 20, 30},
                {5, 10, 15}
        };

        // Size'inin 6 oldugunu biliyoruz bu soruda ama int[] newArray = new int[6]; yazmak hardcoded oluyor.

        // nums.length == 2
        // nums[0].length + nums[1].length --> better than 6 but still not dynamic
        // to count the total number of elements, I will need to loop:

        int size = 0;

        for(int[] eachArray : nums){
            size += eachArray.length; // tum bunlari size variable'ina ekliyorum
        }
        // purpose of this (for each) loop was to count the total number of elements, which should be the size of the merged array

        int[] merged = new int[size];
        int indexToStore = 0;  //  indexToStore to the merged array

        for(int[] eachArray : nums){
            for(int eachNum: eachArray){
                // System.out.println(eachNum);   // bu kisma kadarki kisimla -> bunda tum hepsini alt alta bastirdi. Bir gormek istedik neler oldugunu. Bunu comment out yapip simdi merged edersek;
                merged[indexToStore++] = eachNum;  // assign the eachNum to the merged array
                // System.out.println(Arrays.toString(merged));  // bunu tum loop'u tek tek ne oluyor diye gorebilmemiz icin yazdi, ama bu burada olmayacak, comment out yaptik o yuzden
            }
        }
        System.out.println(Arrays.toString(merged)); //  [10, 20, 30, 5, 10, 15]

    }
}

/*
    int[] a = new int[4]
    a[0] = 5;  // I'm assigning to value of 5 to the index of O in the array
    a[i] = value
 */