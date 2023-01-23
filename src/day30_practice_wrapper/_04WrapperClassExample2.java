package day30_practice_wrapper;

public class _04WrapperClassExample2 {

    public static void main(String[] args) {

        System.out.println(Byte.MIN_VALUE);  // -128
        System.out.println("Byte Min: " + Byte.MIN_VALUE);  // Byte Min: -128 --> ayni sey, sadece console'da aciklamasiyla gormek icin boyle yazdi

        System.out.println(Byte.MAX_VALUE);  // 127  --> boyle yazinca degerlerini buluyoruz, Saim; you don't have to memorize demisti o yuzden bize datatypes konusunu islerken
        System.out.println("Byte Min: " + Byte.MAX_VALUE);  // Byte Min: 127

        System.out.println("Integer Min: " + Integer.MIN_VALUE); // Integer Min: -2147483648
        System.out.println("Integer Max: " + Integer.MAX_VALUE);  // Integer Max: 2147483647

        System.out.println(Character.isDigit('4'));  // true
        System.out.println(Character.isLetter('o')); // true
        System.out.println(Character.isUpperCase('e'));  // false ------> if(char > 'A' && char <= 'Z') yapiyorduk onceden, ama simdi sadece bu sekilde yapabilirizzz fiyuuu !

        String s = "123";
        System.out.println(s + 5);  // 1235    --> concatenation oldu addition olmadi cunku s bir String.

        Integer.parseInt(s);    // I'm parsing this number. I'm taking a String and returning it an int. -> I want to store it in int type -> int i diyelim:
        // parse ---> converting String (or object) to primitive datatype. For ex: Integer.parseInt() olunca converting String to an int type.

        int i = Integer.parseInt(s); // converts the String to an int type
        System.out.println(i + 5);  // 128  ---> addition --> artik i sayi oldu





    }
}
