package day49_functional_interface;

public class _08UsingNumber {   // implements _07NumberInterface ama bunu yazmadik, neden?? -> kizlara sor ???

    public static void main(String[] args) {

        // to implement Functional interface, I need to use lambda expression. -> implementation'da her seyi kullanabilirsin: if statement, loop, switch, ternary... ne istersen, implementation bu sadece. The core of the lambda expression is:  () -> {};   yani interface name + method name = (parameters) -> {expressions};

        _07NumberInterface evenOrOdd = (n) -> {
                    // num is just a parameter for our lambda expression. You can call it however you want: n, number... But in general: n falan kullaniliyor. -> (n) seklinde yazdik garanti olsun diye, ama parameter bir tane ise parantez kullanmamiz zorunlu degil, birden fazla olursa o zaman zorunlu olurdu

            if(n % 2 == 0){
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        };

        evenOrOdd.test(5);  // 5 is odd --> test dedigimiz _07NumberInterface interface'indeki abstract method name
        evenOrOdd.test(10); // 10 is even

        // Functional interface'de bir tane abstract method var diye implementation'i da mi bir tane olacak? Implementation'i icin evenOrOdd dedik method ismine, ama sadece bu mu? No, I can also make another implementations with another methods. Mesela cube methodu da olusturalim:

        _07NumberInterface cube = n -> System.out.println(n * n * n);
        //  _07NumberInterface cube = (n) -> { System.out.println(n * n * n); } ;  // boyle de yapabilirdik ama bir tane parameter oldugu icin paranteze gerek yok. Everything is in one statement ise curly brackets { } kullanmasan da oluyor --> ama evenOrOdd methodundaki gibi ise curly brackets'i kullan.

        cube.test(3);  // 27

    }
}

