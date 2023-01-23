package day37_static._01_bestbuy;

public class _02BestBuyStores {

    public static void main(String[] args) {

       //  _01BestBuy.location = "Fairfax"; // Bu calismiyor, neden? location is an instance variable, so we need an object in order to access the instance variable.

        _01BestBuy store1 = new _01BestBuy();
        store1.location = "Fairfax";
        System.out.println(store1.location);  // Fairfax


        // "hello world"; --> direkt boyle bir sey yazamayiz, hata verir.
       //  _01BestBuy.headquarters;  // Bu calismiyor, neden? Cunku bunda bir sey yok, kod falan yok, sadece String bu. Yani main method icinde bir yere print statement kullanmadan "hello world" yazarsak hata vermesiyle ayni sebepten aslinda. Print statement icinde yazabiliriz ama bunu:
        System.out.println(_01BestBuy.headquarters); // Richfield, Minnesota ---> this is a static variable, which means we can use the class name to access

        System.out.println(store1.headquarters); // Richfield, Minnesota --> instances(object) come from a class & static members belong to class. this is valid syntax, but you should use the class name to access, but instance references


        // other static members:
        System.out.println(Math.PI); // 3.141592653589793 // --> PI is static. --> PI dedigimiz pi sayisi. Tirnak isareti icinde yazilmamis. A fixed, known value, o yuzden static. Direkt sonucu belli.
        System.out.println(Integer.MIN_VALUE); // -2147483648 --> min value is also static

        // Arrays.sort();  // Parantez var, bir method ama hangisi? I am accessing by the class name, which means it is a static method. --> accessing static method from Arrays class



    }
}
