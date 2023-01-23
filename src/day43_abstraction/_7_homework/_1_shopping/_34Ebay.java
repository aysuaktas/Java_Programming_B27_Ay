package day43_abstraction._7_homework._1_shopping;

import day43_abstraction._7_homework._1_shopping._31OnlineShopping;
import day43_abstraction._7_homework._1_shopping._33AllowUsersToSell;

public final class _34Ebay extends _31OnlineShopping implements _33AllowUsersToSell {

    @Override
    public void buyItem() {
        System.out.println("Buying this item on Ebay");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning this item to Ebay");
    }

    @Override
    public boolean payForShipping() {
        return false;
    }

    @Override
    public void viewCart() {
        System.out.println("Viewing items in the cart");
    }

    @Override
    public void uploadProduct() {
        System.out.println("Uploading this item for sale");
    }
}
