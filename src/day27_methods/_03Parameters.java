package day27_methods;

public class _03Parameters {

    public static void greeting(String name){  // name is the parameters, variable used in the method ---> general hello demek yerine if I want to say hello to someone -> o yuzden parantez icini bos birakmadim bu sefer
        System.out.println("Hello " + name);
        System.out.println("Nice to meet you " + name);
    }

    public static void age(int birthYear){
        System.out.println("You are " + (2022 - birthYear) + " years old");
    }

    public static void main(String[] args) {  // to call this method, I make main method

        greeting("James"); // bu sefer parantez icini bos birakmak yerine isim yazdik --> James is an argument, value of the name for method

        /* Print edince:
        Hello James
        Nice to meet you James
         */

        greeting("Kelly");  // Kelly is an argument, value of the name for method

        /*
        Hello Kelly
        Nice to meet you Kelly
         */

        age(2000);   // You are 22 years old
        age(1987);   // You are 35 years old
        age(1998);   // You are 24 years old



    }
}
