package day06_operators;

public class UpdatingVariables {

    public static void main(String[] args) {

        int n = 10;

        // reassign a new value
        n = 20;

        int a = 3;
        a = a + 4;  // 7 --> because a+4 -> 3+4 + 7 gets stores as the new value for a
        System.out.println(a); // 7

        int b = 15;
        b+= 9;  // b = b+9; --> 24
        b += 1; // 25
        System.out.println(b); // 25

        int z = 10;
        z++;  // 10 -> post increment
        System.out.println(z);  // 11

        /*
        int z = 10; demistik. Bunu update etmek istersek;
        Updating a number by 1:
            z = 11;  // boyle reassign edebiliriz
            or
            z = z + 1;
            or
            z += 1;
            or
            z++; or ++z

         */

        int java = 8;
        int testing = --java; // 7 -> pre-decrement

        System.out.println(java); // 7 --> Onceden 8di ama altta testing variable'ini yaparken java degerini bir dusurduk. Bunun sonucu da 7 -> because code does not go back. Until I manually changed sth.
        System.out.println(testing); // 7

        int x = 7;
        int y = x--; // 7 --> cunku post-decrement -> degeri sonrakinde azalacak. y = 7. Ama x'in degeri aninda bir dusmus oluyor cunku code does not go back -> so, x = 6.

        System.out.println(x); // 6  ((7ydi ama 6 oldu yukarida))
        System.out.println(y); // 7

    }
}
