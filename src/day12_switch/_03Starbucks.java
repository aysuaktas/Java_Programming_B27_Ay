package day12_switch;

public class _03Starbucks {

    /*
    drink:  // size of drink
        price
        calories

    tall:
        2.50
        100

    grande:
         4.00
         150

    venti:
         4.50
         200

     */

    public static void main(String[] args) {

        String size = "grande";    // input.nextLine()
        double price = 0;
        int calories = 0;  // TODO: bunlara 0 yazdik cunku -> degere ulasmak icin adresine bakiyor bilgisayar. Eger sen deger atamazsan bir adres belirlenmiyor. Bu sefer o degistirmek istediginde adresi bulamadigi icin hata veriyor. 0 (zero) yazdiginda o degisken icin bir adres belirliyor bilgisayar. Bir daha o degisken uzerinde islem yapmak istediginde o adresi gidip bulabiliyor.
        // ---> ((veri tipleri diye aratip calis. Arkadaki calisma prensibiyle ilgili bu. Kizlar grubundan birinin IT'deki ablasi dedi bunlari ))

        switch(size) {      // I cannot evaluate price in switch. It is not allowed because it is double number. ((TODO: Switch parantezinin icine double koyamayiz yani ama icinde yazdirabiliriz)).


            case "tall":
                price =  2.50;
                calories = 100;
                break;

            case "grande":
                price = 4.00;
                calories = 150;
                break;

            case "venti":
                price = 4.50;
                calories = 200;
                break;


            // default case koymaya gerek yok su an.

        }

        if(price != 0 && calories != 0) {     // TODO: yanlis bir sey yazarsak (case'e yazmadigimiz yani tall, grande, venti olmayan bir sey olursa) -> yukarida price ve calories icin yazdigimiz 0'i diger veriler icin getirmesin diye bunu yazdik. Yani 0 calorie 0 price yazmasin diye. -> default kullaninca yine 0 calorie vs printed ediyor.
            // Sona default: yazarsak ve case'lerde yer almayan bir size (String size = "g" gibi) belirlersek -console'da -> Size: g is 0 calories and costs $0.0 cikiyor.

            System.out.println("Size: " + size + " is " + calories + " calories and costs $" + price);

            // String size = "tall"; ise -> Size: tall is 100 calories and costs $2.5
            // String size = "grande"; ise -> Size: grande is 150 calories and costs $4.0
            // String size = "venti"; ise -> Size: venti is 200 calories and costs $4.5

        }


    }
}
