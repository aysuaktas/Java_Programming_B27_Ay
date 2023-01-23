package day17_string_loops;

public class _03MiddleChar {

    /* // TODO: tekrar bak buna
    Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character.

    Input:
        elephant
    Output:
        The middle characters: ph
     */

    public static void main(String[] args) {

        String str = "elephant";
          // index    01234
          // length  5/2 = 2


        // elevators    -> length 9 / 2 = 4
        // 012345678


        if(str.length() % 2 == 1){
            // str has an odd number of characters, so there is 1 middle char  --> for ex: water
            int midIndex = str.length()/2;
            System.out.println("The middle character: " + str.charAt(midIndex));

        } else {
            // str has an even number of characters, so there are 2 middle char --> for ex: elephant, java,...
                 // elephant  -> length 8/2 =4
                 // 01234567

            int firstMid = str.length()/2 - 1;
            int secondMid = str.length()/2;
            System.out.println("The middle characters are " + str.charAt(firstMid) + str.charAt(secondMid));  // first way -> with two charAt() method

            System.out.println("The middle characters are " + str.substring(firstMid, secondMid +1)); // second way -> with one substring() method
        }



    }
}
