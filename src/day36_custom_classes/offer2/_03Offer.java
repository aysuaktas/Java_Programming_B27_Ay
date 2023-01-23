package day36_custom_classes.offer2;

import java.sql.Time;

public class _03Offer {

/*
     create a class called Offer
        - data:
            company, location, salary, is full time, number of PTO
*/
    String company;
    String location;
    double salary;
    boolean isFullTime;
    int numberOfPto;


/*
        - constructor:
            - create a constructor that creates an Offer object with the company and location
            - create a constructor that creates an Offer object with the company, location, and salary
            - create a constructor that creates an Offer object with the company, location, salary, is full time, and number of PTO
*/

    public _03Offer(String company, String location){
        this.company = company;
        this.location = location;
    }

    public _03Offer(String company, String location, double salary){
    //    this.company = company;
    //    this.location = location;
        this(company, location);  // bunu ustte tanimladik ayri ayri, burada birlikte yazabiliriz o yuzden
        this.salary = salary;
    }

    public _03Offer(String company, String location, double salary, boolean isFullTime, int numberOfPto){
        //    this.company = company;
        //    this.location = location;
        //    this.salary = salary;
        this(company, location, salary);
        this.isFullTime = isFullTime;
        this.numberOfPto = numberOfPto;
    }



/*
        - method:
            toString()
                print all the employees information
*/

    @Override
    public String toString() {
        return "\n_03Offer{" +  // n'yi sonradan ekledik yan yana yazmasin hepsini diye
                "company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOfPto=" + numberOfPto +
                '}';
    }
/*
    Create a separate class to create and test the Offer objects
    create multiple Offer objects and store them into an ArrayList of Offers. Create multiple other Lists to filter out different information:
        write a program that can only keep the offers from local area
        write a program that can remove all offers that are not for SDET or QA
        write a program that can remove the offers that are not full Time
        write a program that removes all offer that are less than 100,000 salary
        - Find the biggest and lowest salary Offers and print the whole object
*/

    // Bunu, bu class'i run ettigimiz _04Market class'inda yapacagiz

}
