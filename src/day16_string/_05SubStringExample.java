package day16_string;

public class _05SubStringExample {

    public static void main(String[] args) {

       String s = "infinity";
           //      01234567

        System.out.println(s.substring(0)); // --> infinity -->  starting point 0 ise bastan baslar sona kadar gider
        System.out.println(s.substring(3)); // --> inity --> 3'ten baslar sona kadar gider
        System.out.println(s.substring(5)); // ity --> 5. index'ten baslayip sona kadar gitti
        System.out.println(s.substring(7)); // y

        // System.out.println(s.substring(9));    // StringIndexOutOfBoundsException  --> invalid index. --> index 9 is invalid, so it stops the program. ((Exceptions stops your program -> you will see in the future))


        System.out.println("-------------");

        System.out.println(s.substring(1,6));  // --> nfini // first number'dan baslayip second number'a kadar gidiyor ama second number doesn't included.

        System.out.println(s.substring(0,1)); // i
        System.out.println(s.substring(3,7)); // init
        System.out.println(s.substring(3,8)); // inity

        // System.out.println(s.substring(3,9));  //--> StringIndexOutOfBoundsException  ---> because -> cannot use 8 index here. infinity'de index 0'dan baslayinca en son 7. var. Usttekinde araliga (3,8) deyince 8e kadar ama 8i dahil etmedigi icin sorun olmadi. Ama (3,9) yapinca hata veriyor


    }
}
