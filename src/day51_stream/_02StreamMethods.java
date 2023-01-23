package day51_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _02StreamMethods {

    public static void main(String[] args) {


        // Creating a stream:
        List<Integer> list1 = new ArrayList<>(Arrays.asList(3, 4, 6, 12, 5));
        list1.stream();  //  it is in the Collection interface, and it returns some kind of String. Collection interface'de dedik, that means, all collection types ile kullanilabilir.  // list1.stream(); icin Saim's note: creates the stream, Need to do more
        System.out.println(list1.stream());  // java.util.stream.ReferencePipeline$Head@7d417077

        int[] arr1 = {3, 5, 6, 12, 5};
        Arrays.stream(arr1);  // made stream from array

        // we need to do one more set up, otherwise we cannot see the result. So, I will use the distinct method. But we have to remember that we need to get some kind of result too. Some methods give you a String back (return String), and some methods give you something else, for ex: numbers.

        // distinct method: removes duplicates!:

        // let's make another list type. Let's make a bunch of duplicates this time, to see distinct method:
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 1, 2, 3, 4, 5, 6, 6, 7, 6, 5, 4, 2, 4, 1, 5, 7, 4, 2));
    //    System.out.println(list2.stream().distinct());  //java.util.stream.DistinctOps$1@d041cf  //--> list2.stream() yazinca I have stream and I have the ability to calling its methods, so I can use .distinct() after that. // Stream is not a data structure. O yuzden onu cagirinca ArrayList'im mi var? Hayir, I have stream. What is stream? It is just a data

        // I need to get some kind of result. So, I need to add .collect(Collectors.toList()) at the end of it.
        System.out.println("distinct" + list2.stream().distinct().collect(Collectors.toList())); //-> just prints --> as: --> distinct[1, 2, 3, 4, 5, 6, 7] -->// Neden bu eklemeyi yaptim sona? Because I want to convert stream to the ArrayList. Yani ne yapmis olduk burada?:

            /*
            Saim's notes:
                .stream() -> converts the list to a stream
                .distinct() -> removes all the duplicates from the Stream
                .collection(Collectors.toList)) -> converts the Stream to a List type
             */

    //    list2 = list2.stream().distinct().collect(Collectors.toList());  // just reassign back into the same reference. Bunu da yapabiliriz.

    //    List<Integer> newRef = list2.stream().distinct().collect(Collectors.toList());  // can create new reference to store the new data. Bunu da yapabiliriz.

        System.out.println("list2: " + list2);  // list2: [1, 1, 1, 2, 1, 2, 3, 4, 5, 6, 6, 7, 6, 5, 4, 2, 4, 1, 5, 7, 4, 2]  //-> my original list buydu. Distinct methodunu kullandigimiz hali ise duplicate'leri cikardi.

        // Let's convert arr1, its syntax a little bit different

        int[] arr2 = {1, 1, 1, 2, 1, 2, 3, 4, 5, 6, 6, 7, 6, 5, 4, 2, 4, 1, 5, 7, 4, 2};
        arr2 = Arrays.stream(arr2).distinct().toArray();  // converting between types icin farkli ornek gostermek istedi -> sadece Arrays.stream(arr2).distinct().toArray(); yazinca I am not printing or I am not storing it, so I am not using it if I just write like that. O nedenle arr2'ye store ettik bunu once. Print edelim:
        System.out.println("distinct w/ array: " + Arrays.toString(arr2));  // distinct w/ array: [1, 2, 3, 4, 5, 6, 7]  -> w/ dedigi with


        System.out.println("==========================");


        // skip method -> If I want to skip some of them, if I don't want some of them to be in my data, I use skip method -> this method is NOT index based.
            // Saim's note: skip(n): skips/moves the n number of elements
        List<String> list3 = new ArrayList<>(Arrays.asList("summer", "bike", "fall", "raining", "pond", "lake", "fishing", "sun"));
        System.out.println(list3.stream().skip(3).collect(Collectors.toList())); // [raining, pond, lake, fishing, sun]  //--> it is not index base. it removes first three if I write skip(3). It starts with the first element. ((element olarak bakiyoruz index olarak degil))
        System.out.println(list3);  // [summer, bike, fall, raining, pond, lake, fishing, sun]
        System.out.println(list3.stream().skip(6).collect(Collectors.toList()));  // [fishing, sun]
        System.out.println(list3.stream().skip(10).collect(Collectors.toList()));  // []   -->// 10. yok elimde, 10 tane element yok yani. Ama exception vermiyor, sadece bos [] print ediyor


        System.out.println("==========================");


        // limit() method -> allows us to convert, manipulate the data. Manipulate which elements you want there icin kullaniliyor. Stream sadece a data, o nedenle index degil, element mantigi var. limit(n) deyince ilk n kadar elementi'i yazdiriyor -> Saim's note: limit(n) -> keep a n number of elements
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list4.stream().limit(5).collect(Collectors.toList())); // [1, 2, 3, 4, 5]  -->// it takes first five elements because we said limit(5). We are not talking about indexes, this is about element, because stream is just a data. --> stream() yapinca sonrasinda limit methodunu kullanabildik. Sonra da sonucu List type'a donusturebilmek icin .collect(Collectors.toList()) kismini sonuna ekledik

        // using both limit & skip:
        System.out.println(list4.stream().limit(6).skip(2).collect(Collectors.toList()));  // [3, 4, 5, 6]
        System.out.println(list4.stream().skip(4).limit(4).collect(Collectors.toList()));  // [5, 6, 7, 8]  //--> once skip the first four yaptik yani 1, 2, 3, 4u geciyor, print etmeyecek. And then, limit the 4 yani skip'ten sonraki ilk 4u alacagiz, o da 5, 6, 7, 8


        System.out.println("==========================");

        // count() method returns to LONG type. Bu method bize size'i soyluyor aslinda.
        // count: how many elements/data are in the stream:
        List<Integer> list5 = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 1, 2, 3, 4, 5, 6, 6, 7, 6, 5, 4, 2, 4, 1, 5, 7, 4, 2));
        System.out.println(list5.stream().count());  // 22 ---> count method kullandik -> it just says its size. Bunu tek kullanmak cok mantikli degil ama baska seylerle birlestirebiliriz. Mesela:
        System.out.println(list5.stream().distinct().count());  // 7 --> once duplicate olanlari cikarip sonra size'ina baktik


        // TASK: given a String determine the number of unique characters:
        String s = "aaaaabbbbbbcccccddddeeeeeeffff";
        System.out.println(Arrays.stream(s.split("")).distinct().count());  // 6
        System.out.println(Arrays.stream(s.split("")).distinct().collect(Collectors.toList()));  // [a, b, c, d, e, f]  -->// you could have also converted the stream to an array : you can use toArray() instead of Collect to List

    }
}
