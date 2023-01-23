package day41_exceptions._3_try_catch;

public class _14MultipleSleep {

    public static void main(String[] args) throws InterruptedException {  // accepting if the exception happens stop my program  --> main methodun yanina throws + sorun olan exception'i girdik. (( Kendime not: Throws InterruptedException yazmadan once Thread.sleep(3000) yazdigimizda kirmizi renkte hata gosteriyordu, uzerine gelip tiklamadan bekleyince InterruptedException diyor, buradan da bilebilirim hangi exception oldugunu )) --> throws olmadan run edemezdik bile.

        System.out.println("Hello");

        Thread.sleep(3000);

        System.out.println("Second line");

        Thread.sleep(3000);

        System.out.println("Middle line");

        Thread.sleep(3000);

        System.out.println("Bye");


        System.out.println("=========================");

        System.out.println("Hello");

        Thread.sleep(3000);

        System.out.println("Second line");

        Thread.sleep(-3000);  // handle edemedim exception'i. O yuzden bundan sonra program duracak cunku throws kullandik. Throws'ta exception olunca program duruyor.

        System.out.println("Middle line");

        Thread.sleep(3000);

        System.out.println("Bye");


        /* Yukaridakilerin hepsinden sonra print edince console'da:

        Hello
        Second line
        Middle line
        Bye
        =========================
        Hello
        Second line
        Exception in thread "main" java.lang.IllegalArgumentException: timeout value is negative
        	at java.base/java.lang.Thread.sleep(Native Method)
	        at day41_exceptions._3_try_catch._14MultipleSleep.main(_14MultipleSleep.java:30)
         */





    }
}
