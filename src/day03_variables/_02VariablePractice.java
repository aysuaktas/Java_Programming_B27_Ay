package day03_variables;

public class _02VariablePractice {

    public static void main(String[] args) {

        byte age; // declared a byte variable that is called age
        age = 10; // assigning 10 to the age variable
        System.out.println(age); // printing the age variable which means I will print the value of the variable
        System.out.println("age"); // this prints the characters age (a,g,e), not the variable that has a number value

        System.out.println("20"); // printing the character 2 and 0
        System.out.println(20); // printing the int 20    // by default 20 is int type

        System.out.println(age); // 20 is directly in the code, I cannot change it. But I can use 'age' as much as I want. It's variable
        System.out.println(age + 1); // age value is 10, then it adds 10 + 1 and prints 11

        // byte num = 200; 200 is too big for byte types
        short num = 200; //declared and assigned at the same time
        System.out.println(num);

    }
}
