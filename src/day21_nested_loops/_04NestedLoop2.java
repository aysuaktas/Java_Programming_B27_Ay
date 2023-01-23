package day21_nested_loops;

public class _04NestedLoop2 {

    public static void main(String[] args) {

        for(int i = 0; i < 8; i++){

            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();  // empty print statement'in amaci ustte print ile yapmis olmamiz. Ustteki print methodken bu olmazsa yan yana ( **************************** seklinde ) console'da cikiyor. Ustte println ile yapip bunu koymazsa da bu sefer alt alta dumduz her siraya tek * koyuyor 28 tane. Ama sekil de olsun istiyorsak hem prinln yerine print hem de sonrasinda empty print statement kullanmaliyiz
        }

        /*
        Bunu print edince console'da:

        *
        **
        ***
        ****
        *****
        ******
        ******* cikiyor

         */


        // Nested loop is not good for execution. -> because it takes more and more time for execution. -> ((Her birine tek tek tekrar tekrar bakiyor..))

    }
}
