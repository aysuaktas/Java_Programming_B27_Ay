package day41_exceptions._3_try_catch;

public class _09ExampleOne {

    // Exceptions konusundaki ilk class

    public static void main(String[] args) {

        String s = null;

//      System.out.println(s.length());  // this would cause a NullPointerException - during runtime --> my program will compile but when I run it (on the runtime), there is an exception: NullPointerException. -> We cannot handle it before the running because it is unchecked exception, we see it in the runtime

        s = "hello";
//      System.out.println(s.charAt(10));  // this would cause a StringIndexOutOfBoundsException - during runtime --> happens during runtime, it's unchecked exception

        System.out.println("Hello");

//      Thread.sleep(5000);  // the method has some possible checked exception, so we need to handle it before we can compile - checked - compile time -->checked exception bu, during the compile time --> Thread is class. sleep() is a method. --> it simulates seconds, o yuzden 5000 verdik deger olarak



    }
}
