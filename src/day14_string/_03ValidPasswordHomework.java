package day14_string;

public class _03ValidPasswordHomework {

    /*
        Declare and assign a String for password
        the password should be more than 8 character long
        print: Valid password or Invalid password
     */

    public static void main(String[] args) {

        String password = "asdfghjk_123";   // 12 character long olarak assign ettim

        if(password.length() > 8){
            System.out.println("Congrats! This is a valid password.");
        } else {
            System.out.println("Sorry, this password is not valid. ");
        }

    }
}
