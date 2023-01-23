package day16_string;

public class _01LongestA_RecapOfHomework {

    /* // TODO: check this example again
    ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

    Challenge: Instead of just checking for "a" add another variable that can be used to check for any character.
     */

    public static void main(String[] args) {


        /*
        String word1 = "java";
        String word2 = "mouse";
        String word3 = "computer";

        int word1Len = word1.length();
        int word2Len = word2.length();
        int word3Len = word3.length();

        if(word1.contains("a") && word1Len > word2Len && word1Len > word3Len){
            System.out.println(word1 + " is the longest with a");
        } else if(word2.contains("a") && word2Len > word1Len && word2Len > word3Len){
            System.out.println(word2 + " is the longest with a");
        } else if (word3.contains("a") && word3Len > word1Len && word3Len > word2Len){
            System.out.println(word3 + " is the longest with a");
        } else {
            System.out.println("No one word was the longest");
        }

         */

        String word1 = "java";
        String word2 = "mouse";
        String word3 = "apple";
        String longest = "";

        if(word1.contains("a") && word1.length() > longest.length()){
            longest = word1;
        }

        if(word2.contains("a") && word2.length() > longest.length()){
            longest = word2;
        }

        if(word3.contains("a") && word3.length() > longest.length()){
            longest = word3;
        }

        System.out.println(longest + " is the longest");


        // TODO: hepsi esit olursa ve "a" icerirse -> mesela java, baba, mama gibi -> ilk word'u yazdiriyor. Saim bununla ilgili bir ekleme yapmadi. David'e sor group meeting'de


    }
}
