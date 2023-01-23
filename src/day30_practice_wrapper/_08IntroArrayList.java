package day30_practice_wrapper;

import java.util.ArrayList;
import java.util.Arrays;

public class _08IntroArrayList {

    public static void main(String[] args) {

        int[] a = {4, 2, 1};   // array
        System.out.println("Number of elements: " + a.length);  // Number of elements: 3
        System.out.println("Print the whole array: " + Arrays.toString(a));  // Print the whole array: [4, 2, 1]
        System.out.println("Access the first element: " + a[0]);  // Access the first element: 4

        System.out.println("------- SOME INFORMATION: -------");
        System.out.println("Add elements to the array: - CANNOT change size of array after creation");
        System.out.println("Remove element from the array - CANNOT do it");  // we cannot delete in array
        System.out.println("Array can hold values that are primitive types & object types");  // object types = non-primitive datatypes

        System.out.println("-------------------------");

        ArrayList<Integer> nums = new ArrayList<>(); // --> empty ArrayList bu. Basta Arraylist yazarken < > icine type'i koyuyoruz.
        System.out.println("Number of elements: " + nums.size()); // Number of elements: 0

        System.out.println("Print whole ArrayList: " + nums);  // Print whole ArrayList: []

        System.out.println("Adding to ArrayList: .add() method");
        nums.add(5);
        nums.add(10);
        System.out.println(nums);  // [5, 10]
        System.out.println(nums.size());  // 2


    }
}
