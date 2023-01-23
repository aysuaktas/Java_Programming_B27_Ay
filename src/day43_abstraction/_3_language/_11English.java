package day43_abstraction._3_language;

public class _11English implements _10Language { // implements _10Language'i ekledik. -> English class implemented the methods in _10Language. It is implemented.  // _11English class'i normal bir class. This is the first non-abstract class, or in this case, first non-abstract layer.


    @Override
    public void hello() {
        System.out.println("Hello");
    }

    @Override
    public void bye() {
        System.out.println("Bye");
    }

    // Hello and Bye -> english implementation.

}
