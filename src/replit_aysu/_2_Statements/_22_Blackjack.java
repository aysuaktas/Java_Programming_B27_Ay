package replit_aysu._2_Statements;

import java.util.Scanner;

public class _22_Blackjack {

    /*
    Use if statements to help the Blackjack dealer determine who won. There will be an int house value and an int player value. Use the following rules of blackjack to print out the result:
        if the player score is bigger than 21, the result is player bust
        if the player score is equal to the house score, the result is its a tie
        if the player score is equal to 21, the result is player win
        if the house score is bigger than the player score, the result is player lose
        if the player score is bigger than the house score, the result is player win
      Note: Can be done with separate if statement or a multi-branch if statement
     */

    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        //WRITE YOUR CODE BELOW

        if(player > 21){
            System.out.println("player bust");
        } else if(player == house){
            System.out.println("its a tie");
        } else if(player == 21){
            System.out.println("player win");
        } else if(house > player){
            System.out.println("player lose");
        } else if(player > house){
            System.out.println("player win");
        }

        /*
        8
        21 --> player win

        10
        7 --> player lose

        4
        4 --> its a tie

        10
        25 --> player bust

        7
        12 --> player win

         */

    }
}
