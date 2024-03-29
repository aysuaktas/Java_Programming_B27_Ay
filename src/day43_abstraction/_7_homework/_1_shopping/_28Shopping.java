package day43_abstraction._7_homework._1_shopping;

public abstract class _28Shopping {

    public abstract void buyItem();
    public abstract void returnItem();
}

/* Homework:

Create an abstract class Shopping
    - Declare two abstract methods:
        buyItem(), returnItem()

Create a concrete class Target
    - Make the class final
    - Inherit Shopping and implement all abstract methods

Create an interface Shipping
    - Declare an abstract methods:
        payForShipping(boolean)

Create an abstract class OnlineShopping
    - Inherits Shopping and implements Shipping
    - Does not need to implement any abstract method
    - Declare an abstract methods:
        viewCart()

Create a concrete class Amazon
    - Make the class final
    - Inherit OnlineShopping and implement all abstract methods

Extra:

Create an interface AllowUsersToSell
    - Declare an abstract method:
        uploadProduct()

Create a concrete class Ebay
    - Make the class final
    - Inherit OnlineShopping and implements interface AllowUsersToSell interface
    - Implement all abstract methods
 */
