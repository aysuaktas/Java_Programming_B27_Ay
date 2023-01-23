package day25_array;

import java.util.Arrays;

public class _04SumAndAdd {

    public static void main(String[] args) {

        /*
        given an array add all the elements and add the sum value to the end of the array

            int[] = { 5, 1, 2}
            {5, 1, 2, 8}
         */

        int[] arr = {5, 1, 2};
        int sum = 0;

        for(int each: arr){
            sum += each; // sum = sum + each ----> goes through every element and adds to the sum variable
        }

        int[] newArr = Arrays.copyOf(arr, arr.length +1);  // arr.length is 3. Yani original size was 3. But it is arr.length +1, so it will make an array with 4 length. ((Dynamic olsun diye length ile yaptik, direkt deger yazmadik))

        System.out.println(Arrays.toString(newArr));  // [5, 1, 2, 0] --> sonuncu element'in degerini belirlemedigimiz icin default olarak zero yaziyor.
        newArr[newArr.length -1] = sum; // -> length - 1 ile yeni ekledigimiz o son index'i bulmak istiyoruz. -> storing the sum value into the last index of the newArr  --> newArray : 4 tane index olan. sum = 5 + 1 + 2 oluyor -> yani sum = 8
        System.out.println(Arrays.toString(newArr)); // [5, 1, 2, 8] --> son index zero'dan 8'e dondu cunku sum uzerinden belirledik onu


    }
}
