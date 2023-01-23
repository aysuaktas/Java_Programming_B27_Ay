package day10_if_statements;

public class _12TernaryExample {

    public static void main(String[] args) {

        int score = 50;

        if(score > 70){
            System.out.println("passing");
        } else {
            System.out.println("failing");
        }


       // System.out.println(score > 70 ? "passing" : "failing");   -> ((ternary versiyonu, ben yazdim))


        System.out.println("-----------------------");


        // And different way to do it;

        int score2 = 50;
        String result;

        if(score2 > 70){
            result = "Passing";
        } else {
            result = "Failing";
        }
        System.out.println(result);


        System.out.println("-----------------------");


        // The same thing with Ternary example;

        int score3 = 80;
        String result2 = score3 > 70 ? "Passing" : "Failing";   // storing the result to a String variable
        System.out.println(result2); // usttekinde store ettigini simdi yazdirmis olduk bunda. Ama;

        System.out.println(score3 > 70 ? "Passing" : "Failing");  // printing the result right away

        /*
        different way to write an if statements: --> ((ternary)) ;

	    finalValue OR
	    returnValue = boolean_expression ? trueValue : falseValue;

        ?   If          ? —> if statement’teki if
        : else          : —> if statement’teki else

         */


        System.out.println("-----------------------");

        int n = 9;
        System.out.println(n % 2 == 0 ? "even" : "odd");     // odd


        System.out.println("-----------------------");

        boolean isGreen = false;
        System.out.println(isGreen ? "Drive" : "Stop");    // Stop

        /*
        if(isGreen) {
            System.out.println("Drive");
        } else {
            System.out.println("Stop");
        }
         */

        System.out.println("-----------------------");

        int num = 10;
        System.out.println(num > 0 ? "Positive" : n < 0 ? "Negative" : "Zero"); // TODO: if-else'in ternary versiyonu
        // numara 0dan buyukse Positive -> numara 0dan kucukse Negative -> o da degilse Zero -> demek bu ifade


    }
}
