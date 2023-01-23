package day32_arraylist;

import java.util.ArrayList;

public class _02LoopList {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(8);
        nums.add(7);
        nums.add(3);
        nums.add(4);
        System.out.println(nums);  // [4, 8, 7, 3, 4]

        // get(0) get(1) get(2)  --> get(int): return the element at the given index number -> bunu loop ile yapinca get(i) diyoruz o kisim icin. Her bir dongude (loop'ta) tek tek starting point'teki index number'dan (genelde i = 0 dedigimiz) ending point'e kadar gidiyor.

        // We can print all of them in the same line dynamically with loop

        // with for loop:

        for(int i = 0; i < nums.size(); i++ ) {  // length for array or length() for String yerine -> ArrayList'te size kullaniyoruz -> size is telling us how many elements are there in an ArrayList

            System.out.print(nums.get(i) + " "); // array[i] --> TODO: array[i] yazdi Saim buna, why?
            // Sonucu -> 4 8 7 3 4  --> println yerine print ile yan yana yazdirdik. " " ile aralarinda bosluk biraktik

            // System.out.println(nums.get(i)); // bu alt alta yazdiriyor
        }

        System.out.println();  // println yerine print'ler arasinda alt satira gecmesi icin
        System.out.println("------------");

        // with for each loop:

        for(int each : nums){
            System.out.print(each + " "); // 4 8 7 3 4  --> println degil print ile yan yana yazdik //---->  get() the element methodunu kullanmama gerek yok cunku for each loop yapisi geregi tek tek sirasiyla tum elementlere bakacak
        }

        System.out.println();
        System.out.println("----- String example: ------");

        // Yine bu avengers verileri uzerinden bakarsak:

        ArrayList<String> avengers = new ArrayList<>();
        avengers.add("Iron Man");
        avengers.add("Spider Man");
        avengers.add("Thor");
        avengers.add("Captain America");
        avengers.add("Hawkeye");

        System.out.println(avengers); // [Iron Man, Spider Man, Thor, Captain America, Hawkeye]

        // TASK:
        // print the initials. If there is only one word, then print just the first letter:

        for(String each: avengers){

            if(each.contains(" ")) {    // each is every element. Datatype of each element is String. Space iceriyor mu diye baktim cunku space yoksa two words icermiyor

                int space = each.indexOf(" ") +1; // more readable ve reusable olmasi icin int space variable'i olusturduk
                System.out.println(each.substring(0, 1) + each.substring(space, space + 1)); // could have just use charAt()

            } else {
                System.out.println(each.charAt(0));  // charAt(0) is the first character for each word
            }
        }

        // yani mantigi boyle: If block icin dedik ki--> space varsa -> bir kelimeden fazla anlamina geliyor. O yuzden once substring ile 0. index'i yani ilk harfini aldik. Sonra space characterini bulup ikinci kelimenin de ilk harfini aldik. Initials olusturmus olduk. Else block ise -> eger space'imiz yoksa yani tek kelimeyse -> o zaman da 0. index'te olani aldik ki bu, kelimenin ilk harfi.

              /* console'da :
                     IM
                     SM
                     T
                     CA
                     H
               */



    }
}
