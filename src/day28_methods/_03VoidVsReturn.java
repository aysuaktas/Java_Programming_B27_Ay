package day28_methods;

public class _03VoidVsReturn {

    public static void main(String[] args) {

        sayHello(); // Hello

        sayBye();  // the return value was not used, so we don't see any difference  // charAt(0)
        // bunu print edince yani when I call the method sayBye, nothing happens. Sadece sayHello'nunkini print ediyor
        System.out.println(sayBye()); // Bye --> methods returns String, I am printing a String --> bu sekilde burada print statement icine yazinca printed oluyor.

        String str = sayBye(); // method returns String and assigned the result into the new variable
        // System.out.println(str); yapmayi denedigimde Bye printed oldu
    }


    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String sayBye(){
        return "Bye";
    }

}
