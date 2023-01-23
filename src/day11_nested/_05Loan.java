package day11_nested;

public class _05Loan {

    /*
    create a class Loan

    declare and assign a credit score variable
    try to use ternary to determine of you are eligible for a loan
    you are eligible if you have a credit score of 700 or above

    if you are eligible print "loan approved"
    otherwise print "loan rejected. Sign up for our credit program"
     */

    public static void main(String[] args) {

        // ternary example  --> tum o if'leri tek tek yazmadan hizlica yapabildik, bazi durumlarda ternary cok pratik oluyor!

        double creditScore = 800;
        System.out.println(creditScore > 700 ? "Loan approved" : "Loan rejected. Sign up for our credit program");  // first method

        // second method is:
        // String result = creditScore > 700 ? "Loan approved" : "Loan rejected. Sign up for our credit program";
        // System.out.println(result);


        /* Ternary'de;
        About the boolean ->  is true or false,  (credit score > 700 -> bu ornekte boolean bu. Degeri 800 verince bu dogru, o yuzden ilk expression gecerli olur ve consola'da Loan approved yazar.

         Cunku, if the boolean is true,
        : dan onceki kismi aliyoruz.

        If the boolean is false,
        : dan sonraki kismi aliyoruz.

        ? if
        : else
         */


    }
}
