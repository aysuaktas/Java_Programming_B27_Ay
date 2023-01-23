package day22_array;

import java.util.Arrays;

public class _03DoubleExample {

    public static void main(String[] args) {

        double[] prices = new double[4];
        System.out.println(Arrays.toString(prices)); // [0.0, 0.0, 0.0, 0.0] -> for double type, so numbers are not integer, kusuratlilar.

        prices[0] = 12.99;
        System.out.println(Arrays.toString(prices)); // [12.99, 0.0, 0.0, 0.0]

        prices[1] = 9.50;
        prices[2] = 13.10;
        prices[3] = 20.30;
        System.out.println(Arrays.toString(prices)); // [12.99, 9.5, 13.1, 20.3]

        prices[2] = 214.99;  // I had a prices[2] already which is 13.10. I'm reassigning the index 2.
        System.out.println(Arrays.toString(prices)); // [12.99, 9.5, 214.99, 20.3] -> I updated this value, there is no problem.



    }
}
