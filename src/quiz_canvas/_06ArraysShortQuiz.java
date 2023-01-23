package quiz_canvas;

import java.util.Arrays;

public class _06ArraysShortQuiz {

    public static void main(String[] args) {


        /*
        // Q1 = Which of the following are valid array declarations?

        int[] arr = {1,2,3,4};  --> valid
        int[] arr = {"hello", "world", "java"};  --> not valid Cunku int demis ama String demeliydi
        int[] arr = new int[8];  --> valid, size'i belirledi
        int arr = {1,2,3,4};  --> not valid -> square brackets koyulmamis
         */

        System.out.println("-------------");

        // Q2 = An Array's size can be changed after creation --> FALSE

        System.out.println("-------------");


        // Q3 = Result of following code fragment?

        char[] letters = {'A', 'Z', 'y', 'b'};
        Arrays.sort(letters);
        for(char each : letters){
            if(each < 'a'){
                continue;
            }
            System.out.print(each);   // by --> Sorted edilirken ascii order -> 1. special character  2. number  3. uppercase  4. lowercase  --> A (ascii degeri 65) ve Z (ascii degeri 90) uppercase oldugu va asci degerleri lowercase letters'tan kucuk oldugu icin; if(each < 'a') oldugu surece ((yani lowercase olmadigi surece - cunku a en kucuk lowercase)) continue yani onlari atla, digerlerine gec, diyor. Bu nedenle A ve Z'yi atliyor, console'da print edilen: by oluyor
        }

        System.out.println();  // ustteki ornek println degil print oldugu icin bunu yazdim ki alt satira gecsin
        System.out.println("-------------");


        // Q4 = Result of code fragment?

        int n = 0;
        String [] days = {"sun", "mon", "wed", "sat"};

        for(int i = 0; i < days.length; i++){

            switch (days[i]){
                case "sat":
                case "sun":
                    n++;
                    break;
                case "mon":
                    n += 5;
                    break;
                case "wed":
                    n -= 2;
            }
        }
        System.out.println(n);  //5 --> cunku String [] days = {"sun", "mon", "wed", "sat"}; 'e baktigimizda once sunday'e bakariz. n++ diyor. n =0'di, 1 oldu. Sonra break var, devam etmez yani durur. Sonra monday'e bakar. n += 5 --> 1 + 5'ten n = 6 oldu. Sonra wed'e bakar, n -= 2 yani 6-2'den 4 oldu. En son sat element'ine bakar, n++'dan o sonuc 4 +1'den 5 olur


        System.out.println("-------------");


        // Q5: Result of code fragment?

        int[] num1 = {1,2,3,4};
        int[] num2 = num1;  // yani num2 = {1,2,3,4}

        num1[0] = 10;  // 0.element olan 1; 10 ile degisirse -> 10,2,3,4
        num2[2] = 9;   // num2 = num1 yani birbirlerine esit oldugu icin num2'nin de 0. elementi 10 olmus oldu. 2. element olan 3; 9 ile degisirse -> 10,2,9,4 oldu

        System.out.println(Arrays.toString(num1)); // [10, 2, 9, 4]
        System.out.println(Arrays.toString(num2)); // [10, 2, 9, 4]


        System.out.println("-------------");


        // Q6: Result of code fragment?

        int[] intArr = {15, 30, 45, 60, 75};
        intArr[4] = intArr[2];  // 4. element olan 75 -> 2. elemente esitlendi yani 45 oldu  --> yeni durum: 15, 30, 45, 60, 45 oldu
        intArr[2] = 90; // 2. elementi 45 yerine 90 olarak reassign edersek: 15, 30, 90, 60, 45
        System.out.println(Arrays.toString(intArr));  // [15, 30, 90, 60, 45]


        System.out.println("-------------");


        // Q7: Result of code fragment?

        String [] planets = {"Mercury", "Venus", "Earth", "Mars"};
        int x = planets.length;  // planets Array'inin length'i yani element sayisi = 4
        int y= planets[3].length(); // planets Array'inin 3. elementinin uzunlugu -> yani Mars'in karakter uzunlugu -> 4
        System.out.println(x+ "" + y);   // 44  --> String oldugu icin addition degil concatenation. O yuzden sonuc 44


    }
}
