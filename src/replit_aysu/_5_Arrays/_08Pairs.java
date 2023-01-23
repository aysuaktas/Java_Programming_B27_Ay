package replit_aysu._5_Arrays;

import java.util.Scanner;

public class _08Pairs {

    /*
    Given a String [] arr, print a pair of items together in one line until all the pairs are printed. A pair is an element and the element next to it. Print each item with a comma in between them.

    Note: The loop used in the given code is to dynamically create the String array. You don't need to fully understand this part yet, focus only on having access to an array.

    Input:
        [apple, banana, kiwi, grape, milk, soda, juice, coffee]

    Output:
        apple, banana
        banana, kiwi
        kiwi, grape
        grape, milk
        milk, soda
        soda, juice
        juice, coffee
     */

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = input.nextLine();
        }

        //WRITE YOUR CODE BELOW:


        for (int i = 0; i < arr.length-1; i++) {  // when it reaches the last element and tries to find a next one to make a pair, since there is no index there, it gives error. O yuzden i < arr.length-1 yaptim ki son index'i i olarak alip i+1 yapmasin ve olmayan index yuzunden out of bounds exception yemeyeyim
                System.out.println(arr[i] + ", " + arr[i + 1]);
            }

        }
    }

