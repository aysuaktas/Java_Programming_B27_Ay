package day15_string;

public class _01Recap {

    public static void main(String[] args) {

        String first = "Testing";
        first.toUpperCase();
        System.out.println(first); // ---> Testing -> reassign etmeden print ettigimiz icin original versiyonu yazdi, uppercase yapmadi

        first = first.toUpperCase();  // //todo: object'i hala degistirmedim ama reassign ettim
        System.out.println(first);  // ---> TESTING


        System.out.println("-----------------------------");


        String second = "SOFT SKILLS";
        String lowerSecond = second.toLowerCase(); // todo: reassign etmedik object'i degistirdik. We made a new variable, new reference.
        System.out.println(second);  // ---> SOFT SKILLS
        System.out.println(lowerSecond);  // ---> soft skills


        System.out.println("-----------------------------");


        String third = "   hello  world  ";
        System.out.println(third); // -> console'da basta ve sonda bosluklu halini yazdiriyor
        System.out.println(third.length());  // ---> 17
        third.trim();
        System.out.println(third.length());   // ---> 17 yine. Cunku reassign etmedik.

        third = third.trim();   // reassign edersek;
        System.out.println(third);  // ---> hello  world ---> console'da bu cikiyor reassign ettikten sonra. Yani bastaki ve sondaki bosluklarin trim methodu ile atilmis hali.
        System.out.println(third.length());  // ---> 12 ---> reassign ettikten sonraki length de bu, bastaki ve sondaki spaces gittikten sonraki hali


        System.out.println("-----------------------------");











    }
}
