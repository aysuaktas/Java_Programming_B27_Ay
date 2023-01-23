package day20_loops;

public class _07CharactersInStringHomework {

    /*
    Characters in String
    Given a String print the ascii value codes for each character
        Ex:
            Input:
                java
            Output:
                106 97 118 97
     */

    public static void main(String[] args) {


        // Saim's solution:

        String s = "java";

        for(int i = 0; i < s.length(); i++){
            System.out.print((int)s.charAt(i) + " ");
        }


        System.out.println("-------------------");



        // Zeynep's solution:

        String word = "java";
        String ascii = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            ascii += (int)ch + " ";
        }
        System.out.println(ascii.trim());






    }
}
