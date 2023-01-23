package day51_stream;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class _01Recap {  // about functional interface

    public static void main(String[] args) {

        // 1.1 Create a function that can check if two array are equal and contains the same elements'
        //      ex: arr1 = {3,2,1}
        //      ex: arr2 = {2,1,3}

        BiPredicate<int[], int[]> arrayEquals = (arr1, arr2) -> {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1,arr2);
        };

        System.out.println(arrayEquals.test(new int[]{3,2,1}, new int[]{1,2,3}));  // true

        // day20 -> _03CountHi'a benziyor ama bunda counting yapmiyoruz sadece replace ediyoruz


                // idea: 1 array is iterated
                // 1 array is a String -> as you go through each element of the first array, replace the First occurrence of it in the String
                // at the end, if the String is empty (no numbers), then they were the same

        System.out.println("=========================");

        /*
            1.1 Create a function that can returns the common characters of two strings
                ex: str1 = "Python"
                    str2 = "Wooden Spoon"

                    output: on
         */

        BiFunction<String, String, String> commonChars = (str1, str2) -> {

            String common = "";

            for (int i = 0; i < str1.length(); i++) {
                if (!common.contains(str1.substring(i, i + 1)) && str2.contains(str1.substring(i, i+1))) {
                    // str2.contains("" + str1.charAt(i)); // baska yontemde yapabilirdik ((onu sildik)) ama onda sonda concatenation yaptigindan emin ol cunku contains method wants String. O nedenle "" + seklinde yazdi str1.charAt(i)yi
                    common += str1.charAt(i);
                }
            }
            return common;
        };

        System.out.println(commonChars.apply("Wooden SpoonP" , "Python"));  // onP  --> farki gormek icin Spoon sonuna P de ekledik, yanlislikla degil yani.

        System.out.println("=========================");

    }
}
