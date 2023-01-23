package day41_exceptions._5_bank;

public class _18NotEnoughMoneyException extends RuntimeException {  // extends RuntimeException'i biz ekledik --> extending RunTimeException class makes this class an unchecked exception

    public _18NotEnoughMoneyException(){
        super("Not enough money in the account"); // allows me to define the message part of the exception

    }
}
