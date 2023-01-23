package day06_operators;

public class UnaryExample {

    public static void main(String[] args) {

        int n = 0;  //0
        n++;  // This is post increment, this adds 1 -> value becomes 1 -> Number boyle sadece n++ ile de direkt 1 artti -> todo: practice.
        System.out.println(n);  // 1

        ++n; // This is pre increment. Value becomes 2
        System.out.println(n); // 2

        System.out.println(++n); // This is pre increment, value becomes 3, then it prints the value

        System.out.println(++n); // pre increment. Value become 4, then it prints the value

        System.out.println(n); // 4
        System.out.println("post number");

        System.out.println(n++); // post increment, prints the current value which is 4, and then it will increment by 1

        System.out.println(n); // 5 // post increment'te once print ettik, sonra 1 eklemek icin buraya yine yazdik cunku print ettikten sonra ekliyor.


        System.out.println("-----------------------");

        int x = 4; //4
        int y = x; // both of them are 4
        int z = ++x; // pre increment -> I will update my value right away (now) --> 5
        System.out.println("x " + x);  // 5 -> cunku x degeri onceden 4 iken --> 5 olmustu //z'yi ekledikten sonra x console'da 4tu, 5 oldu. Because code does not go back. Until I manually changed sth. -->  // x ve y'yi iki cup gibi dusun. Ikisine de su koyduk. Sonra x olana z yani diyelim ki red color ekledik. Onun rengi artik degisti. Ama bu, y'nin degisecegi anlamina gelmiyor. Then, another cup yapiyorum, z. The copy of new x. It is red. Z is red, gibi dusun. // todo: practice
        System.out.println("y " + y);  //4
        System.out.println("z " + z);  //5


        System.out.println("-----------------------");

        int candy = 5;
        System.out.println("Your kid asks for candy, you have " + candy);  // 5
        System.out.println("You give them 1, so now you have " + --candy); // 4 --> minus minus (--) before the variable, so this is pre-decrement. So, subtract 1 first, then print it.
        System.out.println("The sibling comes in and he/she wants one, you check how many there, then give him/her one " + candy--); // 4 -> Post decrement. You check how many there first, so this is post decrement. We have 4. Then, you give him/her one.
        System.out.println("Total candy in jar now " + candy); // 3 --> bir ustteki post decrement oldugu icin degeri next line'da yani simdi 1 dusmus oldu


        // USE CASE: counting:
        // your name. We want to find how many times your name as the letter 'a'. Every time you find an 'a', you will do another incrementing
        int counter = 0;
        counter++;  // 0 -> post increment oldugu icin next line'da artacak
        // when we find another a
        counter++;  // 1 -> post increment oldugu icin next line'da artacak
        // System.out.println(counter); yaparsam 2 olur


    }
}
