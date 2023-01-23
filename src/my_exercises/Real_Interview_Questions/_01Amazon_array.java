package my_exercises.Real_Interview_Questions;

import java.util.*;

public class _01Amazon_array {

    /*
    k=1; output should be 3  --> (( k=1 -> most repeated 1 number ))
    k=2; output 2,3  --> ((k=2 --> most repeated 2 numbers from array))
    ------
     (( Question is about frequency of characters -> most frequent element in the array? ))
    --------
    (( If k is 1, print the number that repeats the most, if k is 2, print the number that repeats the most, and then print the number that repeats the most.))
     */


        // Sonucu bulamadi, dene

/*
        int[] nums = {1, 2, 2, 3, 3, 3, 4};
        int k = 2;

        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> numFrequency = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int frequency = 0;

            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    frequency++;
                }
            }

            numFrequency.add(frequency, num[i]);
        }

        int[] keys = numFrequency.keySet();

        int[] sortedFrequency = Arrays.sort(keys);

        for( int i = 0; i < k; i++){
                int mostHighFrequency = sortedFrequency[i];
                int mostFrequentNumber = numFrequency.get(mostHighFrequency);
                result.add(mostFrequentNumber);
            }

            System.out.println(result);




 */




    }


