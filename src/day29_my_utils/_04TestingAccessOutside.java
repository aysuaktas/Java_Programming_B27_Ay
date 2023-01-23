package day29_my_utils;

import day38_encapsulation._01_access_modifiers._01AccessModifiers;  // bu day38_encapsulation package'indaki _01AccessModifiers class'iyla ilgili oldugu va baska package'dan gelmis oldugu icin import edildi

public class _04TestingAccessOutside {

        public static void main(String[] args) {
                 _01AccessModifiers obj = new _01AccessModifiers();
                System.out.println(obj.a);  // 5 --> It's okay because I'm still in the same project, (so, even this is a different package, it's okay)

               // System.out.println(obj.b);  // b is default, which is only visible in the same package, so it cannot be accessed in a different package

              //  System.out.println(obj.c);  // c is private, so its only visible in the same class
        }
}
