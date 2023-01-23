package java_interview_coding_David;

public class Q6PrintConsecutiveNumbers {  // consecutive = ardisik

    /*
    Q6: Numbers -- print consecutive numbers

    Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.

    However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.

    If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.

        For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

    For example, here is the output for N = 24:
        1
        Codility
        Test
        Codility
        Coders
        CodilityTest
        7
        Codility
        Test
        CodilityCoders
        11
        CodilityTest
        13
        Codility
        TestCoders
        Codility
        17
        ....
     */

    public static void main(String[] args) {
        consecutiveNumbers(24);
    }

    public static void consecutiveNumbers(int N){  // N -> int num parameter

        String divisibleBy2 = "Codility";  // for reusability in the code, I created some variables like divisibleBy2.
        String divisibleBy3 = "Test";
        String divisibleBy5 = "Coders";

        for(int i = 1; i <= N; i++){
            if (i % 30 == 0){   // instead of doing separately 2, 3, and 5 as : i % 2 == 0 && i % 3 == 0 && i % 5 == 0  -> we can do i % 30 == 0 ((because 2 * 3 * 5 = 30))

                // in multi-branch if statement, we need to start from general one to specific ones.  --> I used remainder operator and && (and) operator. I have to start to rare one. More specific need to be at the top and we will continue with more general ones.
                System.out.println(divisibleBy2 + divisibleBy3 + divisibleBy5);  // CodilityTestCoders   --> the most general condition here.
            } else if (i % 2 == 0 && i % 3 == 0){
                System.out.println(divisibleBy2 + divisibleBy3);  // CodilityTest
            } else if (i % 2 == 0 && i % 5 == 0){
                System.out.println(divisibleBy2 + divisibleBy5);  // CodilityCoders
            } else if (i % 3 == 0 && i % 5 == 0){
                System.out.println(divisibleBy3 + divisibleBy5);  // TestCoders
            } else if (i % 2 == 0){
                System.out.println(divisibleBy2);  // Codility
            } else if (i % 3 == 0){
                System.out.println(divisibleBy3);  // Test
            } else if (i % 5 == 0){
                System.out.println(divisibleBy5);  // Coders
            } else {
                System.out.println(i);  // number itself
            }

        }  // end of for loop
    }
}

    /* // David's answer:

    public static void consecutiveNumbers(int N) {
        String result = "";
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0)
                result += "CodilityTestCoders\n";
            else if (i % 2 == 0 && i % 3 == 0)
                result += "CodilityTest\n";
            else if (i % 2 == 0 && i % 5 == 0)
                result += "CodilityCoders\n";
            else if (i % 3 == 0 && i % 5 == 0)
                result += "TestCoders\n";
            else if (i % 2 == 0)
                result += "Codility\n";
            else if (i % 5 == 0)
                result += "Coders\n";
            else if (i % 3 == 0)
                result += "Test\n";
            else
                result += i + "\n";
        }
        System.out.println(result);
    }
     */


    /* Zeynep's alternative solution:

        public static void consecutiveNumbers(int N) { // another solution but not shorter
        for (int i = 1; i <= N; i++) {

            if (i % 2 == 0) {
                System.out.print("Codility");
                if (i % 3 == 0) {
                    System.out.print("Test");
                }
                if (i % 5 == 0) {
                    System.out.print("Coders");
                }
                System.out.println();
                continue;     // continue yapinca digerlerine bakmiyor, dogru mu?? Ogren.
            }
            if (i % 3 == 0) {
                System.out.print("Test");
                if (i % 5 == 0) {
                    System.out.print("Coders");
                }
                System.out.println();
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Coders");
            } else {
                System.out.println(i);
            }
        }
    }
     */