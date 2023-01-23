package day49_functional_interface;

import java.sql.Wrapper;

public class _10TestGeneral {

    public static void main(String[] args) {

        _09GeneralInterface<Integer> validYear = (year) -> {
            // (( generic type = all Object type. Yani directly primitive datatypes olarak kullanamiyoruz, ama primitive olanlari kullanmak istiyorsak onu Wrapper class olarak kullanabiliyoruz -> mesela bu ornekte int yerine Integer kullanmamiz gibi))

            if (year >= 0 && year <= 2022) {
                System.out.println(year + " is valid");
            } else {
                System.out.println(year + " is not a valid year");
            }
        };

        // let's do another function that also works in any type. Let's say I want to do it a String. T could be any type, so I can work with String too. Because I can work with ANY OBJECT TYPE in generics

        _09GeneralInterface<String> eachChar = (str) -> {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        };

        validYear.test(2001);   // 2001 is valid
        eachChar.test("hello world");  // bu her bir karakteri alt alta -> h e l l o   w o r l d  olarak print edecek



    }
}
