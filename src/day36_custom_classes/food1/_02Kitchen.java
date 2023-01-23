package day36_custom_classes.food1;

import day36_custom_classes.food1._01Food;

import java.util.Arrays;

public class _02Kitchen {


    /*
      Create a separate class to create and test the Food objects
        -try making an array of Food objects
    	- find all the Food objects that start with 'a' and print the whole information
    	- find all the Food objects that have a total price over 7 and print the name of the food
         */

    // _01Food class'ini bunda run edecegiz.

    public static void main(String[] args) {

        _01Food[] allFood = new _01Food[5];    // I'm making an array that stores food elements -> size'i 5 olarak belirledim

        System.out.println(Arrays.toString(allFood)); // [null, null, null, null, null]

        _01Food apples = new _01Food("Apples");
        allFood[0] = apples; // I'm storing the Food object (apples) into the Food array
        allFood[1] = new _01Food("Sushi", 10);
        allFood[2] = new _01Food("Cajun Pasta", 2, 3.99);  // each Pasta is 3.99
        allFood[3] = new _01Food("Kebab", 5, 2.5);
        allFood[4] = new _01Food("Plov", 4, 2.99);
        System.out.println(Arrays.toString(allFood));  // [ < Name: apples > ,  < Name: Sushi, quantity: 10 > ,  < Name: Cajun Pasta, quantity: 2, unit price: $3.99, total price: $7.98 > ,  < Name: Kebab, quantity: 5, unit price: $2.5, total price: $12.5 > ,  < Name: Plov, quantity: 4, unit price: $2.99, total price: $11.96 > ]


    // _01Food class'inda daha duzenli dursun diye yazdigimiz return  " < " + str + " > ";  yerine onceden return str; yazdigimizda soyle olmustu:
    //  [Name: apples, Name: Sushi, quantity: 10, Name: Cajun Pasta, quantity: 2, unit price: $3.99, total price: $7.98, Name: Kebab, quantity: 5, unit price: $2.5, total price: $12.5, Name: Plov, quantity: 4, unit price: $2.99, total price: $11.96]


        System.out.println("------------------------");


        // print each Food object in a separate line

        for(_01Food each : allFood){
            System.out.println(each);
        }  // _01Food class'inda toString() methodu silersek bize sadece hashcode veriyor. O yuzden toString() cok onemli burada

    /* Print edince console'da:
        < Name: apples >
        < Name: Sushi, quantity: 10 >
        < Name: Cajun Pasta, quantity: 2, unit price: $3.99, total price: $7.98 >
        < Name: Kebab, quantity: 5, unit price: $2.5, total price: $12.5 >
        < Name: Plov, quantity: 4, unit price: $2.99, total price: $11.96 >
   */

        System.out.println("----------------------");


        // find all the Food objects that starts with 'A', or 'C', and print the whole information

        System.out.println("Food that starts with A or C");

        for(_01Food each: allFood){
            if(each.name.startsWith("A") || each.name.startsWith("C")){
                System.out.println(each);
            }
        }

        // Console'da:
        // < Name: Apples >
        // < Name: Cajun Pasta, quantity: 2, unit price: $3.99, total price: $7.98 >

        System.out.println("---------------------");

        // find all the Food objects that have a total price over 7 and print the name of the food

        System.out.println("Food that is over $7:");

        for(_01Food each: allFood){
            if(each.totalPrice >= 7){
                System.out.println(each.name);
            }
        }

        /*Console 'da:
        Cajun Pasta
        Kebab
        Plov
         */



    }
}
