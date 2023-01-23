package practices_group_15;

import java.util.Scanner;

public class _02_DecrementIncrement_LogicalAndIf {

    public static void main(String[] args) {


        int num10 = 5;
        int num1 = 10;
        num1 = num1++;    // it is 11 now

        if (10 < ++num1 || 5 > num10++) {
            System.out.println(num1);
            // Logical and kullansaydik -> if statement'inde logical and (&&) icin iki tarafin da true olmasi gerektigi ama bu statement'te iki taraf da true olmadigi icin -> it will not be printed on the console.

            // Logical and'de (&&) ilk condition false ise -> no need to check the other one. Ilki true degilse JVM gidip ikinci kismi check etmez cunku JVM tries to save time.

            // Logical or'da ( || ) ise -> iki statement'ten en az birinin true olmasi lazim. Tek or isareti | de olabilirdi, o zaman ilk kısımdan sonra JVM eger gerekmezse (ilki true ise) ikinci kısmı execute etmiyor. JVM tries to save time. 10 < 11 oldugu icin en az biri dogru, it will be printed.

            System.out.println("davidJacobs" + num1);   // bu da ayni if statement'in icinde. Ama eger if statement'i yazdiktan sonra curly brackets { } koymazsak sadece ondan sonraki ilk statement if ile ilgili olur. Other statements will be separate. For ex:
        }

        System.out.println("------------------------------");

        if(4 > 5)   // boyle yazip sonuna curly brackets koymazsak;
            System.out.println("davidChecks sth");  // it's about if statement -> condition in if statement is false -> it will not be printed
            System.out.println("dacidChecks sth 2");  // it is not about if statement because there is no curly brackets on if statement -> it is not about if statement, so even if statement is false, this will be printed.


        System.out.println("------------------------------");

        if (10 > 11 || 5 > num10++) {
            System.out.println("davidJacobs" + num10); // iki condition da false oldugu icin bu statement will not be printed.
        }

        if (10 < 11 || 5 > num10++) {
            System.out.println("davidJacobs" + num10);  // 10 < 11 true oldugu icin console'da yazacak -> davidJacobs6  // onceden int num10 = 5 demistik, sonra da bir ustte bir kez num 10++ kullandik. Onda print edilmeyen +1 simdi edilecek o yuzden num10 = 6 oldu
        }

        System.out.println("------------------------------");

        /*
        How to create a Scanner object? -> Scanner input = new Scanner(System.in);    --> remember the syntax to create a scanner (only name changes)

        After I create that Scanner, we need a method  -> String name1 = scan.next();  etc   --> Be careful to use correct method for your dataType to use

        nextInt() for your int, nextDouble() for your double, etc. However, there is no next.char() method in Scanner class

        next() is for strings of one word (no space);
        nextLine() grabs everything with spaces more than one word

        Empty nextLine() -> grabs the enterKey if the previous scanner method is not nextLine()

         */

        System.out.println("------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your name ");
        String name1 = scan.next();
        System.out.println(name1);
        System.out.println("please enter your id ");
        int id = scan.nextInt();
        System.out.println("id = " + id);  // 123 ENTER
        scan.nextLine();  // empty nextLine() ---> ENTER after your id goes here and you can now use the nextLine() in the following statement
        System.out.println("please enter your department");
        String dep = scan.nextLine();
        System.out.println("dep = " + dep);


        System.out.println("------------------------------");

        num1 = 10;
        num10 = 5;
        if (10 < 11 || 5 > num10++){
            System.out.println(num1);
            System.out.println("davidJacobs" + num1);
        } else if (5 > 10){
            int num6 = 566 * 789;
            System.out.println(num6);
        } else {
            System.out.println("both false so you are in else");
        }
        System.out.println("num1====> " + num1++);
        num1++;
        System.out.println("num1====> " + num1++);
        System.out.println("num1====> " + num1);
        System.out.println("end of if");


    }
}
