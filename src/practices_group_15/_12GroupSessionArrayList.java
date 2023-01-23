package practices_group_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _12GroupSessionArrayList {

    // TODO: bunu Notes uygulamasina 10 Agustos 2022 David ile grup toplantisi notlari uzerinden tamamla, telefonda da fotolar vardi. Eklemeler yaparsin.


    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>(Arrays.asList("1", "2", "3")) {
            {
                add("Banana");
                add("Grapes");
                System.out.println("could you add -->" + add("Apple"));
                System.out.println("could you add -->" + add("Melon"));
                if (add("Kiwi")) {

                }
                remove("Kiwi");
                System.out.println(add("Mango"));
            }
        };

        myList.add("david");
        myList.add("David");
        myList.add("David");

        System.out.println("myList = " + myList);

        myList.add(3, "Strawberry");
        myList.set(5, "Ali");
        //myList.replaceAll(e->e.toUpperCase());
        System.out.println("myList = " + myList);


        System.out.println("could you remove -->" + myList.remove("Daviiiiid"));
        System.out.println("myList = " + myList);

        int num = 2;
        //String s="Strawberry";
        System.out.println("what did you remove -->" + myList.remove(6));
        myList.set(4, "lemons");
        System.out.println("myList = " + myList);


        ArrayList<String> myList2 = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "Kiwi"));
        System.out.println("myList2 = " + myList2);

        myList.removeAll(myList2);
        System.out.println("myList = " + myList);


        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(10);
        numsList.add(10);
        numsList.add(7);
        numsList.add(8999);
        numsList.add(9);
        numsList.add(3);
        numsList.add(81);
        numsList.add(8);
        numsList.add(8);
        numsList.add(44);

        numsList.remove(Integer.valueOf(44));
        System.out.println("numsList = " + numsList);
        //numsList.removeAll(Arrays.asList(8,8999));
        //numsList.clear();
        ArrayList<Integer> nums = new ArrayList<>();
        nums = (ArrayList<Integer>) numsList.clone();
        Collections.sort(nums);
       // printList(numsList);
       // printList(nums);
        System.out.println("nums contains (44) = " + nums.contains(44));
        System.out.println("nums contains (8,44) = " + nums.containsAll(Arrays.asList(8, 44)));

    }
}



