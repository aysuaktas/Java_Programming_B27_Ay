package day35_custom_classes.homework4;

public class _08SongHomework {


    // Bugunku odevler -> constructor practice icin;

    /*
     create a class called Song

        - data:
            name, length, artist, genre

        - constructor
            - create a constructor that creates a Song object with the name, length, artist, and genre

        - method:
            toString()
                print all the Song information

    Create a separate class to create and test the Song objects

     */

    String name;
    double length;
    String artist;
    String genre;


                 // Bu kismi overloading anlatirken Saim ekledi -> kendi odevimden ayirabilmek icin ice girintili yazdim, normalde girintili olmadan yazacak yani bu kisim da. Constructor with two arguments cagirmak icin _09CallingSong class'inda iki tane value giriyorum
                 public _08SongHomework(String name, double length){
                 this.name = name;
                 this.length = length;
                 }

    public _08SongHomework(String name, double length, String artist, String genre){  // constructur name'imiz class name ile ayni olmali. O yuzden _08SongHomework seklinde bende. Saim'in yaptiginda class ismi Song idi, o yuzden burasi da Song onda.
        this.name = name;
        this.length = length;
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +      // burada class ismi cikiyordu, oteki class'ta print edince console'da _08SongHomework seklindeydi diye degistirdim
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
