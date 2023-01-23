package day33_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class _01HidePassword {

    /* It was yesterday's homework
    Hide passwords

    Given an ArrayList of passwords (String). Hide each password in a star (*) format where each character is a star and print the ArrayList of hidden passwords
        Ex:
        Input:
        {"one", "hi", "hold}

        Output:
        [ ***, **, **** ]
     */

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "monday"));
        System.out.println(hidePassword(list));  // [***, ***, *****, ******]

    }


    public static ArrayList<String> hidePassword(ArrayList<String> list) {

        ArrayList<String> hidden = new ArrayList<>();

        for (String each : list) {

            String stars = "";

            for(int i = 0; i < each.length(); i++){
                stars += "*";
            }
            // hidden.add(stars); da dedik diger yolda
            hidden.add(numOfStars(each.length())); // alttaki numOfStars methodunu cagiriyorum burada. Mesela hi kelimesi icin kelime uzunlugu iki. O zaman numOfStars methodunda for loop'taki i < length kisminda length yerine 2 gibi dusunecegiz

        }

        return hidden;

    }


    public static String numOfStars(int length){
        String stars = "";

        for(int i = 0; i < length; i++){
            stars += "*";

        }
        return stars;
    }


    /*
    original version of hidePassword method

    public static ArrayList<String> hidePassword(ArrayList<String> list){

        ArrayList<String> hidden = new ArrayList<>();

        for(String each : list){

            String stars = "";

            for(int i = 0; i < each.length(); i++){
                stars += "*";
            }

            hidden.add(stars);

        }

        return hidden;
    }

     */


}
