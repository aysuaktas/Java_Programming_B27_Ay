package day19_loops;

public class _07LoopWithString {

    public static void main(String[] args) {

        String s = "july";
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        // ustteki hardcoded. If we miss a character or sth, it will be a problem. But we can do it with loop more dynamic.

        System.out.println();  // empty print statement

        // with for loop:

        for(int i = 0; i < s.length(); i++) {   // length - 1 is our last character. Ama biz last character'i de almak istiyoruz. O yuzden i < s.length'te bitirdik
            System.out.println(s.charAt(i));   // now it will work with any characters
        }

        // Hep zero'dan mi baslamaliyiz? Not really. But if we want to look every character, we start from zero because for index numbers, first index is zero






    }
}
