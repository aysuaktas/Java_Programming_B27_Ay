package day51_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class _03StreamMethod2 {

    public static void main(String[] args) {

        // primitive array to a List -->
        int[] arr = {3, 4, 1, 5, 15, 4};
        List<Integer> list =  Arrays.stream(arr).boxed().collect(Collectors.toList());

              //  Arrays.stream(arr) --> converts the array to a stream(int) --> ((this is int stream, ama cok da fark etmez). --> (Stream is a generic type / generics. ---> Generics'te sadece object types var, primitives yok, primitives kullaniyorsak Wrapper class kullaniyorduk. O yuzden .boxed kullanmamiz gerekiyor once, int'i object type cevirmek icin. Ondan sonra ne istersek kullanabiliriz. --> Bu method ile ((stream'den genel olarak mi bahsediyor??)) char array kullanilmiyor mesela, bazi kurallar var.))

                     /* Saim's note:

                         Arrays.stream(arr) --> converts the array to a stream(int)

                        .boxed() --> converts the data from int to Integer -> result is Stream<Integer>
                     */

            // list to array:  ((simdiye kadar list'i array'e cevirmeyi gormemistik))
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 5, 1, 5, 5, 12, 5, 2));
        int[] arr2 = list2.stream().mapToInt(n -> n).toArray(); // mapToInt() -> this method takes out element and turn it into int type. -> Taking some value, and I am returning it into int type. For ex, firstly I am taking my first element which is number 3, and I am returning as int parameter type. All my types from wrapper class'i primitive int'e dondurur bu method. Yani takes the Generic type and return it primitive int type. Primitive array type'a dondurduk. --> Method ismi mapToInt() yani mapping is like connecting two information together. Mapping information anlaminda dusun. Map method bu, about streams. It is not about collection framework, yani collection framework'undeki map ile alakasi yok, sadece mapping derken connecting/mapping information anlaminda dusun bunu. Bir stream method'u.

                /* Saim's note:

                list2.stream() --> converts List to a Stream<Integer>
                .mapToInt(n --> n) --> converts each number to an int type
                    IF IT WAS A METHOD: public static int mapToInt(Integer i){
                                            return(int)i;
                 */

                        /* Yani bu casting gibi -> downcasting gibi. Yani mapToInt(n --> n)'i method olarak yazsaydik: public static int mapToInt(Integer i){
                               return(int)i; gibi olurdu     */

       // list2.toArray(); // olsaydi this returns the object array


        System.out.println("=========================================");


        List<Integer> list3 = new ArrayList<>(Arrays.asList(3, 5, 1, 5, 5, 12, 5, 2));
        // Function ne? -> method that has any parameter ((take any argument)) and any return type
        System.out.println(list3.stream().map(n -> n * 2).collect(Collectors.toList())); // [6, 10, 2, 10, 10, 24, 10, 4]  -->// I'm returning number multiplying by it -> reassign etmedigimiz icin degerini degistirmedik list3'un, bu nedenle list3'u print edersek 2 ile carpilmamis ilk hali print olacak:
        System.out.println(list3);  // [3, 5, 1, 5, 5, 12, 5, 2]

                /*
                 IF IT WAS A METHOD: public static int map(Integer i){
                                                return i * 2;
                 */


        System.out.println("=========================================");


        List<String> list4 = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")); // gunlerin shorter version'ini cok goruruz, basically first three letters'ini
     //   System.out.println(list4);  // [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
        System.out.println(list4.stream().map(day -> day.substring(0,3).toUpperCase()).collect(Collectors.toList())); // [MON, TUE, WED, THU, FRI, SAT, SUN] -->// uppercase yapmak zorunda degiliz ama yapabiliriz. --> // collect(Collectors.toList()) yazmazsak hashcode gibi goruyoruz


        System.out.println("=========================================");


        List<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> even = list5.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());  // filter() accepts predicate so, it needs to return boolean. If my element is even, keep it and filter others anlaminda kullaniyoruz burada filter method'u
        List<Integer> odd = list5.stream().filter(p -> p % 2 != 0).collect(Collectors.toList());

        System.out.println(even);  // [2, 4, 6, 8, 10]
        System.out.println(odd);   // [1, 3, 5, 7, 9]


        // given some list of numbers, find how many were even:
        System.out.println(list5.stream().filter(p -> p % 2 == 0).count());  // 5
        System.out.println(list5.stream().filter(p -> p % 2 == 0).distinct().count()); // 5  --> how many unique even numbers -> bunu yani unique olanlari bulmak icin distinct methodunu kullandik. Tum cift sayilarimiz unique oldugu icin total number'i degismedi distinct method ile yazinca.


        System.out.println("=========================================");


        List<String> list6 = new ArrayList<>(Arrays.asList("java", "soft skills", "javascript", "JAVA", "JAVAscript", "selenium", "restassured", "cypress"));

        // hangileri java kelimesini iceriyor?
        System.out.println(list6.stream().filter(p -> {
            p = p.toLowerCase(); // we returned everything to lowercase first ((case sensitivity'nin onune gecmek icin))
            return p.contains("java");
        }).collect(Collectors.toList()));  // [java, javascript, JAVA, JAVAscript] --> filter method'unun parantezinin kapandigi yerin sonuna gelip .collect(Collectors.toList()) yazdik ki hashcode gormeyelim sonucu gorelim

        // how many java geciyor?
        System.out.println(list6.stream().filter(p ->
                p.toLowerCase().contains("java")).count());  // 4

        // map() ve forEach() method
        list6.stream().map(s -> s.toUpperCase()).forEach(e -> System.out.print(e + " "));  // JAVA SOFT SKILLS JAVASCRIPT JAVA JAVASCRIPT SELENIUM RESTASSURED CYPRESS  --> hepsini uppercase yaptik. println yerine print ile yan yana print ettik

        System.out.println();

        list6.stream().map(s -> s.toUpperCase()).forEach(System.out::print);  //JAVASOFT SKILLSJAVASCRIPTJAVAJAVASCRIPTSELENIUMRESTASSUREDCYPRESS --->//  call a method on an object bu sekilde -> (System.out::print) -->// Saim's explanation: does the same thing as line 98, each element uses the method ---->// line 98 dedigim: list6.stream().map(s -> s.toUpperCase()).forEach(e -> System.out.print(e + " ")); olan

                // just a call method icin forEach(System.out::println); gibi kullanabilirsin ama you cannot control it. So, if you want to give an implementation, you have to use with lambda.

                /* line 102'deki list6.stream().map(s -> s.toUpperCase()).forEach(System.out::print); dekini println ile yapip:
                list6.stream().map(s -> s.toUpperCase()).forEach(System.out::println); yapinca console'da:

                JAVA
                SOFT SKILLS
                JAVASCRIPT
                JAVA
                JAVASCRIPT
                SELENIUM
                RESTASSURED
                CYPRESS
                 */
    }
}

    /*
    .method1().method2.method3()
        write it as:
        .method1()
        .method2()
        .method3()
     */
