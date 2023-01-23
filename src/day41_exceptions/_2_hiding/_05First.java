package day41_exceptions._2_hiding;

public class _05First {


    // static method:
    public static void staticMethod(){
        System.out.println("Static method from First"); // static method from the _05First class anlaminda yazdik
    }


    // instance method
    public void instanceMethodA(){
        staticMethod();  // calls the closest method, which is line 7 method in this class
    }

}
