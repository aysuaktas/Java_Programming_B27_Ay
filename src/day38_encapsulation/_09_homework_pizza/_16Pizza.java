package day38_encapsulation._09_homework_pizza;

public class _16Pizza {

    /*
    create a class called Pizza

        - data:
            size (String), number of toppings

        - constructor
            - create a constructor that creates a Pizza object with the length and the width

            	call setters here

        - encapsulate the Pizza class

        	- setter condition:
        		size can only be:
        			small, medium, or large

        		number of toppings must be a positive number

        - other methods:

            - calculatePrice()
            		calculate the price of the pizza based on:

            			small base: $4
            			medium base: $6
            			large base: $8

            			each topping adds $0.75 to the price

            			calculate the total price and return the cost

            - toString()
                print the size, number of toppings, and cost of the pizza

    Create a separate class to create and test the Pizza objects
     */

    private String size;
    private int numberOfToppings;

    double costOfPizza;


    //
    public _16Pizza(String size) {  // int numberOfToppings'i de ekle, unutmusum
        this.numberOfToppings = numberOfToppings;
        setSize(size);  // we are calling setter method here
        setNumberOfToppings(numberOfToppings);  // we are calling setter method here
    }

    // getter methods:
    public String getSize() {
        return size;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    // setter condition: size can only be: small, medium, or large. number of toppings must be a positive number olarak verilmis.
    // setter methods:
    public void setSize(String size) {
        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) {   // setter condition: size can only be: small, medium, or large
            this.size = size;
        }
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings > 0) {    // setter condition: number of toppings must be a positive number
            this.numberOfToppings = numberOfToppings;
        }
    }


    /*
    calculatePrice() method:
            		calculate the price of the pizza based on:

            			small base: $4
            			medium base: $6
            			large base: $8

            			each topping adds $0.75 to the price

            			calculate the total price and return the cost

     */

/*
    public double calculatePrice() {
        costOfPizza = 0;
        if (size == "small") {
            costOfPizza += 4;
        } else if (size == "medium") {
            costOfPizza += 6;
        } else if (size == "large") {
            costOfPizza += 8;
        }
        costOfPizza += numberOfToppings * 0.75;

        return costOfPizza ;
    }
    // Bunda sonuc cikti ama size bir String oldugu icin == ile degil equals veya equalsIgnoreCase ile yapmam gerekiyor bunda da.
 */


    public double calculatePrice(){
        costOfPizza = 0;
        if (size.equalsIgnoreCase("small")){
            costOfPizza += 4;
        } else if (size.equalsIgnoreCase("medium")){
            costOfPizza += 6;
        } else if (size.equalsIgnoreCase("large")){
            costOfPizza += 8;
        }

        costOfPizza += numberOfToppings * 0.75;

        return costOfPizza;
    }




    /* Merve'nin calculatePrice() methodu:
    public double calculatePrice(){
        costOfPizza = 0;
        if (size.equalsIgnoreCase("small")){
            costOfPizza += 4;
        } else if (size.equalsIgnoreCase("medium")){
            costOfPizza += 6;
        } else if (size.equalsIgnoreCase("large")){
            costOfPizza += 8;
        }
        return costOfPizza += numberOfToppings * 0.75;
    }
     */



        // toString() method:  (print the size, number of toppings, and cost of the pizza)

        @Override
        public String toString () {
            return "Pizza{" +
                    "size='" + size + '\'' +
                    ", numberOfToppings=" + numberOfToppings +
                    ", costOfPizza=" + costOfPizza +
                    '}';
        }
    }

