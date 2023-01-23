package day31_arraylist;

import java.util.ArrayList;

public class _08ArraylistMaxElementHomework {

    /*
    Try to loop:

        Create an ArrayList of Double elements
        Fill the ArrayList with some values
        Find the max element from the ArrayList
     */

    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();

        numbers.add(0.5);
        numbers.add(9.2);
        numbers.add(4.18);
        numbers.add(12.518);


            // First way:  with for loop:
        double max = numbers.get(0); // TODO: direkt 0 yazinca hata veriyor, bu sekilde olmali

        for(int i = 0; i < numbers.size(); i++){  // double degil int cunku baslangic noktasina 0 derken kastettigimiz sifirinci index
            if(numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        System.out.println(max);  // 12.518



        /*
            // Second way:  with for each loop:

        double max = numbers.get(0);

        for (double each: numbers) {
            if (each > max) {
                max = each;
            }
        }
        System.out.println(max);  // 12.518
        */



    }
}
