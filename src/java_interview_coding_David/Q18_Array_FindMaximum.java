package java_interview_coding_David;

import java.util.Arrays;

public class Q18_Array_FindMaximum {

    /*
    Q18:Array--FindMaximum:
        Write a method that can find the maximum number from an int Array.
     */

    public static void main(String[] args) {
        int[] arr = {10, 354, 43, 95, 988};    // -> sorted:  10, 43, 95, 354, 988
        System.out.println(maximumNumber(arr));  // 988
    }

    public static int maximumNumber(int[] nums) {   // int Array

        Arrays.sort(nums);  // sort ready method oldugu icin David oteki yol ile duymak istedi. Stream de kullanan olmus ama o da ready method
        int max = nums[nums.length -1];

        // OR I can start int max = Integer.MIN_VALUE;  -> starting point  -> for-each loop
        /*
        for (int each : nums) {
            if (each > max) {
                max = each;
            }
        }
         */

        return max;
    }
}
