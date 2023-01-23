package day40_inheritance;

public class _11Parent {

    // _11Parent'in yanisira Child ve Run class'lari acalim burada. Different 3 classes yapmak yerine main idea'yi burada gorebiliriz bu sayede.


    public static void hello(){   // static method
        System.out.println("Hello from Parent");
    }
}

class Child extends _11Parent{
    //    @Override : static variables ((methods demek istedi galiba?)) cannot override. O yuzden @Override annotation'ini yazinca hata veriyor: "Static methods cannot be annotated with @Override diye aciklama goruyoruz hatanin uzerine gelince de.
    public static void hello(){ // static method bu da. --> when I make this method, I am hiding the one from the parent (_11Parent)
    // --> Instance method olsaydi _11Parent class'i ve Child class'indaki hello methodu-> o zaman overriding olurdu. Bu da overriding gibi dursa da bunlar static method ve  static olanlar cannot override. Bu, method hiding. ---> Now what happens? The original one from the parent is just hidden. So, when I run this code, when I use the _11Parent.hello, it knows the original one. When I say hello from the child; it's going to run that version of it. --> Why we are hiding? Because we need another method with the same exact name.
        System.out.println("Hello from Child");
    }
}
/* eger bu Child class'in icini bos birakip sadece:
class Child extends _11Parent{

}
yazsaydim, main method'da bu methodu Child.hello(); diye cagirdigimizda yine console'da -> Hello from Parent seklinde printed oluyordu.
 */


class Run{
    public static void main(String[] args) {   // main method
        _11Parent.hello();  // Hello from Parent
        Child.hello();  // Hello from Child
    }
}
