package day38_encapsulation._06_bank;

public class _11TestBank {

    public static void main(String[] args) {

        _10BankAccount account1 = new _10BankAccount(2132215515L, 12312312);

//        account1.balance = 100000;
//        account1.setBalance(100000);
        // balance is private and there is no setter method, so I can't change the values

        System.out.println(account1.getAccountNumber());  // 2132215515

        System.out.println(account1.getBalance()); // 1.2312312E7


    }
}

