package day32_arraylist;

import day29_my_utils._03EasyData;

import java.util.ArrayList;

public class _07TestRandomData {

    public static void main(String[] args) {


        // testing the getRandomNumbers: ---> day29_my_utils package'inda _03EasyData class'i olusturduk. Ondan buna method cagirmaca yaparsak:

        System.out.println(_03EasyData.getRandomNumbers(10));   // 10 yazdigimizda 0'dan 1000'e kadar 10 tane random/rastgele number verecek bize. Her run ettigimizde farkli sonuc cikiyor

        ArrayList<Integer> nums = _03EasyData.getRandomNumbers(20); // 20 tane random number verecek
        System.out.println(nums);


    }
}
