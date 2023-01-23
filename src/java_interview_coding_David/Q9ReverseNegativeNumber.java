package java_interview_coding_David;

public class Q9ReverseNegativeNumber {

    /*
    Write a return method that can reverse negative number and return it as int
        for example:
            input  :     -12345
            output :     -54321
     */

    public static void main(String[] args) {

        System.out.println(reverseNegativeNumber(-12345));  // -54321

        System.out.println(reverseNegativeNumber(12345));   /*  Invalid. Expected number must be negative!
                                                                12345
                                                            */
    }


    public static int reverseNegativeNumber(int num) {   // int num ->  -12345

        if(num < 0) {
            num = num * -1;  // 12345 ---> because otherwise, its reverse : 54321-
            String str = String.valueOf(num);  // valueOf --> (wrapper class method) -> returns wrapper class object ((from primitive))
            String reverse = "";  // String variable ->// to use String methods --> "12345" as String -> add one by one in for loop

            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);  // charAt() -> returns to character at given index number  -->  "54321"
            }

            int reversedResult = Integer.parseInt(reverse);  // parse --> (wrapper class method) -> returns primitive type --> 54321

            return reversedResult * -1;  //  -54321

        } else {
            System.out.println("Invalid. Expected number must be negative!");
            return num;
        }
    }
}

    /* // David's answer:

    private static int reverseNumber(int num) {

        //-1235677
        String str = new StringBuilder("" + num).reverse().toString();
        //System.out.println(str);
        //7765321-
        if (num < 0) {
            str = "-" + str.substring(0, str.length() - 1);
        }
        return Integer.valueOf(str);
    }
     */
























    /*
    // Merve's solution:

     public static int reverseNumber(int number) {

         if (number < 0) {
             number = number * -1;   // 6789  // eksiyi yok ettim
             String strNum = Integer.toString(number);  // int string oldu -> wrapper class methodu old Integer -> "6789" as String
             String reverseStr = ""; // for loopta tek tek eklemek icin -> "9876"
             for (int i = strNum.length() - 1; i >= 0; i--) {
                 reverseStr += strNum.charAt(i);
             }
             int result = Integer.parseInt(reverseStr); // String'i primitive integera cevirmek icin -> 9786

             return result * -1; // negative olsun diye

         } else {
             System.out.println("Invalid number");
             return number;
         }
     }

    public static void main(String[] args) {
        System.out.println(reverseNumber(-678854));
        System.out.println(reverseNumber(67));
    }
}
     */


    /*
    // Zeynep's solution:


    public static void reverseNegativeNumber(int number) {

        number = -number;
        String str = String.valueOf(number);
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        int reversed = Integer.parseInt(reverse);
        System.out.println(-reversed);

    }

    public static void main(String[] args) {
    reverseNegativeNumber(-678854);
    }
}
     */






