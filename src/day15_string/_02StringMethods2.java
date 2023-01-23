package day15_string;

public class _02StringMethods2 {

    public static void main(String[] args) {

        String word = "java";
        System.out.println(word.startsWith("j")); // ---> true ---> Does my word (java) starts with j? True. Then, it will be printed 'true'

        System.out.println(word.startsWith("ja")); // ---> true

        System.out.println(word.startsWith("jae")); // ---> false


        System.out.println("-------------------------------");


        System.out.println(word.endsWith("a")); // ---> true -> Does my word (java) ends with lowercase a? True.
        System.out.println(word.endsWith("A")); // ---> false -> because case sensitivity does matter. My word ends with lowercase a, not uppercase A.

        System.out.println(word.endsWith("java")); // ---> true -> muhtemelen boyle kullanmazsin, ama bu da syntax olarak true.
        System.out.println(word.endsWith("va")); // ---> true
        System.out.println(word.endsWith("va ")); // ---> false -> va'dan sonra space biraktik ama benim word'um space ile bitmiyor. Sorun space'de ama character olarak degil. Sorun benim orada space birakmamis olmamda


        System.out.println("-------------------------------");


        boolean b = word.startsWith("hello"); // todo:  method returns boolean, so you can also declare a boolean variable

        String s = "hello world today";
        System.out.println(s.startsWith("hello wor")); // ---> true -> space var ama benim yazdigim "hello world today" de space'li oldugu icin sorun yok, dogru bu. Space character'i ile bir sorunum yok yani, o da olabiliyor.


        System.out.println("-------------------------------");


        String str = "today it is 80 degrees";
        System.out.println(str); // --> today it is 80 degrees

        System.out.println("str.contains(today)) " + str.contains("today")); // --> str.contains(today)) true   // Kendime not: console'da bakinca hangisine ait oldugunu gormek icin boyle iki kez yazdik ama su sekilde de olur normalde;
        System.out.println(str.contains("today"));  // ---> true ((kendime not))

        System.out.println("str.contains(it is)) " + str.contains("it is")); // ---> true
        System.out.println("str.contains(degrees)) " + str.contains("degrees")); // ---> true
        System.out.println("str.contains(it 80)) exact sequence " + str.contains("it 80")); // ---> false. Cunku exact sequence olmasi lazim contains icin. it is 80 kisminda sadece it 80 diye sorarsa -> false, arada is de olmaliydi ---> ya da ayri ayri yazabilirdik: str.contains("it") && str.contains("80"); seklinde olsa true olurdu. Cunku, mesela;

        System.out.println(str.contains("80") && str.contains("today")); // ---> true. These are two different contains methods that return boolean. Separately, then I put them together. Boolean -> 80'i icerir mi diye baktik, true. today'i icerir mi diye baktik, true. --> true && true == true oldu



    }
}
