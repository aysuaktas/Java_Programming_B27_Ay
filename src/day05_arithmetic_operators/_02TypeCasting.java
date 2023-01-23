package day05_arithmetic_operators;

public class _02TypeCasting {

    public static void main(String[] args) {

        byte b = 14;
        int i = b; // int is bigger, so this is okay

        //[Smallest] byte -> short -> int -> long -> float -> double [Largest]
        //Widening Convention; go from smaller datatype to bigger datatype. This happens automatically

        long l = 40; // by default 40 is int type, int can automatically be stored into a long because int is smaller than long
        long l2 = 30000000000L; // 30000000000 is int by default, but it is too big for int type, so we need to tell the compiler it is a long type with using the L.

        float f = 10; // 10 is int type by default. Can we go from int to float? Int is smaller than float, so it will automatically be cast (so we can go from smaller one to bigger one automatically).
        System.out.println(f);

        double d = 19.99;
        int i2 = (int)d; // double is bigger than int, so I will need to cast to int. Narrowing Convention; go from a bigger type to a smaller type. We need to manually cast ->   syntax: smallerType varName = (smallerType) otherBiggerVariable
        System.out.println(i2); // buyukten kucuge giderken some lost (kayip) oluyor, O yuzden 19.99 olan deger console'da 19 seklinde.

        int i3 = 500;
        byte b2 = (byte)i3; // int is bigger than byte, so I will need to cast to byte
        System.out.println(b2); // byte cannot hold 500

        short s = 60;
        double d3 = s; // smaller olandan bigger'a gittigi icin automatically 60.0 oluyor.


        // float f2 = 100.50; // This number is considered as double by default. To make float to double -> double is bigger, so we wrote like this:
        float f2 = (float)100.50; // or you can do 100.50f
        long l3 = (long)f2; // float is bigger than long. Float'tan long'a giderken we lose sth. Bu nedenle 100.50 degeri console'da 100 oldu, we lost ".50"
        System.out.println(l3);

        double d4 = l3;  // double, long'dan buyuk -> long'dan double'a giderken; widening -> happens automatically
        System.out.println(d4); //ustte float'tan long'a cevirirken .50'yi kaybettigimiz icin kaybedilen yani eksik olan deger uzerinden gidiyor yani automatically 100.0 oluyor 100.50 degil.

        // todo -> bu class type casting'i anlamak icin guzel
    }
}
