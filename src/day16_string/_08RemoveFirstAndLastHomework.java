package day16_string;

public class _08RemoveFirstAndLastHomework {

    /*
    Given two words. Print the first word without its first character then print the second word without its last character.

    Input:
        apple
        banana
    Output:
        pple
        banan
     */

    public static void main(String[] args) {

        String word1 = "apple";
        int lengthOfWord1 = word1.length();

        String word2 = "banana";
        int lengthOfWord2 = word2.length();

        System.out.println(word1.substring(1, lengthOfWord1));

        System.out.println(word2.substring(0, lengthOfWord2 -1));


        // index numbers start from zero. Bu nedenle first characteri almayacagimiz karakteri 0 yerine 1den yani second character'den baslatmis olduk.

        // lengthOfWord - 1 = son character'in index number'i. Son karakteri dahil etmeyecegimizde lengthOfWord2 -1 yazdik ki ikinci karakter dahil edilmiyor.





    }
}
