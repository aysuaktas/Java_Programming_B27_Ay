package day48_maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _01Season {

    public static void main(String[] args) {

        // avg temp each season -> ((average temperature for each season)):

            // key   => season name = String
            // value => temperature = double type

        Map<String, Double> temperature = new HashMap<>();
        temperature.put("summer", 85.0);  // average temperature for summer is 85.0 Fahrenheit dedik
        temperature.put("fall", 65.2);
        temperature.put("winter", 30.5);
        temperature.put("spring", 68.2);
        System.out.println(temperature); // {spring=68.2, fall=65.2, winter=30.5, summer=85.0}


        // Update the value istiyorsan put methodunu kullanabilirsin. Ayni key ile baska bir value yazinca o key updated olmus oluyor, kind of reassigning gibi yani bir nevi. Eger key'i update etmek istiyorsan ise once o key'i cikarman, sonra yeniden eklemen gerekir. Key is a way of accessing of everything. Her sey ona bagli. Remove the whole entry by the key and add a new one if you want yapabilirsin ancak. Key'i degil de value'yu update etmeyi gormek icin summer key'ini put methodu ile tekrar yazdik ve o key'in new value'su artik bu oldu:
        temperature.put("summer", 87.1);
        System.out.println(temperature); // {spring=68.2, fall=65.2, winter=30.5, summer=87.1}


        // We can manually get them. For ex: for winter and for spring:
        System.out.println("Average temperature for winter: " + temperature.get("winter"));  // Average temperature for winter: 30.5
        System.out.println("Average temperature for spring: " + temperature.get("spring"));  // Average temperature for spring: 68.2


        System.out.println(temperature.containsKey("mid summer"));  // mesela Florida'da technically winter yok. Her yerde ayni degil
        System.out.println(temperature.containsValue(100.0));


        // are there any duplicate values?
        System.out.println(temperature.values());  // [68.2, 65.2, 30.5, 87.1]  --> to visualize this, we wrote this method. These are our values.
        int before = temperature.values().size();  // values method sadece values'u alir ve gruping yapar, a collection type. Values method is collection type. Collection type works constructor types that we wanted in other classes. So, let's use HashSet, and we will put them in a constructor argument:
        int after = new HashSet<>(temperature.values()).size(); // eliminating the duplicate values with HashSet --> // taking the original size which is 4 and in HashSet, all the duplicates are automatically removed. So we will see that if before size = after size, there is no duplicates. Size changed olursa something is removed anlaminda ve duplicate value oldugunu bize gosterecek:
        System.out.println(before == after ? "No duplicate" : "Duplicate values");  // ternary ile yaptik

            /*
            [68.2, 65.2, 30.5, 87.1]
            No duplicate

                -> Bu bize size'in esit oldugunu, nothing is removed'u yani duplicates olmadigini gosteriyor. Degerlerden bazilari same olsaydi duplicate olmus olacakti, onlar cikarilacakti ve size degisecekti, altina da ternary'de belirttigimiz uzere Duplicate values yazacakti.
             */


        // find the average temperature for all seasons:

        System.out.println(avgTemp(temperature));  // 62.75 // I will give temperature as my map --> burada avgTemp dedigimiz aslinda asagida, main method disinda altta olusturdugumuz method'un ismi. O method'u cagirdik. Direkt buraya da yazabilirdik, ama Lauren sorunca method olarak yaptik, zaten bu sekilde daha reusable oluyor


    }  // main method's end


    // Can we do it as a method that returns double? Let's do as a practice. Ama main method practice'i disina yazdigindan emin ol:
    public static double avgTemp(Map<String, Double> map){
        double average = 0;

        for(double eachTemp : map.values()){   //  we can iterate through values -> map.values yani map burada isim, degisebilir
            average += eachTemp;
        }
        return average / map.size();
    }
        // As we learned yesterday ((_09LoopingMap class of day47_collections package'i bununla ilgiliydi:))
        // 1. we can iterate through keys and
        // 2. we can iterate through values and
        // 3. we can iterate through the entries.
        // But, we can NOT iterate through the Map.

}
