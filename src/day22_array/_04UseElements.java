package day22_array;

import java.util.Arrays;

public class _04UseElements {

    public static void main(String[] args) {

        int [] nums = {4, 5, 12};
        System.out.println(nums.length); // 3 --> length method allows me to print how many elements are there. ((String'de length method icin length() yapiyorduk ama array'de paranthesis yok, sadece length yaziyoruz))
        System.out.println(Arrays.toString(nums)); // [4, 5, 12]

        System.out.println(nums[0] + nums[1]); // 9 --> because of int + int ---> this is addition cunku basically they are int numbers. So it is addition -> nums[0] = 4. num[1] = 5 --> so 4 + 5 = 9



        String [] strs = {"Hello", "World", "java", "code"};

        System.out.println(strs.length); // 4 --> how many elements in array

        System.out.println(strs[2]); // java
        System.out.println(strs[2] + strs[3]); // javacode --> because String + String

        System.out.println(strs[0].length());  // 5 --> String method length() --> tell the number of characters in the String --> strs[0] = Hello -> its length is 5  --> ((Bu direkt array'in length'i degil, array icindeki bir element'in length'i ve o element de String. Bu yuzden String method'daki gibi yapip sonuna paranthesis de koyduk ve length degil length() yazdik. Eger tum array'in uzunluguna yani kac element olduguna bakacak olsaydik o zaman array'deki gibi parantezsiz yapardik -> Bu class'in ilk orneginde yaptigimiz gibi:  System.out.println(nums.length);  // 4 olurdu cevabi ))
        // System.out.println(strs.length); // 4  --> ((ben yaptim))

        System.out.println(strs[1].charAt(strs[1].length() -1));  //d --> last index of the element at index 1. -> index 1'deki element: World

        String s = strs[3]; // assigning the value of the 3rd index of the array in to a new String variable s
        System.out.println(s);  // code -> cunku strs[3] was code. So, s is also code

    }
}
