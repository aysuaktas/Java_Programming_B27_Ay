package replit_aysu._5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _09FindMax {

    /*
    Given an int [] nums, find the print the max number. In other words: find the biggest element in the array.
        Note: The loop used in the given code is to dynamically create the int array. You don't need to fully understand this part yet, focus only on having access to an array and has some numbers.
            Ex: Input:
                [2, 4, 2, 3, -2]

                Output:
                 4
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW

        Arrays.sort(nums);

        // Sort yaparsam max number will always be the last index:
        System.out.println(nums[nums.length -1]);


    }
}
