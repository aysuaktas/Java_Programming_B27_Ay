package day10_if_statements;

public class _07BiggestNumber {

    public static void main(String[] args) {

        int first = 11;
        int second = 3;
        int third = 5;
       // int biggest;      // You don't need both options

        if(first > second && first > third){
            System.out.println(first + " is the biggest");
            //   biggest = first;
        } else if (second > first && second > third){
            System.out.println(second + " is the biggest");
            //   biggest = second;
        } else {         // buna condition yazmama gerek yok cunku first veya second olan biggest degilse bu olacak otomatikman. Statement yazmayacagim icin else kullandim. Statement yazacak olsam
            //   biggest = third;
            System.out.println(third + " is the biggest");
        }

        /*
        Bunu run yapinca;
        int first = 11;     int second = 3;     int third = 5; oldugu icin;
        11 is the biggest -> console'da bu yaziyor
         */




    }
}
