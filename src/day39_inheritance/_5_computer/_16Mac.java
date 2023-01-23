package day39_inheritance._5_computer;

public class _16Mac extends _15Computer {    //extends _15Computer ekledik. Sadece bunu ekledigimizde hata verdi -> There is no default constructor available diyor. Cunku default constructor'a uymuyor bu, let's do our constructor and add arguments yaparsak duzelecek

    /*
    public _16Mac(String os, int memory){
        super(os, memory);
    }
     */

    public _16Mac(int memory){
        super("IOS", memory);
    }  // Neden ustte String os'u sildi ama super() icine "IOS" yazdi? Zeynep'in aciklamasi: ustte direkt bilgiyi giriyor IOS yazarak. O yuzden local variable yazmasina gerek yok --> Cunku o bilgi hep ayni olacak Mac icin




}
