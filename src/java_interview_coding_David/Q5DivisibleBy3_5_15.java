package java_interview_coding_David;

public class Q5DivisibleBy3_5_15 {

    /* Divisible by 3, 5, 15:
     Q5: Write a program that can print the numbers between 1 - 100 that can be divisible by 3, 5, and 15.

        -> if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibleBy15 section

        -> if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibleBy3 section

        -> if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibleBy5 section

        ex: OutPut:
            Divisible By 15: 15 30 45 60 75 90
            Divisible By 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100
            Divisible By 3: 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
    */

    public static void main(String[] args) {
        divisibleBy();
    }

    public static void divisibleBy() {

        String divisibleBy15 = "";  // for concatenation, I start with this
        String divisibleBy5 = "";
        String divisibleBy3 = "";


        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0) {    // we can find divisibility with remainder operator : %
                divisibleBy15 += i + " ";  // after i, I did + " " for space between numbers on the console
            }

            if (i % 5 == 0 && i % 15 != 0) {
                divisibleBy5 += i + " ";
            }

            if (i % 3 == 0 && i % 15 != 0) {
                divisibleBy3 += i + " ";
            }
        }

        System.out.println("Divisible By 15: " + divisibleBy15);
        System.out.println("divisible By 5 : " + divisibleBy5);
        System.out.println("divisible By 3 : " + divisibleBy3);

    }
}

    /* // David's answer:

        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++)
            list.add(i + 1);

        for (int each : list) {
            if (each % 5 == 0 && each % 3 == 0)
                divisibleBy15 += each + " ";
            else if (each % 5 == 0)
                divisibleBy5 += each + " ";
            else if (each % 3 == 0)
                divisibleBy3 += each + " ";
        }

        System.out.println("Divisible By 15: " + divisibleBy15);
        System.out.println("Divisible By 5: " + divisibleBy5);
        System.out.println("Divisible By 3: " + divisibleBy3);
    }
     */


       /* for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0) {
                System.out.println(" Divisible By 15: " + i);
            }

            if (i % 5 == 0 && i % 15 != 0) {
                System.out.println(" Divisible By 5: " + i);
            }

            if (i % 3 == 0 && i % 15 != 0) {
                System.out.println(" Divisible By 3: " + i);
            }
        }  // end of the for loop
  }
}
        */

    // TODO : Ali Ihsan'in cozumunu atarsa ekle alta

