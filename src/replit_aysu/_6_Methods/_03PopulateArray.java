package replit_aysu._6_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class _03PopulateArray {

    /*
    Create a method called populate() that will take an int argument and print an array that is populated/filled with numbers starting from 1 to the given number.

     This is a void method with an int parameter

     For ex:
     populate(3)

        output:
        [1,2,3]
     */

    // soruda bizden istenen bir arrray yaratmak ve 1den girilen rakama kadar sayilari yazmak.

    public static void main(String[] args) {

        //DO NOT TOUCH THE FOLLOWING LINES
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        populate(n);
    }

    public static void populate(int n){

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){  // for loop icinde i'yi 0'dan baslatiyoruz cunku index numbers start from zero. --> Bazen 1'den de baslatiyoruz ama bu soruda olmuyor cunku ---> Zeynep'in aciklamasi ----> TODO: Cunku; biz array icini doldurmak istiyoruz. int i = 1'den baslatirsak bu sefer array'in sifirinci elemani bos kalacak, index numarasi 0 olandan degil, bir olandan doldurmaya baslamis olacaksin . Bu ornek icin olmaz bu. Array icini dolduracagimiz icin, index numarasini sifirdan baslatmamiz lazim. Ama soruda rakam olarak birden baslatmamizi istedigi icin asagida  arr[i]'yi i +1'e esitledik
            arr[i] = i + 1;     // Biz ilk rakami 1 istedigimiz icin arr i sifirdan basliyor ama kendisi 1 olacagi icin 0+1'den baslamis olacak. Bu nedenle birinci elementte i = 1, sonrakinde 2 olmus olacak. Ama bize deseydi ki array icerisini 1 yerine 0'dan baslatin ve istenen sayiya kadar gitsin --> o zaman arr[i] = i olarak baslatacaktik ve 0.index'te 0 rakami olacakti
        }
        System.out.print(Arrays.toString(arr));
    }

    // print edip console'a 3 yazinca --> [1,2,3]


}
