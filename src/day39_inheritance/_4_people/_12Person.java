package day39_inheritance._4_people;

public class _12Person {

    String name;
    int age;
    // Each person'un sahip oldugu bir iki variable yazalim dedik

    /*  First way buydu _13Employee class'inda yazdigimi icin:

    public _12Person(){

    }  --> Ama bunu yapinca deger vermemis oldum. O yuzden ikinci yol ile yapip argument girdim _13Employee class'inda
     */


    public _12Person(String name, int age) {
        // super() --> calls the parent constructor
        this.name = name;
        this.age = age;
    }
}
