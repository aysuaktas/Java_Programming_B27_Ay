package day15_string;

import java.util.Scanner;

public class _05LongestWithAHomework {

    /*
    ask the user to enter 3 String inputs. Find and print the longest word that also contains 'a'

	Ex:
		"java"
		"mouse"
		"computer"

	Output: java

    Challenge: Instead of just checking for "a" add another variable that can be used to check for any character. // TODO: challenge olanla yapmadim, denersin
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 words");
        String firstWord = input.next();
        String secondWord = input.next();
        String thirdWord = input.next();

        if (firstWord.length() > secondWord.length() && firstWord.length() > thirdWord.length() && firstWord.contains("a")) {
            System.out.println(firstWord + " is the longest word that also contains \'a\'");
        } else if (secondWord.length() > firstWord.length() && secondWord.length() > thirdWord.length() && secondWord.contains("a")) {
            System.out.println(secondWord + " is the longest word that also contains \'a\'");
        } else if (thirdWord.length() > firstWord.length() && thirdWord.length() > secondWord.length() && thirdWord.contains("a")) {
            System.out.println(thirdWord + " is the longest word that also contains \'a\'");
        } else {  // if they are equal or there is no 'a' in any of them
            if (firstWord.contains("a") && secondWord.contains("a") || !thirdWord.contains("a")) {
                if (firstWord.length() > secondWord.length()) {
                    System.out.println(firstWord);
                } else if (secondWord.length() > firstWord.length()) {
                    System.out.println(secondWord);
                }
            } else if (firstWord.contains("a") && thirdWord.contains("a") || !secondWord.contains("a")) {
                if (firstWord.length() > thirdWord.length()) {
                    System.out.println(firstWord);
                } else if (thirdWord.length() > firstWord.length()) {
                    System.out.println(thirdWord);
                } else if (secondWord.contains("a") && thirdWord.contains("a") || !firstWord.contains("a")) {
                    if (secondWord.length() > thirdWord.length()) {
                        System.out.println(secondWord);
                    } else if (thirdWord.length() > secondWord.length()) {
                        System.out.println(thirdWord);
                    }


                } else if (secondWord.contains("a") && !firstWord.contains("a") || !thirdWord.contains("a")) {
                    System.out.println(secondWord + " is the only word that contains a; it's length is not important");
                } else if (thirdWord.contains("a") && !firstWord.contains("a") || !secondWord.contains("a")) {
                    System.out.println(thirdWord + " is the only word that contains a; it's length is not important");
                } else {
                    System.out.println("These words length can be equal or they may not have an 'a' character in them. Please try again!");
                }
            }
            // TODO: java, mouse,computer yazinca -> mouse'u print etti a olmamasina ragmen. Hatayi bul...
        }




    }
}


