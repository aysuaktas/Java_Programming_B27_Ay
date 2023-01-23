package day41_exceptions._2_hiding;

public class _06Second extends _05First {  // extends _05First yaptik


    //  @Override  --> bu hata verir cunku static method'lari override edemeyiz
    public static void staticMethod(){  // _05First olan parent class'ta da vardi. Static method, method hiding bu, overriding degil. Print statement'imiz farkli ama, onda First yaziyordu, bunda Second. Farkli bir method bu artik
        System.out.println("Static method from Second");
    }

    // yeni bir instance method olusturalim.
    public void instanceMethodB(){
        staticMethod();  // instanceMethodA'da da cagirdigimizin aynisini cagiriyoruz  --> // calls the closest method, which is line 7 method in this class
    }

    // Hangi class'taysam the closest one'i cagirir. O yuzden _05First class'inda cagirinca o class'taki static methodu cagiracak instanceMethodA. Ama bu class'ta bu classs'in static methodunu cagiracak instanceMethodB.

}
