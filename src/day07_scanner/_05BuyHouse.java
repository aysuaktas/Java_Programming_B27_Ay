package day07_scanner;

public class _05BuyHouse {

    /*
     declare and assign a credit score variable
     declare and assign a salary

     determine if you can get a loan to buy a house
     there is two ways to get a loan:
        credit score of 720 or above and salary of 100,000 or above
        credit score of 740 or above and salary of 80,000 or above
     */

    public static void main(String[] args) {

        int creditScore = 720;  // benim kredi skorumun by oldugunu varsayalim.
        int salary = 80_000; // normalde money related issues'ta double kullaniyoruz ama hoca bu seferlik boyle yapti // benim salary'min bu oldugunu varsayalim, rastgele deger atadik.

        // Logical operators:
        //    &&  and
        //    ||  or
        //    !   not

        boolean option1 = creditScore >= 720 && salary >= 100_000;
        boolean option2 = creditScore >=740 && salary >= 80_000;
        // karsilastirmak daha kolay olsun diye boolean kullanmis

        boolean canGetLoan = option1 || option2;  // getting a loan icin option1 OR option2 demek bu.

        System.out.println("canGetLoan = " + canGetLoan);

    }
}
