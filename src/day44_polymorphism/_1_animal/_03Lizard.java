package day44_polymorphism._1_animal;

import day44_polymorphism._1_animal._02Reptile;

public class _03Lizard extends _02Reptile {  // extends _02Reptile ekledik, subclass of _02Reptile oldu bu

    // Lizard = kertenkele demek

    public void eat(){
        System.out.println("Eating from LIZARD");
    }

}
