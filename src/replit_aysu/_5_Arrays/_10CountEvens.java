package replit_aysu._5_Arrays;

import java.util.Scanner;

public class _10CountEvens {

    /*
    Given an int [] nums, find and print how many even numbers are in the array.
        Note: The loop used in the given code is to dynamically create the int array. You don't need to fully understand this part yet, focus only on having access to an array and has some numbers.

        Ex: Input:
            [2, 1, 2, 3, 4]

            Output:
              3
     */

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW:


        int count = 0;

        // with for loop:
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){    // nums[i] yazmak yerine sadece i seklinde yazinca replitte hata verdi
                count++;
            }
        }
        System.out.println(count);


         /*   with for each loop:

         for(int eachNum : nums){
             if(eachNum % 2 == 0){
                 count++;
      }
    }
    System.out.println(count);
          */


    }
}
