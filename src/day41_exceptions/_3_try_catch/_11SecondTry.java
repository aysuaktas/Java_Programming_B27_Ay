package day41_exceptions._3_try_catch;

public class _11SecondTry {

    public static void main(String[] args) {

        // catch the object and use it icin gorduk bu class'i:


        /*
        int[] arr = {4, 2, 4, 1};
        System.out.println(arr[10]);  // ArrayIndexOutOfBoundsException cunku arr array'inin size'i 4, but 10 degil.
         */

        // right click ->  refactor -> extract method

        /*
        Popular methods of exception objects:

        printStackTrace() : prints a stack trace (full details) of the exception

        getMessage() : returns only brief description of the exception

         */

        try{
            int[] arr = {4, 2, 4, 1};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e){   // olabildigince specific yaziyorum exception'i
            System.out.println("CATCH BLOCK");
            e.printStackTrace();    // reference name e oldugu icin e. dedik, object'e erisiyoruz yani
            System.out.println(e.getMessage());  // Index 10 out of bounds for length 4 --> String return type oldugu icin bunu print statement icinde yazinca print edebiliyoruz, print statement icinde yazmadigimizda printed olmadi
        }

        // Bu, exception mesajini da veriyor ama durdurmuyor kodu,
        /*
        CATCH BLOCK
        Index 10 out of bounds for length 4   ((--> bu e.getMessage()'den geliyor. Alttaki kisim e.printStackTrace()'den geliyor))
        java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 4
	        at day41_exceptions._3_try_catch._11SecondTry.main(_11SecondTry.java:16)
         */


    }
}
