package day19_loops;

public class _13CountCharactersHomework {

    /*
        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
	Ex:
		Input:
			2juMp41EEkd4s4
		Output:
			3 uppercase letters
			6 lowercase letters
			5 numbers
     */

    public static void main(String[] args) {

        /*

    char ch = ' ';
    String word = "2juMp41EEkd4s4";

    int lowerCaseCount = 0;
    int upperCaseCount = 0;
    int numberCount = 0;

        for (int i = 0; i < word.length(); i++) {     // int i = 0 deme sebebimiz, sifirinci index number'dan baslamasini istiyoruz. i < word.length() dedik ki kelimemizin uzunlugu neyse index number'larimiz ondan bir eksik oluyor. Yani kelimemizden kucuk olsun ki son letter da dahil olsun. i++ dedik ki surekli bir artarak baksin.

            ch = word.charAt(i);
            if(ch>='A' && ch<='Z'){
                upperCaseCount++;
            }else if(ch>='a' && ch<='z'){
                lowerCaseCount++;
            }else{
                numberCount++;
            }
        }


        System.out.println(upperCaseCount + " uppercase letters" + "\n" + lowerCaseCount + " lowercase letters" + "\n" + numberCount + " numbers");

         */

        // Saim's solution;

        String s = "2juMp41EEkd4s4";
        int upper = 0, lower = 0, number = 0;

        for(int i = 0; i < s.length(); i++){

            char eachLetter = s.charAt(i);

            if (eachLetter >= 'A' && eachLetter <= 'Z') {
                upper++;
            } else if (eachLetter >= 'a' && eachLetter <= 'z') {
                lower++;
            } else if(eachLetter >= '0' && eachLetter <= '9'){
                number++;
            }

        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Number: " + number);


        /*
        s = "abc"
             012   // --> index numbers
        i < s.length()    i < 3
        i <= s.length() -1  --> i <= 2
         */

    }
}
