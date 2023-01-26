package java_interview_coding_David;

import java.util.Arrays;

public class Q19_Array_FindMinimum {

    /*
    Q19:Array--FindMinimum:
        Write a method that can find the minimum number from an int Array.
     */

    public static void main(String[] args) {
        int[] arr = {354, 10, 43, 95, 988};
        System.out.println(minimumNumber(arr));  // 10
    }

    public static int minimumNumber(int[] arr) {   // int Array

        int min = Integer.MAX_VALUE;  // starting point

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
}


        /* // Second way with Arrays.sort method
        Arrays.sort(nums);
        int min = nums[0];
        return min;
    }
}

        // Daha kisa hali:
        Arrays.sort(nums);
        return nums[0];
         */
