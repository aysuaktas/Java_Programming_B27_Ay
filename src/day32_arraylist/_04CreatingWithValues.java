package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class _04CreatingWithValues {

    public static void main(String[] args) {

        // How to convert array to ArrayList:

        int[] arr = {3, 5, 1, 1};  // int[] --> bir int array olusturduk

        // array'i ArrayList'e convert edebilirsek ArrayList'in functionalities'ini kullanabiliriz.
        // We can’t declare ArrayList like we can array. So, we will convert an array to an ArrayList to get those initial values.

        // Array'i ArrayList'e cevirmek icin:
        Arrays.asList(arr); // TODO: Arrays.asList() -> this method converts the array to ArrayList


        // How to create an ArrayList with initial values:

        Integer[] arr2 = {3, 4, 4, 6};
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(arr2));   // ArrayList primitive datatypes'i almiyor. int, bir primitive datatype oldugu icin onu wrapper class'a donusturup yazariz ArrayList < >'inin icine. Wrapper class array'i yaptik. -----> arr is not valid ((arr boyleydi ----> int[] arr = {3, 5, 1, 1}; )) because it is int primitive types. O yuzden Integer[] arr2'yi olusturduk ki ArrayList'te kullanabilelim


        // The way we will usually create an ArrayList

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 4, 5, 1, 4));
        System.out.println(list);  // [5, 2, 4, 5, 1, 4]


        System.out.println("---------------------");

        ArrayList<String> names = new ArrayList<>(    // bu sekilde parantezi burada acip altta kapatip arasinda array'i ArrayList yapabiliriz
                Arrays.asList("james", "adam", "ana", "jane")
        );
        System.out.println(names);  // [james, adam, ana, jane]

    }
}
