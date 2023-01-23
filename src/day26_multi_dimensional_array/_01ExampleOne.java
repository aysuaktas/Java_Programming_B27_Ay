package day26_multi_dimensional_array;

import java.util.Arrays;

public class _01ExampleOne {

    public static void main(String[] args) {

        // declare arrays one time:
        char[] upper = {'R', 'J', 'A'};
        char[] lower = {'p', 'z', 'q'};
        char[] other = {'4', '#', '*', '$', '&'};

        // Declaring multi dimensional array
        char[][] chars = new char[3][]; // {upper, lower, other} -> boyle de yazabilirsin ama practice olsun diye biz yazmadik. --> sondaki [] icine bir sey yazmak zorunda degiliz (empty olursa daha flexible), her array'in size'i farkli olabilir.

        // one dimensional degil two (multi) dimensional. O yuzden basta iki tane square brackets [][] koyduk.

        chars[0] = upper; // storing the upper char array as the first element of the 2d array

        chars[1] = lower;
        chars[2] = other;

        // printing each inner array (separately)
        System.out.println(Arrays.toString(chars[0]));  // [R, J, A]
        System.out.println(Arrays.toString(chars[1]));  // [p, z, q]
        System.out.println(Arrays.toString(chars[2]));  // [4, #, *, $, &]

        // printing the whole 2D
        System.out.println(Arrays.deepToString(chars)); // this method is used to print multi dimensional arrays  --> [[R, J, A], [p, z, q], [4, #, *, $, &]]








    }
}
