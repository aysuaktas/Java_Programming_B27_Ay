package day21_nested_loops;

public class _09ShapeHomework {

    /*
    Print these shapes:

    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *

-------------------------------------------------------

    Print this shape:

    * * * * * * * *
    * * * * * * *
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *

     */

    public static void main(String[] args) {


        // Saim's solution:
        /* Once sunu yapalim:

        Print these shapes:

    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
    * * * * * * * * *
                                 */

        for (int i = 0; i < 8; i++) {   // alt alta kac kere olacagi, yani aslinda condition'in kac kere print edilecegi
            for (int j = 0; j < 9; j++) {   // yan yana 9 tane var
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println("-------------------------------------");

        /*
        Print this shape:

    * * * * * * * *
    * * * * * * *
    * * * * * *
    * * * * *
    * * * *
    * * *
    * *
    *
                                     */


        for (int i = 8; i >= 0; i--) {    // ilkinde 8 tane var, asagi indikce birer birer azaliyor.
            for (int j = 0; j < i; j++) {   // TODO: bunun mantigi nasil? anla
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}