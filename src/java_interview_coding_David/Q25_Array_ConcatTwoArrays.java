package java_interview_coding_David;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Q25_Array_ConcatTwoArrays {

    /*
    Q25: Array -Concat two arrays
        Write a return method that can concat two arrays
     */

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40};
        int[] arr2 = {50, 60, 70};
        System.out.println(Arrays.toString(concatIntArraysWithIntStream(arr1, arr2)));   // [10, 20, 30, 40, 50, 60, 70]

    }


    // 1st way --> concatenate two int[] arrays using IntStream:
    static int[] concatIntArraysWithIntStream(int[] array1, int[] array2) {
        return IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray();
    }
















    // Zeynep's solution:

    public static void concatTwoArrays(int[] arr1, int[] arr2) {

        int[] concat = Arrays.copyOf(arr1, arr1.length + arr2.length);
        int j = arr1.length;

        for (int i = 0; i < arr2.length; i++) {
            concat[j++] = arr2[i];
        }
        System.out.println(Arrays.toString(concat));
    }


}

