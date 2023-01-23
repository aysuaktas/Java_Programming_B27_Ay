package day36_custom_classes.offer2;

import day36_custom_classes.offer2._03Offer;

import java.util.ArrayList;

public class _04Market {

    /*
    Create a separate class to create and test the Offer objects

    create multiple Offer objects and store them into an ArrayList of Offers. Create multiple other Lists to filter out different information:

        write a program that can only keep the offers from local area

        write a program that can remove the offers that are not full Time

        write a program that removes all offer that are less than 130,000 salary

        - Find the biggest and lowest salary Offers and print the whole object
*/

    public static void main(String[] args) {

        ArrayList<_03Offer> allOffers = new ArrayList<>();
        allOffers.add(new _03Offer("Amazon", "San Diego", 120_000, true, 15));   // _03Offer class'indaki -> public _03Offer(String company, String location, double salary, boolean isFullTime, int numberOfPto) icin sirasiyla yazdik bu degerleri

        allOffers.add(new _03Offer("Chase", "Chicago", 125_000, true, 15));

        allOffers.add(new _03Offer("Google", "Seattle", 170_000, false, 0));

        allOffers.add(new _03Offer("Accenture", "Chicago", 110_000, false, 15));

        allOffers.add(new _03Offer("Walmart", "Chicago", 125_000, false, 0));

        allOffers.add(new _03Offer("Meta", "Seattle", 135_000, true, 12));

        allOffers.add(new _03Offer("Deloitte", "Seattle", 135_000, true, 12));


        System.out.println("-------with lambda---------");
        //write a program that can only keep the offers from local area
        // lambda kullanalim: removeIf ile:
        ArrayList<_03Offer> localOffers = new ArrayList<>(allOffers);
        localOffers.removeIf(offer -> !offer.location.equals("Chicago"));   // location is a String type, so I can make String manipulation here.
        System.out.println(localOffers);  // bunda location'i Chicago olmayanlari cikardi

        /* Console'da
        [
        _03Offer{company='Chase', location='Chicago', salary=125000.0, isFullTime=true, numberOfPto=15},
        _03Offer{company='Accenture', location='Chicago', salary=110000.0, isFullTime=false, numberOfPto=15},
        _03Offer{company='Walmart', location='Chicago', salary=125000.0, isFullTime=false, numberOfPto=0}]
         */

        // toString() method'u yazarken return kismina baslarken \n yazmadan automatically yaziliyor normalde. Alt satira gecsin diye basina \n koyduk. Yoksa alttaki gibi yan yana, karisi gozukuyordu

        // [_03Offer{company='Amazon', location='San Diego', salary=120000.0, isFullTime=true, numberOfPto=15}, _03Offer{company='Google', location='Seattle', salary=170000.0, isFullTime=false, numberOfPto=0}, _03Offer{company='Meta', location='Seattle', salary=135000.0, isFullTime=true, numberOfPto=12}, _03Offer{company='Deloitte', location='Seattle', salary=135000.0, isFullTime=true, numberOfPto=12}]    ----> bunda location'i Chicago olanlari cikarmistim

        System.out.println("----------------");

        System.out.println("------same thing with for each loop:");
        // alternative, manually ((without lambda. With for each loop)):

        for(_03Offer each : allOffers){
            if(each.location.equals("Chicago")){
                System.out.println(each);
            }
        }

        System.out.println("-------full time---------");


   //  write a program that can remove the offers that are not full Time

        // First way: with lambda:
        ArrayList<_03Offer> onlyFullTime = new ArrayList<>(allOffers);
        onlyFullTime.removeIf(p -> !p.isFullTime);
        System.out.println(onlyFullTime);

    // second way:
      //   onlyFullTime.forEach(each -> System.out.println(each));  // another way to print all

        System.out.println("----------------");

        //  write a program that removes all offer that are less than 130,000 salary

        ArrayList<_03Offer> minSalary = new ArrayList<>(allOffers);
        minSalary.removeIf(p -> p.salary < 130_000);  // p represents every Offer objects in the list
        System.out.println(minSalary);

        System.out.println("----------------");

        // - Find the biggest and lowest salary Offers and print the whole object  --> (( bunun quick way'i var mi lambda ile vs? Not really. We have to do it ourselves))

        double min = allOffers.get(0).salary;
        double max = allOffers.get(0).salary;
        // if it is not biggest are smallest, it's fine, I can change them later. Baslangicta min ve max degeri 0.indexten baslatmak mantikli. Cunku eger mex veya min degilse loop'ta ilerlerken degisecek // --> default starting point
        _03Offer maxOffer = allOffers.get(0);
        _03Offer minOffer = allOffers.get(0);   // maxOffer ve minOffer belirleme sebebimiz -> max ve min olanin tum elemanlarini/ objects'ini console'da print etmek istememiz. Bunlari kullanmadan yapinca sadece min ve max degeri goruyorduk. Bunlari burada default starting point olarak get(0)'dan baslatip sonra altta loop'ta eklemek sayesinde max ve min olanin objects'ini ayri sekilde print edip gorebildik

        for(_03Offer each: allOffers){  // each is every object
            if(each.salary > max){
                max = each.salary;  // max salary olan 170000.0'i bu kisim sayesinde bulduk -> loop, tek tek hepsine bakti ve max'i buldu
                maxOffer = each;  // bunu yazinca all max objects'i yazdirabilecegiz. Yani max olan hangisiyse onun objects'ini yazdiracagiz altta print statement ile
            }
            if(each.salary < min){
                min = each.salary;
                minOffer = each;  // bunu yazinca all min objects'i yazdirabildik
            }
        }
        System.out.println("Min salary: " + min);  // Min salary: 110000.0
        System.out.println("All min objects: " + minOffer); // _03Offer{company='Accenture', location='Chicago', salary=110000.0, isFullTime=false, numberOfPto=15}

        System.out.println("Max salary: " + max);  // Max salary: 170000.0
        System.out.println("All max objects: " + maxOffer); // _03Offer{company='Google', location='Seattle', salary=170000.0, isFullTime=false, numberOfPto=0}
    }
}
