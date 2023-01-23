package day06_operators;

public class LogicalExample {

    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isGoodTemp = true;
        boolean doBbq = isWeekend && isGoodTemp; //If both of them true, we may want to do barbeque.

        /*
        this is not necessary
        isWeekend == true && isGoodTemp == true;
         */

        System.out.println("Do bbq: " + doBbq);  // this is true. Weekend true olsa ama good temperature false olsa -> false olurdu.

        System.out.println("-------------------");

        boolean isTeacher = true;
        boolean isPolice = false;
        boolean isFirefighter = false;
        boolean getDiscount = isTeacher || isPolice || isFirefighter;  // --> or ( || ) only one of the boolean need to be true, for the result to be true
        System.out.println("get a discount: " + getDiscount);

        System.out.println("-------------------");

        // goal: 5 < number < 10
        int number = 8;
        System.out.println(number > 5 && number < 10); // true && true --> true
        System.out.println(number > 0 && number < 5); // true && false --> false

        System.out.println("-------------------");

        int age = 40;
        boolean invalidAge = age < 0 || age > 120;  // -> 40 is less than 0 is false. 40 is more than 120 is also false. --> false || false -> false

    }
}
