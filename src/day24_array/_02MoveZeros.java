package day24_array;

import java.util.Arrays;

public class _02MoveZeros {

    /* Yesterday's homework -> ben yapmadim

    Write a program that will move all the zero numbers to the end of the array. The rest of the numbers will move over in position

        Hint: You don’t have to manipulate the given array, try to use another array too. Think about the indexes

	Ex:
	Input:
		[10, 0, 5, 0, 1, 0]
	Output:
		[10, 5, 1, 0, 0, 0]

     */

    public static void main(String[] args) {

        int[] nums = {10, 0, 5, 0, 1, 0};
        int[] fixed = new int[nums.length];   // [ 0, 0, 0, 0, 0, 0 ]
        int indexToRead = 0;  // --> read every element from beginning to end -> it will read the every element, one at a time -> same as i in a traditional loop
        int indexToStore = 0; // store values into the fixed array, maybe will not increment each time

        // indexToRead: 0 ..... 6
        // indexToStore: 0  ... 3


        while(indexToRead < nums.length){

            if(nums[indexToRead] != 0){   // position zero'da 10 var -> 10 != 0, dogru, 10, sifira esit degil. O zaman if statement dogru. Sonra i++; var. Sonrakine bakiyoruz 0 != 0 is false. Zero equals to zero. Bu yuzden if block will not printed for position (index number) one. O nedenle sifir ise sadece indexToRead++; kismina, if block'un disina ama while loop'un icindeki kisma devam ediyor.
                fixed[indexToStore] = nums[indexToRead];
                indexToStore++;
            }

            indexToRead++;  // 0 karakteri olan yerlerde sadece bu dikkate aliniyor, if block will not run cunku o durumda.

        }
        System.out.println(Arrays.toString(fixed));   // [10, 5, 1, 0, 0, 0]



    }
}
