package java_interview_coding_David;

public class Q3Finra_3_5 {


     /* Q3: Write a method which prints out the numbers from 1 to 30, but for numbers which are a multiple of 3, print "FIN" instead of the number and

     for numbers which are a multiple of 5, print "RA" instead of the number.

     For numbers which are a multiple of both 3 and 5, print "FINRA" instead of number.
    */

    public static void main(String[] args) {
        finra();

    }

    public static void finra(){

        for(int i = 1; i <= 30; i++) {


            if (i % 15 == 0) {  // first, we will check if they are divisible both of them together, because if they are, it will not check only 3 or only 5 ones
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }


        }

    }
}



    /*
    Firstly, I would create a method as public static void + and the name.

    While I am creating this method, I can use "public" access modifier to be able to reach across the project.

    Then, I can use static, because I do not need to create an object from it, I can call it by its class name. ((And our main method is static, and we cannot call instance methods in static, so I need to create static method. [[[[[[ Static methods can only use static variables and static methods. ---> Bunlari bil static'te, interview'da sorarlar]]]]]]

    Then, I can use "void" return type because I don't need to return any value.

    Method name should be "meaningful" and should reflect the issue, so I can call it as "finra".

        [[ Ustteki aciklamalari tam bilmiyorsan yapma, dedi David. Alttaki kismi anlattim o yuzden ]]

    ================================= I would create a public static void method with the name of finra.

    Inside this method, I would create a "for loop" which starts from ONE to THIRTY, including thirty.

    Inside the for loop, I would create an if-else statement.

         In the if block, I would start with the numbers which are divisible by three and five at the same time, because if they are, it will not check only 3 or only 5 ones for that number. So, in my if block, I would say that if the number is divisible by FIFTEEN (which is divisible by both three and five), print "Finra". For understand divisibility, we will use "remainder operator" with remainder, fifteen, equal equal, zero syntax.  [[[[[ Remainder operator'unu soylersin ]]]]]

      Then, I would create an else-if block to say: if the number is divisible by three, print "Fin".

      In the other else-if block --> if the number is divisible by five, print "Ra".

    If the numbers don't fit these criteria, I would just print them.

    Then, I would call this method inside my main method.

     */

    /* // David's answer:

    private static void Finra() {
          String result = "";

         for (int i = 1; i <= 30; i++) {
              if (i % 5 == 0 && i % 3 == 0)// or i%15==0;
                   result += "FINRA ";
              else if (i % 5 == 0)
                  result += "RA ";
              else if (i % 3 == 0)
                   result += "FIN ";
              else
                   result += i + " ";

           // result += (i % 5 ==0 && i %3 ==0)? "FINRA " : (i%5 == 0) ? "RA ":(i%3 == 0) ? "FIN " : i+" ";

        }
        System.out.println(result);
    }

     */




