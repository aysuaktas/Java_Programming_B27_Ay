package java_interview_coding_David;

public class Q2DivideWithoutDivisionOperator {


     /* Divide without "/" (division) operator:
     Q2: Write a method that can divide two numbers without using division operator, and print the result
    */

    public static void main(String[] args) {

        System.out.println(divideWithoutDivisionOperator(0, 4));
        System.out.println(divideWithoutDivisionOperator(9, 3));
        System.out.println(divideWithoutDivisionOperator(5,3));
        System.out.println(divideWithoutDivisionOperator(7,2));
        System.out.println(divideWithoutDivisionOperator(2, 5));
        System.out.println(divideWithoutDivisionOperator(4, 0));



    }


    public static double divideWithoutDivisionOperator(double num1, double num2){

        if(num2 == 0){
            try {
                throw new ArithmeticException("Second number cannot be zero");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }   // 2.numarainin 0 oldugu exception durumu icin ya boyle try catch olustururum ya da kizlarin dedigi gibi if condition ile belirlerim if num2 = 0 ise bir print statement yazdiririm it is not allowed gibi.

        double result = 0.0;

        while (num1 >= num2) {
            num1 = num1 - num2;
            result++;

        }
       return result;

    }
}

    /*
    num1'in icinde kac tane num2 var demek

    while loop

    I will substract num2 from the num1. Every substruction will be count one.
                                <<okunus: sabstraksin>>
     */


    /* David's answer:
    private static void divideWithoutDivisionOperator(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.print(num1 + " devided by " + num2 + " is: ");
        int count = 0;
        while (num1 >= num2) {
            num1 = num1 - num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);
    }
     */


    /* Lauren's code:
    public static void divide(int x, int y) {
        int dividend = x;
        int quotient = 0;
        if (y == 0) {
            System.out.println("Cannot divide by 0!");
        } else {
          while(x>=y){
                x = x - y;
                quotient++;
            }
                if (x == 0) {
                    System.out.println(dividend + "/" + y + " = " + quotient);
                } else {
                    System.out.println(dividend + " / " + y + " = " + quotient + ". The remainder is " + x);
                }
        }
    }
     */


    /* Asli's code:
    public class NumberWithoutDivision {
    public static void main(String[] args) {
        System.out.println(WithoutDivision(18,3));
    }

    public static int WithoutDivision(int num1, int num2) {
        int count=0;
        while(num1>=num2) {
            num1=num1 - num2;
           count++;
        }
        return count;
      }
    }
     */


