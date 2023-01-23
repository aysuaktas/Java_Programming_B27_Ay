package day34_custom_classes.app2;

public class _04AppStore {

    public static void main(String[] args) {

        // Bunu sildi Saim, sorudan alakasiz ama bulunsun burada:
        // String s = "java";  // String is an object.
        // s.length();
        // String.length();  // method static ise boyle yazilabilir ama what String? It doesn't make sense.


        /*
        How to create an object
            ClassName varName = new ClassName();

              Note: left side of the equal sign is the reference
		            right side of the equal sign is the object
         */

        _03App instagram = new _03App();  // the instagram is the reference of the object. --> ='in yani equal sign'in sag tarafi object, sol tarafi reference oluyor bu syntax'te.
        instagram.name = "Instagram";
        instagram.version = 12.1;
        instagram.isFree = true;
        instagram.ratings = 4;

        instagram.update();  // Instagram is updating --> this is calling the instance method by the object / reference  ---> update method'u bir onceki _03App class'indaydi, oradan cagiriyoruz. Ustte de _03App instagram = new _03App(); yazdigimiz icin cagirabildik

        System.out.println(instagram.name);  // Instagram
        System.out.println(instagram.version);  // 12.2
        System.out.println(instagram.isFree);  // true
        System.out.println(instagram.ratings);  // 4
        // Bunlari (bu 4 print statement'tekileri) tek tek yazmak reusable degil. Her app icin kodu 4 kere copy paste yapmamiz gerekirdi.

        System.out.println("------------------");

        // Whenever you print any object in java, it always calls a method. It's already created. For ex, if I print only instagram:
        // _03App class'inda ekleme yapmadan once yaparsam:
        // System.out.println(instagram);  // day34_custom_classes.app._03App@2812cbfa --> bunu run edince hash code aliyorum. Cunku there was one String method that is automatically called, by default. We can update, change it a little bit. There is a method that exists. We will see two ways -> birinde manual olarak gorecegiz


        /*
        _03App class'inda bu alltakini yazdigimizda, orada ne sekilde yazarsak burada cagirdigimizda artik hash code almayacagiz, o yazdigimiz formatta hepsini print edecek:

        public String toString() {    // this is instant. Bunda static yazmadim public static... degil yani, public String.
        return "Name: " + name + "\nVersion: " + version + "\nisFree: " + isFree + "\nRatings "  + ratings;   // It is just concatenation. I concatenate these variables into this format
         */

        System.out.println(instagram);  // now that we wrote the toString, so we can print the object. --> This method is automatically called. Ayrica method ismi falan yazip cagirmadik bunda.

        /* Now, sadece instagram yazinca this will be printed:
        Name: Instagram
        Version: 12.2
        isFree: true
        Ratings 4

     // Boylece tek tek print statement'leri yazmama da gerek kalmadi.
         */

        System.out.println("----------");

        System.out.println(instagram.toString());  // this is not necessary because toString ((_03App'de olusturdugumuz method)) is automatically called

        // diger kisa yolunu sonra gosterecekmis




    }
}
