package day16_string;

public class _03IndexOfExample {

    public static void main(String[] args) {

        String s = "lollipop";
                 // 01234567
        System.out.println("index of l is " + s.indexOf('l'));  //--> index of l is 0
        System.out.println("last index of l is " + s.lastIndexOf('l'));  //--> last index of l is 3

        /* on the console;
        index of l is 0         //--> first position of the l
        last index of l is 3    //--> last position of the l
         */

        System.out.println("index of i is " + s.indexOf('i'));
        System.out.println("last index of i is " + s.lastIndexOf('i'));

        /* on the console;
        index of i is 4
        last index of i is 4
         */

        System.out.println("index of p is " + s.indexOf('p'));
        System.out.println("last index of p is " + s.lastIndexOf('p'));

        /*
        index of p is 5        //--> first position of the p
        last index of p is 7   //--> last position of the p
         */

        System.out.println("index of e is " + s.indexOf('e'));
        System.out.println("last index of e is " + s.lastIndexOf('e'));

        System.out.println("index of P is " + s.indexOf('P'));
        System.out.println("last index of P is " + s.lastIndexOf('P'));

        /* on the console;
        index of e is -1       --> String'imiz lollipop yani icinde e harfi yok. Bu nedenle hem index'i hem lastIndex'i -1 olacak
        last index of e is -1

        index of P is -1       --> String'imiz lollipop yani icinde p var ama lowercase p var. Case sensitivity nedeniyle uppercase P burada yer almiyor, bu nedenle bunun da index'i ve lastIndex'i -1 olacak
        last index of P is -1
         */


        System.out.println(s.lastIndexOf('I'));  // -->  -1
        System.out.println("-------------------");

        System.out.println("index of pop: " + s.indexOf("pop")); // --> index of pop: 5  ---> // gives 5 because the sequence "pop" starts at index 5

        System.out.println("index of Pop: " + s.indexOf("Pop")); // --> index of Pop: -1  --->// buradaki first character p uppercase ile oldugu ama bizim String'deki p'miz lowercase oldugu icin -> negative one (-1) will be returned.

        System.out.println("index of lol: " + s.indexOf("lol")); // --> index of lol: 0  ---> because here, the sequence "lol" starts at index (yani position) 0.


    }
}
