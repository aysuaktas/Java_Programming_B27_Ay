package day47_collections;

import day29_my_utils._01StringUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _06Store {

    public static void main(String[] args) {

    // If I have an item, I will have a price:

        Scanner input = new Scanner(System.in);

        Map<String, Double> store = new HashMap<>(
                Map.of("Water", 2.99, "Bread", 4.55, "Milk", 2.89, "Fruits", 3.31)
        );
        System.out.println(store);  // {Water=2.99, Bread=4.55, Fruits=3.31, Milk=2.89}  --> Saim'de 2. ve 4.nun sirasi tam tersi?

            // I can change HashMap : I can add, I can remove, etc. Immutable map diye bir sey var. It allows us 'to define a bunch of information at one time'. Bunun icin de Map<String, Double> map = new HashMap<>(); yazdigimiz yerde sondaki parantezin icine alta gecip Map.of() yazdik ve yazacagimiz bunch of information'i da bunun icine yazdik


        /*

            containsKey -> String olanlar key. I'm checking keys. Ama user Water degil de WATER veya water yazarsa nasil yapacagiz?  ---> day29_my_utils package'inda _01StringUtil class'indaki fixFormat methodunu cagirarak!

      public static String fixFormat(String str){
      return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();     // first character uppercase olsun istiyoruz, o yuzden str.substring(0,1).toUpperCase() dedik. Kalani lowercase olacak. O yuzden str.substring(1).toLowerCase() dedik ki ilk harf (sifirinci index) sonrasinda yani birinci indexten baslayip sona kadar lowercase olsun
       }
         */

        // Scanner icin:

        System.out.println("What item are would you like?");
  //      String item = input.next();  --> buna ekleme yaptik case sensitivity konusunu cozmek icin:
        String item = _01StringUtil.fixFormat(input.next());  // calling out utility method to fix the formatting of the String  //-> user console'a bir item mesela water vs yazinca biz bunu fixed formatta yani ilk harf buyuk kalani kucuk yazmis olacagiz .fixFormat(input.next()); ile
        if(store.containsKey(item)){  // containsKey -> String olanlar key. I'm checking keys. Ama user Water degil de WATER veya water yazarsa nasil yapacagiz?
            System.out.println(item + " is in the stock!");
            System.out.println("Price is $" + store.get(item));  // get'in icine key yazdik, value'sunu verdi bize
        } else {
            System.out.println(item + " is not in the stock!");
        }


    }
}
