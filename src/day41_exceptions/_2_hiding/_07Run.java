package day41_exceptions._2_hiding;

public class _07Run {

    public static void main(String[] args) {

        _05First.staticMethod();  // Static method from First  --> // accesses the method in the First class

        _06Second.staticMethod();  // Static method from Second  --> // accesses the method in the Second class


        // _05First and _06Second references'i uzerinden eristik bunlara. --> Her iki instance method icinde de static method'u cagirmistik. Ikisi de kendisine en closest olan yani kendi class'inda olani cagirmis oldu.

        System.out.println("-----------------");

        new _05First().instanceMethodA();  // Static method from First  --> // calls the instance method, which is calling the static method inside. The closest method (same class) method is called
        new _06Second().instanceMethodA();  // Static method from First  --> bunda da First yazani yazdirdi bu sefer. Cunku closest one'i cagiriyordu ve instanceMethodA'ya closest olan bu.  --> // this instance method was inherited, it calls the closest static method (the one in the First class)

        System.out.println("-----------------");

       // new _05First().instanceMethodB(); // instance method b was created in the sub class -> parent class'ta degil de sub class'ta oldugu icin parent class uzerinden cagiramiyoruz onu boyle, hata veriyor.

        new _06Second().instanceMethodB();  // Static method from Second  --> bu sefer de instanceMethodB'ye en yakin olan (yani onunla ayni class'ta olan oluyor bu da) static method'u cagiracak ve ondaki statement'i yazdiracak -> onda Second'li olan yaziyordu, o yuzde o printed olacak burada.  --> // this instance method is also calling the static method, the closest one is the one in the second class

    }
}
