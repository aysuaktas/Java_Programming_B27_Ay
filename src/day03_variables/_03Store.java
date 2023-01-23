package day03_variables;

public class _03Store {
    public static void main(String[] args) {

        int numberOfItems = 1000;
        System.out.println(numberOfItems);

        System.out.println(numberOfItems + " in the store"); // it combines (concatenates) the value of the numberOfItems variable with the characters 'in the store'

        numberOfItems = 700; // this is called reassignment. We reassigned it. We reassigned 700 into the variable
        System.out.println(numberOfItems + " after the sale");

        int totalAfterShipment = numberOfItems + 5000;
        System.out.println("totalAfterShipment = " + totalAfterShipment);  // soutv

        double totalCost = 1_000_000.99; // 10,000,000.99 -> how we might want to write it, but commas are not valid java syntax, so we can use underscore in numbers, to improve readability
        System.out.println(totalCost);

        float f = 19.99F; // adding the letter F (or f - uppercase or lowercase) will tell the compiler this is a float number, not a double number. The f is not printed, because that is part of the code, not the number

        float f2 = 100; // 100 is int type by default, and int is smaller than float, so there is no problem here // todo
        System.out.println(f);
        System.out.println(f2);

        // int f2 = 100; valid if I wanted
        // float f2 = 100F;
        // float f2 = 100.99F;

        long population = 8_000_000_000L; // adding l/L to the number will change the type from int (the default) to a long type, because 8 billion was too big to be held in an int type. ((number is too big for int, but it's still int. But int can be max around 2 billion. This is too much. So, we add L at the end of the number))
        System.out.println(population);

        long pop2 = 1_000_000; // we do not need to put L at the end. Because 1 million is a valid number for int types, and that type can automatically be converted to a bigger type   // todo
        System.out.println(pop2);












    }

}
