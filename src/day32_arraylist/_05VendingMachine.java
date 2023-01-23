package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _05VendingMachine {

    public static void main(String[] args) {

        /*
        // Older approach: use add method many times (again and again):
        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("Soda");
        drinks.add("Juice");
        drinks.add("Water");
        drinks.add("Coffee");
        System.out.println(drinks);  // [Soda, Juice, Water, Coffee]
         */

        Scanner input = new Scanner(System.in);

        // same thing with new approach
        ArrayList<String> drinks = new ArrayList<>(Arrays.asList("Soda", "Juice", "Water", "Coffee"));  // same exact ArrayList. Ama tekrar tekrar add method'unu kullanmak yerine asList deyip parantez icine hepsini arasina virgul koyarak yazdik, yeni method bu

        System.out.println("Welcome! Which drink would you like?");
        String selection = input.next();  // ((tek kelime, next() yeterli o yuzden. nextLine()'a gerek yok)) --> _01StringUtil.fixFormat(input.next)); -> case sensitivity etkilemesin istiyorsak day29_my_utils package'da _01StringUtil class'inda fixFormat vardi, onu kulanmak icin



        if(drinks.contains(selection)){   // eger (Arrays.asList("Soda", "Juice", "Water", "Coffee") icine yazdiklarimizdan biriyse if block will run
            System.out.println(selection + " is vending");
        } else {   // eger belirtmedigimiz bir sey yazilirsa else block will run.
            System.out.println(selection + " is not in the vending machine");
        }

        /*
        Welcome! Which drink would you like?
        Water
        Water is vending
        ---------------------
        Welcome! Which drink would you like?
        ice
        ice is not in the vending machine
         */




    }
}
