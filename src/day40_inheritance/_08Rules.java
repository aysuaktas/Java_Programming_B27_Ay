package day40_inheritance;

public class _08Rules {
}   // bunun parantezini burada kapattik

    // this class is about overriding rules


    // remember, we can make multiple classes in the same file. Just the public class should be matching the class name.

    class A {
        public int getNum() {
            return 5;
        }

        String getName() {  // default access modifier, hicbir sey yazmadik cunku onune public, protected veya private diye
            return "James";
        }

        /*
        public A get(){
            return null;
        }
        // sadece bunu gorursen ne anlama gelir? --> First of all, it is an instance method, not static. First part of the method is access modifier. "get" is our name. Paranthesis is our parameter.

        A kismi normalde void veya return type oluyor (we recognize this as return type). But this method should return an "A" type, which is an object of the A class. --> So, when I call the get method, it returns me the object of it.

        return null; dedik. I just put null to compile, because 'null' is for object types. --> So, null part allows me to compile, because A is an object type. ((kendimden not: object type'in default value'su null'du hatirla))

        What we need to know is -> // A is the return type, the method should return an A object
         */

        public A get(){   // A is the return type, the method should return an A object
            return new A();  // A obj = new A();  -> A obj = new A() dedigimizde, this is how we traditionally/normally make an object. The right side is the object side, the left side is the reference. I'm not doing any reference here, I'm just creating the object. O yuzden sadece bu traditional/normally yaptigimizdakinin sagdaki kismini yazmis olduk

            // ---> bunu return null yerine return new A() gibi de yazabilirim cunku it returns the object of the 'A'

        }

    }  // class A parantezini kapattik burada


    class B extends A {
        @Override   // cannot change the name or parameters
        public int getNum(){  // method'un parameters'ini ya da ismini degistiremiyoruz.
            return 5;
        }
    }

    class C extends A {
        @Override // we are able to change the access modifier to more accessible if we want, in this example: public or protected
        public String getName(){  // default access  --> Original olan ((getName)) default access modifier'di -> default'tan daha visible olan protected veya public ile degistirebiliyoruz bunu if we need. Degistirmek icin kriterimiz yani rule -> more visible olmasi
            return "James";
        }
    }  // class C'nin parantezini kapattik. Burada aslinda overriding ile class A'daki default'u public'e cevirdik.


    /*
    class D extends A {
        @Override
        public A get(){
            return null     // null -> by default
        }

    // public A get() diyor yani bunda return type A aslinda. void veya String vs yapamam. Cunku it (return type) should be the same or covariant olmasi gerekiyor, demistik.

    // C, D falan -> bunlar subclass of it (A). O nedenle return type'i C veya D olarak falan degistirebiliriz. (Ama any type degistiremiyoruz. Cunku return type ya same olmali ya da degistireceksek de covariant yani subclass olmali) Yani A'yi Animal class olarak dusun, method'u da getAnimal olarak. Muhtemelen return type'i default olarak Animal yapardik. Ama subclasses are a little bit more specific. So; bu return type'i general yerine daha specific yapmak istersek Animal yerine Cat veya Dog gibi subclass'i kullanabiliriz. Bunda da, mesela, A'nin subclass'i olan D yaparsak:
     */


    class D extends A {
        @Override   // you can keep the return type the same, or change to covariant (which is basically sub class of that return type)
        public D get(){
            return new D();  // return null; yapmak istesek onu da yapabiliriz mesela. Default olarak null. Ama boyle de olur.
        }
    }




