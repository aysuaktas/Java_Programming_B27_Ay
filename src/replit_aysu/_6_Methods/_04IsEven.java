package replit_aysu._6_Methods;

import java.util.Scanner;

public class _04IsEven {

    /*
    Finish the method called isEven() that will take an intargument and return if the given number is even as a boolean. If the number is even the method returns true, but if the number is odd the method returns false. The isEven() method is being called in the main method and given an argument.
           This is a return method with an int parameter
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }

    public static boolean isEven(int num){
        //WRITE YOUR METHOD

        if(num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

}
