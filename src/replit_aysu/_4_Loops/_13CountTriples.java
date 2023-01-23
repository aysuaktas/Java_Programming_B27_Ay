package replit_aysu._4_Loops;

import java.util.Scanner;

public class _13CountTriples {

    /*
    Use a loop to count the number of triples in the given str. A triple is when the same character appears three times in a row. So if there is a specific character that is repeated three times, that will be counted as one triple. Print the total number of triples found in the String. The triples may overlap.

    Ex:
  Input:
    abcXXXabc   // abc abc gibi degil ayni karakterden arka arkaya uc tane olmasi lazim aaaXXXbbb falan olsa 3 olurdu ama bunda 1 oldu

  Output:
    1
   ---------------
   Ex:
  Input:
    xxxabyyyycd

  Output:
    3

  -> the triples found are xxx yyy and another yyy
  -----------------
  Ex:
  Input:
    java

  Output:
    0
     */

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        //WRITE YOUR CODE BELOW

        int count = 0;
        for(int i = 0; i < str.length() - 2; i++) {   // normalde i <= dersek length()-1 yapiyorduk, esitlik yoksa -1 yapmiyordik. Ama bunda esitlik isareti yokken -2 yaptik cunku boyle olmasa son karakterden sonra iki tane index'e daha bakmaya calisir, ikinci ve ucuncu character olarak, ama elimizde oyle bir index olmadigi icin OutOfBounds exception olur
            if(str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2) ){
                count++;
            }
        }
        System.out.print(count);

    }
}
