package day42_abstraction._1_exception_recap;

public class _01VendingMachine {

    /* Vending machine'imiz bu olsun:

    Chips       Gum         Candy
      1          2            3
     */


    public static String select(int selection){

        String item = "";

        if(selection == 1){
            item = "Chips";
        } else if(selection == 2){
 //           item = "Gum";  // this is out of stock --> sadece out of stock gibi bir statement yazmak is not enough because program will continue to run. Bununla ise program will stop ?
            throw new _02OutOfStockException();  // throw -> throw is the keyword that causes the exception to happen. --> throw new _02OutOfStockException(); derken new dedik yani object olusturduk. Eger 2 girilirse o zaman _02OutOfStockException'dakini print edecek --> throw is a keyword, not a method.
        } else if(selection == 3){
            item = "Candy";
        }

        return item;
    }


    /*
    public static void main(String[] args) {
        System.out.println(5 / 0);   // -> ArithmeticException
    }
     */   // TODO: bunu neden yazdi, kizlara sor

    public static String selectValid(int selection) throws _04InvalidSelectionException { // buraya throws _04InvalidSelectionException yazmadan once alttaki else block icindeki throw new _04InvalidSelectionException(); hata veriyordu altinda kirmizi cizgi ile, daha run etmeden exception

        String item = "";

        if(selection == 1){
            item = "Chips";
        } else if(selection == 2){
            item = "Gum";
        } else if(selection == 3){
            item = "Candy";
        } else {    // _04InvalidSelectionException class'ini ekledikten sonra bu kismi buraya ekledik. Bu olmadan once eger 1,2 veya 3 olmazsa _03Runner class'inda hicbir sey printed olmuyordu
            throw new _04InvalidSelectionException();  // Zeynep's note: checked exception - must be handled - but also I created this because I don't want to handle myself
        }

        return item;
    }





}

// bu runtime exception, run etmeden yapilacak baska bir sey yok su an.
