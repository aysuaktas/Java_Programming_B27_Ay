package day23_array;

import java.util.Arrays;

public class _03EvenOrOdd {

    public static void main(String[] args) {

        int[] nums = {3, 5, 12, 12, 5, 12, 4, 2};
        System.out.println(Arrays.toString(nums));  // [3, 5, 12, 12, 5, 12, 4, 2]

        int even = 0, odd = 0;

        for(int each: nums){
            if(each % 2 == 0){
                even++;  // print(each + " is even")
            } else {
                odd++;  // print(each + " is odd")
            }
        }

        System.out.println("Even: " + even);  // Even: 5
        System.out.println("Odd: " + odd);   // Odd: 3


        // ustteki for each loop ile yapildi. Aynisinin for loop halini de yapabiliyoruz.


        /* // For loop ile yapilmis hali:

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                even++; // print(each + " is even")
            } else {
                odd++;  // print(each + " is odd")
            }
        }

        System.out.println("Even: " + even);  // Even: 5
        System.out.println("Odd: " + odd);   // Odd: 3
         */

    }
}
