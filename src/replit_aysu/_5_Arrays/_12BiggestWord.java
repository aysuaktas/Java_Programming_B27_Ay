package replit_aysu._5_Arrays;

import java.util.Scanner;

public class _12BiggestWord {

    /*
    Given a String [] words, find and print the longest word in the array. You can assume the elements will have different lengths.
        Note: The loop used in the given code is to dynamically create the String array. You don't need to fully understand this part yet, focus only on having access to an array.

    Ex:
        Input:
        [aaa, bbbbb, whasstupppp, longg, jaaaaavvaaaaaaaaaa]

        Output:
        jaaaaavvaaaaaaaaaa
    ---------------------------

    Ex: Input:
     [five5, six666, one1111111111111, 2two, four4444]

        Output:
         one1111111111111
     */


    public static void main(String[] args) {

        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];  // user 5 tane kelime girecek, bize en uzun kelime lazim
        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();
        }
        //WRITE YOUR CODE BELOW

        String longestWord = words[0];  // default olarak array'in ilk elementini longest olarak atadim. Alttaki for loop sayesinde --> ondan daha buyugu varsa artik o longestWord olmus olacak:

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        System.out.println(longestWord);


     /*
        // For each loop:
        String biggest = words[0];
        for (String word : words) {
            if(word.length()>biggest.length()){
                biggest = word;
            }
        }
        System.out.println(biggest);
      */


    }
}
