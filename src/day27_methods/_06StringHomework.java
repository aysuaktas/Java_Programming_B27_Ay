package day27_methods;

public class _06StringHomework {

    /*  ((---> ben yapmadim))
    create a method that accepts a String and print each character of the String on a separate line
     */

    public static void main(String[] args) {

        eachCharacterOfString("Aysu & Furkan!");
        System.out.println();  // empty print statement
        eachCharacterOfString("We love Java!");
    }

    public static void eachCharacterOfString(String word) {

        /*  First way -> Merve's way
        for(int i = 0; i < word.length(); i++){
            char eachChar = word.charAt(i);
            System.out.println(eachChar);
        }
         */

        // Second way: -> Alina's way
        char[] arr = word.toCharArray();
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }



    }
}
