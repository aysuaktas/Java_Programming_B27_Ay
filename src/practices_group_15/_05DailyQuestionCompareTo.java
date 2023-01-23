package practices_group_15;

public class _05DailyQuestionCompareTo {

    public static void main(String[] args) {


        String s = "a";
        String s2 = "z";
        System.out.println(s.compareTo(s2));  // -25

        String first = "z";
        String second = "a";
        System.out.println(first.compareTo(second));  // 25

        String str = "a";
        String str2 = "a";
        System.out.println(str.compareTo(str2));  // 0

        /*
        3 Ways to compare two string objects:

    1) by using .equals() method:
        With this method, we compare the contents of two different String, and it returns to boolean. However, case sensitivity matters in Java. To prevent this, we can use the  .equalsIgnoreCase() method.

    2) by using == operator:
        In String, == operator compares the object location. If two different Strings are created by String literal, and their values are the same, one object will be created in String pool. If we use == operator for them, “true” will be printed on the console. If they are created with new keyword, they are created in Heap’s memory separately.

    3) by using compareTo() method:
        We did not cover it in our class but according to my quick research, it is basically for comparing values and evaluating them through returning an integer value. It is to describe whether first String is equal to, less than, or greater than the second String. If they are equal, method returns to zero. Otherwise, it will be a positive (if first String > second one) or a negative value (if first String < second one).
         */


        /* David's explanation:

        1. By using equals () method
        2. By using == operator
        3. By using compareTo() method

        -The String class equals() method compares the original content of the string. It compares values of string for equality. String class provides the following two methods.

        - The == operator compares references, not values.

        - compareTo() is used for comparing two strings lexicographically. Each character of both strings are converted into a Unicode value. However, if both strings are equal, then this method returns 0 else it only results in either negative or positive value.

         */


    }
}
