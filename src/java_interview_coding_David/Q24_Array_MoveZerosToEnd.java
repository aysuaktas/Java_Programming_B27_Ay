package java_interview_coding_David;

import java.util.Arrays;

public class Q24_Array_MoveZerosToEnd {

    /*
    Q24: Array -- Move Zeros to the End
        Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)

            - Ex:  input: {1,0,2,0,3,0,4,0};
            output: [1, 2, 3, 4, 0, 0, 0, 0]
     */      //--> bu soruyu ben cozmedim, yine bak, YouTube'dan falan da izle


    // David's solution1 :

    private static int[] arrayWithZeroesAtTheEnd(int[] numArray) {
        for (int k = 0; k < numArray.length - 1; k++) {

            int swapCounter = 0;

            for (int i = 0; i < numArray.length - 1; i++) {
                if (numArray[i] == 0 && !(numArray[i + 1] == 0)) {

                    int container = numArray[i];
                    numArray[i] = numArray[i + 1];
                    numArray[i + 1] = container;

                    swapCounter++;

                }
            }
            if (swapCounter == 0)
                break;
        }
        return numArray;
    }


    // David's solution2 :

    public static void numberArrayWithTotalZeroElmi(int n) {   // bu da bu sorunun cozumu mu, bilmiyorum, bak
        int sum = 0;
        int[] result = new int[n];

        for (int i = 0; i < n - 1; i++) {
            sum += result[i] = i;
        }
        result[n - 1] = -sum;
        System.out.println(Arrays.toString(result));


        // David's solution3 :
/*
        public static void moveZeroToEndElmi ( int[] arr){

            int[] result2 = new int[arr.length];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    result2[j] = arr[i];
                    j++;
                }
            }

            System.out.println(Arrays.toString(result2));
        }
 */




    /*
    //Saim's solution:

    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];  // new array with the same size of given array.
        int count = 0;   // count variable

        for (int each : array) {     // foreach loop for given array
            if (each != 0)    // if each element is not 0
                result[count++] = each;   //  assign that value as our new array’s first value
        }

        return result;
    }
     */


    }
}
