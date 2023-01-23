package day15_string;

public class _04CharAtMethod {

    public static void main(String[] args) {

        String s = "java";
        //          0123   --> index (position) of the characters in the String

        System.out.println("First char " + s.charAt(0));  // ---> j --> first character icin -> charAt(0) yapariz cunku index numbers start from zero.

        System.out.println("Second char " + s.charAt(1));  // ---> a
        System.out.println("Third char " + s.charAt(2));   // ---> v
        System.out.println("Fourth char " + s.charAt(3));  // ---> a

        // System.out.println("Invalid char " + s.charAt(100)); // ---> 100 is not a valid index in our String. Our String'de -> java -> Sadece 0, 1, 2, 3 position'lari var, farkli bir sey yazarsam error veriyor.


        System.out.println("-------------------------");


        System.out.println("Length: " + s.length());  // -> length (of java) = 4
        System.out.println("Last index: " + 3); // last index == length - 1 ---> 4 - 1 = 3


        System.out.println("-------------------------");


        // TODO:  reverse my String, hardcoded: goal is to see: avaj --> java'nin tersten yazilisi -> first way:
        System.out.print(s.charAt(3)); // a
        System.out.print(s.charAt(2)); // v
        System.out.print(s.charAt(1)); // a
        System.out.print(s.charAt(0)); // j --> avaj -> Bunlarda println degil de print method kullandigimiz icin console'da alt alta degil, yan yana (avaj olarak) yazdi -> reverse my String

        System.out.println("-------------------------");

        //second way for reverse my String is:

        System.out.println(s.charAt(3) + s.charAt(2) + s.charAt(1) + s.charAt(0)); // ---> 428 --> because it is not concatenation. It is addition. Cunku hic String'im, double quote'm yok burada. --> print edince 418 yaziyor

        System.out.println("" + s.charAt(3) + s.charAt(2) + s.charAt(1) + s.charAt(0)); // ---> avaj ---> Ustteki print statement'in basina double quote ekleyerek bunu addition'dan concatenation'a cevirmis olduk, bu nedenle toplayip 418 olarak yazmadi, concatenate yapip avaj olarak yazdi


    }
}
