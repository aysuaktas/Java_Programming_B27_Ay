package java_interview_coding_David;

public class Q17String_SumOfDigitsInString {

    /*
    Q17:String--sum of digits in a string:
        Write a method that can return the sum of the digits in a string. “12345” → 15
     */

    public static void main(String[] args) {
        System.out.println(sumOfDigits("12345"));   // 15
    }


    public static int sumOfDigits(String str){  // String to use String methods

        int sum = 0;

        for(int i = 0; i < str.length(); i++){
            sum += str.charAt(i) -48;  // // Ascii value of numbers starts from 48. so we subtract it from sum
        }
        return sum;
    }
}

    // Hepsi numbers ise ustteki cozum ise yarar ama degilse calismaz.














    // Integer.valueOf(sum);   // int --> object integer  --> buna gerek yokmus

    // Kizlarin cozumu:
    /*
    public static int sumOfDigits(String str){

        int result = 0;

        for(int i = 0; i < str.length(); i++){
            result += Integer.parseInt("" + str.charAt(i));
        }
        return result;
    }
}
     */









