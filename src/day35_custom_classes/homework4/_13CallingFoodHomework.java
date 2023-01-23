package day35_custom_classes.homework4;

public class _13CallingFoodHomework {

    public static void main(String[] args) {

        _12FoodHomework food1 = new _12FoodHomework("Vegan ice cream", 3, 3.99);  // (String name, int quantity, double unitPrice){  sirasiyla yazdim  // double totalPrice'i buraya yazmadim cunku calculatePrice methodu ile ayri hesapladim onu. Ama buraya yazmamama ve ayri print etmeme ragmen food deyince o da eklendi console'a

        // Her methodu constructor icinde cagirmamiza gerek yok

        System.out.println(food1);  // Food{name='Vegan ice cream', quantity=3, unitPrice= $3.99, totalPrice= $11.97}

        _12FoodHomework food2 = new _12FoodHomework("French fries", 2, 5.50);
        System.out.println(food2);  // Food{name='French fries', quantity=2, unitPrice= $5.5, totalPrice= $11.0}



    }
}
