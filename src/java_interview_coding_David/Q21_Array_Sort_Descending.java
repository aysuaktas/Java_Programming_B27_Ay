package java_interview_coding_David;

import java.util.Arrays;

public class Q21_Array_Sort_Descending {

    /*
    Q21:Array--SortDescending
        Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
            Ex:   int[] arr = {10,20,7, 8, 90};
                  arr = Sort(arr); ==> {90, 20, 10, 8, 7};
     */

    public static void main(String[] args) {
        // int[] arr = {354, 10, 43, 10, 95, 988};  // [988, 354, 95, 43, 10, 10]
        // int[] arr = {9, 10, 25, 3, 6, 8};     //* [25, 10, 9, 8, 6, 3]
        int[] arr = {10, 20, 7, 8, 90};  // [90, 20, 10, 8, 7]
        System.out.println(Arrays.toString(sortingDescending(arr)));
    }

    public static int[] sortingDescending(int[] arr){

        for(int i = 0; i < arr.length -1 ; i++){  // -1 for not to get an exception in the last number

            if(arr[i] < arr[i+1]){   // I will swap them:
                int temp = arr[i];  // storing the value of arr[i]
                arr[i] = arr[i+1];
                arr[i+1] = temp;

                // reset the index value to the -minus 1;
                i = -1;   // because after swapping two numbers, it needs to start from beginning
            }
        }
        return arr;
    }

}










// ascending yapmak icin tek fark: if statement'i arr[i] < arr[i+1] olarak degil de arr[i] > arr[i+1] olarak kurup ilk karakter ikinciden buyukse yerlerini degistirmek. Cunku ascending olanda once kucukleri sonra buyukleri yazmak istiyoruz. Bu ise descending yani once buyukleri sonra kucukleri yazmak istiyoruz, o yuzden arr[i] < arr[i+1] seklinde kuruyoruz ki ilk karakter ikinciden kucukse yerleri degissin.