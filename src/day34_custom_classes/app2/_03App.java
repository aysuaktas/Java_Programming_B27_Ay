package day34_custom_classes.app2;

public class _03App {

    String name;
    double version;
    boolean isFree;
    int ratings;

    public void update(){    //void yerine boolean'la yapip isUpdating gibi return type'la da yapabilirdik ama void ile easier diye Saim bunu yapti
        System.out.println(name + " is updating");  // name -> name of the application olacak orada
        version += 0.1;
    }

    // I will make another class to call this. Bir sonraki _04AppStore class'i bununla ilgili.


    // Direkt instagram print ettigimizde hashcode aliyorduk. Onu almamak icin alttaki toString methodunu olusturduk:
    public String toString() {    // this is instant. Bunda static yazmadim public static... degil yani, public String.
        return "Name: " + name + "\nVersion: " + version + "\nisFree: " + isFree + "\nRatings "  + ratings;   // It is just concatenation. I concatenate these variables into this format

        // Artik _04AppStore class'inda instagram yazinca hashcode almiyorum. Direkt burada yazdigim formata gore bilgileri print ediyor birlikte. Boylece tek tek print statement'leri yazmama da gerek kalmadi.
    }


}
