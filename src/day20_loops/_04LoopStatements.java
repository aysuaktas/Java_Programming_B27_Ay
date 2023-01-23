package day20_loops;

public class _04LoopStatements {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {
            System.out.print(i + " ");   // 1 2 3 4 5 ---> + " " kismini rakamlar arasinda bosluk kalsin diye kullandik
        }
        System.out.println();

        for(int i = 1; i <= 5; i++) {
            if(i == 2) {
                break; // the loop stops when the i is 2
            }
            System.out.print(i + " ");   // 1
        }
        System.out.println();

        for(int i = 1; i <= 5; i++) {
            if(i == 2) {
                continue; // the loop skips the iterations when i is 2, so 2 isn't printed --.. 2yi atlayip sonrasina geciyor
            }
            System.out.print(i + " ");  //  1 3 4 5
        }
        System.out.println();

        for(int i = 1; i < 100; i++){
            if(i % 2 == 0){
                continue;  // i 2'ye tam bolunuyorsa yani cift sayiysa onlari atlayacak. Bu sayede sadece tek sayilari yazdirabildik.
            }

            System.out.print(i + " ");  // 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99
        }


















    }
}
