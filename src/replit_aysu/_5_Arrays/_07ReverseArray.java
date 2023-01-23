package replit_aysu._5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _07ReverseArray {

    /*
    Given a String [] words, go through the array and reverse it. Print the reversed array where the order of the elements is changed.

    Note: The loop used in the given code is to dynamically create the string array. You don't need to fully understand this part yet, focus only on having access to an array.

    Input:
         [hello, why, by, apple, note]

    Output:
         [note, apple, by, why, hello]

     */

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINES:
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++){
            arr[i] = input.nextLine();
        }

        //WRITE YOUR CODES BELOW:

        // input'u [hello, why, by, apple, note] olarak dusunursek arr: ["hello", "why", "by", "apple", "note] olur.

        String[] reverse = new String[arr.length];  //  reverse ise: [null, null, null, null, null] olur. Sonra her bir step'te arr'i tersten okuyup elementleri tek tek yazmasi icin backward for loop yapacagiz i-- ile
        int count = 0;
        for(int i = arr.length - 1; i >= 0; i--){
            reverse[count++] = arr[i];
        }
        System.out.println(Arrays.toString(reverse));


    }
}
