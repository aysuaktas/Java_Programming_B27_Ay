package day49_functional_interface;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class _01ConfigRaeder {

            // bunu olusturmadan once ilk yaptigimiz -> project level'a gidip "test.properties" isimli properties file'i olusturduk --> (((bu class'ta da o information'a erismek istiyoruz sanirim)))


           // Properties properties = new Properties();  // properties object yaptik. -->  Equal sign'in -> Left side'i reference, right side'i object. -->import java.util.Properties'ten import edildi Properties

    private static Properties properties = new Properties(); // we added private and static at the beginning of that properties object. Because:

        // private -> only accessible in the same class
        // static -> I can access by the class name instead of needed to create an object  + static kullanmamizin diger bir sebebi de static only accept static members, so, instance kullansaydik ... ((burayi yazamadim ama David de toplantisinda bahsetmisti bu kisimdan)). static kullandik ki static methods'a vs yani static members'a kolayca erisebilecegiz boylece. Hem de object create etmemiz gerekmeden, cunku instance degil static.

        // Properties -> we are creating an object of this class to connect a properties (text.properties) to a java object

    static {


        try {
            // creates a file object, allows us to connect to a file
            FileInputStream file = new FileInputStream("test.properties");  // we are putting our name, our path basically. Some kind of file connection icin hangi file'i acmasini istiyorsak onun adini yaziyoruz parantez icine --> java.io.FileInputStream'dan import edildi FileInputStream -> java.io is the base package of the class --> direkt bunu yazinca FileInputStream uzerinde bir warning goruyoruz -> tiklayinca checked exception olan -> Unhandled exception: java.io.FileNotFoundException uyarisini goruyoruz, run etmek icin bunu handle etmemiz lazim, o nedenle try-catch block kullaniriz

            // loads the files into the properties object
            properties.load(file);   // load method kullandik to load the information from the file to the Properties object --> direkt properties.load(file) yazinca load kelimesi uzerinde warning verdi -> Unhandled exception: java.io.IOException -> bu checked exception'i verdi, o yuzden bunun icin de bir catch block lazim. Aslinda FileNotFoundException yerine alttakini IOException olarak degistirdik ve bu iki exception'i da kapsadi

        } catch (IOException e) {  // FileNotFoundException degil IOException yaptik cunku IOException is the parent of the all the exceptions in try block
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

        // static block -> run the code in the beginning to make sure everything is set up
        // FileInputStream -> connect to a file -> allows access to the information in some way
                // -> checked exception occurs, so we need to handle with try catch


    // How are you setting up your environment in your framework? sorusunu sorabilirler interview'da. This is utility class. What is the purpose of utility class? Utility classes have practical reusable methods that help automation. --> sanirim bu properties file'i konusunu daha cok automation'da gorecegiz. Zaten Saim ders notuna bu konu icin -> Properties & Driver Utilities - Idea for automation demisti


    /*  Summary of what we did:

        1) we created a properties file called: test.properties
                + had some information

        2) we created a class called _01ConfigReader
        3) in Config Reader, we created a Properties object
        4) in the static block, we connected to the file, using FileInputStream
        5) we used the load method from the Properties object (3) to load the information from the file to the Properties object
                 // Yani -> methods that we used are in the Properties object

        6) ((Buraya kadarki kismin kodu ustteydi, buradan sonrasi altta. --> How do we read the information in the java, in the code? -> I can give some keyword ((keyword mu dedi bunda???)) and get a value. But I have a problem here, it is private. Object'i private olusturduk, it is accessible only by in this class. Herkes erisip degistiremesin istiyoruz, o yuzden private kullandik ama encapsulation idea'sini kullanacagiz. Without direct access to my properties object olmasi icin encapsulation kullanalim, altta yaptik bu kismi, getter method kullandik -> digerleri private iken bunu public yapiyoruz ki baska class'ta okuyabilelim, encapsulation mantigi bu --> :) ENCAPSULATION EXAMPLE OLARAK NOT AL :))))) ))

     */

    public static String getProperty(String key) {   // this is getter method, encapsulation --> we are returning a String type cunku test.properties File'indakiler String. O nedenle public static sonrasinda String dedik
        return properties.getProperty(key);  // parameter olarak key verdik ki argument olarak day, browser, topic hangisi yazilirsa onun value'sunu verecek bize, onu return edecek
    }
}

    // let's make another class to test the information --> _02ReadInfo class'i bunun devami
