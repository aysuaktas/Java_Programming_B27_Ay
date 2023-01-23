package replit_aysu._3_String;

import java.util.Scanner;

public class _44_PrefixAgain {

    /*
    Use String methods to determine if the prefix is found again somewhere later in the String. A prefix is the set of characters in the beginning of the String. To determine how long the prefix is, use the given n value. For example, if n is 2, the prefix is the first two characters, so you would check if the String from the 3rd character until the end has those two character repeating anywhere. Output the result as a boolean value, true or false.

    Ex: input -> abXYabc   --> console'a once bunu yaz, enter'la
                 1  --> sonra bunu yaz enter'la -> sonucu gorursun

        output-> true  ((-> 'a' is the prefix because n is 1, and the character 'a' is found again in the String "bXYabc"))

    Ex: input -> abXYabc
                 2

        output -> true ((  -> 'ab' is the prefix because n is 2, and the characters 'ab' are found again in the String "XYabc"))

    Ex: input -> abXYabc
                 3

        output -> false (('abX' is the prefix because n is 3, and the characters 'a' are NOT found again in the String "Yabc"))
     */

    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();

        //WRITE YOUR CODE BELOW


        // Ben yapamadim -> Discord'da Soelam Sanzhieva'nin cozumu;

        if(n == 1 && str.substring(1).contains(str.substring(0,1))){  //n bir ise prefix ilk bir character. Bu durumda, index number 0'dan basladigi icin, bundan sonrasinda bu prefix tekrarliyor mu diye bakacagimiz icin --> str.substring(1) deyip bu str String'inde (0,1)'i contains ediyor mu diye baktik. Substring'de aralik verilince son deger araliga dahil edilmedigi icin --> sifirinci index number'da olan character str String'inde tekrarliyor mu diye bu sekilde baktik.
            System.out.println(true);
        } else if(n == 2 && str.substring(2).contains(str.substring(0,2))){
            System.out.println(true);
        } else if (n == 3 && str.substring(3).contains(str.substring(0,3))){
            System.out.println(true);
        } else {
            System.out.println(false);
        }




        /*
        // Zeynep'in cozumu;


        String word = str.substring(0,n);   //burada n'e kadar olan kismi kestik, n dahil degil


        String leftOver = str.substring(n,str.length());  // bununla da n'den itibaren olan kismi belirledik (n ilk deger oldugu icin dahil)

        boolean value = leftOver.contains(word);

        System.out.println(value);

        ---------


        substring'i n == 1 iken (0,1)
        n == 2 iken (0,2)
        n == 3 iken (0,3) diye tek tek yapmak yerine
        str.substring(0,n); seklinde yapmis

        -------
        Zeynep'in aciklamasi:

        String word = n'e kadar olan kismi kestim.

        String leftOver = n'den geri kalan kismi ayirdim

        boolean = geri kalan kisimda, ilk kestigim kisim var mi yok mu? ---> boylelikle "n" kac olursa olsun oncesi ve gerisi olarak ikiye ayirip birbiri icinde tekrar ediyor mu kontrol edebilirsin.


         */

        /* Merve'nin cozumu;

         if(n == 1){
      String first = str.substring(0,1);
      str = str.substring(1);
      System.out.println(str.contains(first));
    }else if (n == 2){
      String second = str.substring(0,2);
      str = str.substring(2);
      System.out.println(str.contains(second));
    }else if(n == 3){
      String third = str.substring(0,3);
      str = str.substring(3);
      System.out.println(str.contains(third));
    }
         */






    }
}
