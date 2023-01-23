package replit_aysu._6_Methods;

import java.util.Scanner;

public class _05Max {

    /*
    Finish the method called max() that will take two int arguments and returns the number that is the biggest between them.
        This is a return method with two int parameters
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }


    public static int max(int x, int y){
        // WRITE YOUR METHOD BELOW

        if(x > y){
            return x;
        } else {
            return y;
        }

    }
}
