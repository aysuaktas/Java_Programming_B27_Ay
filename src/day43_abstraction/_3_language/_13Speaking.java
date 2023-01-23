package day43_abstraction._3_language;

public class _13Speaking {

//    _10Language obj = new _10Language();  // cannot create objects of interface -> o yuzden comment out yaptik

    public static void main(String[] args) {


        _11English obj = new _11English();
        obj.hello();   // Hello
        obj.bye();   // Bye

        _12Spanish obj2 = new _12Spanish();
        obj2.hello();  // Hola
        obj2.bye();  // Adios

    }
}