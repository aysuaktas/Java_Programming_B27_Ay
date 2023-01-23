package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class _04PartyList {

    /*
    We are throwing a party, we want to gather all the name
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many people are coming to the party?");
        int size = input.nextInt();

        String [] names = new String[size];  // new String[input.nextInt()];
        System.out.println(Arrays.toString(names));  // showing the empty array created, based on the size from the console // String oldugu icin console'da [null, null, null, null, null] yazdi. Int ile yaptigimizda ise null yerine 0 veriyordu bize her bir element icin

        /* Console'da;
        How many people are coming to the party?
        5  -> yazarsak
        [null, null, null, null, null]  -> null means there is no string object, nothing
         */


        for(int i = 0; i < names.length; i++){  // our purpose: ask for the name, and store to the array
            System.out.println("Enter the name of person " + (i + 1)); // burayi sadece i yaptigimizda Enter the name of person 0'dan basliyordu. Sifirinci insan olmaz, birinci olur. O yuzden i+1 yaptik --> if you don't have paranthesis [ when you say (i+1) ], the line will concatenate (from) left to right, but we want to do addition first as i + 1, then concatenate the message
            String guest = input.next();  // sadece first name'i alalim dedik o yuzden nextLine yerine next() kullandik
            names[i] = guest;  // names[i] = input.next();
        }
        System.out.println("Final list coming to the party:");
        System.out.println(Arrays.toString(names));


        /*
        How many people are coming to the party?
        3  -> yazinca
        [null, null, null]
        Enter the name of person 1   // System.out.println("Enter the name of person " + (i + 1)); --> bunda i+1 yerine i yapinca bu kisimda name of person 0 diye soruyordu. i+1 yapip onu duzelttik
        Zeynep  --> yazinca
        Enter the name of person 2
        Merve --> yazinca
        Enter the name of person 3
        Aysu  --> yazinca
        Final list coming to the party:
        [Zeynep, Merve, Aysu]
         */



    }
}
