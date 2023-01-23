package day19_loops;

public class _04MultiplicationTable {

    public static void main(String[] args) {

        int num = 5;   // Bu kismi input.nextInt() seklinde yaparsan Scanner'a dondurebilirsin.

        for(int i = 1; i <= 10; i++) {     // multiplication yapacagimiz icin 0 yerine 1 yaptik

            System.out.println(num + " x " + i + " = " + num * i);  // x is used to represent multiplication --> i de her seferinde degisecek, num hep ayni ama i her seferinde 1 artacak

        }



    }
}
