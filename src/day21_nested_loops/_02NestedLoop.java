package day21_nested_loops;

public class _02NestedLoop {

    public static void main(String[] args) {

        /* Nested loop kullanmayip Tek tek yazsak ((zaman kaybi ve tekrara dusuyorsun, bunu istemiyoruz)) boyle olurdu:
        for(int i = 0; i < 3; i++){
            System.out.println("Hello World");
        }

        System.out.println("Hello Universe");


        for(int i = 0; i < 3; i++){
            System.out.println("Hello World");
        }

        System.out.println("Hello Universe");


        for(int i = 0; i < 3; i++){
            System.out.println("Hello World");
        }

        System.out.println("Hello Universe");

         */


        // Nested loop:
        for(int j = 0; j < 4; j++) {       // outer loop   -> j:0 j:0 --> i:0 i:0 //--> j:1 j:1 --> i:0 i:0   i:1 i:1  //--> j:2 j:2 --> i:0 i:0  i:1 i:1  i:2 i:2... // for every iteration of outer loop, inner loop starts from yhe beginning

            for (int i = 0; i < 3; i++) {           // inner loop
                System.out.println("Hello World");
            }

            System.out.println("Hello Universe");
        }



    }
}
