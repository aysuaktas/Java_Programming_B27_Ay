package day43_abstraction._1_cars;

import day43_abstraction._1_cars._02Toyota;
import day43_abstraction._1_cars._03BMW;
import day43_abstraction._1_cars._05Tesla;

public class _06Road {

    // running class bu.

    public static void main(String[] args) {

        _02Toyota car1 = new _02Toyota();
        _03BMW car2 = new _03BMW();
        _05Tesla car3 = new _05Tesla();

        car1.start(); // turning the key to start

        car2.start();  // pressing the button to start

        car3.start();  // Key car near by starting car
        car3.charge(); // at tesla charging station




    }
}
