package day29_methods;

import day28_methods._02Numbers;

public class _02TestCalling {

    public static void main(String[] args) {

        int[] arr = {3, 1, 4, 5};
        int sum = _01ExtraPractice.sumFromArray(arr);  // _01ExtraPractice class'ina gidip oradaki sumFromArray method'unu bu class'ta boyle cagirabildik
        System.out.println(sum);   // 13

        double value = _01ExtraPractice.currencyConvertor("won", 130);  // className.methodName ile cagirabildik yine. Bu sefer yine o class'taki currencyConverter method'unu cagirdik (we called this method from another class)
        System.out.println(value);   // 158277.6

        // TODO: bunda syntax'ini gorunce "ExtraPractice is a class name" oldugu assumption'ini yapacaksin.

        System.out.println("-------------");

        // Farkli bir package'dan alacaksan we have to do import. day28 package'indaki _02Numbers class'ini cagirmak istiyorsam:

        // _02Numbers --> bunu yazinca altta class isimleri cikti, bunda enter'a tikladim -> import day28_methods._02Numbers; yazdi ust tarafta import kisminda

        _02Numbers.checkNum(9);  // Positive   will be printed ---> className.methodName yapiyoruz yine. Bir daha print statement icine yazmaya gerek yok cunku bu return type degildi, void ile yapilmis bir method idi, we did all the printing inside of the method, o yuzden direkt yazdirabildik.





    }
}
