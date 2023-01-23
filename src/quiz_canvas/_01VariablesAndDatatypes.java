package quiz_canvas;

public class _01VariablesAndDatatypes {

    public static void main(String[] args) {

        int num1 = 200;
        int num2 = 50;
        num2 = num1;
        System.out.println(num1);  // 200
        System.out.println(num2);  // 200 cunku num2 degerini num1'e esittir dedik.

        System.out.println();

        long a = 20L;
        int b = (int)a;
        // What is the value of b?
        System.out.println(b);   // 20

        System.out.println();

        float x = 2_500.34444f;
        int y = (int)x;    // float'tan int'e giderken biraz deger kaybediyor.
        /*
        // double z = (double)y;
         */
        // System.out.println(z);  //2500.0

        System.out.println();

        long l = 200L;
        double d = 19.99;
        float f = 10;
       // f = d;     // fail to compile  // double'dan float'a yani smaller olana gitti
        f = l;
       // l = d;     // fail to compile  // kucuge gitti, we need to do casting
       // l = f;     // fail to compile  //float to long-> kucuge gitti
        d = f;
        d = d;


    }

}
