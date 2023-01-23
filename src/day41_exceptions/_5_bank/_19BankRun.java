package day41_exceptions._5_bank;

public class _19BankRun {

    public static void main(String[] args) {

        _17Bank obj = new _17Bank();  // _17Bank'in object'ini yaptik
        obj.balance = 3000;

        obj.withdraw(2000);
        System.out.println(obj.balance);

        /* Print edince:
        Money withdrawn
        1000.0
         */

        obj.withdraw(2000);   // ama elimizde 1000 kalmisti, ondan da 2000 cikarirsak negatif sayi oluyor -> _18NotEnoughMoneyException aldik. (( _18 kismibenim class ismimden kaynakli tabii)

        /* Son obj.withdraw(2000) ekledigimizden sonra tekrar run edersek:

        Money withdrawn
        1000.0
        Exception in thread "main" day41_exceptions._5_bank._18NotEnoughMoneyException: Not enough money in the account
	        at day41_exceptions._5_bank._17Bank.withdraw(_17Bank.java:10)
	        at day41_exceptions._5_bank._19BankRun.main(_19BankRun.java:18)
         */

    }
}
