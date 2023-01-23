package day14_string;

public class _01StringMethods1 {

    public static void main(String[] args) {

        String item = "pen";   // in String pool
        String item2 = new String ("pen");  // directly in the heap
        System.out.println(item == item2);  // checks if the object item is the same object as item2 ----> false

        String item3 = new String("pen");
        System.out.println(item2 == item3);  // compares the two objects. They are both in the heap ----> false

        //  equals equals'i ( == ) primitive datatypes'i karsilastirirken kullanmaya devam edecegiz. Ama String is a non-primitive datatype. So;

        //  .equals()  : compare the value of the Strings, which checks if the characters are the same
        System.out.println(item.equals(item2));    // true
        System.out.println(item2.equals(item3));   // true

        System.out.println(item3.equals("pen"));   // true

        System.out.println(item.equals("Pen"));   // checks for exact characters including cases  ----> false
        System.out.println(item.equalsIgnoreCase("Pen")); // check only for matching characters and ignores all cases ((uppercase - lowercase will be ignored)) -----> true

        System.out.println("----------------------------");

        String username = "jamesbond";
        String password = "BOND007";
        System.out.println(username.equals("jamesbond"));  // true
        System.out.println(password.equals("bond007"));    // false -> because we wrote lowercase 'bond' instead of uppercase BOND

        System.out.println("----------------------------");

        String day = "Tuesday";
        System.out.println(day.length());  // length() -> it counts how many character there is.    ----> 7
        String day2 = "Friday";
        int len = day2.length();   // length() method gives back int type, so we can use it however we want
        System.out.println(len);   // ----> 6

        String str = " hello ";  // the character 'hello' are 5 long but spaces are also character, so the space in the beginning and end are included, which means the total length is 7
        System.out.println(str.length());  // ----> 7 // space de sayiliyor. // prints how many characters the String has, not the String // print (7)

        System.out.println(str);  // it prints ' hello ' to the console

        System.out.println("----------------------------");

        String word = "Summer";
        word.toUpperCase();  // the uppercase method makes all the characters uppercase, but we didn't do anything with this value

        // nextInt(); --> bu da baska bir method ornegi. // TODO:  Tum methodlarda -> assign etmezsen degeri degismez

        // TODO:  System.out.println(word.toUpperCase()); boyle yapinca da all uppercase -> methodu direkt print statement icinde kullaninca. Ama bundan sonra direkt word'u yazdirmak istersek o yine original hali olan Summer olacak cunku reassign etmedik ve String is immutable
        System.out.println(word); // Summer. It won't change to uppercase. Because String is immutable, cannot change. The thing is we can reassign it.

        word = word.toUpperCase();  // reassigning it, so;
        // this time we make all the characters uppercase, then the String it gives us back (all uppercase), was reassigned into the variable
        System.out.println(word);   // So, when we print 'word'----> SUMMER
        System.out.println(word);   // SUMMER

        System.out.println("----------------------------");

        String sentence = "hello My NAME is";  // a sentence with both lowercase and uppercase
        System.out.println(sentence.toLowerCase());  // ----> hello my name is
        System.out.println(sentence); // ----> hello My NAME is  // it prints the original String, because String is immutable, it cannot change

        // TODO: make a new String that was all lowercase, and then print it :
        String lowerVer = sentence.toLowerCase();  //  new variable is okay // the new object from the method is stored into the new variable //----> eger oncekini kaybetmek istemiyorsak yeni olusturmak mantikli, duruma bagli yani
        System.out.println(lowerVer);   // ----> hello my name is

        // option3: reassign is also okay
        sentence = sentence.toLowerCase();  // reassigning
        System.out.println(sentence);  // ----> hello my name is


        System.out.println("----------------------------");

        String s = "      java       ";
        System.out.println(s); //      java
        System.out.println(s.length());  // 17
        s = s.trim();  // trim() method gets rid of all the extra spaces in the beginning and end of a String
        System.out.println(s);  //java  ---> trim method'dan sonra bosluklar gitti; bu nedenle length print edilince de 4 olacak;
        System.out.println(s.length()); //4

        String s2 = "   multiple    words   here    ";
        System.out.println(s2.trim());  // trim() will remove from beginning and end, middle spaces will not be touched.   // ---->multiple    words   here


    }
}
