package day07_scanner;

public class _06ShortCircuitEx {

    public static void main(String[] args) {
        System.out.println(true && true);  // true
        System.out.println(false && true); // false

        // System.out.println(5/0); // you cannot divide by 0 (it is a mathematical thing). Bu nedenle bunu run etmeye calistigimizda error veriyor.

        // System.out.println(true && 5/0 == 0);  //boyle olunca da hata veriyor.

        System.out.println(false && 5/0 == 0); // code does not even run the second one because first one is false, so the code does not run second one. Bu nedenle hata vermeden "false" yaziyor console'da.

        // System.out.println(false & 5/0 ==0);   // tek & isareti ile denerken bazen calisabiliyor ama kodda fark oluyor. Mesela bunu && ile yazdigimizda ikincisini run bile etmeden false demisti. Ama tek & ile yazdigimizda yine error veriyor. (( && executes only one side if the result is already known. But & executed both sides no matter what -----> && kullan.))

        System.out.println(true || false); // ilki true. We already know the result. The outcome is true because it says true OR false --> true.

        int count = 0;
        System.out.println(true || count++ == 1); // true. Cunku in the beginning -> true oldugu icin devami her ne olursa olsun cevap true. The second part does not even get executed.So it thinks the count is still zero.
        System.out.println(count);  // 0

        System.out.println(true | count++ == 1); /// bir usttekinde tek bir tane | kullansaydik iki taraf da execute edilecegi icin alttaki 'count' print statement'i 1 cikacakti.
        System.out.println(count);

        /*
        Single &  -  |    continue run until the end
        Double && -  ||   when find thr result ----> STOP
         */

    }

}
