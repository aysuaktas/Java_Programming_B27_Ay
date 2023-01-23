package quiz_canvas;

import java.io.Console;
import java.util.Scanner;

public class _04Unit1AssessmentPart2 {

    public static void main(String[] args) {


        // output of following code:
        int check = 150;
        String str = "";

        if(check % 2 == 0){  // check = 150. 2'ye tam bolunur, true.
            str += check;  // String degeri olarak 150 console'da olacak. Check etmeye devam ediyoruz:
            if(check % 5 == 0){  // 150 degeri 5'e de tam bolunur, bu da true
                str += "132"; // 132 String degeri (int degil) de console'da yazacak
            } else {  // this will not get executed because inner if block (check % 5 == 0) is true
                str = "500";
            }
        } else {  // this will not get executed because outer if block (check % 2 == 0) is true
            str += "123";
        }

        System.out.println(str); // 150132


        System.out.println("----------------------");


        // output of following code:
        // Note: If statements are allowed in the case block.

        int num = 0;
        boolean b = false;

        switch (num){

            case 0: // The switch needs to match with case 0 which is the first case. The code will begin to executed from this point to the end of the switch or a break statement.
                b = true;  // b false'tu, reassign ettik true oldu. Break olana kadar yazdiracak alttakileri
            case 1:
                System.out.print(1);
            case 2:
                if(b){  // b= true dedik en son
                    System.out.print(2);
                } else {
                    b = false; // if block true, bu else block'u print etmeyecek bu yuzden. Break olmadigi icin case 3'e de gececek
                }
            case 3:
                if(b){  // b = true idi
                    System.out.print(3);
                    break;  // break var, gerisini print etmeyecek
                } else {
                    b = true;
                }
            case 4:
                System.out.print(4);
            case 5:
                if(!b){
                    break;
                }
                System.out.print(5);
        }
        // output is --> 123


        System.out.println("----------------------");


        // output of following code:
        // Console'da sirasiyla 7 ve 10 yazilmak uzere;

        Scanner scan = new Scanner(System.in);

        int one = scan.nextInt();  // 7 olsun dedik
        int two = scan.nextInt();  // 10 olsun dedik

        if(one-- > two * 2){   // 7 > 10 * 2 yani 7 > 20 ifadesi false, bu yuzden else block'u print eder
            System.out.println("one"); // bunu print etmez
        } else {
            System.out.println(two); // 10
        }
        // --> Output is -> 10


        System.out.println("----------------------");


        /*
        // What type for each case should be defined to allow the code to compile?

        Scanner in = new Scanner(System.in);
        int num = 0;

        switch(in.next()){
            case TYPE:
                num = 1;
                break;
            case TYPE:
                 num = 2;
                 break;
            case TYPE:
                 num = 3;
                 break;
          }
          System.out.println(num);

          --> Answer is --> String --> because it the method, next() method is used. int olsa nextInt, byte olsa nextByte, boolean olsa nextBoolean kullanilirdi. Ama String oldugunda next() veya nextLine() kullaniyoruz, bu nedenle String.

          Saim's explanation:
             The next() method from Scanner gives returns a String value, so if the value being checked is String type the cases should also be String type.
          */


          System.out.println("----------------------");


          // output of following code:
          // Console'da sirasiyla 20 ve 15 yazilmak uzere;

          Scanner userInput = new Scanner(System.in);

          byte b1 = userInput.nextByte();
          byte b2 = userInput.nextByte();

          int max = b1 > b2 ? b1 + 2 : b2 - 5;
        System.out.println(max); //--> 22 -> cunku b1'e 20 b2'ye 15 yazdigimizda b1 > b2 is true. True ise b1 + 2 demis. 20 + 2'den answer is 22.


        System.out.println("----------------------");


        /*
        // What modifications would allow us to print: James Bond (Select all that apply).
        // Console'da sirasiyla James ve Bond ve 7 yazilmak uzere;

        Scanner input;    // change this line to: Scanner input = new Scanner(System.in);  //-> because the given line did not have an object created, only the name/reference was declared without an actual object.

        String first = input.nextLine();
        String last = input.nextLine();
        int number = input.nextInt();   // numara 7 olsun diye belirtilmisti. Ama we need to change this line to: int number = input.nextInt() + 1 ((to make it even number))

        String fullName = "";

        if(number % 2 == 0){
            fullName = first + " " + last;
        } else {
            fullName = "Not valid name";   // bunu yazdirmasini istemiyoruz, isim-soyisim print etmesini istiyoruz. O yuzden yukarida 7 olan numarayi +1 ekleyip 8 yapma secenegini de isaretledik ki 8, 2'ye tam bolunebilsin ve if block dogru olsun, if block'taki statement yani isim soyisim print edilsin
        }

        System.out.println(fullName);
        */

        System.out.println("----------------------");


        // output of following code:
        // Console'da sirasiyla true ve false ve true yazilmak uzere;

        // Scanner scan = new Scanner(System.in);

        boolean isTall = scan.nextBoolean();  // true
        boolean isFast = scan.nextBoolean();  // false
        boolean isFlexible = scan.nextBoolean();  // true
        String sport = "";

        if(isTall){  // true

            if(isFast){   // false
                sport = "basketball";
            } else if(isFlexible){   // true
                sport = "gymnastics"; //so, this will printed
            } else {   // this will not get executed
                sport = "volleyball";
            }

        } else {  // outer if block'taki isTall true oldugu icin this will not be executed

            if(isFast){  // not executed
                sport = "soccer";
            } else {    // not executed
                sport = "tennis";
            }
        }
        System.out.println(sport);  // gymnastics








    }
}
