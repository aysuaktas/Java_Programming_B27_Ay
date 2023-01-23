package day34_custom_classes.student1;

public class _01Student {


    // Once method olusturmadan objects yazmak istedik


    // instance variables:
    String name;
    int batchNumber;
    String program;
    double grade;
    // these are instance variables --> instance: is an object (and object is an instance) --> //  instance variable --> is the variable defined in a class (it is inside the curly bracket of a class, not belonging to any other code block, like a method). Every object has a copy of these variables


    // Simdi bununla iliskili bir class actik -> _02School class'i


    public void study(){
        System.out.println(name + " is studying");  // hangi ismi girersek o calisiyor diyecek bu. Ama main method bunda yok, _02School olan class'ta cagiracagiz bunu
    }


}
