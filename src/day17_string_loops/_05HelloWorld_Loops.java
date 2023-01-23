package day17_string_loops;

public class _05HelloWorld_Loops {

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World"); // gibi yazabiliriz ama we are repeating ourselves. We don't want to repeat ourselves. So, we can use loops for this.

        System.out.println("---------------");

        // while loop;

        /* Infinite loop:

        while(true){
            System.out.println("Hello World");
        }  // this is an infinite loop, does not stop. --> alt alta surekli Hello World yaziyor biz durdurana kadar.
         */


        // print 50 times;
        int counter = 0;  // We can call it counter. Counter can start from zero.

        while(counter < 50) {   // zerodan 50ye kadar yazacak -> 50 times yaziyor. (int counter'i 1 olarak belirlersen yine 50 times yazmis olurdu)
            System.out.println("Hello World " + counter); // counter'i ekleme sebebimiz 50 kere Hello World yazdigini gorebilmemiz.

            // it is still an infinite loop. Because int counter = 0 dedik and zero is always smaller than 50.
            counter++; // this line adds 1 to the number each iteration, it allows the loop to stop at some point
            // yani burada counter++ dersek infinite loop'tan cikar, 50 kere Hello World yazar. --> 0'dan baslattik 49'a kadar yazdi. 1'den baslatirsak 50'ye kadar yazar. Her turlu 50 times yazacak. -> We have 50 iterations (iteration is simply the cycle of executions) in this example.
        }







    }
}
