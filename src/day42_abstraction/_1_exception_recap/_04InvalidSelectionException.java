package day42_abstraction._1_exception_recap;

public class _04InvalidSelectionException extends Exception {  // extends Exception yaptik ---> being a sub class of Exception class makes this a checked exceptions

    // this class'ta it will be "checked exception"


    public _04InvalidSelectionException(){
        super("Selection can only be 1, 2, or 3");
    }




}
