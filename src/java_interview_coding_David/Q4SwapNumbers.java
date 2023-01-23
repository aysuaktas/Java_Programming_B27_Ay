package java_interview_coding_David;

public class Q4SwapNumbers {

     /* Swap numbers:
     Q4: Swap two variable values without using a third variable
    */

    public static void main(String[] args) {
        swapNumbers(4, 9);
    }

    public static void swapNumbers(int x, int y){

    //    int x = 6;   // initial value of x
    //    int y = 7;   // initial value of y

        System.out.println("Before swapping: \n x = " + x + "\n y = " + y);  // initial value of x (as num 1) and y (as num 2) -> let's say x=4, y=9

        // first, sum of these numbers:
        x = x + y;  // so, new value of x is 13 now

        // to determine y, current x value minus y:
        y = x - y;  // y = 13 - 9 -> so, new value of y is 4  ((there is substraction here. I will substract y from x))

        // to identify x --> x is equal to = current x value minus current y value
        x = x - y;  // 13-4 -> so, new value of x is 9

        System.out.println("After swapping: \n x = " + x + "\n y = " + y);

    }
}
        // common solution bu ustteki, bununla yapabilirmisiz.

    /* // David's answer:

        int a = 10;
        int b = 20;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
     */


       // addition (+) ve substraction (-) yerine Asli'nin 2. yolda yaptigi multiplication (*) ve division ( / ) ile yapacak olursak -> sayilardan birinin zero (0) olma durumunda exception verir, bunu handle etmemiz lazim


        /* // Asli'nin :
       // First way:
        int a=10;
        int b=50;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

        // Second way:
        int c=20;
        int d=60;
        c=c*d;
        d=c/d;
        c=c/d;
        System.out.println(c);
        System.out.println(d);

        // Third way:
        a=b-a+(b=a);  // in one line :OMG
        System.out.println(a);
        System.out.println(b);
         */
