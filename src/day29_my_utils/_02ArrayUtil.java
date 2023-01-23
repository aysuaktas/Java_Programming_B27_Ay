package day29_my_utils;

public class _02ArrayUtil {

     /*
         Group of utility methods for arrays
         Extra practices ((odevler)) from 08/01/2022 ((1st of August)) will be done here --> bunlar day29'un odevleri --> I will call and print these methods in day30's package
      */


    /*
    Min Number
        create a method that will accept an int array and return the smallest number from the array
    */

    public static int min(int... arr) {  // int [] arr IS THE SAME AS int ... arr  (( int [] arr yaptigimda day30 package 1. class'ta bunu _02ArrayUtil.min(4, 2, 1, 5, 1, -1, 2, 5, 2, -1, 5); seklinde cagirdigimda hata verdi ama, kullanimina dikkat et ))
        int min = arr[0];

        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    /*
    Max Number
         create a method that will accept an int array and return the biggest number from the array
     */

    public static int max(int... arr) {
        int max = arr[0];

        for (int each : arr) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }


    /*
    Contains
        create a method that will accept an int array and an int number. Check and return if the given number is in the array.
     */

    public static boolean contains(int[] arr, int num) {   // cevabi ya true ya da false olacak, o yuzden boolean yazdik

        for (int each : arr) {
            if (each == num) {
                return true;   // return -> stops
            }
        }
        return false;   // if the code is false, then this one will printed automatically
    }


    /*
    IndexOf
        create a method that will accept an int array and an int number. Find and return the index of the number in the array. If there is multiple occurrence return the first occurrence's index
     */


    // if you want to use var args ((variable arguments)): public static int indexOf(int num, int ... arr) {

    public static int indexOf(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {  // every number from the array with the number we are looking for
                return i;
            }
        }
        return -1;  // if each element is not equal to number, if any of my numbers cannot match, then if statement will not be true. So, it will return a negative value. O yuzden -1 dedik. Java'da negative index number olmadigi icin it is a good default value. ((indexOf method'da o character yoksa -1'e return olur diyorduk))
    }


    // overloading ile bu indexOf'u yeniden yapacak olursak:

    public static int indexOf(int[] arr, int target, int startIndex) {
        for (int i = startIndex; i < arr.length; i++) {  // 0 yerine startIndex'ten baslattik
            if (arr[i] == target) {  // num yerine target yazdik
                return i;
            }
        }
        return -1;
    }


    /*
    Add Element
        create a method that will accept a String array and a String element. Add the given element value into the end of the array. Do not replace the last index of the given array, but instead create a new array with a bigger size to fit all the original elements plus the new one
     */

    public static String[] addElement(String[] arr, String element) {

        String[] newArr = new String[arr.length + 1]; // create an array with an extra size

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[newArr.length - 1] = element;  // add the new element to the end of the new array

        return newArr;
    }


    /*
    Add Element
        overload the add element method to accept two String arrays. For this one add all the given elements from the second array in the first array.
                Ex:
	            {"today", "is", "monday"}
	            {"no", "softskills", "today"}

                output > [today, is, monday, no, softskills, today]
     */

    // ilk array'ime 3 kelime daha eklemek istiyorum

    public static String[] addElement(String[] original, String[] other) {

        String[] merged = new String[original.length + other.length]; // length ne olacak? iki array'in combine edilmis hali. Yani 'original' array'inin uzunlugu ve 'other' array'inin uzunlugunun toplami (addition)

        for (int i = 0; i < original.length; i++) {  // copy the elements from the original array to the new array
            merged[i] = original[i];
        }   // [today, is,monday, null, null, null] --> it is like this so far.


        // option: int i =0, j = original.length; j++ --> merged[j]  -------> eger +i ile yapmak istemezsen (( merged[original.length + i] kisminda )) -> alternatif olarak boyle de yapabilirsin
        for (int i = 0; i < other.length; i++) { // read the elements from the other array and store them into the merged array
            merged[original.length + i] = other[i];  // I need to store them in merged
        }
            // i = 0 iken -> position(index) 3'e no'yu ekliyor. Sonra i++dan i =1 olunca index4'e softskills'i ekliyor. i = 2 olunca da index5'e today'i ekliyor

        return merged;
    }



    }  // closing paranthesis of class








