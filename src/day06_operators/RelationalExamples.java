package day06_operators;

public class RelationalExamples {

    public static void main(String[] args) {

        System.out.println(3 > 2);   // true
        System.out.println(3 >= 2); // it is also true because 3, 2den buyuk veya 2ye esit.
        System.out.println(5 > 10);  // false

        int a = 10;
        int b = 20;
        System.out.println(a < b);  // 10 < 20 -> true
        System.out.println(a < 15);  // 10 < 15 -> true

        System.out.println(10 == 10); // In Java, we use the == to compare the values to check if they are equal. 10 = 10, so true.

        boolean isEqual = 11==5;
        System.out.println(isEqual); // false

        System.out.println(4 != 20); // true -> because 4 is not equal to 20
        System.out.println(20 != 20); // false -> because 20 = 20

        System.out.println(true == true); // true

        System.out.println('a' == 'A'); // false -> because of case sensitivity

    }
}
