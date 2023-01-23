package replit_aysu._5_Arrays;

import java.util.Scanner;

public class _15NonDuplicate {

    /*
    Given an int [] nums that has duplicate numbers, which means each numbers is found twice in the array. Find and print the non-duplicate number, which mean the ones that do not have two occurrences of it. If there is more than one, return the first unique in array!

         Input:
         [1, 2, 3, 4, 3, 4, 1]

         Output:
           2
    -------------------
            Input:
           [6, 44, 6, 4, 3, 4, 1]

          Output:
          44 (more than one unique number. but 44 is the first)
     */

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //WRITE YOUR CODE BELOW:

        // Anam Zahra's solution:


        for(int i = 0; i < nums.length; i++){

            int count = 0;   // bu count'u for loop'un icine degil oncesine yazinca hata veriyor.
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;  // eger nums[i] == nums[j] ise count 2 olacak
                }
            }
            if(count == 1){
                System.out.println(nums[i]);
                break;  // bunda break yapmis cunku soruda; birden fazla unique number varsa sadece ilkini yazdir diyor bize
            }
        }



    }
}
