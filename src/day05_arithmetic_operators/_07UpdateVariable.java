package day05_arithmetic_operators;

public class _07UpdateVariable {

    public static void main(String[] args) {

        int a = 4;
        System.out.println(a+10); // 14
        System.out.println(a);  // 4 -> reassigned edip degistirmedik, halen 4

        a = a + 20;  // reassigned ettik -> 4 + 20
        System.out.println(a);  // 24

        int b = 5;
        b += 30; // this is the same as this: b = b + 30; This is a Shorthand Operations
        System.out.println(b);  // 35

    }
}
