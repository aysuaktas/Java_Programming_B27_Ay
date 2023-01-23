package day35_custom_classes.carpet2;

public class _04Store {

    public static void main(String[] args) {

        // bunda _03Carpet class'ini cagiracagiz

        _03Carpet kover = new _03Carpet(12.5, 35, 12.99, false);   // width = 12.5   length = 35   unit price = 12.99    isPersian ((boolean)) = false diyelim -> isPersian false oldugu icin if statement'i execute etmeyecek yani totalPrice'a 200 dolar falan eklemeyecegiz
        System.out.println(kover);  // _03Carpet{width=12.5, length=35.0, unitPrice= $12.99, Regular carpet , totalPrice= $5683.125}

        _03Carpet persian = new _03Carpet(12.5, 35, 12.99, true); // ustteki ornekle ayni degerleri girdik ki bir degisiklikle farki gorelim --> farkli olarak sadece isPersian'a true dedik, boylece _03Carpet class'indaki if statement execute edilecek ve totalPrice'a 200 daha eklenecek

        // persian.calculatePrice(); // da diyebilirim burada ama constructor benim icin cagirirken neden yapayim ki??

        System.out.println(persian);  // _03Carpet{width=12.5, length=35.0, unitPrice= $12.99, Persian carpet , totalPrice= $5883.125}


        // I can change the variable:
        persian.width = 16.5;
        System.out.println(persian);  // bunu yazinca width degeri degisti ama totalPrice ayni kaldi --> _03Carpet{width=12.5, length=35.0, unitPrice= $12.99, Persian carpet , totalPrice= $5883.125}

        // Variable degisince totalPrice'i da degistirmek icin persian.calculatePrice(); yapmamiz gerekiyor variable'i degistirdikten sonra, print etmeden once:
        persian.width = 16.5;
        persian.calculatePrice();
        System.out.println(persian);  // _03Carpet{width=16.5, length=35.0, unitPrice= $12.99, Persian carpet , totalPrice= $7701.725}  --> bunda totalPrice da degismis oldu



    }
}
