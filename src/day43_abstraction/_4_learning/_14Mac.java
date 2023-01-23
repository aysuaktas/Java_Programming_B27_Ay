package day43_abstraction._4_learning;

public interface _14Mac {


    // Mac bilgisayarinin sahip oldugu ve fixed olan ne var? Version olmaz mesela cunku fixed degil. Ama mesela fixed olarak: brand'i Apple.

    public static final String brand = "Apple";  // here, the keywords are grey because you don't need them, they come automatically, by default. Interface'da variables her zaman public static final olur cunku. Instance variables olmaz. O yuzden alttaki gibi sadece String os = "IOS"; yazmak da okay.


    String os = "IOS";  // public static final String os = "IOS"; ile ayni sey bu yazdigimiz, automatically geliyor cunku


    // brand and os are both public static final variables.
    // instance variables are not allowed in interface. ---> Cunku instance variables is =  not static. Ama interface'de methods static olmak zorunda.

    /* methods:
         in interface, you can define abstract methods (which are default), static, default
     */


    void turnOn();  // public abstract void turnOn();


    public static void getBrand(){  // public is grey ((color)) because everything is public by default  --> getBrand diye isimlendirdik ama bunun getter-setter method ile hicbir ilgisi yok
        System.out.println("The brand is Apple");
    }


    public default void typing() {

            // default allows us to create a method with implementation in the interface. It is NOT the default access modifier. This is an instance method for the class that implements.

            // it is not a static method --> default keyword is not access modifier. Access modifier olan default ile karistirma. default yazmadigimizda bu instance method olarak -> icine aciklama yazamiyorduk, sadece public void typing(); diye noktali virgulle bitirebiliyorduk. Sonra default kelimesini araya ekleyince artik " ; " olan kisim nedeniyle hata vermeye basladi, artik { } yapabildik ve icine yazi yazabildik:

        System.out.println("Typing on apple keyboard");
    }

}
