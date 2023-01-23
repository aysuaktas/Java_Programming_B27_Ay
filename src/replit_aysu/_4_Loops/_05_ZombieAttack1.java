package replit_aysu._4_Loops;

import java.util.Scanner;

public class _05_ZombieAttack1 {

    /*
    There is a zombie disease pandemic wiping out populations. Use a loop to keep track of the city's population. The starting population is given as the inhabitants value. Each day the city is losing half of its population. Write the program that will show the population day by day, until the city gets to zero.
    Note: Case sensitivity should be considered. We are looking for the lowercase character versions of both Strings

    Ex:
  Input:
    6

  Output:
    Day 0 [6]
    Day 1 [3]
    Day 2 [1]
    ---- EXTINCT ----
     */

    // Iroda Abdusalamova's solution:

        public static void main(String[] args) {
            //DO NOT TOUCH THESE LINES:
            Scanner scan = new Scanner(System.in);
            int inhabitants = scan.nextInt();
            //WRITE YOUR CODE HERE:


            int day = 0;  // or you can call as int count = 0;

            while (inhabitants >= 1){
                System.out.println("Day " + day + " [" + inhabitants + "]");
                inhabitants = inhabitants / 2; //because each day, we are losing half of the population
                day++;  // it is while loop, so we used post increment here as its position
            }
            System.out.println("---- EXTINCT ----");



        }
}
