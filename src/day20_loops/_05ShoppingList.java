package day20_loops;

import java.util.Scanner;

public class _05ShoppingList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String list = "";

        while(true){  // this is infinite ama for now it is okay because we will stop in break

            System.out.println("Enter an item");
            list += "\n* " + input.nextLine();  // -> listedeki okunurluk acisindan basina "\n* " ekledik ki her bir item icin alt satira gecsin ve oncesine * isareti koysun

            System.out.println("Do you want to add another item");

            if(input.nextLine().equalsIgnoreCase("no")){
                break;   // user no deyip baska bir sey istemeyince my loop/program will stop
            }
        }

        System.out.println(list);

        /*
            Enter an item
            apple  --> dersek
            Do you want to add another item
            yes  ---> dersek
            Enter an item
            oat milk  ---> dersek
            Do you want to add another item
            yes  ---> dersek
            Enter an item
            tomatoes  ----> dersek
            Do you want to add another item
            no ---> dersek

            * apple
            * oat milk
            * tomatoes

         */










    }
}
