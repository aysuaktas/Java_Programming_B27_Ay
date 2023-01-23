package java_interview_coding_David;

import java.util.Arrays;

public class Q0 {    // Furkan


    public static String mergeTwoArrays(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length+ arr2.length];

        int i = 0;
        for(int each : arr1){
            result[i++] = each;
        }

        for(int each : arr2){
            result[i++] = each;
        }
        return Arrays.toString(result);
    }

    public static void main(String[] args) {
        int[] num1 = {1,3,5};
        int[] num2 = {7,9,4,8};
        System.out.println(mergeTwoArrays(num1, num2));   // [1, 3, 5, 7, 9, 4, 8] ->  merge two arrays
    }



}
