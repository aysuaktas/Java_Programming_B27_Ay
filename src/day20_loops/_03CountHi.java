package day20_loops;

public class _03CountHi {

    public static void main(String[] args) {

        // counting how many times hi is in the String

        String s = "abhicdhelhilofrhiidayhi";

        // approach 1: while loop and delete the first occurrence each time   --> first way:

        int count = 0;   // degisimi yaparken bir yandan da kac kere yaptigini saydiriyor ki boylece kac tane oldugunu buluyor

        while(s.contains("hi")){
             // System.out.println(s);  // bunu biz gorelim diye yazdi. Bunu yazmadan once console'da sadece 3 yaziyordu. Simdi her hi'yi yazdikca onu delete edip kalanini yaziyor, sonra 3 diyor yani boyle:
                     /*
                      abhicdhelhilofrhiidayhi
                      abcdhelhilofrhiidayhi
                      abcdhellofrhiidayhi
                      abcdhellofridayhi
                      4
                    */
            count++;
            s = s.replaceFirst("hi", "");  // replaces the first occurrence
        }
        System.out.println(count);   // 4


        System.out.println(); // empty print statement


        // approach 2: for loop to check one index at a time, but when there is an h, we will check another index  ---> second way:

        String s2 = "abhicdhelhilofrhiidayhi";  // sonuna bir h daha eklersek error veriyor.
        int count2 = 0;

        for(int i = 0; i < s2.length(); i++){

            if(s2.charAt(i) == 'h' && s2.charAt(i + 1) == 'i'){     // i + 1 checks next char
                count2++;
            }
        }

        System.out.println(count2);


        System.out.println();  // empty print statement


        // approach 3: using indexes to check every 2 characters ---> counting two characters at a time   ---> third way:

        String s3 = "abhicdhelhilofrhiidayhi";
        int count3 = 0;

        for(int i = 0; i < s3.length() - 1; i++){

            if(s3.substring(i, i + 2).equals("hi")){
                count3++;
            }
        }

        System.out.println(count3);

        /*
        a b 0 1 --> sub(0,2)
        b h 1 2 --> sub(1,3)
        h i 2 3 --> sub(2,4)
         */

        /*
        these check the same value:

            if(s3.substring(i, i+2). equals("hi")){

            if(s3.substring(i).startsWith("hi")

            if(startsWith("hi", i) same as above but using different startsWith version

         */



    }
}
