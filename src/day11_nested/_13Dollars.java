package day11_nested;

public class _13Dollars {

    public static void main(String[] args) {

        // 1 dollar and you get back change
        // the change will be in quarters, nickles, dimes, pennies // TODO: see this example again

        int money = 65;   // where 100 is 1 dollar
        int quarter = money / 25;
        money %= 25;    // money = money % 25;
        int dimes = money / 10;    //
        money %= 10;
        int nickles = money / 5;
        money %= 5;     // money remainder from 5
        int pennies = money;

        System.out.println("Change:");
        System.out.println(quarter + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickles + " nickles");
        System.out.println(pennies + " pennies");

        /*
        int money = 74 ise;
        Change:
        2 quarters
        2 dimes
        0 nickles
        4 pennies
         */




    }
}
