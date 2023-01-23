package day35_custom_classes.traffic1;

public class _01TrafficLight {


    // Constructor konusuna basladikkkk! :
    // Bu class'takini _02Road class'inda run edecegiz.

    String color;   // instance variable. Sadece renk istiyorum ben dedik burada

    public _01TrafficLight(String inputColor){    // Burada constructor olusturduk   // Ustteki String color oldugu icin, orada color yazarken burada da yazamam! inputColor dedik mesela buna da  --> parantez icindeki String inputColor is a parameter. Declare ediyoruz, bir deger yok.

        boolean isValid = inputColor.equalsIgnoreCase("red") || inputColor.equalsIgnoreCase("yellow") || inputColor.equalsIgnoreCase("green");  //biri Road class'inda baska renk vermeye calisirsa false versin diye boolean yaptik bunu. Ignore case yaptik, case sensitivity fark etmez -> Eger Road class'inda baska bir color yazilirsa console'da null cikacak

        if(isValid) {
            color = inputColor;  // Road class'inda bir renk girilirse bu benim bu class'ta olusturdugum color'a esit olsun dedik
        }

    }


}
