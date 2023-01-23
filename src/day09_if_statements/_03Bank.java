package day09_if_statements;

public class _03Bank {

    public static void main(String[] args) {

        double balance = 1_000_000;
        double amountToWithdraw = 1_500_000;

        /*
        bu amountToWithdraw degeri 500_000 iken console'da;
        Withdraw: 500000.0
        Account balance is: 500000.0 olarak gozukuyordu.
        Bu degeri 1_500_000 olarak degistirince console'da cikan:
        Withdraw: 1500000.0
        Overdraft penalty
        Amount due: 375000.0
         */

        balance -= amountToWithdraw;  // balance = balance - amountToWithdraw;
        System.out.println("Withdraw: " + amountToWithdraw);

        if(balance >= 0){
            System.out.println("Account balance is: " + balance);
        }

        if(balance < 0){
            System.out.println("Overdraft penalty");
            System.out.println("Amount due: " + amountToWithdraw * 0.25);
        }


    }
}
