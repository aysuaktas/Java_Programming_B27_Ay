package day04_variables;

public class _04MyName {
    /*
    declare your name as multiple char variables
    print your name, see what happens
     */

    public static void main(String[] args) {

        char first = 'A';
        char second = 'y';
        char third = 's';
        char fourth = 'u';

        // char a = 'a', b = 'b', c = 'c';

        System.out.print(first);  // yazdigimiz same line'da olsun diye println degil print ile yaptik.
        System.out.print(second);
        System.out.print(third);
        System.out.println(fourth);  // -> This is first solution to be able to write a name in the same line  // Aysu


        System.out.println("My name is " + first + second + third + fourth);   // My name is Aysu --> This is second solution. -> concatenate a String in the beginning, this will concatenate all the chars together.  // System.out.println("" + first + second + third + fourth); seklinde de olur. Concatenate etmezsek -> addition yapar ve sayisal deger goruruz. Mesela, alttaki ornek:


        System.out.println(first + second + third + fourth);  // 418 ==> characters has a number related to them. That is why, when I wrote like that (without concatenation) -> 418 is appeared on the console.   //todo

    }
}
