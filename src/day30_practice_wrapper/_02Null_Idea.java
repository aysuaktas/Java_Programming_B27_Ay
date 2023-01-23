package day30_practice_wrapper;

public class _02Null_Idea {

    public static void main(String[] args) {

        String[] a = {"hello", "World", "friday"};
        System.out.println(a[0]);  // hello  --> a[0] -> array'in 0.elementi
        System.out.println(a[0].charAt(0));  // h


        String[] b = new String[2];  // [null, null]

        System.out.println(b[0]); // null
        System.out.println(b[0].charAt(0));  // NullPointerException ---> null.charAt(0) --> INVALID
        // You are trying to use an object that is not there. Onu kullanmaya calisiyorsun ama there is no String object there. Orasi null. The object has not created yet, anlamina gelir ---> NullPointerException.




    }
}
