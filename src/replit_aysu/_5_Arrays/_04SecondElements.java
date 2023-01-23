package replit_aysu._5_Arrays;

import java.util.Scanner;

public class _04SecondElements {

    /*
    Given an int [] nums print the second element and the second to last element in the following format:

        Ex:
           Input:
           [1, 2, 3, 4, 5]

            Output:
            Second element: 2
            Second to last element: 4
     */

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i =0; i < size; i++) {
            nums[i] = scan.nextInt();
        }

        //WRITE YOUR CODE BELOW

        System.out.println("Second element: " + nums[1]);  // index number'lar sifirdan basliyor. Birinci element olsa num[0] ile bulurduk. Ikinci element -> nums[1] ile bulunur.

        System.out.println("Second to last element: " + nums[nums.length-2]);  // TODO: ayyay'de bastan ikinci elementi bulma -> ismi nums ise ->  nums[1] olurdu ((because index numbers start from zero)) ama array'de sondan ikinci element'i bulma -> nums[nums.length-2]

        //console'da ilk yazdigimiz 'size' oluyor. Sonra degerleri girmeye basliyoruz

    }
}
