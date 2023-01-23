package day26_multi_dimensional_array;

import java.util.Arrays;

public class _02Groups {

    public static void main(String[] args) {

        String[][] cydeo = {     // one dimensional degil two (multi) dimensional. O yuzden basta iki tane square brackets [][] koyduk ve String[][] cydeo yazdik

                {"Alen", "Tina", "Alema", "Nargiz"}, // this is one single dimensional array
                {"Anam", "Baz", "Busra", "Ostap"}, // comma(,)lari nereye koyduguna dikkat et. Hem {} icinde kelimeleri birbirinden ayirmak icin hem de } sonrasinda kullaniyoruz ki bundan sonraki dimensionlardan ayiriyoruz. Last array'in sonuna comma'ya gerek yok
                {"Rabia", "Shahad"},
                {"Ketino", "Eylul", "Nadia"}  // We don't use comma(,) at the end of this last array
        };   // --> bu kapatistan sonraki noktali virgulu de unutma, syntax acisindan lazim

        System.out.println(Arrays.deepToString(cydeo)); // prints the whole 2D array -> so, we see all the groups in cydeo -> [[Alen, Tina, Alema, Nargiz], [Anam, Baz, Busra, Ostap], [Rabia, Shahad], [Ketino, Eylul, Nadia]]

        System.out.println(cydeo.length); // 4 --> how many inner, 1d array is there. It is counting how many elements in the 2d array

        System.out.println(cydeo[2].length);  // 2 --> how many elements in the array at index 2

        System.out.println(cydeo[0][3]); // --> accessing one specific String element from the inner array at index 0 and giving back the element at index 3 --> First array'deki 3.indextekini print ediyoruz boyle yazarsak. --> Nargiz will be printed

        System.out.println(Arrays.toString(cydeo[1])); // printing the whole inner element array at index 1 --> [Anam, Baz, Busra, Ostap]

        System.out.println("-----------");

        // how to loop through each inner array ((name in all groups)):

        for(String[] eachInner: cydeo) {    // each element is a String array. O yuzden bu sekilde yazdik --> to loop through a 2d array, the element's type is a 1d array
            System.out.println(Arrays.toString(eachInner));
        }  // [Alen, Tina, Alema, Nargiz]
           // [Anam, Baz, Busra, Ostap]
           // [Rabia, Shahad]
           // [Ketino, Eylul, Nadia]


        System.out.println("-----------");

        // how to loop through each name:
        for(String[] eachInner : cydeo){  // this will going to one at a one time. O yuzden index numbers girmemize gerek yok bunda, sunlara bak diye. Bastan sona hepsine bakacak bunda
            for(String eachName : eachInner){
                System.out.println(eachName); // now I'm going to see each name in a separate line
            }
        }
                 /*
                    Alen
                    Tina
                    Alema
                    Nargiz
                    Anam
                    Baz
                    Busra
                    Ostap
                    Rabia
                    Shahad
                    Ketino
                    Eylul
                    Nadia
                 */

        // how to loop through each name and print the first letter in uppercase:
        for(String[] eachInner : cydeo){
            for(String eachName : eachInner){
                System.out.print(eachName.substring(0,1).toUpperCase());
            }
        }
        // ATANABBORSKEN -> this will be printed. Her ismin ilk karakterini aldik, uppercase seklinde yazdirdik. Println yerine print ile yazdim ki alt alta olmasin.

        System.out.println();  // alttaki ornek de ustteki de print ile oldugu icin ikisinin cevaplarini ayirabilmek icin bunu koydum ki alta gecsin

        // how to loop through each name and print the last letter in uppercase:
        for(String[] eachInner : cydeo){
            for(String eachName : eachInner){
                System.out.print(eachName.substring(eachName.length() -1).toUpperCase());
            }
        }
        // NAAZMZAPADOLA -> this will be printed. Her ismin son karakterini aldik, uppercase olarak yazdirdik.

    }
}
