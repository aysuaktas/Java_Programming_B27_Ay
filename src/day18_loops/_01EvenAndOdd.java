package day18_loops;

public class _01EvenAndOdd {

    public static void main(String[] args) {

        int limit = 100;
        int count = 1;


        // printing all the even numbers:

        while(count <= limit){  //bu dogru oldukca print olmasini istiyorum --> // run for limit number of times. Go from 1 to limit.
            if(count % 2 == 0){  // count (hardcoded olarak 1 belirledik) 2'ye evenly (kalansiz bir sekilde) bolunuyor mu diye bakiyoruz (yani cift sayi mi diye)
                System.out.print(count + " ");   // println degil print method ile yaptik. sadece System.out.print(count); seklinde yapinca cift sayilari araliksiz yaziyor 2468101214...., such a mass. O yuzden count + " " yapti ki sayilarin arasinda space olsun --> 2 4 6 8 10...
                count++; // bunu eklemezsek my number is always 1, so it is always true, so it wouldn't stop -> infinite loop olurdu
            }
            count++;
        }



        System.out.println();  // empty print statement - ornekleri ayirmak icin


        // print all the odd numbers from limit to 1, backwards order:

        int back = limit;  // starting number based on the limit variable --> // limite yukarida 100 demistik, o degeri degistirirsek bu da degisebilsin, dynamic olsun diye buraya da 100 yazmak yerine limit variable'ini yazdik.

        while(back >= 1){  // back <= 1 yazarsak 100 <= 1 statement'i false -> beginning'de daha buradaki gibi yanlis ise code does not even run.
            if(back % 2 == 1){ // checks for odd != 0
                System.out.print(back + " ");  // yan yana yazsin diye println yerine print() kullandik. Aralarinda bosluk olup daha readable olsun diye (back + " ") yapip bosluk biraktik
            }
            back--;
        }



    }
}
