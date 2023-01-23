package day23_array;

import java.util.Arrays;

public class _01LoopArray {

    public static void main(String[] args) {

        int[] nums = {4, 213, 6};

        // print whole array
        System.out.println(Arrays.toString(nums));  // [4, 213, 6]

        // print each on a separate line hard coded index
        System.out.println("Hardcoded:");  // kendimize hatirlatma
        System.out.println(nums[0]);  // 4
        System.out.println(nums[1]);  // 213
        System.out.println(nums[2]);  // 6


        System.out.println("-------------");  // empty print statement

        // printing each with for loop:
        System.out.println("With for loop:");  // kendimize hatirlatma
        for(int i = 0; i < nums.length; i++){   // i <= nums.length - 1  de diyebilirdik, onemli olan sonuna kadar gitmesi
            System.out.println(nums[i]);  // alt alta 4   213   6  yazdirdi
        }

        System.out.println("-------------");  // empty print statement

        // create our own printing format:
        System.out.println("our own format:");
        String arrayAsString = "Array ~ ";
        for(int i = 0; i < nums.length; i++){
            arrayAsString += nums [i] + " | ";    // ayrimak icin aralarina | koyduk, our choice. pipes koyduk. --> += is concatenation with shorthand operator
        }
        arrayAsString += "~ END";  // kendimiz icin end yazdik, code'un orada bittigini anlayalim diye. Yazmadan da olmustu.
        System.out.println(arrayAsString);  // Array ~ 4 | 213 | 6 | ~ END   // -> Sonda sadece bir kez print ettigimiz icin ayni line'da print edecek


        System.out.println("-------------");  // empty print statement


        // go through with for each loop
        System.out.println("For each loop:");

        for(int eachNumber : nums){   // nums yerine name of the array neyse onu koyuyoruz. --> for each loop -> read every element from the array, beginning to end
            System.out.println(eachNumber); // eachNumber == nums[i]  --> these are the same -> eachNumber in 'for each' loop, nums[i] in 'for' loop
        }


    }
}
