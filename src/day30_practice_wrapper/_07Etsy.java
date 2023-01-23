package day30_practice_wrapper;

public class _07Etsy {

    public static void main(String[] args) {

        String s = "Item(s) total: $144.99";
        double price = Double.parseDouble(s.split(" ")[2].substring(1)); // [2] yani 2.index'te fiyat ile ilgili kisim var, price variable'i icin onu ele aldik o yuzden. Dollar sign'i ($) ignore etmek icin substring(1)den baslattik.
        System.out.println(price);  // 144.99

        if(price >= 100){
            System.out.println("Check if shipping is free");
        }


    }
}
