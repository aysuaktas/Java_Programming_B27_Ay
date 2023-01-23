package day38_encapsulation._09_homework_pizza;

import day38_encapsulation._09_homework_pizza._16Pizza;

public class _17TestingPizza {

    public static void main(String[] args) {

        _16Pizza pizza1 = new _16Pizza("mega");

        //  pizza1.size;  //  I cannot call private variable like this. So;

        System.out.println(pizza1.getSize());  // null  --> because it is not small || medium || large
        System.out.println(pizza1);  // Pizza{size='null', numberOfToppings=0, costOfPizza=0.0}



        _16Pizza pizza2 = new _16Pizza("small");

        System.out.println(pizza2.getSize());  // small
        System.out.println(pizza2); // Pizza{size='small', numberOfToppings=0, costOfPizza=0.0}


        pizza2.setNumberOfToppings(1);
        System.out.println(pizza2.getNumberOfToppings());  // 1
        System.out.println(pizza2);  // Pizza{size='small', numberOfToppings=1, costOfPizza=0.0}
        System.out.println(pizza2.calculatePrice()); // 4.75

        // if we reassign the number of toppings:
        pizza2.setNumberOfToppings(2);
        System.out.println(pizza2.getNumberOfToppings());  // 2
        System.out.println(pizza2.calculatePrice());  // 5.5
        System.out.println(pizza2);  // Pizza{size='small', numberOfToppings=2, costOfPizza=5.5}





    }
}
