package day19_loops;

public class _09CountLetter {

    public static void main(String[] args) {

        // frequency -> is a very popular interview question

        // frequency of letter in a word
        // word -> java
        // how many 'a' chars?

        // Normalde nasil yapariz -> firstly word'e bakarsin, first letter'a bakip -> no this is not the letter that I'm looking for. Then, second word'e bakarsin -> no, it's not again. Third letter'da aradigim letter var diyelim, 1 sayarim.

        String word = "java";
        int count = 0;

        for(int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {   // Zeynep'in aciklamasi::::    index number 0dan basliyor ve her kelimenin bir index number'i var. Rakamsal olarak 0'dan baslayarak kelimenin sonuna kadar takip edisini charAt() ile esitleyerek ( == ) yapiyor cunku charAt(i) demek bir integer demek. esittir a dedik, yani a'nin oldugu noktadaki rakam/index number'dan bir esitleme yapiyor. ---> Normalde har veya kelime karsilastirmak icin String'de equals method kullanmak gerekiyor == yerine (cunku == location ile ilgili oluyor non-primitive'de) ama burada harflerin lokasyon olarak sayi karsilastirmasi yaptigimiz icin burada sikinti yok.
                count++;     // kelimem java ise -> is j equal to a? no. Second letter'a geceriz. Is a equal to a? yes, 1 sayariz. Third letter -> v is not equal to a. Fourth and last letter is equal to a, yes -> so, it will print "2" on the console when we print it below.
            }
        }

        System.out.println(count);

        // String word = "java";  -> ise console'da --> 2
        // String word = "apples and bananas";  --> ise console'da --> 5



    }
}
