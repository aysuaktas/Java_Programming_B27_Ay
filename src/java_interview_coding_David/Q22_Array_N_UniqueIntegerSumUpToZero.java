package java_interview_coding_David;

import java.util.ArrayList;
import java.util.Arrays;

public class Q22_Array_N_UniqueIntegerSumUpToZero {

    /*
    Q22: Array -- N unique integers that sum up to 0

        Write a function: that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array.
                -> For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
                -> The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
                -> For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */     //--> bu soruyu ben cozmedim, yine bak, YouTube'dan falan da izle



    // David's solution:

    private static int[] arrayOfUniqueNumbersWithTheirSumZero(int N) {
        int[] uniquesWithSumZero = new int[N];
        ArrayList<Integer> myList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < uniquesWithSumZero.length - 1; i++) {
            myList.add(i);
            sum += i;
        }
        myList.add(-sum);

        for (int i = 0; i < myList.size(); i++) {
            uniquesWithSumZero[i] = myList.get(i);
        }
        return uniquesWithSumZero;
    }



/*
    // Saim's solution:
    public static int[] solution(int N) {

        int[] result = new int[N];
        int sum = 0;

        for (int i = 0; i < N - 1; i++) {
            result[i] = i;
            sum += i;
        }

        result[N - 1] = -sum;

        return result;
    }
 */



}
