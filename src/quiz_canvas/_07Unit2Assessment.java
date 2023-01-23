package quiz_canvas;

import java.io.CharArrayReader;
import java.util.Arrays;
import java.util.Scanner;

public class _07Unit2Assessment {

    public static void main(String[] args) {


        /*
        // Q-4 :

        String a = "204";
        String b = 6 + a;  // a bir String oldugu icin bu concatenation olacak
        System.out.println(b);   // 6204
         */



        /*
        // Q-5:

        String s = "Java is fun";
        char c = s.charAt(4);

        if(c == 'i'){
            System.out.println("A");
        } else if(c == 'a'){
            System.out.println("B");
        } else if(c == ' '){
            System.out.println("C");
        }
        // C will be printed. Because s.charAt(4) dedigimiz bosluk karakterine denk geliyor. If statement'inde bosluga denk dusen print statement de C.
         */




        /*
        // Q-6:
        String result = "garden";
        result.substring(2);   // burada reassign etmedigi icin result halen ayni, garden.
        System.out.println(result);  // garden
         */




        /*
        // Q-7:
        String str = "the fox ran wild";
        str = str.substring(4, 11).toUpperCase();
        System.out.println(str);  // FOX RAN
        */




        /*
        // Q-8:
        String s = "the game was tied at 2-2";
        String s2 = s.substring(5);

        int index1 = s.indexOf("game");
        int index2 = s2.indexOf("game");

        if(index1 == index2){
            System.out.println(index1);
        } else {
            System.out.println(index2);
        }

        // -1 will be printed. Cunku indexOf methodunda elimizde o index yoksa sonucu -1 oluyor. s2 icin s.substring(5) diyerek 5. indexten baslatmis ama oyle olunca icinde "game" olmuyor.
         */




         /*
         // Q-9:
         String z = "MOUNTAIN";
         z = z.substring(2,9).trim().toLowerCase();
             System.out.println(z);  // StringIndexOutOfBoundsException ---> cunku substring(2,9) yazinca son index dahil olmamak uzere 2,3,4,5,6,7 ve 8. indexleri print etmesi lazim ama MOUNTAIN kelimesinin son indexi 7. 8 index'i olmadigi icin out of bounds exception verir
         */




        /*
        // Q-10:
        String a = "I write java";
        boolean b = a.contains("i");
        boolean c = a.endsWith("java");

        String result = b && c ? "go" : "don't go";   // true && true oldugu icin sonuc true -> ilk kismi yani go'yu print edecek
        System.out.println(result);  // go
        */



        /*
        // Q- 11:

        // The CONTINUE statement will skip the rest of the current iteration, but the BREAK statement will exit the loop completely. --> true
         */




        /*
        // Q- 12:
        for(int i = 0; i < 10; i++){
            if(i % 2 != 0){
                continue;  // cift sayi degilse yani tek sayi ise continue demis, yani o iteration'i print etmeden atlayip next iteration'a gececek ve cift sayi olanlari print edecek
            }
            System.out.print(i);   / 02468
        }
         */




        /*
        // Q- 13:
        int number = 10;

        while(number < 100){
            number *= 2;
        }
        System.out.println(number);  // 160

        // 10 -> 20 -> 40 -> 80 -> 160  --> int number = 10 iken basladik. 10 < 100 oldugu icin number *= 2 yani number ile yani 10 ile 2'yi carpariz. Yeni number'imiz 20. O da 100'den kucuk -> 20*2 = 40. 40 da 100'den kucuk. 40*2= 80. 80 de 100'den kucuk. number'imiz 80*2 = 160 oldu. 160 artik 100'den buyuk oldugu icin while loop'taki boolean expression false oldu ve loop is stopped. O yuzden number = 160 olarak kaldi
         */



        /*
        // Q-14:
        String word = "java";
        int a = 1;

        do{
            System.out.println(word.charAt(a));  // a'yi 1 olarak vermis bize. Yani charAt(1)'e yani 1.indexte ne olduguna bakacagiz -> a var. do-while loop'ta en az bir kere print edildigi icin bu print edilecek -> a kesin yazacak yani

        } while (a > word.length());

        // 1 > word.length is false oldugu icin it will not get executed. O yuzden cevap sadece a ---> a will be printed.
        */




        /*
        // Q-15:
        String str = "The cat has a hat";
        int a = 0;

        do{
            a++;   // a buradan sonrakinde 1 olmus oluyor.
            str = str.replaceFirst("a", "");  // replace degil de replaceFirst method oldugu icin sadece ilk a'yi ("cat" kelimesindeki a'yi) silmis bunda. Elimizde 3 a daha kalmis oldu
        } while(str.contains("a"));  // str 3 tane a iceriyor halen. a zaten 1'di. 3 kere daha dongu devam edecek ve a = 4 olacak. Sonra while loop false'a donecek ve execute olmaya devam etmeyecek

        System.out.println(a);  // 4
         */



        /*
        // Q-16:
        String s = "I will find the lost book";
        String word = "Reverse";

        for(int index = s.length() -1; index <= 0; index--){
            word+= s.charAt(index);
        }
        System.out.println(word);  // Reverse ---> TODO: why? bak
         */




        /*
        // Q-17:  [ Evaluate each iteration one at a time ]. What is output?:

        String str = "cydeo";

        for(int i = 0; i<= str.length(); i += 3){
            System.out.print(str.charAt(i));   // ce
        }  // TODO, tekrar bak
         */




        /*
        // Q-18:
        String str = "hello";

        for(int i = 0; i < str.length()-1; i++){
            System.out.println(str.substring(i, i+2));  // substring'de ikincisi dahil olmadigi icin bunda i ve i+1 dahil. Her iteration'da iki tane print edip sonra oteki index'e bakacak.
        }
        // So, it will be printed like this:
   //      he
   //      el
   //      ll
   //      lo

         */




        /* Give the following inputs for Scanner: 6    4    3. What is the output?


        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();   // 6
        int num2 = input.nextInt();   // 4
        int iterate = input.nextInt();   // 3
        int total = 0;

        for(int j = 1;  j <= iterate; j++ ){
            total += num1+num2;    // 6 + 4 yani 10
        }
        System.out.println(total);  // 30 ---> j <= iterate yani 3 oldugundan 3 kere tekrar edecek aslinda bu. 3 kere 10 ekleyecek total'e. Yani 30.
         */





        // Q-20:
        int count = 0;

        for(int a = 0; a < 3; a++){
            for(int b = 0; b <= a; b++){
                count += b;
            }
        }
        System.out.println(count);  // 4

    // Merve'nin aciklamasi altta. TODO: tekrar bak
    //   a0  b0
    //   a1  b0
    //   a1  b1
    //   a2  b0
    //   a2  b1
    //   a2  b2

    // b'lerin toplami 4. Her bir iteration bu sekilde. Count da b'yi ekleyerek gidiyor zaten. O nedenle cevap: 4



        /*
        Which of the following are valid ways to create an array? (Select all correct answers):

        // Dogru olanlar:
        boolean [] bool = {true, true, false, true};
        String s[] = new String[4];
        int [] a = {1,2,3};
        char chars [] = new char[26];

        Yanlis olanlar:
        short numbers [] = new String[10];  // bir dataType short biri String olmaz. Syntax olarak ayni type oLmalilar

        byte [] = {4,5,1,4,5};  // variable name verilmemis

        double [4] d = {3.4, 5.2, 5.1, 1.0};  // [4] yazan yer bos olmaliydi
         */




        /*
        // Q-23:
        int [] nums = new int[5];
        int a = 6;

        nums[1] = a;  //6
        nums[0] = a * 2;  // 12
        nums[2] = a-4;  // 2
        nums[3] = nums[2];  // 2
        nums[4] = nums[a-4];  // 2
        System.out.println(Arrays.toString(nums));  // [12, 6, 2, 2, 2]
         */




        /*
        // Q-24:
        double[] nums = new double[4];

        nums[0] = 10.5;
        nums[2]= 20.5;
        nums = new double[4];  // burada nums variable'ini reassign ediyor. Onceden verdigi 0. ve 2. indexleri sifirlamis gibi dusun, bu artik yeni bir variable. Bunun sonrasinda sadece 1. ve 3. indexleri tanimladigi icin 0. ve 3. index -> double icin default value olan 0.0 olacak
        nums[1] = 13.99;
        nums[3] = nums.length;
        System.out.println(Arrays.toString(nums));  // [0.0, 13.99, 0.0, 4.0]
         */




        /*
        // Q-25:
        String[] strs = {"display", "population", "meeting", "copy", "franchise"};

        int a = strs.length;  // 5
        int b = strs[3].length();  // 4

        System.out.println(a + " " +b);  // 5 4
         */




        /*
        // Q-26:
        int [] b = {1, 2, 3};

        for(int j = 0; j < b.length; j++){
            b[j] = b[j] * 2;
        }
        System.out.println(Arrays.toString(b));  // [2, 4, 6]
         */




        /*
        // Q-27:
        String[] words = {"one", "two", "three", "four"};
        String[] other = new String[words.length];  // 4

        int index = 0;

        for(String word : words){
            other[index++] = word + word.length();
        }
        System.out.println(other);  // --> hashcode --> [Ljava.lang.String;@4411d970
        */




        /*
        int[] arr = {4, 2, 5, 7, 2, 3};
        boolean[] bArr = new boolean[arr.length];  //6

        for(int i = 0; i < arr.length; i++){
            bArr[i] = arr[i] % 2 == 0;
        }
        System.out.println(Arrays.toString(bArr)); // [true, true, false, false, true, false]
         */




        /*
        // Q-29:
        int[] nums = {52, 14, 709, 423, 13};
        int total = 0;

        for(int each: nums){
            if(each > 200){
                total += 5;
            } else {
                total += 10;
            }
        }
        System.out.println(total);  // 40 --> sirasiyla loop boyunca total += seklinde ekleyerek gittiginden 10 + 10 + 5 + 5 + 10'dan toplamlari 40 yapiyor
         */




        /*
        // Q-30:
        int[][] nums = {
                {4, 2, 15},
                {31, 5, 12, 6, 12},
                {31, 1},
                {1, 41, 5}
        };
        System.out.println(nums.length);  // line1 -->  4
        System.out.println(nums[1].length);  // line2 --> 5

        for(int each: nums[2]){
            System.out.print(each); // line3 --> 311 olacak cevap. (([31, 1] degil, cunku bu bir array degil))
        }
         */



    }
}
