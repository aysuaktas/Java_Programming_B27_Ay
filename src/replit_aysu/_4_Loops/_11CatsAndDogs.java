package replit_aysu._4_Loops;

import java.util.Scanner;

public class _11CatsAndDogs {

    /* very similar to previous example : CountHi

    Use a loop to count how many times the characters cat and dog are found in the given String str. Output true if cat and dog appear the same number of times, otherwise output false

    Ex:
  Input:
    catdog

  Output:
    true

    Ex:
  Input:
    catcat

  Output:
    false

     */

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

        int countCat = 0;
        int countDog = 0;  // // bunlari burada 0 vermezsen hata veriyor. Count yapabilmen icin once bir baslangic noktasi vermen lazim ki sonra increment yapabilesin

        for(int i=0; i < str.length()-2; i++){  //  normalde i <= dersek length()-1 yapiyorduk, esitlik yoksa -1 yapmiyordik. Ama bunda -2 yaptik cunku boyle olmasa son karakterden sonra iki tane index'e daha bakmaya calisir, ikinci ve ucuncu character olarak, ama elimizde oyle bir index olmadigi icin OutOfBounds exception olur

            if(str.substring(i, i+3).equals("cat")){  // bunda i'den baslattik, i+3'te bitirdik. Niyetimiz i'yi, i+1'i ve i+2'yi yani 3 karakteri almak. Substring'de ikinci konumdaki dahil edilmedigi icin bunu saglayabilmis olduk. Sadece lowercase cat istedigi icin de equalsIgnoreCase kullanmadik.
                countCat++;
            }

            if(str.substring(i, i+3).equals("dog")){
                countDog++;
            }

        }

        if(countCat == countDog){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

/*  Zeynep's solution instead of my last if statement
    boolean same = countCat == countDog;
    System.out.println(same);
    */

    }
}
