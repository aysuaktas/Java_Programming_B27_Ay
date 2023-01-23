package day22_array;

import java.util.Arrays;

public class _01FirstArray {

    public static void main(String[] args) {

                 /*  How to declare arrays?
	        There are two ways to declare one-dimensional arrays:

	         1. Specify the type, and then specify square brackets [] and finally array variable name.
	    	            int[] scores;
		             String[] names;

                   This first way is preferred as convention. But both of them okay in terms of syntax.

	         2. Specify the type, and then specify the array variable name which is followed by square brackets [ ].
		               int scores[];		String names[];
		        	  Bu sekilde sadece declare etmiş olduk, assign etmedik.
                 */


        int[] nums;   // declaring an int array ---->  // int[] ya da space ile int[ ] seklinde yazilabilir ama bosluk cok istenmiyor convention olarak


                    /*  Instantiating Arrays:
	             To instantiate one dimensional array, use the keyword new, followed by type and then finally specify the size within square brackets []

		            1. Declare and instantiate in separate statements
                          int[] scores;      // önce declare ettik
		                 scores = new int [4];  // ((bunda size’i 4 olarak belirlemiş olduk, bunu değiştiremiyoruz çünkü Array’de ‘size’ değişmiyor))

		            2. Declare and instantiate in single statements
                        int[] scores = new int [4];      // ayni anda hem declare hem instantiate ettik
		                String[] names = new String [5];
                         */

        nums = new int [5]; // initializing the array with 5 spaces
        // so far this is our array: 0, 0, 0, 0, 0
        // System.out.println(Arrays.toString(nums));  // [0, 0, 0, 0, 0] --> ((ben ekledim))

        // The size (how many elements we should have) -> square brackets [] icinde yazan sayidir. Bir sey assign etmedigimiz surece 0 olarak gozukurler console'da

        // The element has Indexes.
        // --> so far this is our array: 0, 0, 0, 0, 0 demistik
        //                 index number: 0  1  2  3  4

        System.out.println(nums[0]);  // 0  --> Syntax acisindan: name of the array, square brackets and inside of this square brackets, we wrote index number

                     /*  Assigning values to Array Elements:
	                          numbers [0] = 20;
                     */

        // to change the first element to be 10:
        nums [0] = 10; // assigning the value 10 in position 0 of the array

        System.out.println(nums[0]); //  10  //--> element'i 10'a assign ettigimiz icin bu console'da 10 olarak gozukecek artik

        nums[3] = 25;
        System.out.println(nums[3]);   // 25
        // at this point, the whole array: [10, 0, 0, 25, 0]
        System.out.println(Arrays.toString(nums)); // [10, 0, 0, 25, 0] --> ((bunu ben ekledim))


        /*
        Eger value’yu sonradan öğreniyorsak üstteki gibi once sadece declare ederiz vs vs. Ama value’lari/ elements’i bastan biliyorsak ayni anda hem declare hem assign edebiliriz. Yani:
                     Array Initialization:
	            Like regular variables, Java also allows you to initialize an array’s elements when you create the array:
                        int[ ] myList = {1,2,3,4,5};
         Bu sayede hem declare hem assign etmis olduk.
         */

        // declaring and initializing with the values;
        int [] other = {5, 7, -8, 20, 12};
        System.out.println(other[1]);  // 7  --> 1. indexteki value
        System.out.println(other[4]);  // 12
        // System.out.println(other[100]);  // --> if the index does not exist -> it causes the --> ArrayIndexOutOfBoundException

        // System.out.println(Arrays.toString(other)); // [5, 7, -8, 20, 12]  --> bunu Zeynep ile denedik. Arrays.toString kullaniyoruz ama bu sadece String icin degil, int falan oldugunda da tumunu yazdirmak istedigimizde bunu kullaniyoruz.


    }
}
