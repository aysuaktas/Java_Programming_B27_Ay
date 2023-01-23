package java_interview_coding_David;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Q26_ArrayList_RemoveDavid {

    /*
    •Q26: ArrayList--Remove “David"
        Given a list of people' names: “David", "John", "Eric", “David"..... Write a java operation to remove all the names named David
     */


    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("David", "John", "david", "Eric", "David", "Furkan", "Aysu"));
        System.out.println(removeDavid(names));   // [John, david, Eric, Furkan, Aysu]

        System.out.println(removeDavid2(names));  // [John, Eric, Furkan, Aysu]

    }

    // 1st way -> with removeAll()
    public static List<String> removeDavid(List<String> names) {
        names.removeAll(Arrays.asList("David"));
        return names;
    }


    // 2nd way -> with lambda -> with removeIf()
    public static List<String> removeDavid2(List<String> names) {
        names.removeIf(name -> name.equalsIgnoreCase("David"));
        return names;
    }
}






// Third way --> Iterator :)


// Lambda ve Iterator -> bunlar advanced topics. Bunlari mulakatta kullanirsan konuyu bildigini anlarlar.