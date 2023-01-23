package practices_group_15;

public class _01_Variables {

    public static void main(String[] args) {

    /*
                PRIMITIVE TYPE CASTING;
        1) Implicit casting (widening convention):
     Casting smaller primitive types -> to larger primitive types. It is done automatically by JVM.

     byte < short < int < long < float < double

        2) Explicit casting (narrowing convention):
        Casting larger primitive types -> to smaller ones.We have to do it manually.

        double > float > long > int > short > byte
     */

    byte num1 = 100;
    short num2 = 10000;
    double num3 = 3.5;
    float num4 = 2.5F;
    long num5 = 5;
    int num6 = 200000;

    num5 = num2;
    num1 = (byte) num6;
        System.out.println(num1); // num1 = 64. There are lots of data loss here.
        System.out.println(num2); // num2 degeri 10000'di
        System.out.println(num5); // num5'i num2'ye esitleyince num5 de 10000 oldu.
        System.out.println(num6); // 200000

    /*
    After String, everything will be concatanation.
    String name = “david”;
    System.out.println(5 + 6 + name + 5 + 6);  yazınca console’da 11david56 yazıyor. İlk kısımdan sonra name kısmı string olduğu için sonrasında math yok, String sonrasında addition olarak almıyoruz o eşittir işaretini. Sonrası String concatanation oluyor.
     */


     String name = "david";
     System.out.println(5 + 6 + name + 5 + 6);  // 11david56

     System.out.println(5 + 6 + name + 5 + 6 + 4555+"Jacobs" + (5+6) + name + 5 * 7+"david");
     // 11david564555Jacobs11david35david
     /*
     Precedence of all operators çok önemli.
    Hem multiplication hem addition (+ işareti) varsa, parantez yoksa -> önce * sonra + gelir.

                    Precedence of Operators;
    1st:   the unary operators +, -, ++, - -, !
    2nd: the binary arithmetic operators *, /, %
    3rd: the binary arithmetic operators +, -
    4th: the boolean operators <, >, <=, >=
    5th: the boolean operators ==, !=
    6th: the boolean operator &
    7th: the boolean operator |
    8th: the boolean operator &&
    9th: the boolean operator ||
      */

        //  ; olan yerde o statement'in bittigini anlariz

        num1 = 10;   num1 = num1++; //gibi yan yana da yazilabilir cunku Java is not space sensitive. Semicolon (;) yaptigimizda o statement bitmis oluyor. Next statement ondan sonra basliyor, yaninda da olsa sorun olmaz.

}

 }