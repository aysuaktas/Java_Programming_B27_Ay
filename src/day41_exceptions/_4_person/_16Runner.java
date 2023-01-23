package day41_exceptions._4_person;

public class _16Runner {

    public static void main(String[] args) {

        _15Person obj = new _15Person();
        obj.setName("James");
        obj.setAge(21);
        System.out.println(obj);

        _15Person obj2 = new _15Person();
        obj2.setAge(-30);
        System.out.println(obj2);

    }
}

        /* Run edince:
    Person{name='James', age=21}
    Exception in thread "main" java.lang.IllegalArgumentException: Age should not be less than 0 or more than 120
	    at day41_exceptions._4_person._15Person.setAge(_15Person.java:23)
	    at day41_exceptions._4_person._16Runner.main(_16Runner.java:13)

    --> Age should not be less than 0 or more than 120 aciklamasini biz yazmistik _15Person class'inda. Exception kisminda onu da yazmis oldu aciklama olarak
        */
