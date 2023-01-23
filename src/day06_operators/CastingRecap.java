package day06_operators;

public class CastingRecap {

    public static void main(String[] args) {

        int age = 40; // This number is int by default.
        long ageLong = age; //going from smaller to bigger > happens automatically.

        // If we go from bigger (long) to smaller (int);
        long num = 100;
        int numInt = (int)num;

        // long boxes = 30L; // If we put L, it become long. Ilk ornekte (int age = 40; long ageLong = age olanda) L koymadik cunku that number was int by default. But;
        long boxes = 3000000000L; //This number is too long for int, so we put L and made it long.

        // Java does not care about numbers. About compiling part, Java cares about syntax. It could be number that fits or does not, but it's about compiling.

        float f = 14.5F;
        int i = (int)f; // there will be data loss when we go from float to int. We will lose 0.5
        System.out.println(i);   // i -> 14
        double d = f;
        System.out.println(d);   // d -> 14.5
        double d2 = i;
        System.out.println(d2);  // d2 -> 14.0  // i=14'tu. Double olunca 14.0 oldu

    }
}
