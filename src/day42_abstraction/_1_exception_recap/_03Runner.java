package day42_abstraction._1_exception_recap;

public class _03Runner {


    public static void main(String[] args) {

        System.out.println(_01VendingMachine.select(1));  //  this method has an unchecked exception - normally these exceptions are not handled--> 1 yazarsam console'da Chips, 3 yazarsam Candy yaziyor. Valid olmayan 5 yazdigimizda hicbir sey print olmuyor. ((Bir sey olabilsin diye _04InvalidSelectionException class'ini olusturduk)) 2 yazinca _02OutOfStockException yaziyor, devaminda da Create breakpoint kismi icin: : Item is out of stock aciklamasi yaziyor. Bu aciklamayi _02OutOfStockException class'inda eklemistik.

        // select(2) --> causes the exception

        try {
            System.out.println(_01VendingMachine.selectValid(5));
        } catch (_04InvalidSelectionException e) {
            System.out.println(e.getMessage());
        } finally {
            // block of code that will run always  --> finally always run. How can you stop the final block to run diye trick soru sorabilirler interview'larda. --> you could stop this block from running if you use System.exit() before this block. --> yani finally block oncesinde System.exit() kullanip direkt programi stopped edebiliriz ancak.
        }
    }

        /*
        Ilk print statementte select(1) ve alttaki try block'ta selectValid(5) yapinca console'da:
        Chips
        Selection can only be 1, 2, or 3

        ---> Ama ilkinde seleck(2) yaziliyken:

        Exception in thread "main" day42_abstraction._1_exception_recap._02OutOfStockException: Item is out of stock
	        at day42_abstraction._1_exception_recap._01VendingMachine.select(_01VendingMachine.java:20)
	        at day42_abstraction._1_exception_recap._03Runner.main(_03Runner.java:7)
         */


/*
    public static void main(String[] args) throws _04InvalidSelectionException{     // bu ornekte throws kullaninca: ---> using throws will allow the program to compile, but you didn't handle the exception, so when we give the invalid data the exception happens and programs stops

           System.out.println(_01VendingMachine.selectValid(5));
    }

    // usttekini comment'e alip bunu print edince de exception. Console'da:
    Exception in thread "main" day42_abstraction._1_exception_recap._04InvalidSelectionException: Selection can only be 1, 2, or 3
	    at day42_abstraction._1_exception_recap._01VendingMachine.selectValid(_01VendingMachine.java:46)
	    at day42_abstraction._1_exception_recap._03Runner.main(_03Runner.java:34)
*/
    // using throws will allow the program to compile, but you didn't handle the exception, so when we give the invalid data the exception happens and programs stops

    /* if you want to ignore multiple use a comma
    throws Exception1, Exception2...

     */





}
