package day48_maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _04DataBaseExample {

    /*
    DataBase ->  where the data is stored. A kind of container that stores a bunch <<banc>> of information gibi dusun database'i.

    Person
        FIRST_NAME
        LAST_NAME
        AGE
        ADDRESS

        This is the database for people information. Data needs to be stored somewhere. Mesela Amazon's customer information falan.
        How do we read that data? -> That's why we will learn database.

        Ornek olarak gorelim diye Saim Excel'de (veya Google Sheet'te) bunu olusturdu:
        JAMES - BOND - 40 - 131 PARK DRIVE, LONDON
        ANNA - JONES - 35 - 2312 TUCKER AVE

        // values don't have to be capital but keys will be capital yani all uppercase

        // insanlar same name, adress vs olsa da onemli degil, bunlar value. Onemli olan key'lerin unique olmasi, ki oyle.

     */

    public static void main(String[] args) {

        Map<String, String> person1 = new HashMap<>();
        person1.put("FIRST_NAME", "James");  //normalde boyle olmasa da bu sefer put ile kendimiz ekleyelim -> FIRST_NAME key'i icin James value'su
        person1.put("LAST_NAME", "Bond");
        person1.put("AGE", "40");  // value da String olacagi icin yasi da double quote ( " ) arasinda yazmamiz gerek
        person1.put("ADRESS", "131 PARK DRIVE, LONDON");

        System.out.println(person1.get("FIRST_NAME"));  // James


        // bu sadece bir kisi icindi. 200 kisinin bilgileri varsa how can I pull all the informations of 200 people? --> to store, ArrayList. ArrayList allows us to store many elements. We can put object types in ArrayList. HashMap is also an object type, not primitive. How can I represent all people? I will need multiple HashMap. -->  // So, how we will store them? As an ArrayList of the HashMap.

        List<Map<String, String>> allPeople = new ArrayList<>();  // String as a key and String as a value olsun dedik yine.
        allPeople.add(person1);
        allPeople.add(Map.of("FIRST_NAME", "Anna", "LAST_NAME", "Jones", "AGE", "30", "ADDRESS", "2312 TUCKER AVE"));

        System.out.println(allPeople);  // [{ADRESS=131 PARK DRIVE, LONDON, LAST_NAME=Bond, FIRST_NAME=James, AGE=40}, {FIRST_NAME=Anna, LAST_NAME=Jones, ADDRESS=2312 TUCKER AVE, AGE=30}]  --> this is the whole ArrayList of Map elements

        System.out.println(allPeople.get(0)); // {ADRESS=131 PARK DRIVE, LONDON, LAST_NAME=Bond, FIRST_NAME=James, AGE=40}  --> it means, I'am getting the first row. So, it gets the first element from the ArrayList. The elements are Maps.

        System.out.println(allPeople.get(0).get("FIRST_NAME"));  // James -->// Saim's explanation:  reads the first ArrayList element, which is a Map, then it gets the value based on the key FIRST_NAME


        /* some possible Test Cases are:
            - TC:  Verify all the users in the DB are unique
            - TC:  Verify if the information entered on the UI is the same that went into the DB
            - TC:  AGE should not be empty
         */

        // for the TC of "AGE should not be empty", we can do this:
        for(Map<String, String> eachPerson : allPeople){
            if(eachPerson.get("AGE") == null){
                System.out.println("FAIL");
            }
        }


    }
}
