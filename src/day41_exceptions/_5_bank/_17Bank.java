package day41_exceptions._5_bank;

public class _17Bank {

    double balance;

    public void withdraw(double amount){

        if(amount > balance){
            throw new _18NotEnoughMoneyException();
        }

        balance -= amount;
        System.out.println("Money withdrawn");
    }


}
