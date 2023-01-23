package day06_operators;

public class Store {

    public static void main(String[] args) {

        int numberOfItems = 0;  // todo: practice --> bu variable'lara 0 assign ettik
        double price = 0.0;

        System.out.println("Go and pick up some coffee");
        System.out.println("Items in the cart: " + ++numberOfItems); // we added a coffee to our cart -> pre-increment -> it is 1. todo: ... + ++variableName
        price += 3.55;  // price = price + 3.55 yazmanin kisa yolu bu

        System.out.println("Go pick some oat milk");
        System.out.println("add 1 gallon of oat milk " + ++numberOfItems);  // pre increment. --> numberOfItems bir usttekinde 1'di, simdi 2 oldu
        System.out.println("add 1 gallon of oat milk " + ++numberOfItems);  // pre increment --> 3
        price += 5.99;  // price = price + 5.99 demenin kisa yolu // toplam 2 gallon oat milk fiyati gibi yazdik bunu

        System.out.println("Your total is $" + price);

    }
}
