package day36_custom_classes.food1;

public class _01Food {

        /*
        create a class called Food

        - data:
            name, quantity, unit price, total price
        */

    String name;
    int quantity;
    double unitPrice;
    double totalPrice;


        /*
        - constructor

            - create a constructor that creates a Food object with the name

            - create a constructor that creates a Food object with the name and quantity

            - create a constructor that creates a Food object with the name, quantity, and unit price
            	-> call calculatePrice() method here
        */

    public _01Food(String name){
        this.name = name;
    }

    public _01Food(String name, int quantity){
        this(name);   // chaining
    //  this.name = name;   -> chaining kullanmak istemezsen second way
        this.quantity = quantity;
    }

    public _01Food(String name, int quantity, double unitPrice){
        this(name, quantity);
   //   this.name = name;
   //   this.quantity = quantity;
        this.unitPrice = unitPrice;
        calculatePrice();  // method'u constructor icinde cagirdik. Cunku; ((Zeynep'in aciklamasi: Direkt constructor icinde istedigimiz method calisiyor, tekrar method cagirmaya gerek yok diye, sanirim))
    }


        /*
        - method:

        	- calculatePrice(): multiple the quantity by unit price and assign the value to the total price

            - toString()
                print all the Food information
         */

    // calculatePrice():
    public boolean calculatePrice(){

        if(quantity <= 0 || unitPrice <= 0){   // quantity ve unit price yoksa it will return false. quantity zero ise mesela vs, I cannot calculate price --> == demistik ama negatif numbers da sayilmaz, o yuzden <= olarak degistirdik
            return false;  // total price was not calculated
        }
        totalPrice = unitPrice * quantity;
        return true;    // quantity ve unit price varsa it will return true
    }


    // toString():

    public String toString(){

        String str = "Name: " + name;

        if(quantity != 0) {
            str += ", quantity: " + quantity;
        }

        if(unitPrice != 0) {
            str += ", unit price: $" + unitPrice;
        }

        if(totalPrice != 0){
            str += ", total price: $" + totalPrice;
        }

        return  " < " + str + " > ";  // str is string that we are using to build up  --> normalde bunu sadece return str diye yaptik. Sadece _02Kitchen class'inda run edince daha duzenli dursun diye sonradan < ve > ekledik ki her birini ayirmis olduk.
    }


        /*
        Create a separate class to create and test the Food objects

    	try making an array of Food objects
    	find all the Food objects that start with 'a' and print the whole information
    	find all the Food objects that have a total price over 20 and print the name of the food
         */

}
