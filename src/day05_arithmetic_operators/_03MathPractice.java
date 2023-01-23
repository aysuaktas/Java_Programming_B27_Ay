package day05_arithmetic_operators;

public class _03MathPractice {

    /*
    ARITHMETIC OPERATORS

Addition:
	Operator   +
	Adds a value to another
	Ex: 10+5  -> Result: 15

Subtraction:
	Operator  -
	Subtracts one value from another
	Ex: 10-5 -> Result: 5

Division:
	Operator  /
	Divides two values
	Ex: 10/5 -> Result: 2

Multiplication:
	Operator  *
	Multiplies two values
	Ex: 10*5 -> Result: 50

Modulus:
	Operator  %
	Divides two values and returns to remainder
	Ex: 10%3 -> Result: 1

     */

    public static void main(String[] args) {

        System.out.println(4 + 5);
        System.out.println(4 * 5);

        // int * int -> int
        System.out.println(2 * 5);

        // int * double --> double   // smaller ile bigger type'i carpinca result will be bigger type // todo: reminder
        System.out.println(2 * 5.5);

        // int / int -> int
        System.out.println(10 / 3);

        // int / double --> double
        System.out.println(10 / 3.0);

        System.out.println(5 % 2); // 2 + 2 went into 5 twice, there is one left.

        System.out.println(4 % 2); // the result is 0. There is no left over because 2 divides into 4 evenly.

        System.out.println(6 % 2); // That is evenly divisible, so no left over.

        System.out.println(4 % 10); //  4/10 yapinca -> not enough to have a whole 10, so 4 is the left over. Here, the result is 4. Left over is just the first number that I have. --> The rule is; if the first number is smaller than second number, left over will be the first one. // todo: reminder

    }
}
