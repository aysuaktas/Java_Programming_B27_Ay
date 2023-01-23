package day43_abstraction._7_homework._1_shopping;

import day43_abstraction._7_homework._1_shopping._28Shopping;

public final class _29Target extends _28Shopping {

    @Override
    public void buyItem() {
        System.out.println("Buying this item at Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning this item to Target");
    }
}
