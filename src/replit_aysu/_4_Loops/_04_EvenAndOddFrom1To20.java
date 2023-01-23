package replit_aysu._4_Loops;

public class _04_EvenAndOddFrom1To20 {

    /*
    Use a loop to print all the even numbers from 1 to 20. Print each number on the same line, with spaces between each
    Use another loop to print all the odd numbers from 1 to 20. Print each number on the same line, with spaces between each
        Note: In the end there will be two lines. First the line to show all the even numbers and then another line to show all the odd numbers
     */

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for (int j = 1; j <= 20; j++){
            if (j % 2 == 1){
                System.out.print(j + " ");
            }
        }

        /* Iroda Abdusalamova's solution --> benim method ile yapinca sondaki bosluk sorun cikariyordu replitte.

        String even = "";
    String odd = "";
    for (int number = 1; number <= 20; number++) {
      if (number % 2 == 0) {
        even = even + number + " ";    // even += number + " ";
      }
    }

    for (int number = 1; number <= 20; number++) {
      if (number % 2 == 1) {
        odd = odd + number + " ";

      }
    }
    System.out.println(even.trim());
    System.out.println(odd.trim());

  }
}
         */




    }
}
