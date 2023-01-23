package day38_encapsulation._06_bank;

public class _10BankAccount {

    // goal :  make fill will be read-only --> yani you can't change information. Information'i alabilirsin ama information degistiremezsin. Amacimiz bu, bu class'ta. Bunu yapmak icin -> getters method kullanip setters method kullanmayacagiz

    private long accountNumber;
    private double balance;


    // Altta Getter method'u olusturduktan sonra geldik constructor'umuzu olusturuyoruz:
    public _10BankAccount(long accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    // Getter methods:
    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // there is no setters methods here, so you can never change the values. -> It is always fix.


}
