package day39_inheritance._1_pizza;

import day39_inheritance._1_pizza._01Pizza;

public class _02Mall {

    public static void main(String[] args) {

        // make an object:
        _01Pizza pizza1 = new _01Pizza("medium", 2);
        System.out.println(pizza1);  // Size: medium, numberOfToppings: 2, total price: 7.5

        // let's do another pizza object -> pizza2
        _01Pizza pizza2 = new _01Pizza("large", -3);  // invalid numberOfToppings verdik
        System.out.println(pizza2.getSize());  // large
        System.out.println(pizza2.getNumberOfToppings());   // 0

        // another object:
        _01Pizza pizza3 = new _01Pizza("extra large", 3);  // extra large -> valid bir size degil
        System.out.println(pizza3.getSize());  // null
        System.out.println(pizza3.getNumberOfToppings());   // 3

        pizza3.setSize("large");
        System.out.println(pizza3.getSize());  // large


        // Array:
        _01Pizza[] pizzas = {pizza1, pizza2, pizza3};  // We are doing our objects from _01Pizza class. O yuzden onu kullandik bu kalipta da  --> // ArrayList<Pizza>

        for(_01Pizza each: pizzas){
            System.out.println(each.getSize());
        }

        /* for each loop'u run edince console'da:
        medium
        large
        large
         */


    }
}
