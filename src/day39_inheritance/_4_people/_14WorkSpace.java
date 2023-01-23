package day39_inheritance._4_people;

public class _14WorkSpace {

    public static void main(String[] args) {

        _13Employee james = new _13Employee("James Bond", 40, 100_000_000);

     //   System.out.println(james);  // day39_inheritance._4_people._13Employee@7d417077 --> diger class'larda to String method yapmadim. O yuzden hangisini run edecek? The one is made in the object class -> hashcode ile olan. --> return getClass().getName() + "@" + Integer.toHexString(hashCode()); uzerinden print ediyor object class'taki toString() method bu oldugu icin, ve karsimiza hashCode cikiyor.

        // _13 Employee class'ina toString methodu ekledigimizden sonra -> james'i print edersek duzeliyor:

        System.out.println(james);  // _13Employee{salary=1.0E8, name='James Bond', age=40}




    }
}
