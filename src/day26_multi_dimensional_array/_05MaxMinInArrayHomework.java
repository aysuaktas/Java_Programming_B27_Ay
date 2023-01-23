package day26_multi_dimensional_array;

import java.util.Arrays;

public class _05MaxMinInArrayHomework {

    /*
    Given a 2D int array find the max and min number from the whole array

       int[][] {
              {1, 5, 2, 23},
              {-12, 41, -5, -2},
              {1, 5, 1, 5}
       }

       Max: 41
       Min -12

    Extra: Find the max and min between each inner array
     */

    public static void main(String[] args) {

        int[][] nums = {
            {1, 5, 2, 23},
            {-12, 41, -5, -2},
            {1, 5, 1, 5}
        };

        Arrays.sort(nums[0]);
        Arrays.sort(nums[1]);
        Arrays.sort(nums[2]);

        /*
        System.out.println(Arrays.toString(nums[0]));  // [1, 2, 5, 23]
        System.out.println(Arrays.toString((nums[1]))); // [-12, -5, -2, 41]
        System.out.println(Arrays.toString(nums[2])); // [1, 1, 5, 5]
         */

        int max = 0;
        int min = 0;

        for(int[] number: nums){   //number is -> name of inner arrays
            for(int each : number){  // each -> each element in array
                if(each > max){
                    max = each;
                }
                if(each < min){
                    min = each;
                }
            }
        }
        System.out.println("Max number: " + max);   // Max number: 41
        System.out.println("Min number: " + min);   // Min number: -12

        System.out.println("-----------");

        // Extra: Find the max and min between each inner array

        // 0. element -> {1, 5, 2, 23} idi -> sorted edilince [1, 2, 5, 23] olmustu, bunun uzerinden:
        int maxOfElement0 = nums[0][nums[0].length -1]; // num[0] dedigimiz 0.element. max number'i -> ustte sort method uyguladigimiz icin -> sondaki indexteki yani length-1'deki olacak
        System.out.println("Max number of the element 0 is: " + maxOfElement0); // Max number of the element 0 is: 23

        int minOfElement0 = nums[0][0];
        System.out.println(("Min number of the element 0 is: " + minOfElement0));  // Min number of the element 0 is: 1

        // 1. element -> {-12, 41, -5, -2} idi -> sorted edilince [-12, -5, -2, 41] olmustu:
        int maxOfElement1 = nums[1][nums[1].length -1];  // num[1] -> 1. element
        System.out.println("Max number of the element 1 is: " + maxOfElement1);  // Max number of the element 1 is: 41

        int minOfElement1 = nums[1][0];
        System.out.println(("Min number of the element 1 is: " + minOfElement1));  // Min number of the element 1 is: -12

        // 2. element -> {1, 5, 1, 5} idi -> sorted edilince [1, 1, 5, 5] olmustu:
        int maxOfElement2 = nums[2][nums[2].length -1];
        System.out.println("Max number of the element 2 is: " + maxOfElement2);  // Max number of the element 2 is: 5

        int minOfElement2 = nums[2][0];
        System.out.println(("Min number of the element 2 is: " + minOfElement2));  // Min number of the element 2 is: 1

    }
}
