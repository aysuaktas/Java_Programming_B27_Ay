package java_interview_coding_David;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q27_ArrayList_RemoveSomeValues_Numbers {

    /*
    •Q27:ArrayList--Remove some values
        Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-9, 0, 13, 45, 93, 100, 107, 1559, 2022));
        System.out.println(removeNumbersGreaterThan100(numbers));   // [-9, 0, 13, 45, 93, 100]
    }

    public static List<Integer> removeNumbersGreaterThan100(List<Integer> nums){
        nums.removeIf(number -> number > 100);
        return nums;
    }

}
