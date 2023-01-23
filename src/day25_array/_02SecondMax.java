package day25_array;

import java.util.Arrays;

public class _02SecondMax {

    /* ((Yesterday's homework but I did not do it.))

    [IQ] Second Biggest Number

    Given an Array of numbers. Find and print the 2nd biggest number.

    Note the 2nd biggest should be unique meaning it should be different from the max number

    Example:
    	Input:
	    	[4,3,1,4,5,2,4,8,4,8]
	    Output:
	    	5

     */

    public static void main(String[] args) {

        int[] nums = {4,3,1,4,5,2,4,8,4,8};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));  // [1, 2, 3, 4, 4, 4, 4, 5, 8, 8]

        // Sort yaparsam max number will always be the last index:
        System.out.println("Max Number: " + nums[nums.length -1]);   // Max Number: 8

       // System.out.println("Second Max: " + nums[nums.length -2]);   // Second Max: 8 --> this doesn't work because 8 is duplicate, so it gives wrong second max     //-->  Boyle yapinca normalde sondan ikincinin second max olmasi beklenir ama degerler bunda esit. O yuzden aslinda 5 olmaliydi bu. Peki nasil yapariz?


        int max = nums[nums.length -1];

        for ( int i = nums.length -1; i >= 0; i--) {   // Starting point'im sondaki number, yani sort yapildiktan sonra en buyuk olan number. This for loop --> reads the numbers from the end. We sorted, so I will keep running until I find a number that is not the same as the max number
            if (nums[i] != max) {
                System.out.println("Second Max: " + nums[i]);
                break;  // bunda break stetament is very important! Olumcul :D Break her zaman cok onemli olmuyor ama bunda gerekli, zorunlu!!
            }
        }

        // Second Max: 5   will be printed on the console.


    }
}
