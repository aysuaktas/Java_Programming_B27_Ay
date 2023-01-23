package day35_custom_classes.homework4;

public class _10EmployeeHomework {

    /*
     create a class called Employee
          - data:
                name, id, job title, salary

        - constructor
            - create a constructor that creates an Employee object with the name, id, job title, and salary


        - method:

            goToMeeting()
                when this method is called print:
                    $name is going to a meeting

            toString()
                print all the employees information

    Create a separate class to create and test the Employee objects
     */

    String name;
    int id;    // long id dedi buna Saim
    String jobTitle;
    double salary;

    public _10EmployeeHomework (String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

public void goToMeeting(){
    System.out.println(name + " is going to a meeting!");
}

    @Override
    public String toString() {
        return "Employee {" +    // _10EmployeeHomework yazisini Employee olarak degistirdim
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +        // buraya $ isaretini ben ekledim
                '}';
    }
}
