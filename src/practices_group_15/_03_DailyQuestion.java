package practices_group_15;

public class _03_DailyQuestion {

    public static void main(String[] args) {

        boolean x,z = true;
        int y = 20;
        x = (y != 10) || (z = false);  // y = true cunku y, 10 degil. Ilk kisim dogru oldugu icin || (or) sonrasini will not be executed. O yuzden z = false execute edilmeyince bastaki z = true;yu gecerli saymaya devam eder
        // ---> David's explanation: if the first part of || is true, then the result is always true, no need to check 2nd part. Because of short hand operator, second part of || were not executed / remained true

        System.out.println("x is: " + x);
        System.out.println("z is: " + z);

        /*
        What will be printed out?

        x is: true
        z is: true
         */


    }
}
