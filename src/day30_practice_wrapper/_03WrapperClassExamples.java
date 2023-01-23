package day30_practice_wrapper;

public class _03WrapperClassExamples {

    public static void main(String[] args) {

        byte b = 9;  // this is just a primitive datatype
        Byte b2 = 23; // lowercase byte olan primitive datatype. Uppercase Byte olunca this is a class, an object

        Character c = 'j';
        System.out.println(c);  // j  --> Bunu bu turdeki context'te kullanmayacagiz but just good to know how it works

        int i = 4;
        Integer i2 = i; // primitive -> wrapper class : autoboxing ---> ((autoboxing: converting the primitive datatype to a wrapper class object ))
        System.out.println(i2); // 4

        Integer i3 = 32;
        int i4 = i3;  // wrapper class -> primitive: unboxing  ---> bunda wrapper class'tan primitice datatype'a gidiyorum -> unboxing yani converting from the wrapper class object to the primitive datatype
        System.out.println(i4);  // 32

        Integer i5 = new Integer(10);  // bu older version'da. Not wronh but older way of using wrapper class. Artik bunu kullanmiyoruz, o yuzden intelliJ uzerini cizmis -> Integer i5 = 10 seklinde kullaniliyor.
        System.out.println(i5);  // 10
        Integer i6 = 10;
        System.out.println(i6); // 10






    }
}
