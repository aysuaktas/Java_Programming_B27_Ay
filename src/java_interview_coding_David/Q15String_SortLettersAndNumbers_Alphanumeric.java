package java_interview_coding_David;

import java.util.Arrays;

public class Q15String_SortLettersAndNumbers_Alphanumeric {

    /*
    Q15: String -- Sort Letters and Numbers from alphanumeric String:
               Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
                    Ex: Input: "DC501GCCCA098911" OutPut: "CD015ACCCG011899"
     */

    public static void main(String[] args) {
        System.out.println(sortLettersAndNumbers("DC501GCCCA098911"));    // CD015ACCCG011899
    }

    public static String sortLettersAndNumbers(String str) {      // DC501GCCCA098911

        String temp = "";     //  "DC,501,GCCCA,098911"

        for (int i = 0; i < str.length(); i++) {
            temp += "" + str.charAt(i);

            // use Wrapper class methods -> isLetter, isDigit
            if (Character.isLetter(str.charAt(i)) && i < str.length() - 1) {   // i < str.length() - 1
                if (Character.isDigit(str.charAt(i + 1))) {   // After I add i+1, I don't want to see outOfBoundsException -> So --> i < str.length()-1
                    temp += ",";    //  for comma between Letters and Digits
                }
            }

            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isLetter(str.charAt(i + 1))) {
                    temp += ",";    //  for comma btw Digit and Letters
                }
            }
        }

        String[] arr = temp.split(",");   // temp: DC,501,GCCCA,098911  --> arr: ["DC","501","GCCCA","098911"]
        str = "";   //  CD015ACCCG011899

        for (String each : arr) {
            char[] chars = each.toCharArray();  // charArray to sort
            Arrays.sort(chars);
            for (char eachChar : chars) {
                str += "" + eachChar;
            }
        }
        return str;
    }
}

    /*
    // David's solution:

    public static void SortLettersAndNumbersFromString(String str) {
        String str2 = "";

        for(int i = 0; i < str.length(); i++) {
            str2 += ""+str.charAt(i);

            if(Character.isAlphabetic(str.charAt(i)) && i < str.length()-1 ) {
                if(Character.isDigit(str.charAt(i+1)) ) {
                    str2 +=",";
                }
            }


            if(Character.isDigit(str.charAt(i)) && i < str.length()-1) {
                if(Character.isAlphabetic(str.charAt(i+1))) {
                    str2 +=",";
                }
            }
        }

        String[] arr = str2.split(",");
        str ="";

        for(String each: arr) {
            char[] chars=each.toCharArray();
            Arrays.sort(chars);

            for(char eachChar: chars){
                str +=""+eachChar;
            }
        }

        System.out.println(str);
    }

     */








