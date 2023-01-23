package replit_aysu._3_String;

import java.util.Scanner;

public class _37_HasJava {

    /*
    Use String methods to check if the given word contains the text java, but not anywhere in the String. The java text must be in either position 0 or position 1 of the String. If the text java appears in any other position it is not valid and is not considered to be found in the String. Output a boolean value, true or false.

    Note: You won't be able to just use contains method

    Ex:
  Input:
    javapython

  Output:
    true
    --------------------
    Ex:
  Input:
    cjavac++

  Output:
    true
    --------------------
    Ex:
  Input:
    c#javaruby

  Output:
    false   -> The 'java' is not in positions 0 or 1

     */

    public static void main(String[] args) {

            //DO NOT TOUCH THESE LINE/LINES
            boolean exists = false;
            Scanner scan = new Scanner(System.in);
            String word = scan.next();

            //WRITE YOUR CODE BELOW:  //--> ben yapamadim, replit solutions channel'da Anam Zahra'nin cozumu

            int LengthOfWord = word.length();

            if(LengthOfWord < 4){
                System.out.println(false);
            } else if(LengthOfWord >= 4){

                boolean word1 = word.substring(0,4).contains("java");
                boolean word2 = word.substring(1,5).contains("java");

                if(word1){
                    System.out.println(word1);
                } else if(word2){
                    System.out.println(word2);
                } else{
                    System.out.println("false");
                }

                }



            }
        }

