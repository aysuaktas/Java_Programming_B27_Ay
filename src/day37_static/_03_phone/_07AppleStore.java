package day37_static._03_phone;

public class _07AppleStore {

    public static void main(String[] args) {

        _06IPhone iphone1 = new _06IPhone("IPhone X", "Black", 1000, 256);  // onceki class'ta constructor olusturdugumuz icin burada bu degerleri verebildik
        System.out.println(iphone1);

        /* Console'da
        STATIC BLOCK RUN
        CONSTRUCTOR RUN
        _06IPhone{model='IPhone X', color='Black', price=1000.0, storage=256}
         */

        // Run edince once static block'u run etti ki digerlerini de run edebilsin.
        // Run edince sadece instance variables'i run etti cunku _06IPhone class'inda kullandigimiz toString() sayesinde onlari hashcode olmadan gorebiliyoruz ve toString() methodu da instance method'u oldugu icin static olanlar run olmadi.


        System.out.println(_06IPhone.brand);  // bu sekilde class'tan cagiriyoruz static'i. --> // we could use the object to access to static variables, but better to use the class name
        System.out.println(_06IPhone.os);

        /* Bunlari da ekleyince console'da
        STATIC BLOCK RUN
        CONSTRUCTOR RUN
        _06IPhone{model='IPhone X', color='Black', price=1000.0, storage=256}
        Apple
        IOS
         */


        _06IPhone iphone2 = new _06IPhone("IPhone 7", "Silver", 1000, 256);
        System.out.println(iphone2);

        /* Run edince console'da STATIC BLOCK tekrar run olmadi, cunku o basta ve sadece bir kez run olur. So, console'da:
        CONSTRUCTOR RUN
        _06IPhone{model='IPhone 7', color='Silver', price=1000.0, storage=256}
         */


    }
}
