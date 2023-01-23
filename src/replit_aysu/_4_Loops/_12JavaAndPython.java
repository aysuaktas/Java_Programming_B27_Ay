package replit_aysu._4_Loops;

import java.util.Scanner;

public class _12JavaAndPython {

    /*  // CountHi ornegi ve CatsAndDogs ornegi ile ayni

    Use a loop to count how many times the characters java and python are found in the given String sentence. Output true if java and python appear the same number of times, otherwise output false.
Note: Case sensitivity should be considered. We are looking for the lowercase character versions of both Strings

        Ex:
  Input:
    We study java not python

  Output:
    true

    ---------------

        Ex:
  Input:
    What's the difference between java, javascript and python?

  Output:
    false

  -> the 'java' characters appear 2 times in the String but the 'python' characters appear only 1 time.

  ---------------------

        Ex:

        Ex:
  Input:
   Java is a general-purpose computer-programming language that is concurrent, class-based, object-oriented,[15] and specifically designed to have as few implementation dependencies as possible.

  Output:
    true

  -> The first word 'Java' is not counted because it starts with the uppercase 'J', so the number of times 'java' and 'python' appear in this String is 0 and 0 and since they are the same, the output is true
     */

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        //WRITE YOUR CODE BELOW


        int countJava = 0;
        int countPython = 0;  // // bunlari burada 0 vermezsen hata veriyor. Count yapabilmen icin once bir baslangic noktasi vermen lazim ki sonra increment yapabilesin

        for(int i=0; i < sentence.length()-3; i++) {  //  normalde i <= dersek length()-1 yapiyorduk, esitlik yoksa -1 yapmiyordik. Ama bunda -3 yaptik cunku boyle olmasa son karakterden sonra uc tane index'e daha bakmaya calisir, ikinci, ucuncu ve dorduncu character olarak, ama elimizde oyle bir index olmadigi icin OutOfBounds exception olur

            if (sentence.substring(i, i + 4).equals("java")) {  // bunda i'den baslattik, i+4'te bitirdik. Niyetimiz i'yi, i+1'i, i+2'yi ve i+3'u yani 4 karakteri almak. Substring'de ikinci konumdaki dahil edilmedigi icin bunu saglayabilmis olduk. Sadece lowercase 'java' istedigi icin de equalsIgnoreCase kullanmadik.
                countJava++;
            }
        }

        for(int i = 0; i < sentence.length()-5; i++){
            if(sentence.substring(i, i+6).equals("python")){
                countPython++;
            }

        }

        if(countJava == countPython){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

/* instead of my last if statement
    boolean same = countJava == countPython;
    System.out.println(same);
    */


    }
}
