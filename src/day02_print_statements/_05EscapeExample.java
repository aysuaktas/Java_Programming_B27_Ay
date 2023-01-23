package day02_print_statements;

public class _05EscapeExample {
    public static void main(String[] args) {

//       System.out.println("Today is "Friday"");  this is not valid because it thinks the double quotation is for java syntax, but we want to print the character of double quotation

        System.out.println(" \"here \" ");

        System.out.println("Today is \"Friday\"");

        // I want to print a backslash ( \ )
        System.out.println("\\"); // first \ is syntax, the second \ is the character we want to print

        // tabbing here ((tabbing to put like 5 spaces -> bosluk birakmak icin.))
        System.out.println("\tHello");
        System.out.println("\t\tHello");  // iki tab ile eksta bosluk

        // next line
        System.out.println("Shopping List:\n1)Juice\n2)Chips\n3)Water");

        System.out.println(); // arada bir satir bosluk birakmak icin kullandim.

        System.out.println("Shopping List:\n\t1)Juice\n\t2)Chips\n\t3)Water");  // ((once n sonra t kullandik. Once n ile alt satira gectik sonra tab ile bosluk biraktik. Once tab sonra alt satir olsa alttakiler boyle tab ile girintili durmayacakti))

    }
}
