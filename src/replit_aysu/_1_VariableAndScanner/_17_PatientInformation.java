package replit_aysu._1_VariableAndScanner;

import java.util.Scanner;

public class _17_PatientInformation {

        public static void main(String[] args) {
            //Enter your code here

            String firstName;
            String lastName;
            String email;
            String street;
            String state;
            String city;
            int age;
            int zipCode;
            double height;
            double weight;
            boolean isMarried;
            long workPhoneNumber;
            long personalPhoneNumber;

            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome to the patient portal!\nPlease enter your personal information\nEnter your first name");
            firstName = scan.next();
            System.out.println("Enter your last name");
            lastName = scan.next();


            // this part is already provided DO NOT CHANGE
            System.out.println("Enter your email");
            email = scan.next();
            scan.nextLine();//to capture Enter key press
            System.out.println("Enter your street");
            street = scan.nextLine();

            // continue for city

            System.out.println("Enter your city");
            city = scan.next();
            System.out.println("Enter your state");
            state = scan.next();
            System.out.println("Enter your zip code");
            zipCode = scan.nextInt();
            System.out.println("Enter your work phone number");
            workPhoneNumber = scan.nextLong();
            System.out.println("Enter your personal phone number");
            personalPhoneNumber = scan.nextLong();
            System.out.println("Enter your age");
            age = scan.nextInt();
            System.out.println("Enter your height");
            height = scan.nextDouble();
            System.out.println("Enter your weight");
            weight = scan.nextDouble();
            System.out.println("Are you married?");
            isMarried = scan.nextBoolean();

            String contact = "work phone number: " + workPhoneNumber + "," + " personal phone number: " + personalPhoneNumber + ", email: " + email;

            String fullName = firstName + " " + lastName;

            String address = street + ", " + city + ", " + state + " " + zipCode;

            System.out.println("Patient personal information");
            System.out.println("Full name: " + fullName + "\n" + "Address: " + address + "\n" + "Contact: " + contact + "\n" + "Age: " + age + "\n" + "Height: " + height + "\n" + "Weight: " + weight + " pounds" + "\n" + "Married: " + isMarried);

            /*

            Welcome to the patient portal!
            Please enter your personal information
            Enter your first name
            James
            Enter your last name
            May
            Enter your email
            jamesmay@gmail.com
            Enter your street
            7925 Jones Branch Dr
            Enter your city
            McLean
            Enter your state
            VA
            Enter your zip code
            22102
            Enter your work phone number
            7896542314
            Enter your personal phone number
            2406542314
            Enter your age
            35
            Enter your height
            5.10
            Enter your weight
            173.2
            Are you married?
            true

            yazinca ------>


            Patient personal information
            Full name: James May
            Address: 7925 Jones Branch Dr, McLean, VA 22102
            Contact: work phone number: 7896542314, personal phone number: 2406542314, email: jamesmay@gmail.com
            Age: 35
            Height: 5.1
            Weight: 173.2 pounds
            Married: true
             */

        }
    }

