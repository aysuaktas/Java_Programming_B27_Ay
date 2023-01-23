package day38_encapsulation._01_access_modifiers;

public class _01AccessModifiers {

    public int a = 5;  // it is accessible within the project -> because its access modifier is "public"
    int b = 10; // this has default access because I didn't use any other modifier --> Hicbir sey yazmadigi icin access modifier'i will be "default" by default. So, scope of this variable is within the package. I can use this variable within the package
    private int c = 20; // its visibility only within the class -> because its access modifier is "private"
    // These are instance variables because they belongs to the class


    public static void main(String[] args) {
        int a = 3; // this is local variable -> because it belongs to that block of code
        System.out.println(a); // 3 --> local variables prioritized oldugu icin ustte instance variables olarak a olsa da local olan print edildi burada

        _01AccessModifiers obj = new _01AccessModifiers();
        System.out.println(obj.a);  // 5 --> It's okay because I'm still in the same project  --> bunda instance variable olaninki print ediliyor -> icine obj yazdigim icin. Print statement icine sadece a yazsam 3 olurdu
        System.out.println(obj.b);  // 10 --> It's okay because I'm still in the same package
        System.out.println(obj.c);  // 20 --> It's okay because I'm still in the same class
    }
}

    // Ayni package'daki bundan sonraki _02TestingAccess class'i (ayni package'da ne oldugunu gormemiz icin) ve day29_my_utils'teki _04TestingAccessOutside class'i (baska package'da olunca ne oldugunu gormemiz icin) bununla ilgili