package day29_methods;

public class _06Picture {

    // It is the first class that we see about method overloading topic.


    public static void main(String[] args) {
        draw();  // Drawing circle

        draw("red");  // Drawing with red ---> String argument'i kabul eden method'u ((yani ikincisini)) alacak, there is no problem

        draw(10);  // Making picture of 10  --> bunda da int argument'i kabul eden method'u (yani ucuncusunu) aldi

        draw("hello","world");  // Drawing with two Strings


    }


    public static void draw(){  // no parameters is also a parameter type
        System.out.println("Drawing circle");
    }

    // Color'dan vs bahsetmek istiyorsam peki? How can I overload the method? I will keep the name as same

    public static void draw(String color){
        System.out.println("Drawing with " + color);
    }

    public static void draw(int size){
        System.out.println("Making picture of " + size);
    }

    public static void draw(String s, String s2){  // different number of parameters var bunda. Baska string'li de yazmistik ama onda bir taneydi, bunda iki tane var. Yani bu da method overloading. Iki tane String yazarsak bunu print edecek:
        System.out.println("Drawing with two Strings");
    }

    public static void draw(String s, int a){
        // buraya ne yazarsak onu print edecek parameterlardan ilki String ikincisi int olursa
    }


    public static void draw(int a, String s){
        // buraya ne yazarsak onu print edecek parameterlardan ilki int ikincisi String olursa
    }


}








