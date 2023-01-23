package day29_methods;

import day29_my_utils._01StringUtil;  // day29_my_utils dedigim farkli package oldugu icin oncelikle onu import etmeliyim! ((my_utils.StringUtil seklinde Saim'de, ben numaralandirma verdigim icin benim biraz farkli ama ayni mantik -> packageName.className yani))

public class _03CallingStringMethods {

    public static void main(String[] args) {
        System.out.println(_01StringUtil.reverse("hello world"));  // dlrow olleh  --> day29_my_utils package'indaki _01StringUtil class'indan cagiriyorum bunlari. Bunu ve alttaki palindrome, fixFormat, camelCase ornegi de oradan.

        System.out.println(_01StringUtil.isPalindrome("racecar"));  // true

        System.out.println(_01StringUtil.fixFormat("jaMEs")); // James --> fixFormat orneginde sadece ilk karakter uppercase, kalani lowercase oluyordu


        System.out.println(_01StringUtil.camelCase("JAVA will ruLE tHe wORLd"));  // javaWillRuleTheWorld
    }
}
