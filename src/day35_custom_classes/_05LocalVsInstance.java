package day35_custom_classes;

public class _05LocalVsInstance {


    // a & b are instance variables:
    int a = 5;
    int b = 10;

    public _05LocalVsInstance(int a, int z){  // a & z here are local variables --> (parameters are local variables? )
       // a = a;  // local a is prioritized, which means here you are reassigning the local variable to itself, but that means the instance a -> did not change  ---> SO, instance variable ile local variable bunda same, ikisi de ayni. O yuzden hangisi oldugunu nasil anlayacak? local a is prioritized, o yuzden by default onu alacak!
        this.a = a; // the solution is this. When we want to reference instance variables, and localVariableName is the same with instanceVariableName, we will use " this. " keyword. Yoksa by default local variables'i aliyor cunku.
        b = z;
    }

    public void print(){
        System.out.println(a);
    }


    // ayri bir class yerine main method'u burada olusturup burada run edersek:

    public static void main(String[] args) {
        _05LocalVsInstance obj = new _05LocalVsInstance(20, 50);  // obj = object anlaminda.
        System.out.println(obj.a);   //  20 -->   a = a; yaptigimizda print edilen 5 idi cunku localVariableName is the same with instanceVariableName, oldugu icin by default local variables'i almisti. Ama this.a = a; kullaninca bu sefer reference instance variable yapmis olduk, o yuzden console'da 20 print edildi.
        System.out.println(obj.b);   // 50
    }





}
