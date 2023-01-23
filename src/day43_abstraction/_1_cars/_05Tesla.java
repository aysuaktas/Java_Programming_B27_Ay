package day43_abstraction._1_cars;

import day43_abstraction._1_cars._04ElectricCar;

public class _05Tesla extends _04ElectricCar { // extends _04ElectricCar dedik. _04ElectricCar bir abstract class. _05Tesla ise concrete class, and subclass of _04ElectricCar, there is only one concrete of it. O yuzden ondaki tum methodlari kullanmamiz gerek bunda.



    @Override
    public void start() {
        System.out.println("Key car near by starting car");
    }

    @Override
    public void charge() {
        System.out.println("at tesla charging station");
    }
}

// Tesla is a _04ElectricCar
// Tesla is a _01Car
// Tesla is an Object ((cunku Object is the parent class of all classes))
