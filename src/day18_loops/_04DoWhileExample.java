package day18_loops;

public class _04DoWhileExample {

    public static void main(String[] args) {

        int i = 0;
        do {             // do icin shortcut -> do yazip enter'layinca curly brackets'i bizim yerimize acip kapatir
            System.out.println(i);
        } while (false);   // do while'da burada semicolon ( ; ) kullanilir. -> for the future iterations, while is necessary

        // the do block is executed first, then the boolean is checked. -> do while loop'da do block her zaman bir kez print ediliyor, while block yanlis olsa bile.
        // firstly, do block will be checked. So, it will print one time -> it will print 0. But while block is false, so it will stop here.


        System.out.println();  // empty print statement


        do{
            System.out.println(i);
            i++;
        } while (i <= 10);  // bu durumda 0'dan 10'a kadar print olur



    }
}
