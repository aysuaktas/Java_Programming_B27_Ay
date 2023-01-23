package day21_nested_loops;

public class _07NestedStop {

    public static void main(String[] args) {

        for(int i = 0; i < 5; i++){

            if(i % 2 == 1) continue;

            for(int j = 0; j < 3; j++){
                // if(i % 2 == 0) break; // i even number olunca break yani orada duruyor
                System.out.println(i + " " + j);
            }
            // break;
        }

        /* continue ve break koymadanki hali
        0 0
        0 1
        0 2
        1 0
        1 1
        1 2
        2 0
        2 1
        2 2
        3 0
        3 1
        3 2
        4 0
        4 1
        4 2
         */

        /* inner loop'u kapamadan hemen once en sona break koyunca:
        0 0
        0 1
        0 2
         */

        System.out.println("-------------------");


        outer: for(int i = 0; i < 5; i++){   // outer veya inner gibi label koyabiliyoruz bunlarin basina boyle yazinca

            inner: for(int j = 0; j < 3; j++){
                if(i == 3) break outer;  // outer ve inner diye label koydugumuz icin break outer ; gibi belirtebildik. Yoksa burada break olunca inner icin break olacakti ama outer da diyebildik  baslarindaki label sayesinde
                System.out.println(i + " " + j);
            }
        }



    }
}
