package day09_if_statements;

public class _02SingleIfExample {

    public static void main(String[] args) {

        if (true) {
            System.out.println("Hello");
        }                                         // bunu run edince console'da Hello cikiyor. true olan will always print.

        if (false) {
            System.out.println("Bye");
        }                                         // bunu run edince console'da bu cikmiyor, bunu atlayip bundan sonra bir sey varsa ona geciyor.Cunku bu false. The boolean was false,this will NOT run. Eger false yerine true yazsaydi bunu da console'da run edecekti. False olan will not print, bundan sonra ne varsa ona gecer print etmek icin. // Saim, mantigi anlamamiz icin gosterdi bunu, hep bunu yapmayacagiz zaten logical olmaz :D
        /*
         Syntax of single if statement bu:
          if(Condition){
            Statements
        }
        Bunu degistiremezsin. Mesela if(Condition); seklinde yaparsan bunu normal bir statement olarak alir ve orada false yazmasina ragmen Bye'i print ederdi.
         */

        System.out.println("break"); // this is normal print statement, not part of any if

        System.out.println("------------------------"); // alistirmalari ayirmak icin koydum

        int year = 2020;  // bu 2022 olunca run olmadi cunku statement false oldu -> 2020 veya 2021 olmadigi icin. // 2020 yapinca statement dogru, bu sefer run etti.

        if (year == 2020 || year == 2021) {
            System.out.println("Stay home");
            System.out.println("Wash your hands");
            System.out.println("Social distance");
        }

        System.out.println("------------------------"); // alistirmalari ayirmak icin koydum

        double price = 39.99;  // bu 9.99 olunca statement false oldugu icin run olmadi bu kisim. Bunu 39.99 yapinca -> 39 >= 20 true oldugu icin run oldu.
        if (price >= 20) {
            System.out.println("Free shipping");
        }


    }
}