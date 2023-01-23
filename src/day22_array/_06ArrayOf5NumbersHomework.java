package day22_array;

import java.util.Arrays;

public class _06ArrayOf5NumbersHomework {

    /*
    Create an array of 5 numbers. Manually reverse the array
        -No loop yet
     */

    public static void main(String[] args) {

        // int [] nums;  // declaring an int array
        // nums = new int [5];  // initializing the array with 5 spaces //-->  so far this is our array: 0, 0, 0, 0, 0

        // Bibi Mariam Ahmadyar's solution:

        int [] nums = {1, 2, 3, 4, 5};  // declaring and initializing with the values;

        nums [0] = 5;  // num 0 = sifirinci index
        nums [1] = 4;
        nums [2] = 3;
        nums [3] = 2;
        nums [4] = 1;

        System.out.println(Arrays.toString(nums)); // [5, 4, 3, 2, 1]

        // Huseyin's solution:

        int[] numbers = {21,2,100,250,45};
        System.out.println(numbers[4] + ", " + numbers[3] + ", " + numbers[2] + ", " + numbers[1] + ", " + numbers[0]);   // 45, 250, 100, 2, 21


    }
}
