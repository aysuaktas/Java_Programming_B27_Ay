package day39_inheritance._3_access.b;

public class _11RunnerB {


    public static void main(String[] args) {

        // Q: What does _10TownHouse inherit from _07House?
        // these are in different packages

        _10TownHouse house = new _10TownHouse();
        house.address = "123134 road";  // public String address idi bu _07House package'inda.

       // house.city = "Fairfax";  // --> not accessible outside the package. -->  I don't have access because I'm in a different package ve inherited yapmadim yani bu child class degil.

        // house.state;  // -> state has default access modifier, so only accessible in the same package

        // house.zipcode;  // -> zipcode is private, so only accessible in the same class

    }
}