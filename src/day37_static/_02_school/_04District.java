package day37_static._02_school;

public class _04District {

    public static void main(String[] args) {

        _03School.district = 149;
        _03School.totalTeachers = 100;
        _03School.totalStudents = 3000;

        _03School.totalTeachers--;   // burada ogretmen sayisini bir azalttik, bir sonraki line'da azalacak yani -> I'm just subtracting one (1)

        System.out.println(_03School.district);  // 149
        System.out.println(_03School.totalTeachers);  // 99
        System.out.println(_03School.totalStudents);  // 3000

        // we just made static variables here --> Merve'nin aciklamasi

        _03School.announcement();  // announcement to whole district
       // _03School.lunch();  // lunch() method is instance --> Merve'nin aciklamasi: in order to use it,I need object because it is an instance method


        _03School middle = new _03School(); // create an object to use lunch instance method
        middle.lunchTime = 12;
        // _03School.lunchTime;  // --> again it will NOT work by using className
        middle.lunch();  // Lunch is at 12

        middle.totalStudents = 5000; // I reassigned --> that info is accessible but not recommended --> ((cunku totalStudents bir static variable))
        System.out.println(_03School.totalStudents);  // 5000




    }
}
