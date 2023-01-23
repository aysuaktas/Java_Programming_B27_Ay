package day45_polymorphism._1_building;

public abstract class _01Building {


    // Abstract class olunca iki sey oluyor -> 1) I can not instantiate of this class yani bundan object olusturamam. 2) I can use the abstract methods.

    String location;
    double price;

    public _01Building(String location, double price){
        this.location = location;
        this.price = price;
    }

    public abstract void pay();   // implementation of this will be coming in next classes

    public String toString(){
        return "Location: " + location + ", price: " + price;
    }  // bunu manually yazdik Generate uzerinden automatically degil

}

 /*
    Create an abstract class Building

    create instance variables:
        String location
        double price

    create abstract methods:
        void pay()

    create a constructor to assign the location & price

    override the toString to print the location & price
     */