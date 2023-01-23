package day42_abstraction._2_exercise;

public class _06Running extends _05Exercise {   // extends _05Exercise ekledik buraya

    @Override
    public void perform(){    // no argument
        System.out.println("We are running");
    }


    @Override
    public void getCaloriesBurned(int minutes){  // Kizlarla::: int minutes'i variable olarak declare etmedik basta, nasil parantez icinde kullanabiliyoruz? Method oldugu icin, constructor degil ya o nedenle
        System.out.println(minutes * 0.35);
    }

}

/*

    Running is an Exercise
    Running is non-abstract (normal class)
    Running is the first non-abstract class it is the concrete class

    Concrete classes must implement(override) all the abstract methods
 */