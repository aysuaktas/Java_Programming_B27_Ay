package day26_multi_dimensional_array;

import java.util.Arrays;
import java.util.Scanner;

public class _04Book {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many chapters do you want to write?"); // this will determine how many times the loop will continue
        int chapters = input.nextInt();
        input.nextLine();  // handle enter input -> bunun ustunden nextInt var ama sonra nextLine kullanacagiz, o yuzden empty bir nextLine yazmamiz lazim ki to handle enter input

        String[][] book = new String[chapters][];

        for(int i = 0; i < chapters; i++){
            System.out.println("Type your chapter");
            book[i] = input.nextLine().trim().split(" "); // reading a String from the console, then triming the extra spaces in the beginning and at the end, and finally splitting the array by the spaces, getting a String array with each word as a separate element. That String array is stored into the book 2D array.  --> split ile every word separated by space

        }

        System.out.println(Arrays.deepToString(book));

/*     Boyle run edince kitap chapter'larinin icine de virgul koyuyor.
    How many chapters do you want to write?
    4
    Type your chapter
    Chapter 1. Hello World. We print using println
    Type your chapter
    Chapter 2. We learned variables. Variables and datatypes allow us to store info
    Type your chapter
    Chapter 3. if statement, switch, ternary allow us to control the programs
    Type your chapter
    Chapter 4. Loops and array allow us much more fun programs
    [[Chapter, 1., Hello, World., We, print, using, println], [Chapter, 2., We, learned, variables., Variables, and, datatypes, allow, us, to, store, info], [Chapter, 3., if, statement,, switch,, ternary, allow, us, to, control, the, programs], [Chapter, 4., Loops, and, array, allow, us, much, more, fun, programs]]
 */



        // print each inner array, one at a time:

        for(int i = 0; i < book.length; i++){
            System.out.println(Arrays.toString(book[i]));
        }


        // print each word from the array, one at a time: --> bunu how traditional loop works in array'i gostermek icin yapti:

        for(int i = 0; i < book.length; i++){
            for(int j = 0; j < book[i].length; j++){
                System.out.println(book[i][j]);
            }
        }

        /*
        How many chapters do you want to write?
        3
        Type your chapter
        hello world java
        Type your chapter
        variable and datatypes
        Type your chapter
        if, loop, arrays more things
        [[hello, world, java], [variable, and, datatypes], [if,, loop,, arrays, more, things]]
        [hello, world, java]
        [variable, and, datatypes]
        [if,, loop,, arrays, more, things]
        hello
        world
        java
        variable
        and
        datatypes
        if,
        loop,
        arrays
        more
        things
         */


    }
}


