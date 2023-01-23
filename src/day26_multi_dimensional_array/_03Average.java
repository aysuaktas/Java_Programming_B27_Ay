package day26_multi_dimensional_array;

import java.util.Arrays;

public class _03Average {

    public static void main(String[] args) {

        /* Task:
        1) see the average of each array
        2) see the total average of all numbers in the array

        average = sum of number/numbers of elements
         */

        int[][] nums = {
                {3, 5, 1, 2},
                {2, 1, 5, 10, 8},
                {3, 1, 5, 12}
        };

        int totalSum = 0;
        int totalElements = 0;

        for(int[] eachInner : nums) { // --> looping through the 2D array nums, which means going through each inner array (int[])  --> type of my elements are int array. Not just int but int array. -> int[] eachInner yazdik o yuzden

            int sum = 0; // resets ((each time)) for the next array
            // ornegin her asamada soyle toplayacak: mesela ilkinde: sum =  3 + 5 + 1 + 2
            for(int eachNum : eachInner){ // purpose of inner loop: add all the numbers from the inner array
                sum += eachNum;
            }

            System.out.println(Arrays.toString(eachInner));
            System.out.println("Average: " + (double)sum/ eachInner.length);  // double type yapmak istiyorum cunku I don't want to lose data. Ama average yani number'larin ortalamasini alirken karsima decimal numbers cikacak. O yuzden casting yaptik. Cunku int yaptik ama decimal number olursa we will lose some data
            totalSum += sum;
            totalElements += eachInner.length;  // her birinin de length'ini topladi ki sonda total'i alacagiz

        }

        System.out.println("Total average of nums: " + (double)totalSum/totalElements);

    }
}
  /*
   Print edince console'da:
        [3, 5, 1, 2]
        Average: 2.75
        [2, 1, 5, 10, 8]
        Average: 5.2
        [3, 1, 5, 12]
        Average: 5.25  // buraya kadarki kismi loop ile oldu
        Total average of nums: 4.461538461538462  // bu loop'un disinda yazildi
   */
