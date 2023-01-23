package day13_switch_string;

public class _03StringObjects {

    public static void main(String[] args) {


        String s = "first";  // String Literal, in String pool (only string literal is in the pool)

        String s2 = new String("second"); // object (directly) in the heap (not in the pool because it is not string literal)

        System.out.println(s == s2);  // compares two different objects  --> ((false because their locations are different))

        String s3 = new String("first");
        System.out.println(s == s3);  // compares objects in two different locations --> false

        String s4 = "second";
        System.out.println(s == s4);  // --> false -> cunku birinde first birinde second yaziyor

        String s5 = "first";  //It is string literal, so it must be in the string pool. But in the string pool, we already have a "first"
        System.out.println(s == s5);  // they are the same object, so they have the same address --> true


    }
}
