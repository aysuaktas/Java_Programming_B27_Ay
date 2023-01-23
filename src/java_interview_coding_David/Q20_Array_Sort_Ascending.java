package java_interview_coding_David;

import java.util.Arrays;

public class Q20_Array_Sort_Ascending {

    /*
    Q20:Array--SortAscending
        Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
            Ex:  int[] arr = {10, 9, 8, 7};
                 arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */

    public static void main(String[] args) {
      //  int[] arr = {354, 10, 43, 10, 95, 988};     // [10, 10, 43, 95, 354, 988]
      //  int[] arr = {9, 10, 25, 3, 6, 8};     //* [3, 6, 8, 9, 10, 25]
        int[] arr = {10, 9, 8, 7};   // [7, 8, 9, 10]
        System.out.println(Arrays.toString(sortingAscending(arr)));
    }

    public static int[] sortingAscending(int[] arr){

        for(int i = 0; i < arr.length -1 ; i++){  // -1 for not to get an exception in the last number

            if(arr[i] > arr[i+1]){   // I will swap them ((small will come first)):
                // to swap 2 numbers:
                int temp = arr[i];  // storing the value of arr[i]   //num1
                arr[i] = arr[i+1];  // num1 became num2
                arr[i+1] = temp;    // num2 became num1

                // reset the index value to the -minus 1;
                i = -1;   // because after swapping two numbers, it needs to start from beginning
            }
        }
        return arr;
    }

}








// descending yapmak icin tek fark: if statement'i arr[i] > arr[i+1] olarak degil de arr[i] < arr[i+1] olarak kurup ilk karakter ikinciden kucukse yerlerini degistirmek. Cunku descending olanda once buyukleri sonra kucukleri yazmak istiyoruz

// time efficiency -> bu kavrami kullanmayi oneriyor Asli



    /* // Zeynep's solution:
    public static int[] ascendingArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }
        }
        return array;
    }
     */