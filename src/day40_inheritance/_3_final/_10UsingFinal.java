package day40_inheritance._3_final;

public class _10UsingFinal extends Test {   // extends _09FinalExamples doesn't work because _09FinalExample class is final. Ayni sebepten dolayi -> extends String veya extends Math de yapamam cunku onlar da final class. ((String'inki -> public final class String)) --> extends Test dedigimizdeki Test kismi bu file icinde altta yazdigimiz class

    // extends FinalExamples doesn't work because FinalExample class is final
    // extends String
    // extends Math
    public static void main(String[] args) {

        //_09FinalExamples class'indaki public final int a = 10; ve public final int b; dedigimiz instance variables'ti. O yuzden; If I want to access them, I need an object to do it, because they are instance members.
        _09FinalExamples obj1 = new _09FinalExamples(20); // put a number here, mesela 20 dedik. Cunku _09FinalExample class'inda parameter vardi, o yuzden argument(value) vermemiz lazim burada.
        System.out.println(obj1.a);  // 10
        System.out.println(obj1.b);  // 20 --> b = num demistim. int num da benim parameter'imdi. O yuzden constructor argument'i olarak ne verirsem it will be the value of 'b'.

//      cannot change final variables
//        obj1.a = 4;
//        obj1.b = 40; --> a ve b final variables oldugu icin onlari reassign etmeye calisirsak hata veriyor. Cunku final variables degisemez.


    //  _09FinalExamples'taki constant'a nasil access ederiz? className.VARIABLENAME ile.
        System.out.println(_09FinalExamples.PLANET);  // Earth

//     _09FinalExamples.PLANET = "Mars";
//     --> boyle yapip constant'imi Earth yerine Mars'a degistirmeye calisirsam da hata veriyor, cunku final variables degisemez.


        // altta olusturdugumuz helloWorld methodunu yazdirabilmek icin main method icinde cagirirsak:
        // cagirmak icin I need to make an object of either using final or Test. Let's make a Test object:
        Test obj2 = new Test(); // obj1'i ustte kullandik, buna obj2 dedik o yuzden
        obj2.helloWorld();   // Hello World  --> instance method oldugu icin ((static yazmiyor methodda)) helloWorld method'unu object ile cagirdik.

    }  // main method sonu


    /*  If I try to override --> hata verir, it doesn't work because -> final methods'u override edemeyiz. Yani you can access the original code, but you cannot change it which also means you cannot override it:

      @Override
      public void helloWorld(){
           // cannot override final methods
      }
     */

}


// let's do different class here:
class Test {
    public final void helloWorld() {  // bu: final method
        System.out.println("Hello World");
    }
}
