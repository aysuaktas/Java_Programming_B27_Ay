package day29_methods;

public class _07VarArgEx {

    public static void main(String[] args) {

        int[] a = {3, 1, 3, 5}; // now, I can call my method with an argument:
        printAll(a); // 3 1 3 5

        System.out.println();  // println degil print olan 2 seyi ayirdik bununla. Yoksa yanina yazardi

        // dynamic(a); this works
        dynamic(4, 1, 4, 1, 5, 2);  // 4 1 4 1 5 2 --> bunun metodundaki  syntax of three dots (...) , which represents an array, but allow you to type number directly, instead of having to create an array first
        //  --->  ... yapinca da bu bir array ama basta size belli degil, ben burada kac tane yazarsam bunun sonrasinda size belli oluyor.

        System.out.println();

        dynamic("hello", "monday", "java"); // hello monday java

    }

    public static void printAll(int [] nums){
        for(int each : nums){
            System.out.print(each + " ");
        }
    }

    public static void dynamic(int ... nums){   // three dots (...) is still an array  --> int ... nums is the same as int[] nums
        for(int each : nums){
            System.out.print(each + " ");
        }
    }

    public static void dynamic(String ... words){  // String ... words is the same as String[] words
        for(String each : words){
            System.out.print(each + " ");
        }
    }



}
