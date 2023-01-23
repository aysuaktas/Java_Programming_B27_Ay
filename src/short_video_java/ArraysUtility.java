package short_video_java;

// if I have the arrays that I need to work on, the first step is: I need to import the arrays utility class. import statement for arrays utility class is this:


import java.util.Arrays;  // bunu manual olarak yazdik, artik Arrays class method'larini kullanabiliriz

public class ArraysUtility {

    public static void main(String[] args) {


        // toString() method: converts array object to string, returns String:

        String[] names = {"John", "Smith", "Shay", "Breanna", "Josh"};

        System.out.println(names); // [Ljava.lang.String;@3f0ee7cb --> direkt variable name'i yazarsam hash code verir

        System.out.println(Arrays.toString(names));  // [John, Smith, Shay, Breanna, Josh]  --> to print any single-dimensional array, we use: Arrays.toString

        System.out.println("-------------------------");


        // sort() method: sorts the array in ascending order:

        int[] numbers = {5, 1, 3, 4, 2, 0};
        System.out.println(Arrays.toString(numbers));  // [5, 1, 3, 4, 2, 0] -> this is my array before sorting

        Arrays.sort(numbers); // now, Array is sorted. Simdi tekrar print edersek:

        System.out.println(Arrays.toString(numbers));  // [0, 1, 2, 3, 4, 5]  -> sorted array from smallest to biggest -> String veya char array olsaydi da alfabetik order'a gore olurdu; ascending order bu demek.

        System.out.println("-------------------------");


        // equals() method: compares two array objects if they have same elements in same order, returns boolean --> (elementlerin kendisi ve elementlerin sirasi same ise true, degilseler false):

        char[] arr1 = {'a', 'b', 'c'};
        char[] arr2 = {'a', 'b', 'c'};

        System.out.println(arr1 == arr2);  // false --->  karsilastirmak icin == operator'unu kullanirsan it will return false. Because arr1 ve arr2 are two different objects that are created in the heap. This == operator compare the objects from the memory allocation.

        // if you want to compare the elements of an array, you need to use equal() method, NOT the == operator
        System.out.println(Arrays.equals(arr1, arr2));  // true --> cunku bu iki array'in elements'i ve orders'i (positions'i) same

        // Farkli order'da olsalardi? Mesela:
        char[] arr3 = {'b', 'a', 'c'};
        System.out.println(Arrays.equals(arr1, arr3)); // false -> Because they are not in the same order.

        // What if I want to compare these elements without worrying about their orders? Siralama farketmeksizin ayni degerleri iceriyorlar mi diye anlamak istersek -> once sort sonra equal methodunu kullaniriz

        Arrays.sort(arr1);
        Arrays.sort(arr3);    // siraladiktan sonra arraylerim boyle olacak:
        System.out.println(Arrays.toString(arr1));  // [a, b, c]
        System.out.println(Arrays.toString(arr3));  // [a, b, c]

        System.out.println(Arrays.equals(arr1, arr3));  // true --> sorting sonrasi karsilastirirsak
        

        System.out.println("-------------------------");


        // copyOf(array, newLength) method: copies the specified array elements and sets new length, returns new array:

        int[] scores = {45, 55, 65, 75, 85};

        // bu scores array'ini alip kopyalamak ve iki tane daha extra spaces/spot eklemek istiyorsam (to add two more elements) yani size 5 iken 7 olsun istiyorsam
        int[] scores2 = Arrays.copyOf(scores, 7); // boyle olunca scores array'inde olan elementler kopyalanacak ama yeni array'in uzunluguna 7 dedik, o kalan iki element yerine de default olan deger yazilacak. Bu int oldugu icin default olarak 0 yazacak, double olsa 0.0 olurdu vs.

        System.out.println(Arrays.toString(scores2));  // [45, 55, 65, 75, 85, 0, 0]

        // What if I don't want to copy all array, but I want to copy only first three? Then, you need to make sure that the new size (newLength) is 3:
        int[] scores3 = Arrays.copyOf(scores, 3);
        System.out.println(Arrays.toString(scores3));  // [45, 55, 65]


        System.out.println("-------------------------");


        // copyOfRange(array, begIndex, endIndex): copies the specified range of the array, returns new array ---> (Bu methodu kullanacagimizda once array that you want to copy of'u sonra begining indexi sonra da ending index'i yazariz ve o aradakileri print eder --> of course ending index will be excluded, similar to the substring method)
        char[] elements = {'A', 'B', 'C', 'D', 'E', 'F'};
//      index numbers:      0    1    2    3    4    5
        // Array'imiz bu olsun. B'den E'ye (index number 1den 4e) olan elementleri kopyalamak istiyorsam once index number'larina bakarim.

         char[] someElements = Arrays.copyOfRange(elements, 1, 4);
        System.out.println(Arrays.toString(someElements));  // [B, C, D]  --> bunu print etmek icin de Arrays.toString kullanmamiz gerek, yoksa hash code verir. Ending index olan 4.index dahil olmuyor. Onu da dahil etmek istersek 4+1 yapmamiz gerekir:

        char[] someElements2 = Arrays.copyOfRange(elements, 1, 4+1);
        System.out.println(Arrays.toString(someElements2)); // [B, C, D, E]






    }
}
