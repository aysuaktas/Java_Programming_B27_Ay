package day42_abstraction._2_exercise;

public class _07Gym {

    public static void main(String[] args) {

//        _05Exercise obj = new _05Exercise();  // not valid because Exercise is abstract - cannot create objects from it --> bunlari buraya comment olarak yazdik cunku _05Exercise class'i abstract class oldugu icin ondan object create edemiyoruz.

        _06Running run = new _06Running();
        run.perform();   // We are running
        run.getCaloriesBurned(30);   // 10.5

//      _08Lifting obj = new _08Lifting();   // _08Lifting class'i is abstract, so we cannot create an object of this class

        _09Bench benching = new _09Bench();
        benching.perform();   // Bench press
        benching.getCaloriesBurned(20);   // 200
        benching.rackWeights();   // Putting the bar back on the rack



    }
}
