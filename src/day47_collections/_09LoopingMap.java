package day47_collections;

import java.util.HashMap;
import java.util.Map;

public class _09LoopingMap {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("January", 1);
        map.put("December", 12);
        map.put("April", 4);

        //       for(   : map)    --> "only map" does NOT work.  --> eski usul kullandigimiz burada calismayacak. keySet(), .values(), .entrySet() ile birlikte kullanabiliriz ama mesela:

                            // map bizim Map'imizin isminden geliyor
        for (String eachKey : map.keySet()) {   // keySet() method returns me the Set types of keys --> keySet bizim key'lerimizin uzerinde tek tek gezecek  // Saim's note: iterates through a Set of keys
            System.out.println("key - " + eachKey);
            System.out.println("value - " + map.get(eachKey));  // get method icine key yaziyoruz, bize value'yu veriyor. Ama alttaki .values() methodunda mesela bu yok, cunku o zaten values uzerinde geziyor, bize key'i vermesi icin get methodu kullanamayiz cunku get methodunun mantigi zaten icine key verip onun value'sunu bulmak
        }

                /*
                key - December
                value - 12
                key - January
                value - 1
                 key - April
                 value - 4
                */

        // for-each loop'da isme genelde key diyecek cunku it is what it is :D Ama simdi eachKey dedi


        System.out.println("==================");

        for(Integer eachValue : map.values()){   // iterates through all the value  --> --> .values() methodu bizim value'larimizin uzerinde tek tek gezecek. map.values() dedik cunku Map'imizin adini map vermistik
            System.out.println(eachValue);
        }

                  /*
                      12
                      1
                      4
                  */

        System.out.println("==================");

        for(Map.Entry<String, Integer> eachEntry : map.entrySet()){    // iterates through all the entries --> entry = key + value  --> Map.Entry is for looping by key + value pair together  --> entrySet() methodu hem key'lerin hem value'larin uzerinde tek tek gezecek.
             //  System.out.println(eachEntry);  --> bu da kullanilabilirdi ama genelde bir seyin key'ini veya value'sunu gormek isteyecegiz, amac heerrr seyi print etmek degil. O yuzden bunu comment'e aldik
            System.out.println(eachEntry.getKey());   // sadece bunu print edersek sadece aylari alt alta print ediyor
            System.out.println(eachEntry.getValue());
        }

                /*
                     December
                     12
                     January
                     1
                     April
                     4
                 */

        System.out.println("map.size() = " + map.size());  // map.size() = 3  --> burada size() methodu gosterdi.

    }
}

    /*
    -> keySet()
		- it returns a Set of keys  (( it basically takes all the keys and return some kind of Set type. We are not iterating directly through the map: ))
			- then we can iterate through the keys and use those to read the value

			Map<String, Double> map = new HashMap<>();
			for(String key : map.keySet()){			// directly map kullanamayiz ama map.keySet() yaparsak sorun yok ))

			}
       */