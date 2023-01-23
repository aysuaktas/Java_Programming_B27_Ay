package day27_methods;

public class _01FirstMethod {


    public static void helloWorld(){   // this is our first method.
                   // main method yapmadik, bunu koyduk. return type olan void yerine baska seyler de gelecek ama simdi void ile yapiyoruz
        System.out.println("Hello World!");   // burada print etmeyecek, main method'un altinda cagirdigim yerde print olacak
    }

    public static void helloWorld5Times(){
        for(int i = 0; i < 5; i++){
            System.out.println("Hello World");  // println degil de print yazarsan yan yana yazdirir bu methodu kullandigin zaman // --> burada print etmeyecek, main method'un altinda cagirdigim yerde print olacak
        }
    }

    public static void main(String[] args) {   // you should not declare a method inside of another method. Yani main method'u diger method'un icine (inside of it) yazamazdik. We need main method to run the code. --> Ama diger methodlari da main method icine yazamayiz. We cannot write any method inside of the another method. O yuzden diger methodlarimizi main method ustune yazdik ve kendilerinden hemen sonra } kendi paranthesis'lerini kapattik.
        helloWorld();   // Hello World! --> bunu yazarak I called the method. Main method olmadan we can't call the method
        helloWorld();   // Hello World!

        // Bu sayede reusable olmus oldu. Ne zaman bu kodumda Hello World! yazdirmak istesem bunu kullanabilirim mesela

        System.out.println("--------- with loop: ----------");

        // What if I want to print hello world 5 times?
        for(int i = 0; i < 5; i++){
            helloWorld();
        }    // bunu loop ile boyle yapabiliriz. Ama ornek gormek acisindan bu loop'u method ile reusable yaptik main method'un ust kisminda. Yani onunla da yazdirabiliriz. I can call them with just one method:

        System.out.println("--------- After we did this loop reusable with method: ----------");

        helloWorld5Times();  // prints hello world 5 times
        helloWorld5Times();  // prints hello world 5 times. Yani bunu her yazdigimda 5 kere yazmis olacak console'da

    }
}
