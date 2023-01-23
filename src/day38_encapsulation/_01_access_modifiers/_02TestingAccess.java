package day38_encapsulation._01_access_modifiers;

public class _02TestingAccess {

    public static void main(String[] args) {
        _01AccessModifiers obj = new _01AccessModifiers();
        System.out.println(obj.a);  // 5 --> It's okay because I'm still in the same project
        System.out.println(obj.b);  // 10 --> It's okay because I'm still in the same package
       // System.out.println(obj.c);  //-> It's not okay because I'm not in the same class and its access modifier was c --> c is private, and we are outside the class, so no access / visibility
    }
}
