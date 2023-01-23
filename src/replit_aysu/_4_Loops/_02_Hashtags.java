package replit_aysu._4_Loops;

import java.util.Scanner;

public class _02_Hashtags {

    /*
    Use a loop to print a hashtag # for n times. The n value is how many hashtags should be on the same line, in the output.
     */

        public static void main(String[] args) {
            //DO NOT TOUCH BELOW:
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            //WRITE YOUR CODE HERE

            for(int i = 0; i < n; i++ ){  // # for n times yapmak istedigimiz icin 0dan baslattik ve i < n dedik. int i = 0 yerine 1'den baslatsaydik i <= n  yazabilirdik
                System.out.print("#");
            }

            // user n icin ne girerse o kadar sayida # yazdiriyor. Yan yana olmasi icin println yerine print kullandik.

        }
}
