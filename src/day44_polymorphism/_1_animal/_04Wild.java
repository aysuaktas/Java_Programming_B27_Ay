package day44_polymorphism._1_animal;

import day44_polymorphism._1_animal._01Animal;
import day44_polymorphism._1_animal._02Reptile;
import day44_polymorphism._1_animal._03Lizard;

public class _04Wild {

    public static void main(String[] args) {

        // Let's make lizard objects with all references:

        // Let's start with reference of itself:
        _03Lizard lizard1 = new _03Lizard();  // this is reference of itself, which means it has the same reference type with the object


        // reference of super class -> I have two. Bunun super class'i olan _02Reptile class'ini da kullanabilirim, _02Reptile class'inin super class'i oldugundan ve _02Reptile class'i kendi super class'indakilerden etkilendiginden -> burada _03Lizard class'i icin ikisini de kullanabiliriz.

        // reference of super class:
       _02Reptile lizard2 = new _03Lizard();  // _02Reptile reference for lizard object

        _01Animal lizard3 = new _03Lizard();  // Animal reference for Lizard object


        lizard1.eat();  // Eating from LIZARD
        lizard2.eat();  // Eating from LIZARD
        lizard3.eat();  // Eating from LIZARD

        // the reference needs visibility but the execution comes from the object side. Execution happens from the object side. O yuzden lizard object eat method'larimiz three times (3 kere) var. But the reference will not even compile if that reference does not access that method or that variable.  -->  the reference needs to have access to the field -but then execution happens on the object.

    }
}
