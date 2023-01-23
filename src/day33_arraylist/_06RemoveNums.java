package day33_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class _06RemoveNums {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 5, 2, 3, 5, 2, 1, 5, 1, 8, 9, 7, 4, 10, 0, 2, 3)); // 0 ile 10 arasinda random numbers yazdik

        // remove all the numbers that are less than 5:
        System.out.println("----- removing all numbers that are less than 5 -----");

        /*
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) < 5){   // if the number < 5 ise
                nums.remove(i);  // onlari remove yap
            }
        }

        System.out.println(nums);  // [5, 3, 5, 1, 5, 8, 9, 7, 10, 2]  --> burada 5'ten kucuk degerler var. Direkt remove kullanmanin sikintisi bu. Mesela 1,5,2,3... diye basliyor. Biz 2'ye baktiktan sonra i++ olunca 3'u atlayip 5'e bakiyor. Cunku 2 < 5 oldugu icin onu cikariyor ve sonraki index bir onceye kayiyor. Ama o index number'i check ettigi icin yine check etmiyor. Bu nedenle aradaki 3'u check etmiyor bile.
         */

        // Direkt remove kullanmamizin sorunu buydu. Bu sorunu duzeltirsek:

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) < 5){   // if the number < 5 ise
                nums.remove(i);  // onlari remove yap
                i--;  // TODO: TEK FARK BUNU EKLEMEMIZ OLDU. //-->  if I removed an element, the elements will move over which means their index will change, I subtract 1 to make sure I don't skip any elements
            }
        }

        System.out.println(nums); // [5, 5, 5, 8, 9, 7, 10]

        System.out.println("-------------------------------");

        /*
        LAMBDA -> (( is basically a different syntax to give us some functionality. Different kind of functionality. To give the argument removeIf method, we need lambda expression. ))

            removeIf( Predicate ) :
                to define the argument, we will use a lambda expression. RemoveIf method'u icin lambda kullanilir.

        Syntax for lambda:
                variable -> boolean expression (use that defined variable)

         removeIf is an arrayList method
         */

        // remove all the numbers that are less than 5 - using removeIf:
        System.out.println("doing same task with removeIf: ");

        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1, 5, 2, 3, 5, 2, 1, 5, 1, 8, 9, 7, 4, 10, 0, 2, 3));  // same numbers usttekiyle

        nums2.removeIf( n -> n < 5);  // -> is arrow.  // n will be every element. ( n represents every element) --> Syntax for lambda: variable -> boolean expression
        System.out.println(nums2); // [5, 5, 5, 8, 9, 7, 10]

    }
}
