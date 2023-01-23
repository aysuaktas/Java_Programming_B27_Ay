package quiz_canvas;

public class _03Unit1AssessmentPart1 {

    public static void main(String[] args) {


        /* package - import - class order; Saim's explanation:

            The order of these parts of a java file are fixed. It is not mandatory to have a package or import, but when you do, they must be in order relative to each other. Order will always be package→import→class. In the case were there is no package or import the other parts will still maintain order according to where they should be. PIC is a short acronym to remember the order.
         */

        /*
        Definitions:

        - main method : used to execute code
        - System.out.println() : used to display information to the console
        - class : part of java file where code is written
        - package : a folder to group java files

        - java.lang --> package that is automatically imported
            (--> Saim's explanation: The classes in the java.lang package are automatically imported. Classes in this package include the String class and System class)

         */

        // output of following code:
        short s = 20;
        byte b = (byte)s;
        System.out.println((float)b);  // --> 20.0

        // Saim's explanation -------> A short variable s is defined with a value of 20. That variable was cast to a byte type and declared with the new byte variable b. The b variable is then cast to a float type, so the result printed would be 20.0


        System.out.println("----------------------");


        // output of following code:
        int num = 15;
        System.out.println(++num + " " + num++);  // --> 16 16


        System.out.println("----------------------");


        // output of following code:
        int x = 3 * 10;  // 30
        x += -10;  // 20
        x = x - 5;  // 15
        System.out.println(x);   // --> 15


        System.out.println("----------------------");


        //output of following code:
        boolean one = false && 'c' == 'z';  //false
        boolean two = one || true;  // --> true (because false || true -> at least one true -> so, true)
        System.out.println(two);  // --> true


        System.out.println("----------------------");


        /*
        // select all the valid types that allow the program to compile;
        long l = 100;
        short s = (HERE)(l+10);
        System.out.println(s);

        ---> HERE yazan yere secenekler arasindaki int, long, double olmaz. Byte ve short olur.

        Saim's explanation:
            The value types allowed in the parenthesis would be short and byte. Short is allowed because it is the matching datatype of that variable, but the byte type is also valid because casting the value of l + 10 to a byte and then assigned to a short value is okay. The byte type is smaller than short, so it will automatically be assigned to the bigger type. Another note is the first long l variable being assigned 100. 100 is int by default but int number is also smaller than long so there is no problem to assign smaller types to a bigger datatype.
         */

        System.out.println("----------------------");


        // output of following code:
        byte d = 50;
        boolean check = d < 100;  // true because 50 < 100

        if(check){  // true oldugu icin bunu execute edecek
            d -= 25;  // 25 --> (50-25'ten)
        } else {   // bunu execute etmeyecek
            d = 100;
        }
        System.out.println(d);  // --> 25


        System.out.println("----------------------");


        // output of following code:
        boolean e = false;

        if(!e){  // !false yani true ise demis. Bu nedenle if block statement'i print edilir.
            System.out.println("Java");
        } else {
            System.out.println("Soft skills");
        }
        // -> Java will be printed.


        System.out.println("----------------------");


        // output of following code:
        int cookies = 10;
        String day = "Friday";

        switch (day){
            case "sunday":
                cookies++;
            case "monday":
                cookies += 5;
                break;
            case "tuesday":
            case "wednesday":
                cookies += 10;
            case "thursday":
                cookies += 5;
                break;
            case "friday":
                break;
            case "saturday":
                cookies--;
                break;
            default:
                cookies = 0;
        }

        System.out.println(cookies);  // --> 0 --> answer is zero because of the case sensitivity. We do not have "Friday" with uppercase in any of our cases. So, none of them will be matched. So, default will be printed. Default block says cookies = 0, so this is the answer.


        System.out.println("----------------------");


        // output of following code:
        // remember that += is shorthand for concatenation with Strings

        String str = "";  // String str is defined with an empty space
        int number = 35;

        switch(number){
            case 0:
                str = "C# ";
                break;
            case 10:
                str += "is ";
            case 15:
                str = "fun ";
            case 20:
                str += "java ";
            case 25:
                str += "is ";
                break;
            case 30:
                str += "fun";
                break;
            case 35:   // int number = 35 oldugundan bununla match'lesti
                str = "python";  // bundan sonra break; olmadigi icin bunu ve bir daha break olana kadar tum statement'leri print edecek.
            case 40:
                str += "90";  // ustte break; olmadigi icin bunu da print ediyor
        }
        System.out.println(str);  //--> pyhton90


        System.out.println("----------------------");


        // output of following code:
        double pi = 3.14;
        boolean g = pi == 3;  // false because g = 3.14, not 3
        int numberr = 0;

        if(pi >= 3.14 && !g){  // pi >= 3.14 is true && !false is false olmayan yani true --> true
            numberr += 50; // if block is true, so this will be printed. Numberr was zero. Now it is 0 + 50 = 50
        } else {  // this else block will not be executed
            numberr -= 50;
        }

        if(g){  // boolean g was false. False oldugu icin this will not be executed
            num += 50;
        }

        System.out.println(numberr);  //--> 50


        System.out.println("----------------------");


        // output of following code:
        double decimal = 15.64;
        int whole = decimal > 20 ? 20 : 10;  // 15.64 > 20 ifadesi false. Bu nedenle ilk kisimdaki 20 degil, ikinci kisimdaki ( else anlaminda kullanilan : isareti sonrasindaki 10 will be printed)
        System.out.println(whole);  // --> 10


        System.out.println("----------------------");

        /*
        // output of following code:
        boolean check = true;
        String str = check ? 5 : 10;
        System.out.println(str == 10);

        Output is --> //--> Compile time error

        Saim's explanation:
            This is another ternary question focused on the values being assigned in relation to the expression. The variable declared to store the value of the ternary is a String str so the value being assigned should also be a String, but the options defined from the ternary are 5 and 10 which are int type. To program will have a compile time error because int types are trying to be stored into a String variable.

         */




    }
}
