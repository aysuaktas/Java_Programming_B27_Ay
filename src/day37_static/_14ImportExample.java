package day37_static;

import java.util.Arrays;  // bu automatically geldi

import static java.lang.Math.*; // accessing all static members from this class, without the class name // manually yazdik bunu
    // Zeynep'in aciklamasi: bunu yazmak yerine ayri ayri tum math methodlari import static java.lang.Math.PI; VE import static java.lang.Math.abs; gibi. Sonuna tek tek PI veya abs falan yazmamak icin .* kullaniyoruz ki all static members'a access edebilelim --> class'i degil, o class'taki tum static member'lara erisebilme, onlardan cagirma bu

import static java.lang.Integer.*;  // manually yazdik bunu
import static java.util.Arrays.*;   // manually yazdik bunu


public class _14ImportExample {

    public static void main(String[] args) {

       // Math.PI;
       // Integer.MAX_VALUE;
            // Bunlari direkt boyle yazamayiz cunku hangi class'tan'lar? Bu class'ta yoklar. Hemen yukaruda import yazdik -> import static java.lang.Math.*; // bu sayede accessing all static members from this class, without the class name yapabiliyoruz

        System.out.println(Math.PI);  // 3.141592653589793  --> Merve/Zeynep'in aciklamasi: yukarida manual olarak import static java.lang.Math.*;'i import etmis olduk. Bu olmasa static bir sey cagirdigimiz icin class ismiyle cagirmak gerekirdi.
        System.out.println(Integer.MAX_VALUE);  // 2147483647


        System.out.println(PI);  // // 3.141592653589793
     //   System.out.println(max(4, 1));  // 4  --> method:  Math.max() -> cevabi 4'tu. Sonra java.lang.Integer'i da import edince hata gosterdi, o yuzden comment out yaptik  ---> You need to define the class
        System.out.println(abs(-6));   // 6 --> Math.abs()  --> abs denilen sey aslinda absolute value yani mutlak deger


        System.out.println(MAX_VALUE);  // 2147483647
        System.out.println(MIN_VALUE);  // -2147483648
       // parseInt("");  // Integer.parseInt();


        int[] a = {43, 4, 2};
        System.out.println(Arrays.toString(a));  // [43, 4, 2]
        sort(a);  // Arrays.sort  --> import static java.util.Arrays.*;   // yukarida bunu manually yazmadan once burasi hata veriyordu --> Zeynep' in aciklamasi: sort -> static cunku bir sekilde siralanabiliyor. O siralama hep ayni. 3 her zaman 5ten kucuk mesela.
        System.out.println(Arrays.toString(a));  // [2, 4, 43] --> the reason you couldn't use just toString, is because it doesn't know which one you mean, there is multiple from different files  --> Kizlarin aciklamasi: import static java.util.Arrays.*; bunu yazmamiza ragmen -> basina Arrays yazmadigimzda hata veriyor, o class ismini (Arrays.) yazmamiz gerekiyor. Cunku -> toString() methodunu farkli class'larda bir suru yerde kullandigimiz icin hangisi oldugunu anlamiyor


    }
}
