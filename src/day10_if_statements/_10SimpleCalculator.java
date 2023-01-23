package day10_if_statements;

public class _10SimpleCalculator {

    public static void main(String[] args) {
        double numOne = 5;
        double numTwo = 24;
        char operator = '+';
        double result = 0;   // zero starting point

        if (operator == '+'){
            result = numOne + numTwo;
        } else if (operator == '-'){
            result = numOne - numTwo;
        } else if (operator == '*' || operator == 'x'){
            result = numOne * numTwo;
        } else if (operator == '/'){
            result = numOne / numTwo;
        } else if (operator == '%'){
            result = numOne % numTwo;
        } else {
            System.out.println("Invalid operator");
        }

                    // TODO:
        System.out.println("" + numOne + operator + numTwo + " = " + result );    // String olunca ondan sonrasi concatenation oluyor, addition vs olmuyor. O yuzden basa ici bos "" koyduk ki String sonrasindakileri + kullaninca toplamasin. Number and character arasinda String "" koyduguna emin ol. So, number ile character arasinda String oldugundan this is also another option;
        System.out.println(numOne + " " + operator + " " + numTwo + " = " + result);  // another option to display the output

        /*
        double numOne = 5;
        double numTwo = 24;
        char operator = '+'; ise console'da;
        5.0+24.0 = 29.0

        double numOne = 5;
        double numTwo = 24;
        char operator = '*'; ise console'da
        5.0*24.0 = 120.0

         */

    }
}
