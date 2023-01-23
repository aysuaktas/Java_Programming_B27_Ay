package day35_custom_classes.homework4;

public class _09CallingSong {

    public static void main(String[] args) {

        _08SongHomework song = new _08SongHomework("Dudu", 4.23, "Tarkan", "pop");  // _08SongHomework(String name, double length, String artist, String genre) sirasiyla yazdim degerleri

        System.out.println(song);  // Song{name='Dudu', length=4.23, artist='Tarkan', genre='pop'}


        // Benim yaptigim kisim ustteki. Overloading'i anlatirken Saim alta eklemeler yapti:


        // Tipki method overloading'de ogrendigimiz gibi. Constructor'da da usttekinde 4 tane bunda 2 tane value yazdik, o yuzden hangisini yazdirmasi gerektigini biliyor.

        // Constructor with two arguments cagirmak icin iki tane argument girecegim -> Sadece iki sey yazinca JVM(?) anliyor hangisi oldugunu
        _08SongHomework song2 = new _08SongHomework("Four season", 2.8);
        System.out.println(song2);  // Song{name='Four season', length=2.8, artist='null', genre='null'}


    }
}
