package day13_switch_string;

public class _04StringEquals {

    public static void main(String[] args) {

        String s = "java";
        String s2 = "java";
        // both of these are String literal, so they are both in the String pool

        System.out.println(s == s2);  // true  // TODO: it checks if they are the same object, the same location, BUT it does NOT check the value

        System.out.println(s.equals(s2)); // true // checks if the value of the Strings is the same

        String s3 = new String("java");  // this is by new keyword, so this is in the heap
        System.out.println(s == s3); // false // comparing two different objects

        System.out.println(s.equals(s3));  // true  // TODO: checks if the value (character) of the String are same

        System.out.println(s.equals("Java"));  // false -> cunku characters same mi diye bakiyor. TODO: Uppercase ve lowercase'ler same character degil cunku case sensitivity -> java ve Java
                                                // ((equals method ile java ve Java false))

    }
}
