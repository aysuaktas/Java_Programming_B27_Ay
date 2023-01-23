package day29_methods;

public class _04FrequencyOfCharacters {

    /*
    given a String and char determine how many times the given char is found in the String

          For ex:  "java" is my word ise a specific character'in how many times olduguna bakacagim, mesela a karakterine bakalim
               a  >>>>> 2
     */

    public static int frequencyOfChar(String str, char letter){  // int dedik cunku frequency of characters sonucu int olacak yani I'm looking for int
        int count = 0;  // 0 is a good default value because if there is not any, it will print 0 for a character's frequency
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == letter){  // mesela kelime java ise gelip bu kelimenin karakterlerini tek tek charAt(i)'deki i icinde dusunursek; j == a mi, no. a == a mi? yes, count became 1. v == a degil, geciyoruz. a == a --> count 2 olur bu sayede
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChar("java", 'a'));   // 2
        System.out.println(frequencyOfChar("apple", 'a'));  // 1
        System.out.println(frequencyOfChar("apple", 'p'));  // 2
        System.out.println(frequencyOfChar("Mississippi", 'i'));  // 4
        System.out.println(frequencyOfChar("Mississippi", 's'));  // 4
    }


}
