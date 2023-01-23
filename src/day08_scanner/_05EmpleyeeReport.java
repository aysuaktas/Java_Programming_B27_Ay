package day08_scanner;

import java.util.Scanner;

public class _05EmpleyeeReport {

        /*
        full name
        job title
        salary   -> ask each part
        company hq   -> where is the company's headquarters
        full time

        Create a program that will ask the user to enter a salary (double) and number of hours (int).
        Calculate the hourly rate.
        hourly rate = salary / (hours weekly * 52) -> (((--> 52 is the total number of the weeks in a year)))

         */

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

       System.out.println("Enter your full name");
       String fullName = input.nextLine();
       // System.out.println(fullName);  // bunu yazinca yazdigim isim console'da iki kez cikti.


       System.out.println("Enter your job title");
       String jobTitle = input.nextLine();

       System.out.println("What is your hourly rate");
       double hourlyRate = input.nextDouble();

        System.out.println("What is the average number of hours in a week");
        int hours = input.nextInt();

        double salary = hours * 52 * hourlyRate;  // 52 weeks in a year

        System.out.println("Where is the company HQ?");
        input.nextLine();  // empty nextLine() to catch the enter input. Onceki method nextLine olmadigi ve bundan sonra nextLine() kullanmamiz gerektigi icin araya bos bir nextLine koyduk.
        String hqLocation = input.nextLine();

        System.out.println("Are you full time?: true or false");
        boolean isFullTime = input.nextBoolean();

        String report = fullName + " is a " + jobTitle + " they make " + salary + " because they are full time: " + isFullTime + ". The HQ is located in: " + hqLocation;
        System.out.println(report);

        /* Console'da sunu yazdik;

        Enter your full name
        James Bond
        Enter your job title
        Spy
        What is your hourly rate
        50
        What is the average number of hours in a week
        40
        Where is the company HQ?
        London
        Are you full time?: true or false
        True
        James Bond is a Spy they make 104000.0 because they are full time: true. The HQ is located in: London
         */

    }
}
