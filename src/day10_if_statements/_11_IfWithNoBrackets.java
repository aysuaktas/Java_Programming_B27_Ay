package day10_if_statements;

public class _11_IfWithNoBrackets {

    public static void main(String[] args) {

        if(3 < 9){       // true bu. If statement is true -> it will be written from brackets { -> to brackets }
            System.out.println("First");
            System.out.println("Second");
        }

        if(3 > 9)
            System.out.println("Third");   // This is the line executed when if statement is true

        // brackets arasinda yazmazsak -> sadece ilk statement if condition'in statement'i olur. ((Ama we should always use brackets))
            System.out.println("Fouth");  // this is not a part of the if statement, it is just a part of the code

        System.out.println("-------------------");  // ara vermek icin koyduk

        if(5 % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
                                            // brackets yoksa da anlamalisin baskalarinin kodunu diye gosterdi ama sen her zaman brackets kullan


        System.out.println("-------------------");


        char a = 'a';

        if(a == 'a')
            System.out.println("letter a");
        else if(a == 'b')
            System.out.println("letter b");
        else if(a == 'c')
            System.out.println("letter c");
        else
            System.out.println("other");


    }
}
