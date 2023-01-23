package day41_exceptions._3_try_catch;

public class _10FirstTry {

    // about Try & Catch: for exception handling

    public static void main(String[] args) {

        String sentence = "hello world";
        System.out.println(sentence.charAt(0));     // h
//      System.out.println(sentence.charAt(100));  // StringIndexOutOfBoundsException


        System.out.println("-----------------");

        // Bu usttekini try-catch icine yazarsak

        try{

            String s = "hello world";
            System.out.println(s.charAt(0));   // h
            System.out.println(s.charAt(100));  // The String was too short. It went out of bounds yazdi cunku catch block'ta bunu belirledik, OutOfBounds ise bunu print etmek istedik, bu da OutOfBounds oldugu icin bu statement print edildi

        } catch (StringIndexOutOfBoundsException e) {  // e is a parameter name -> e is just a name, very common name to represent your object in try-catch
            System.out.println("The String was too short. It went out of bounds");
        } // catch block only runs if an exception happens

        // catch block'ta -> exception varsa programin ne yapmasini istedigimizi belirtiyoruz. Boylece StringIndexOutOfBoundsException nedeniyle programi durdurmak yerine bu exception varken bir print statement yazdirmak istedik:


        System.out.println("-----------------");

        try{

            String s1 = "hello world";
            System.out.println(s1.charAt(0));   // h
            System.out.println(s1.charAt(1));   // e  --> bunlardan herhangi biri OutOfBounds olmadigi icin catch block run edilmedi

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("The String was too short. It went out of bounds");
        } // catch block only runs if an exception happens


        System.out.println("-----------------");

        try{

            String s2 = "hello world";
            System.out.println(s2.charAt(0));   // h
            System.out.println(s2.charAt(-1));  // The String was too short. It went out of bounds  --> -1 de normalde OutOfBoundsException cunku

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("The String was too short. It went out of bounds");
        } // catch block only runs if an exception happens


        System.out.println("-----------------");

        try{

            String s3 = "hello world";
            System.out.println(s3.charAt(5));   //  -> bosluk print oldu hahahah
            System.out.println(s3.charAt(1));  // e

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("The String was too short. It went out of bounds");
        } // catch block only runs if an exception happens

        System.out.println("-----------------");

/*
        System.out.println("Hello");

        try{
            Thread.sleep(5000);     // it simulates seconds, o yuzden 5000 verdik deger olarak
        } catch (Exception e) {
            System.out.println("Invalid time given");   // ((exception olmadigi icin burasi print olmadi. Thread.sleep method ancak negative olursa o zaman exception oluyor ve sadece exception olunca run olan catch block run olup bunu print edebilirdi. 5000 positive oldugu icin run olmadi))
        } // catch block only runs if an exception happens --> bir problem yok. O yuzden catch block run olmadi. Ne zaman run olurdu? 5000 yerine negative number verseydim

        System.out.println("World");

        // Bu kismi yazip print edince once sadece Hello'yu print ediyor. 5000 degerini verdigimiz icin 5 saniye bekliyoruz sonra World de print ediliyor. ((Waits 5 seconds to run the next code))

 */

        System.out.println("-----------------");


        System.out.println("Hello");

        try{
            Thread.sleep(-5000);  // bunu negatif number yaptik ki catch block run olsun, bunda problem oldugu icin
        } catch (Exception e) {
            System.out.println("Invalid time given");
        } // catch block only runs if an exception happens

        System.out.println("World");

        /* Ustteki 5000 yazani comment'e almadan once bunu da yazdirmadi, 5 saniye bekledi. Ama onu comment'e aldigimda yine run ettim ve hic beklemeden direkt bunu print etti:
                                            Hello
                                            Invalid time given
                                            World
         */


    }
}
