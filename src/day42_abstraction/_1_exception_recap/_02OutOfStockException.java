package day42_abstraction._1_exception_recap;

public class _02OutOfStockException extends RuntimeException {  // with this line ((we added extends RuntimeException -> yani bu class extends RuntimeException'in child class'i olmus oldu)) -> being a child of RuntimeException means we created an unchecked exception!


    // constructor
    public _02OutOfStockException(){
        super("Item is out of stock"); // this helps us define the message of the exception
    }
}
