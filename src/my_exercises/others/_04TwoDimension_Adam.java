package my_exercises.others;

import java.util.Arrays;

public class _04TwoDimension_Adam {

    public static void main(String[] args) {

        //row col
        int [][] array = new int[6][4];


        int [] firstrow = new int[]{10, 20, 30, 40};
        int [] secondrow = new int[]{50, 60, 70, 80};


        System.out.println("array[0][1] = " + array[0][1]); //20

        System.out.println("array[0][0] = " + array[0][0]); //10
        System.out.println("array[0][1] = " + array[0][1]); //20
        System.out.println("array[0][2] = " + array[0][2]); //30
        System.out.println("array[0][3] = " + array[0][3]); //40
        System.out.println("array[1][0] = " + array[1][0]); //50
        System.out.println("array[1][1] = " + array[1][1]); //60




        //row
        for (int i = 0; i < array.length; i++) {
            //col
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);

            }
        }


        /* Bunu print edince 0 yazdirdi. Zeynep'e gore nedeni:
        multi dimensional array yazmis size'lariyla birlikte ama diger yazdigi array'lari ona baglamadigi icin default degeri 0 cikiyor her yazdirdigi
         */


    }
}
