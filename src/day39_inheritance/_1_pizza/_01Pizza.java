package day39_inheritance._1_pizza;

import day38_encapsulation._09_homework_pizza._16Pizza;

public class _01Pizza {

    // Homework'tu, yaptim dun ama Saim ile tekrar yazdim bunda, fark var, bak:

      /*
    create a class called Pizza
        - data:
            size (String), number of toppings
       */

    private String size;
    private int numberOfToppings;

    /*
    constructor
            - create a constructor that creates a Pizza object with the length and the width
                - call setters here
     */

    public _01Pizza(String size, int numberOfToppings){
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }


    /*
    - encapsulate the Pizza class

        	- setter condition:
        		size can only be:
        			small, medium, or large

        		number of toppings must be a positive number
     */

    // encapsulation --> getters & setters:


    // getter method for the size:
    public String getSize() { // private String size icin yapiyoruz bunu, String oldugu icin String return type
        return size;
    }

    // setter method for the size:
    public void setSize(String size){   // parameters faydali olacak small, medium, large elde etmek icin
        if(size.equals("small") || size.equals("medium") || size.equals("large")){ // equals yerine equalsIgnoreCase de olur ama Saim bu sefer bunu yapmak istedi
            this.size = size;
        }
    }

    // getter method for numberOfToppings:
    public int getNumberOfToppings(){
        return numberOfToppings;
    }

    // setter method for numberOfToppings:
    public void setNumberOfToppings(int numberOfToppings){
        if(numberOfToppings > 0){   // number of toppings must be a positive number dedigi icin. Saim >= 0 yapti ama yani normalde > 0 olmali positive dedigi icin ama Saim what if sonradan 0 toppings yapmak istersek ne olacak? dedi, onu da ekledi. Negatif degil sonucta, ona takilmayin su an dedi :D
            this.numberOfToppings = numberOfToppings;
        }
    }


    /*
    other methods:
            - calculatePrice()
            		calculate the price of the pizza based on:

            			small base: $4
            			medium base: $6
            			large base: $8

            			each topping adds $0.75 to the price

            			calculate the total price and return the cost
     */

    public double calculatePrice(){

        if(size != null){
            return (size.equals("small") ? 4 : size.equals("medium") ? 6 : 8) + numberOfToppings * 0.75;    // daha readable olmasi icin parantez koyduk. Ternary ile yaptik
        }

        return -1; // return -1 if the size was not assigned --> if sth does not exist, it will return -1. Just a random member that we choose. 0 secmek mantikli degil o yuzden -1 seciyorum dedi.
    }

    /*
     toString()
                print the size, number of toppings, and cost of the pizza
     */

    public String toString(){
        return "Size: " + size + ", numberOfToppings: " + numberOfToppings + ", total price: " + calculatePrice();
    }   // elimizle yazdik bunu, otomatik tiklamadik.


    /*
     Create a separate class to create and test the Pizza objects
     */
    // --> Bunun icin bir sonraki _02Mall class'i var
}
