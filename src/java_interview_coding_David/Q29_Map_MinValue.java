package java_interview_coding_David;

import java.util.Map;

public class Q29_Map_MinValue {

    /*
    Map -- Min value
        Write a method that can return the minimum value from ta map (DO NOT use sort method)
     */

    // Merve's answer:
    public static double minimumMapValue(Map<String, Double> map){
        double min = Double.MAX_VALUE;
        for (Double eachValue : map.values()) {
            if(eachValue < min){
                min = eachValue;
            }
        }
        return min;
    }


}
