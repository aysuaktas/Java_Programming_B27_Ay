package day32_arraylist;

import java.util.ArrayList;

public class _01SetMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(4);
        list.add(9);
        list.add(0);
        list.add(12);
        System.out.println(list); // [4, 9, 0, 12]

        // set(int, element):  replaces the element at the given index ((birinci yazilan)) with the given new element ((virgulden sonra yani ikinci yazilan)) --> ((This method is basically for replacing))

        // 1) Once hardcoded yapalim:
        // index 2'yi degistirip 10 yapmak istersek:
        list.set(2, 10);  // changes the element at index 2, to be the value of 10
        System.out.println(list);  // [4, 9, 10, 12]

        // first index'i degistirip 2 yapmak istersek:
        list.set(0, 2); // changing the first index to the value of 2
        System.out.println(list);  // [2, 9, 10, 12]

        System.out.println("----------------");

        // 2) What if we want to change something dynamically?

        ArrayList<String> strs = new ArrayList<>();
        strs.add("friday");
        strs.add("off");
        strs.add("study");
        strs.add("relax");
        
        System.out.println(strs);  // [friday, off, study, relax]

        // relax'i baska bir sey yapmak istiyorsam -> once index'ini bulabilirim.
        // indexOf(element):  returns the index of the given element. The index returned will be the first occurrence of the element —> returns int

        int indexOfRelax = strs.indexOf("relax");  // index of relax'i bulduk once
        strs.set(indexOfRelax, "coding"); // index'i bulduktan sonra onu baska bir sey ile ("coding" in this example) degistirebildik
        System.out.println(strs); // [friday, off, study, coding]


    }
}
