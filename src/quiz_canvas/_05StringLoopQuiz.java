package quiz_canvas;

public class _05StringLoopQuiz {

    public static void main(String[] args) {


        // Question 1 =  What is the result of the following code fragment?

        String ta = "A";
        ta += "B";
        String tb = "C";
        ta += tb;
        ta.replace('C','D');
        System.out.println(ta);   // ABC

        // Cunku: reassign etmemis. -> ta = ta.replace dese ABD olurdu. Ama reassign etmedigi icin replace method'lu halini print etmiyor

        System.out.println("----------");


        // Q2 = result of code fragment?

        String str = "    Hello World    ";
        str = str.trim();  // bu sayede bastaki ve sondaki spaces gitmis oldu
        int z = str.indexOf(" ");  // iki kelimenin arasindaki bosluk. ). index Hello'nun H'si olmak uzere sayinca space'in index numarasi = 5
        System.out.println(z);   // 5

        System.out.println("----------");


        // Q3 = result of code fragment?
        String str1 = "java";
        String str2 = new String("java");
        if(str1 == str2){
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }

        // Answer is: Not Equals --> cunku String literal ile olusturulan String ile new keyword ile olusturulan String'in location'i farkli. Biri String pool'da biri Heap'te stored ediliyor. == operators ile bakinca da kelimeye yani string of text'in esitligine degil lokasyona baktigimiz icin -> if(str1 == str2) condition'i fals oldugu icin else block will be printed.

        System.out.println("----------");


        // Q4 = result of code fragment?

        String batch = "   Java Class   ";
        int z1 = batch.trim().length();  // once trim yaptigi icin bastaki ve sondaki 3er bosluk gitmis oldu. Java Class'in uzunlugu da space de dahil oldugu icin -> 10
        System.out.println(z1);  // 10

        System.out.println("----------");


        // Q5 = result of code fragment?

        String s3 = "abcdefg";
       // System.out.println(s3.charAt(s3.length())); // StringIndexOutOfBoundsException ---> cunku s3'un length'i 1'den basladigi icin 7. Yani; s3.charAt( 7.index number'daki karakter ) isteniyor. Ama index numbers sifirdan basladigi icin son karakter olan g'nin index number'i bile 6. Length uzerinden sorup -1 de yapmadigi icin oyle bir karakterimiz yok. Elimizde olmayan character oldugu icin StringIndexOutOfBoundsException hatasini aliyoruz.

        System.out.println("----------");


        // Q6 = result of code fragment?

        String s4 = "wooden spoon";
        String s5 = s4.substring(0, s4.indexOf(" "));
        System.out.println(s5);  // wooden

        // s4.indexOf(" ") dedigi iki kelime arasindaki space. Substring'de ikinci kisma yazilan dahil edilmedigi icin bosluk dahil degil. Bu nedenle s5 = sifirinci index'ten yani en bastan bosluga kadar olan kisim yani wooden oldu.

        System.out.println("----------");


        // Q7 = Match the following loops to how they work

        // for loop -> initializes a variable, checks boolean condition for next iterations, runs code, then updates

        // while loop -> executes the boolean condition first to check if the code inside the loop should run

        // do while loop -> executes the body of the loop first and then checks the boolean condition to for next iterations

        System.out.println("----------");


        // Q8 = result of code fragment?

        int a = 0;
        while(a <= 5){
            a += 2;
        }
        System.out.println(a);
        // 6  --> a 5'ten kucuk veya 5'e esit olana kadar print edecek. Ve 2'ser 2'ser arttiracak. Yani a = 0 iken bir kere sayiyor, sonra 2 a += 2 (yani a = a + 2) dedigi icin 2'yi check ediyor, halen 5ten kucuk, sonra 4'e bakiyor, hala 5ten kucuk. Sonra yine artiriyor 6 diyoe, bakiyor 5'ten kucuk degil, devam etmiyor. Ama en son 6yi yazip sonra check ettigi icin en son a degeri 6 olmus oldu

        System.out.println("----------");

        // Q9 = result of code fragment?

        /*
        for(int i = 0; i < 5; i--){
            System.out.println("Hello Cydeo");
        }
        // -> infinite loop -> This is an infinite loop. Cunku i'yi 0'dan baslatmis ve kosul da i < 5 oldugu surece print et. Loop'un durmasi icin i'nin 5'e esit veya 5'ten buyuk olmasi lazim. Ama i--; yaptigimiz icin 0'dan baslayip geriye yani negatif degerlere gidiyor -> onlar - (negatif) deger olarak hep 5'ten kucuk olacagi icin infinite loop, dongu durmaz --> infinite loop oldugu icin comment out yaptim
         */

        System.out.println("----------");


        // Q10 = result of following code?

   int i = 0;
   do{
       i++;
       System.out.print(i + " ");
   } while (i % 2 == 1);

   // Answer is 1 2. Cunku do while oldugu icin bir kere kesin yazdiriyoruz. i++; demek direkt o i degerini artirmis oluyor, yani 1 olmus oldu. Sonra print statement'te de i + " " var, " " koyma sebebi arada bosluk birakmak. Bir i daha olmus oldu... // TODO: kizlara bir sor bunu

    }
}
