package day37_static._02_school;

public class _03School {


   public int lunchTime;  // instance variable
    public static int district;  // put public or not, it doesn't matter in the same package
    public static int totalTeachers;
    public static int totalStudents;  // those are all static and there will be one copy of them


    public static void announcement(){
        System.out.println("announcement to whole district");
    }

    public void lunch(){
        System.out.println("Lunch is at " + lunchTime);
    }

}

    // Merve'nin notu -->  the difference between static and instance method is --> instance variable or instance method must need an object. Static variable or static method can be called directly from it class itself
