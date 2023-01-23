package day37_static._04_car;

import java.sql.Driver;

public class _10Street {

    public static void main(String[] args) {

        _09Car bmw = new _09Car("X5", "James", 31283284, 'C');
        System.out.println(bmw.driver);
        System.out.println(bmw.driver.name);
        System.out.println(bmw.model);  // this is accessing instance variable


        // Merve'nin eklemesi:
        //if you wanted to use the overloaded constructor; you would need to make it separate driver object first here, then call this constructor with passing that driver there.

        // Merve'nin eklemesi:
        _08Driver driver2 = new _08Driver("John",632899,'D');
        _09Car audi = new _09Car("A6",driver2);
        System.out.println(audi.driver);
        System.out.println(audi.driver.name);

    }
}
