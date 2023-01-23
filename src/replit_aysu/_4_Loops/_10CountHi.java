package replit_aysu._4_Loops;

import java.util.Scanner;

public class _10CountHi {

    /*
    Use a loop to count how many times the characters hi are found in the given String str. Only consider the lowercase characters for hi.
     */

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

        int count = 0;  // bunu burada 0 vermezsen hata veriyor. Count yapabilmen icin once bir baslangic noktasi vermen lazim ki sonra increment yapabilesin

        for(int i=0; i < str.length()-1; i++){  // TODO: normalde i <= dersek length()-1 yapiyorduk, esitlik yoksa -1 yapmiyordik. Ama bunda esitlik isareti yokken -1 yaptik cunku boyle olmasa son karakterden sonra bir tane index'e daha bakmaya calisir ((son karakter kelimenin ilk harfi gibi olmak uzere)), ikinci character olarak, ama elimizde oyle bir index olmadigi icin OutOfBounds exception olur (( cunku asagida substring(i,i+2) yani i ve i+1'i aradigimi soyledim, o yuzden son karakterden sonra da i +2'yi bulmak icin devam edecek ama elimde oyle bir index yok

            if(str.substring(i, i+2).equals("hi")){   // bunda i'den baslattik, i+2'de bitirdik. Niyetimiz i'yi ve i+1'i almak. Substring'de ikinci konumdaki dahil edilmedigi icin bunu saglayabilmis olduk. Sadece lowercase hi istedigi icin de equalsIgnoreCase kullanmadik.
                count++;   // String ile olsa kelime sonuna ++ koymak hata veriyor, int count oldugu icin yapabildik ama
            }

        }

        System.out.println(count);

    }
}
