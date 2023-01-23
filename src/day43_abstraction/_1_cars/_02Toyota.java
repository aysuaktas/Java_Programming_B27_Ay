package day43_abstraction._1_cars;

import day43_abstraction._1_cars._01Car;

public class _02Toyota extends _01Car {  // extends _01Car'i ekledik

    // right click -> Generate -> Implement Methods... yazani sectik, bunda abstract method'lari gorebiliriz:

    @Override
    public void start() {
        System.out.println("turning the key to start");
    } // bu method'un taslagini right click -> Generate -> Implement Methods kismindan tiklayip yaptik, sadece print statement'i kendimiz ekledik.

}

    // overloading the class to have another way to use it mumkun bunda da. Yani start method'unu degistirmiyoruz ama another way to use it dersek overloading yapabiliriz. Mesela alttaki gibi int a parameter'i vermek, buna overloading yapmanin bir yolu olurdu:

    /*
    public void start(int a){

    }

    // Bu sekilde overload edebilir miyiz mesela? CAN YOU OVERLOAD? YES.
     */


