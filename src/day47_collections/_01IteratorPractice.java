package day47_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _01IteratorPractice {   // don't call this class like Iterator. IteratorPractice falan verin ismini diye ozellikle belirtti Saim


    // Iterable is the interface.
    // iterator is the method --> the method is called iterator. All the collection types have the method "iterator". It returns the iterator here.
    // Actual object that we can use.

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("James", "Anna", "Emre", "Jane"));

        for(String each : names){   // type is String cunku ustte oyle belirledik
            System.out.println(each);
        }

        System.out.println();  // empty print statement for readability in console for us

        Iterator<String> it = names.iterator();   // reference "it" is common, you can use "it". ((Veya iterator de diyebilirmisiz, uzun hali))  --> I made my iterator object bu line of code'da. --> Saim'in burada yazdigi tek cumle bu: "pin is created, it starts before the first element" --> it is not about indexes, it is about position. -> Index ile ilgili diyemeyiz cunku bu tum collection type'larinda kullanilabilir ve hepsi index kabul etmiyor, sadece ArrayList'i dusunme. O nedenle position olarak ogren bunu, index degil.

        System.out.println(it.hasNext()); // true  --> hasNext() method checks is there any element after (from where the pin currently is)
        System.out.println(it.next());    // James  --> next() method moves the pin once and return the value of that element (where the pin is)

        System.out.println(it.next());  // Anna
        System.out.println(it.next());  // Emre
        System.out.println(it.next());  // Jane

//      System.out.println(it.next());  // NoSuchElementException veriyor tekrar yazmayi deneyince --> exception occurs because there is no element left

        System.out.println(it.hasNext());  // false  --> is there another element after -> no -> so it returns false

        System.out.println();  // empty print statement for readability in console for us

        // Ne zaman while loop kullanmak mantikli? -> If I don't know the number of iterations that will take. So, best use is "while"

        // asil anlatmak istedigi olay ise bu:
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

            /*
            James
            Anna
            Emre
            Jane
             */

    }
}

    // pin ne? --> Kizlarin explanation:  iterator kullaninca ilk element oncesine pin yaratmis oluyorsun, lokasyon gibi dusun, konumun yani. Sonra next diyerek tek tek tum elementlerin uzerinde dolanabiliyorsun. hasNext de eger baska element yoksa dursun diye; sinir koyuyoruz yani aksi halde devam etmek istersen exception veriyor. Su anki konumundan sonrasi var mi diye boolean donen bir method

    // read with lambda yapmistik onceden, simdi read with iterator icin bir task yapacagiz -> _02RemoveNumber class'inda


    /*
    SAIM'S NOTES ((not in IntelliJ))

Iterable

	interface
	parent of the Collection interface

	any data structure that implements the Iterable, which is any data structure that implements Collection interface, can be iterated with a for each loop

	The interface defined this abstract method:

		Iterator<T> iterator();

		this abstract method was implemented in the collection classes. The methods return an iterator object which allows us to iterate through the elements one at a time using the methods of the iterator. It iterates through from beginning to end

		-> think of the iterator as a pin

		-> when the iterator method is called, the start point is BEFORE the first element


	- methods:

		- hasNext() : returns boolean. Checks if there is any element next to the current position of the iterator(pin)

		- next() : returns the element. First moves the iterator to the next element, and it returns that elements

		- remove() :  removes the element at the current iterator position.

     */
