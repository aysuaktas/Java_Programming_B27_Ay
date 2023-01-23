package day48_maps;

import java.util.*;

public class _02Countries {

    public static void main(String[] args) {

        // task is about some countries and their multiple cities:  ((Bunun icin -> Array istiyorsam array, arrayList istiyorsam arrayList kullanabilirim. Array is fixed size, arrayList is more dynamic. Only storing information istiyorsak Array is fine. But biraz daha dynamic olsun, bir seyler yapabilelim diyorsan arrayList is better ))

        // for some countries and their multiple cities:
            // key   : is the countries -> String type
            // value : is the cities    -> List<String>  --> value is ArrayList
        Map<String, List<String>> countries = new HashMap<>();

        countries.put("United States", new ArrayList<>(Arrays.asList("Chicago", "Dallas", "Irvine", "San Diego", "New York", "Philadelphia", "Madison")));   // bunun new ArrayList<> kismini neden ekledik'in aciklamasini alta yazdim -> Saim's explanation: Arrays.asList() -> is immutable List

  //      System.out.println(countries); // {United States=[Chicago, Dallas, Irvine, San Diego, New York, Philadelphia, Madison]}   --> United States key'i tum bu values'a sahip -> bu, alttaki MAP print statement'i ile ayni, Saim bunun yerine oyle yazdi

        System.out.println("MAP " + countries);  // MAP {United States=[Chicago, Dallas, Irvine, San Diego, New York, Philadelphia, Madison]}

        // Let's add something:
        countries.get("United States"). add("Seattle");  // add method of ArrayList here.

        System.out.println("ARRAYLIST " + countries.get("United States"));  // ARRAYLIST [Chicago, Dallas, Irvine, San Diego, New York, Philadelphia, Madison, Seattle]
        System.out.println("FIRST CITY: " + countries.get("United States").get(0)); // FIRST CITY: Chicago --> first get is from map, then second get is from arrayList (I need indexes for that)

        System.out.println(countries);  // {United States=[Chicago, Dallas, Irvine, San Diego, New York, Philadelphia, Madison, Seattle]} --> bundan once UnsupportedOperationException verdi ustte sadece Arrays.asList ile olusturdugumuz ve bu immutable List oldugu icin. Proper way is calling with constructor. Onceden countries.put("United States", Arrays.asList("Chicago", "Dallas", "Irvine", "San Diego", "New York", "Philadelphia", "Madison")); yapmistik yani, exception vermemesi icin onceki yazdigimiz halinde Arrays.asList oncesine new ArrayList<> ekledik. Ve duzeldi, artik degisiklik yapabiliriz, sadece asList ile yapmanin boyle bir sorunu oluyor. Duzeltince bize Seattle eklenmis halini verdi. We made a new arrayList object yapmis olduk new ArrayList<> seklinde ekleyince

        System.out.println("===============");

        countries.put("Europe", new ArrayList<>(Arrays.asList("London", "Paris", "Rome", "Istanbul", "Berlin", "Madrid")));
        countries.put("Uzbekistan", new ArrayList<>(Arrays.asList("Tashkent", "Samarkand", "Bukhara", "Fergana", "Urgench", "Khiva", "Bakht")));
        countries.put("Kazakhstan", new ArrayList<>(Arrays.asList("Petropavlovsk", "Astana", "Almatry", "Aktobe", "Kokshetau")));

        System.out.println(countries);   // {United States=[Chicago, Dallas, Irvine, San Diego, New York, Philadelphia, Madison, Seattle], Europe=[London, Paris, Rome, Istanbul, Berlin, Madrid], Uzbekistan=[Tashkent, Samarkand, Bukhara, Fergana, Urgench, Khiva, Bakht], Kazakhstan=[Petropavlovsk, Astana, Almatry, Aktobe, Kokshetau]}


        System.out.println("===============");
/*
        Scanner input = new Scanner(System.in);
        System.out.println("What country are you going to tour " + countries.keySet());  // our countries key oldugu icin keySet kullanip yapabiliriz
        String country = input.nextLine();   // United States is with the space oldugu icin next degil nextLine kullanmak lazim
            // now, there is a list of countries that user can choose var console'da. Onlar bu countries'ten birini secince cities'i nasil gosteririz?
        for(String eachCity: countries.get(country)){   // iterate through each city of a specific country --> each city is String. String kullandik bu nedenle
            System.out.println("Touring...." + eachCity);

        }

 */

                /*
                What country are you going to tour [United States, Europe, Uzbekistan, Kazakhstan]
                Uzbekistan   --> user bunu yazarsa :
                Touring....Tashkent
                Touring....Samarkand
                Touring....Bukhara
                Touring....Fergana
                Touring....Urgench
                Touring....Khiva
                Touring....Bakht
                 */

        System.out.println("===============");

        for(Map.Entry<String, List<String>> eachEntry : countries.entrySet()){   // simdi de her entry (key+value together) icin for loop yaparsak
            for(String eachCity : eachEntry.getValue()){  // the value of each Entry was the cities
                if(eachCity.startsWith("A") || eachCity.endsWith("a")){
                    System.out.println(eachCity);
                }
            }
        }
                /* for-each loop sonucunda value'lara tek tek bakiyoruz ve "A" ile baslayanlari OR "a" ile bitenleri print ediyoruz ve console'da:
                Philadelphia
                Bukhara
                Fergana
                Khiva
                Astana
                Almatry
                Aktobe
                 */

      /*  sondaki for each loop icin alternative. Boyle alttaki gibi de olurdu sadece ustte pratik amacli oyle gosterdi:
        for(List<String> eachCountry : countries.values()){
            for(String eachCity : eachCountry)
        }
       */


    }
}
