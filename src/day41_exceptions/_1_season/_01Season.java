package day41_exceptions._1_season;

public class _01Season {

    // dunku bir homework'u Saim de yapti burada. Ama her mevsimi yapmadi, ornek olarak bir iki tanesini yapalim dedi sonraki class'larda:

    // bu parent class:

    String name;
    double highestTemp;
    double lowestTemp;

    public _01Season(String name, double highestTemp, double lowestTemp){
        this.name = name;
        this.highestTemp = highestTemp;
        this.lowestTemp = lowestTemp;
    }

    public void activity(){   // biz kizlarla odevde String yapmistik void yerine. Void oldugu icin sonraki child class'larda + ile concatenation yapamayacagiz, concatenation yapabilmek icin bizim gibi String yapilmasi gerekiyor.
        System.out.println("GENERIC SEASON");
    }

    @Override
    public String toString() {
        return name + " season with the highest temperature of " + highestTemp + " and the lowest temperature of " + lowestTemp;   // bunu kendimiz yazdik, Generate uzerinden otomatik degil
    }
}
