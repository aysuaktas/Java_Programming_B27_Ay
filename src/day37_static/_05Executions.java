package day37_static;

public class _05Executions {

    public static void main(String[] args) {
        new _05Executions();     // 2 --> creating object without reference
        System.out.println(1);   // 1
        new _05Executions();     // 2 --> we called the constructor again
    }

    public _05Executions(){       // This is a constructor. Ama basta constructor'i cagirmamistim. O yuzden bunu print etmedi basta. Sonra main method'da new Executions() ekleyince 2 print olabildi. Bunu uste 1 yazan print statement'i de alta yazdigim icin once 2 sonra 1 yazilacak. En basta da static method oldugu icin 3 yazacak.
        System.out.println(2);
    }

    static {  // this block is run first (once), whenever the class is loaded (used)
        System.out.println(3);  // 3   --> static block
    }    // this have a priority. Static method oldugu icin class'a ait. Ve ilk once bu print olur her zaman! --> // Static block is a part of class. Inside of the main method'a yazamayiz


    /* O yuzden run edince once 3 sonra 1 print edilecek:
         3
         1

         new _05Executions(); diye main method icinde 1den once ve 1den sonra ekledikten sonra ise:
         3
         2
         1
         2 seklinde print edildi
     */








}
