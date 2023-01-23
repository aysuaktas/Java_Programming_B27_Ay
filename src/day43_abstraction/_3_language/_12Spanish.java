package day43_abstraction._3_language;

public class _12Spanish implements _10Language {  //  implements _10Language ekledik biz. Spanish class is implementing _10Language.

    // parent is still "Object" class. Not _10Language. Because it is interface, and interface is not a class, it has its own rules. Burada _10Language'den implement ediyoruz ama _10Language bunun parent class'i degil. Object class'i by default her class'in parent'i oldugu icin direk o diyebiliriz.

    @Override
    public void hello() {
        System.out.println("Hola");
    }

    @Override
    public void bye() {
        System.out.println("Adios");
    }

}
