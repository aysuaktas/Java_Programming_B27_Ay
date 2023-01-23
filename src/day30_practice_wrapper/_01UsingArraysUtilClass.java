package day30_practice_wrapper;

import day29_my_utils._02ArrayUtil;

import java.util.Arrays;

public class _01UsingArraysUtilClass {


    public static void main(String[] args) {


        System.out.println("min number:");

        int num = _02ArrayUtil.min(4, 2, 1, -5, 1, -1, 2, 5, 2, -1, 5);
        System.out.println(num);  // -5

        System.out.println(_02ArrayUtil.min(5, 3, 4, 5, 2, 5, 8));  // 2  --> bu sekilde yazmanin dezavantaji, reusable degil. Tekrar kullanmak istesen bunlari tekrar yazman gerekecek, bir variable'a atamadigin icin


        System.out.println("--------------------------");
        System.out.println("max number:");

        System.out.println(_02ArrayUtil.max(5, 3, 4, 5, 2, 5, 8));  // 8

        int[]a = {45, 2, 6, 2, 6, 23, 83, 12};
        System.out.println(_02ArrayUtil.max(a));  // 83

        System.out.println(_02ArrayUtil.max(new int[]{4, 5, 2, 5, 2}));  // 5

        // Bu usttekilerin hepsi farkli yol aslinda o metodu cagirmamiz icin. Hepsinde ya max number'i ya min number'i cagirdik


        System.out.println("--------------------------");
        System.out.println("contains:");


        int[]b = {4, 5, 12, 5, 14};
        System.out.println(_02ArrayUtil.contains(b, 13)); // false ---> 13 var mi diye loop tek tek gezip bakiyor ama degerlerimiz arasinda 13 yok, o yuzden return false kismini dikkate aliyor ve direkt false diye printed ediyor

        System.out.println(_02ArrayUtil.contains(b, 5));  // true -> iki tane 5 degerimiz var, yani given number olan 5 is in the array -> so, true is printed  --> multiple occurrence olmasi bir sey degistirmez, bir tane olmasi yeterli contains icin. 1 ve uzeri varsa sayisi onemli olmaksizin true -> hic yoksa false sonucu cikar


        System.out.println("--------------------------");
        System.out.println("index of:");


        int[]c = {4, 2, 5, 1, 6};

        System.out.println("index of 5: " + _02ArrayUtil.indexOf(c,5));  // console'da tam halini gormek icin boyle yazdik ama alttaki gibi belirtmeden olan halini de silmedim

        System.out.println(_02ArrayUtil.indexOf(c, 5));  // 2 --> 5, bizim index2'mizde ((index numbers starts from zero))

        System.out.println("index of 7: " + _02ArrayUtil.indexOf(c,7));

        System.out.println(_02ArrayUtil.indexOf(c, 7));  // -1 -> default output olarak -1 vermistik. 7 is not exist oldugu icin default output cikti


        System.out.println("--------------------------");
        System.out.println("index of with overloaded use:");

        int[]d = {4, 5, 1, 6, 1, 6, 3, 5, 4, 1};
        System.out.println("index of first 6: " + _02ArrayUtil.indexOf(d,6));  // index of first 6: 3

        System.out.println("index of first 6: " + _02ArrayUtil.indexOf(d,6, 4));  // index of first 6: 5


        // if we want to do more dynamic:

        int firstIndex = _02ArrayUtil.indexOf(d, 6); // same as line 63 ---> which is---> System.out.println("index of first 6: " + _02ArrayUtil.indexOf(d,6));
        System.out.println(firstIndex); // 3

        int secondIndex = _02ArrayUtil.indexOf(d, 6, firstIndex +1); // same as line 65 --> which is --> System.out.println("index of first 6: " + _02ArrayUtil.indexOf(d,6, 4));
        System.out.println(secondIndex); // 5


        System.out.println("--------------------------\nadd element method:");

        String[] words = {"java", "is", "the", "best"};
        // I want to add: language into the array
        String[] allWords = _02ArrayUtil.addElement(words, "language");
        System.out.println(Arrays.toString(allWords));  // [java, is, the, best, language]

        System.out.println("--------------------------\nadd element method:");

        String[] strs = {"today", "is", "tuesday"};
        String[] other = {"no", "softskills", "today"};

        String[] multipleAdded = _02ArrayUtil.addElement(strs, other);
        System.out.println(Arrays.toString(multipleAdded));  // [today, is, tuesday, no, softskills, today]



    }
}
