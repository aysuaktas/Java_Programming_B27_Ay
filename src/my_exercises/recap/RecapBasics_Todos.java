package my_exercises.recap;

public class RecapBasics_Todos {

    public static void main(String[] args){

        System.out.println("=== Float data type ===");

        float f = 19.99F; // adding the letter F (or f - uppercase or lowercase) will tell the compiler this is a float number, not a double number. The f is not printed, because that is part of the code, not the number

        float f2 = 100; // 100 is int type by default, and int is smaller than float, so there is no problem here ***
        System.out.println(f);
        System.out.println(f2);

        System.out.println("=== Long data type ===");

        long population = 8_000_000_000L; // adding l/L to the number will change the type from int (the default) to a long type, because 8 billion was too big to be held in an int type. ((number is too big for int, but it's still int. But int can be max around 2 billion. This is too much. So, we add L at the end of the number))
        System.out.println(population);

        long pop2 = 1_000_000; // we do not need to put L at the end. Because 1 million is a valid number for int types, and that type can automatically be converted to a bigger type    ***
        System.out.println(pop2);


        /**
         * Primitive Type Casting
         *
         * 	convert from one primitive datatype to another
         *
         * 		[Smallest] byte -> short -> int -> long -> float -> double [Largest]
         *
         * 		Widening Convention
         * 			go from a smaller datatype to bigger datatype
         * 			this happens automatically
         *
         * 				Ex: int i = 10;
         * 					long l = i;
         *
         * 		Narrowing Convention
         * 			go from a bigger type to a smaller type
         * 			need to manually cast
         *
         * 			syntax:
         * 				smallerType varName = (smallerType) otherBiggerVariable
         *
         * 				Ex:
         * 					long a = 50L;
         * 					short s = (short)a;
         */



    }
}
