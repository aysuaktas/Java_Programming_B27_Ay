package day11_nested;

public class _10FieldTrip {

    public static void main(String[] args) {

        int grade = 6;
        String location = "";
        String teacher = "";
        int numberOfGroups = 0;

        if(grade > 0 && grade <= 6){             // between 1-6  -> valid grades

            if(grade == 1){
                location = "Apple Orchard";
                teacher = "Ms Smith";
                numberOfGroups = 5;
            } else if (grade == 2){
                location = "Zoo";
                teacher = "Ms Bond";
                numberOfGroups = 6;
            } else if (grade == 3){
                location = "Aquarium";
                teacher = "Mr Reyes";
                numberOfGroups = 2;
            } else if (grade == 4){
                location = "Museum";
                teacher = "Mr Wilson";
                numberOfGroups = 6;
            } else if (grade == 5){
                location = "Movie Theater";
                teacher = "Ms Lee";
                numberOfGroups = 3;
            } else if (grade == 6) {
                location = "Six Flags";
                teacher = "Mr Bond";
                numberOfGroups = 10;
            }
                // tum bu yazdiklarimdan hicbiri run olmayacak eger grade > 0 && grade <= 6 yani 1-6 arasinda degilse.

            System.out.println("Grade: " + grade);
            System.out.println("Location: " + location);
            System.out.println("Teacher: " + teacher);
            System.out.println("Number of Groups: " + numberOfGroups);


        } else {
            // invalid grades  --> not between 1-6
            System.out.println("Invalid grade");
        }



    }
}
