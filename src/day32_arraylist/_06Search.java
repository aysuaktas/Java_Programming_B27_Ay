package day32_arraylist;

import day29_my_utils._03EasyData;

import java.util.ArrayList;
import java.util.Arrays;

public class _06Search {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("friday", "java", "summer", "reading", "coding", "java", "coding", "java", "summer"));  // bazi elementleri multiple times yazdik
        System.out.println(searchInList(list, "java"));    // 3  --> 3 tane java var cunku ustte
        System.out.println(searchInList(list, "coding"));  // 2  --> 2 tane coding var
        System.out.println(searchInList(list, "friday"));  // 1

        System.out.println("-----------");

        // testing the EasyData: ---> day29_my_utils package'inda _03EasyData class'i olusturduk. Ondan buna method cagirmaca yaparsak:

        // ArrayList<String> test = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));  --> boyle de yapabilirdik ama bunu surekli create etmek yerine diger class'taki methodu cagirabiliriz.

        // above can only be used in this file, but below we are using the dynamic method that can create that arraylist with those values, and we can use them anywhere

        ArrayList<String> days = _03EasyData.getDaysOfWeek();
        System.out.println(days);  // [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]


    }

        public static int searchInList(ArrayList<String> list, String target){
            int count = 0;
            for(String each: list){
                if(each.equalsIgnoreCase(target)){
                    count++;
                }
            }
            return count;
        }








}
