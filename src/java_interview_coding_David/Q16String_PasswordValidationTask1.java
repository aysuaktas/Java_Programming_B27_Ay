package java_interview_coding_David;

public class Q16String_PasswordValidationTask1 {

    /*
    Q16:String--Password Validation Task 1: Write a return method that can verify if a password is valid or not.
        Requirements:
        1. Password MUST be at least 6 characters and should not contain space.
        2. Password should at least contain one upper case letter
        3. Password should at least contain one lowercase letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit
            -> If all requirements above are met, the method returns true, otherwise returns false
     */


    public static void main(String[] args) {
        System.out.println(isValidPassword("AAbk1%AA"));  // true
        System.out.println(isValidPassword("aasAAv 11#")); // false
        System.out.println(isValidPassword("a8dB#"));  // false
    }



    public static boolean isValidPassword(String password) {

        int countLowerCase = 0;
        int countUpperCase = 0;
        int countDigit = 0;
        int countSpecialCharacter = 0;


        if ((password.length() >= 6) && !password.contains(" ")) {

            for (int i = 0; i < password.length(); i++) {

                char letter = password.charAt(i);

                if (Character.isLowerCase(letter)){
                     countLowerCase++;
                }

                if (Character.isUpperCase(letter)){
                   countUpperCase++;
                }

                if (Character.isDigit(letter)) {
                    countDigit++;
                }

                else {   // special character
                    countSpecialCharacter++;
                }


                if ((countLowerCase >= 1) && (countUpperCase >= 1) && (countDigit >= 1) && (countSpecialCharacter >= 1)) {
                    return true;
                }
            }

            return false;

        } else { // (password.length() < 6)

            return false;
        }
    }
}
















    /*
        // olmadi, sor::::

    public static boolean isValidPassword(String password) {

        int countLowerCase = 0;
        int countUpperCase = 0;
        int countDigit = 0;
        int countSpecialCharacter = 0;


        if ((password.length() >= 6) && !password.contains(" ")) {

            for (int i = 0; i < password.length(); i++) {

                char letter = password.charAt(i);

                if ((i >= 'a') && (i <= 'z')) {
                    countLowerCase++;
                }

                if ((i >= 'A') && (i <= 'Z')) {
                    countUpperCase++;
                }

                if ((i >= '0') && (i <= '9')) {
                    countDigit++;
                }

                if ((i >= 33) && (i <= 47)) {
                    countSpecialCharacter++;
                }


                if ((countLowerCase >= 1) && (countUpperCase >= 1) && (countDigit >= 1) && (countSpecialCharacter >= 1)) {
                    // contains(char)
                    return true;
                }
            }

            return false;

        } else { // (password.length() < 6)

            return false;
        }
    }
}
     */






    /* // MERVE's solution


    public static boolean isValid(String password){
        boolean result = false;
        if ((password.length()>=6) && (!password.contains(" "))){
            String upperCase ="", lowerCase="", specialChar="", digit="";
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch)){
                    upperCase+=ch;
                }
                if (Character.isLowerCase(ch)){
                    lowerCase+=ch;
                }
                if (Character.isDigit(ch)){
                    digit+=ch;
                }
                else {
                    specialChar+=ch;
                }
            }
            if (upperCase.length()>=1 && lowerCase.length()>=1  && specialChar.length()>=1 && digit.length()>=1)
                result=true;
        }else{
            result=false;
        }
        return result;
    }
}

     */



