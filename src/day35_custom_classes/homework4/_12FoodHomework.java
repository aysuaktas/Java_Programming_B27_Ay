package day35_custom_classes.homework4;

public class _12FoodHomework {

    /*
     create a class called Food
        - data:
            name, quantity, unit price, total price

        - constructor:
            - create a constructor that creates a Food object with the name, quantity, and unit price
                -> call calculatePrice() method here

        - method:
            - calculatePrice(): multiple the quantity by unit price and assign the value to the total price

            - toString()
                print all the Food information

    Create a separate class to create and test the Food objects
     */

    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public _12FoodHomework(String name, int quantity, double unitPrice){     // TODO: double totalPrice'i buraya yazmadim cunku asagida calculatePrice methodu ile ayri hesaplayacagim onu. Ama buraya yazmamama ve ayri print etmeme ragmen food deyince o da eklendi console'a
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;

        calculatePrice();
    }

    public void calculatePrice(){   // calculatePrice(): multiply the quantity by unit price and assign the value to the total price
        totalPrice = quantity * unitPrice;
    }

    @Override
    public String toString() {
        return "Food{" +          // _12FoodHomework{'u Food{ olarak degistirdim
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice= $" + unitPrice +     // $ isaretini ben ekledim
                ", totalPrice= $" + totalPrice +   // $ isaretini ben ekledim
                '}';
    }
}
