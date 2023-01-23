package day21_nested_loops;

public class _03MultiplicationTable {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){

            System.out.println("Table for " + i);

                /* ilk bu kismi ayri deneyip print edince console'da:
                 Table for 1
                 Table for 2
                 Table for 3
                 Table for 4
                 Table for 5
                 Table for 6
                 Table for 7
                 Table for 8
                 Table for 9
                 Table for 10
                 */

            for(int j = 1; j <= 10; j++){    // inner loop --> i'li olan degil inner'da yani icte olan. Mesela bu ornekte inner'da j kullandik

                // System.out.print(i * j + " " );    // i is the whatever number that I have -> multiply j --> we put the space after because we used print instead of println ve yan yana yazarken arada bosluk kalsin istiyoruz

                System.out.print(i + " x " + j + " = " + i * j + " | ");
            }
            System.out.println();

        /* Bu bos print statement'i yazdirmasak console'da boyle karisik oluyordu:
     Table for 1
     1 x 1 = 1 | 1 x 2 = 2 | 1 x 3 = 3 | 1 x 4 = 4 | 1 x 5 = 5 | 1 x 6 = 6 | 1 x 7 = 7 | 1 x 8 = 8 | 1 x 9 = 9 | 1 x 10 = 10 | Table for 2
     2 x 1 = 2 | 2 x 2 = 4 | 2 x 3 = 6 | 2 x 4 = 8 | 2 x 5 = 10 | 2 x 6 = 12 | 2 x 7 = 14 | 2 x 8 = 16 | 2 x 9 = 18 | 2 x 10 = 20 | Table for 3
        */

            // Ama duzeltince boyle oldu:
            /*
    Table for 1
    1 x 1 = 1 | 1 x 2 = 2 | 1 x 3 = 3 | 1 x 4 = 4 | 1 x 5 = 5 | 1 x 6 = 6 | 1 x 7 = 7 | 1 x 8 = 8 | 1 x 9 = 9 | 1 x 10 = 10 |
    Table for 2
    2 x 1 = 2 | 2 x 2 = 4 | 2 x 3 = 6 | 2 x 4 = 8 | 2 x 5 = 10 | 2 x 6 = 12 | 2 x 7 = 14 | 2 x 8 = 16 | 2 x 9 = 18 | 2 x 10 = 20 |

          */

        }








    }
}
