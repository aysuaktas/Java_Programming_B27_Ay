package replit_aysu._6_Methods;

import java.util.Scanner;

public class _06ProfitOrLoss {

    /*
    Finish the method called profit() that will take two int arguments and returns a String saying if there is a profit, a loss, or no loss. The first argument is the buyPrice value and the second argument is the sellPrice value. There is a profit if the sell price is more than the buy price.
        This is a return method with two int parameters

        For ex:
        100   --> ilk yazilan, buyPrice
        1500  --> ikinci yazilan -> sellPrice

        output:
         profit
     */

    public static String profit(int buyPrice,int sellPrice){
        //WRITE YOUR CODE BELOW

        if(sellPrice > buyPrice){
            return "profit";
        } else if(buyPrice > sellPrice){
            return "loss";
        } else {
            return "no loss";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profit(in.nextInt(), in.nextInt()));
    }
}
