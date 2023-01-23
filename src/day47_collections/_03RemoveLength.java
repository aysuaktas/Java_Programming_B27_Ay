package day47_collections;

import java.util.*;

public class _03RemoveLength {

    public static void main(String[] args) {

        Set<String> words = new HashSet<>(Arrays.asList("one", "two", "java", "hello", "world", "automation", "fan", "soft skills", "lunch"));  // asList returns List type, but List type is a collection. O yuzden Set ile de kullanabiliyormusuz asList'i --> I cannot do it with traditional loop, because I cannot remove with for loop, but I can remove with iterator

        Iterator<String> it = words.iterator();
        while(it.hasNext()){   // hasNext method sayesinde -> next element oldugu surece devam edip sonra duracak bu while loop
            if(it.next().length() <= 4){
                it.remove();
            }
        }
        System.out.println(words);   // [soft skills, lunch, world, automation, hello]
        System.out.println(new TreeSet<>(words));  // [automation, hello, lunch, soft skills, world] --> sorted order'dalar -> if we want to see them in sorted order, we can use TreeSet

    }
}


