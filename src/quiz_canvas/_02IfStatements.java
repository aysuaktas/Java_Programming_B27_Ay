package quiz_canvas;

public class _02IfStatements {

    public static void main(String[] args) {

        int x = 8;
        int y = x++;    // x'in degeri hemen burada bir artti -> 9 oldu. y degeri x++ yani post increment oldugu icin next line'da 9 olacak, bu line'da halen 8.

        System.out.println(x+ " " + y);   // 9 8   ->  Iki deger arasinda string kullaninca addition olmadi, concatenation oldu. O yuzden 9 8 yaziyor 9+8'den 17 yazmasi yerine.

        System.out.println("------------------------");


        boolean X = false;
        boolean Y = !X;   // !false --> true
        boolean Z = X == false;   // Z != X  --> true

        if(X){
            System.out.println("Hello Everyone");
        }

        if(Y){
            System.out.println("Today is a great day");
        }

        if(Z){
            System.out.println("We are improving everyday");
        }

        /*
        Today is a great day
        We are improving everyday --> these are printed at console
         */


        System.out.println("------------------------");

        int score = 1;

        if(score == 0){
            score += 50;
        }

        if(score != 0){
            score *= 50;
        }

        System.out.println(score);    // 50

        /*
        int score = 1;  -> It is not ( != ) zero. So, score *= 50 -> score * 50 => 1 * 50 = 50
         */


        System.out.println("------------------------");


        double scoree = 87.38;
        int extraCredit = 4;


        if(scoree > 90 || (scoree > 85 && extraCredit > 3)){
        System.out.println("You've passed the exam");
         } else {
        System.out.println("You failed");
        }


        /*
        scoree 90dan buyuk degil, ilk kisim false. || (veya) sonrasina bakarsak -> scoree (87.38) > 85 && extraCredit (4) > 3 --> true. So, "You've passed the exam" will printed. Ikinci kisim da false olsaydi else block yani "You've failed" would be printed.
         */

        System.out.println("------------------------");

        int number = 10;

        if(--number >= 10){
            System.out.println("Hello Cydeo");
        } else {
            System.out.println("Hello Universe");
        }

        /*
        --number -> 9 oluyor. 9 >= 10 is false. So, else block will be printed: "Hello Universe"
         */

        System.out.println("------------------------");

        boolean A = false, B = !false;   // B false degil yani true

        if(A){
            System.out.println(1);
        } else if (B){
            System.out.println(2);
        } else {
            System.out.println(3);
        }

        /*
        A is false, so if block will not be printed.
        B is !false = true. So, else if block will be printed and there will be "2" on the console.
        B is already written, so else block will not be run even it is true.

        Console:    2

         */

        System.out.println("------------------------");

        System.out.println(5 % 5 == 0 ? "First" : "Second");

        /*
        This is a ternary example. 5'in 5'e bolumunden kalan 0 -> true. So, -> on the console, "First" will be written.
         */


    }
}
