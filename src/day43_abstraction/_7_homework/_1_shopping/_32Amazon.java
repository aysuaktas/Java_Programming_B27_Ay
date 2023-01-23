package day43_abstraction._7_homework._1_shopping;

import day43_abstraction._7_homework._1_shopping._31OnlineShopping;

public final class _32Amazon extends _31OnlineShopping {

    @Override
    public void buyItem() {
        System.out.println("Buying this item on Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning this item to Amazon");
    }

    @Override
    public boolean payForShipping() {
        return false;
    }

    @Override
    public void viewCart() {
        System.out.println("Ready to checkout");
    }
}
