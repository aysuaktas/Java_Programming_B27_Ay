package day21_nested_loops;

public class _01BiggestSubstring {

    /*
    Biggest substring of matching characters

    Given a String find the biggest substring of chars that match and print it.
    Ex:
        Input:
            aaabbbcccccddddee
        Output:
            ccccc
     */

    public static void main(String[] args) {

        String str = "aaabbbcccccddddee";
        String longest = "";
        String each = "";  // I will assign each character to String --> For ex: a

        for(int i = 0; i < str.length() -1; i++){  // -1 yaptik cunku bir altta [ bu kisimda -> if(str.charAt(i) != str.charAt(i + 1)) yazdigimizda] i + 1 yapiyoruz. +1 is not existing so it will be exception. OutOfBounds'lu hatayi vermemesi icin burada da -1 yapiyoruz. (( i < str.length() -1 yaptik. Eger esitligi de katip i <= seklinde yazsaydik -2 yapmamiz gerekirdi ))

            each += str.charAt(i);  // adds the characters at index i so the String each

            // to check for the end of the String: ((because en uzun olan sondakiyse bu kisim olmadan hata veriyormus))
            if(i == str.length() -2 && str.charAt(i) == str.charAt(i+1)){  // we checked the last substring here [i == str.length() -2] and if the characters are the same //     i == str.length() -2 ile son iki karaktere bakmak istedik. O ikisi birbirine esit mi yani ayni harf mi diye     //   -->  i == str.length == 2 is the last index. this loop checks
                each += str.charAt(i + 1);
                if(each.length() > longest.length()){
                    longest = each;
                }
            }

            if(str.charAt(i) != str.charAt(i + 1)) {  // if the current character is not equal to the next character --> yani aaabbb... diye devam eden String'imizde a is not equal to b noktasinda bu if statement. If our characters are not same, we need a new String

                if (each.length() > longest.length()) {  // eger each String'imiz longest.length'ten buyukse artik o longest length oluyor
                    longest = each;   // if you find a longer substring, assign it to the longest variable

                }

                each = "";  // this is resetting for the next part / letter ---> String each'te a'yi check ettikten sonra o longest oluyor, onu String each'ten siliyoruz ve String longest'a assign etmis oluyoruz. Sonra String each, a'dan sonrakine bakmaya devam ediyor.
                // String each -> a iken String longest -> a. String each aa olunca -> longest = aa. aaa -> aaa. String each will be resetting. So -> String each -> b. b'yi tek tek ekledik. b is not the longest one, then we will check c. 5 tane c var ornekte, now, c is the longest. Sonra String each'i yine resetliyorum ki c'den sonrakileri de check edeyim. O yuzden resetting diyoruz
            }

        }

        System.out.println(longest);



        // Ekaterina Borisova's solution: --> Zeynep'in begendigi cozum

        String s = "aaaabbcccccdddddddddd";
        String s1 = " ";
        int max = s1.length();

        for(int i = 0; i < s.length(); i++){
            String s2 = s.substring(s.indexOf(s.charAt(i)), s.lastIndexOf(s.charAt(i)) + 1 );

            if(max < s2.length()){
                // max = s2.length();  // it is to make it dynamic. Bunu cikarinca cccccccc eklersek console'da halen d'yi yazdiriyor
                s1 = s2;
            }
        }
        System.out.println(s1);  // dddddddddd

    }
}
