package day51_stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _04FilterApplications {

    // bu sayfanin altinda Application isimli yeni bir class olusturduk, baska sayfada ugrasmamak icin

    public static void main(String[] args) {

        Application[] apps = {
                new Application("Jose Penso", 150_000, true),
                new Application("Ostap Koziak", 155_000, true),
                new Application("Ovsanna Abramyan", 250_000, false),
                new Application("Busra Yagiz", 160_000, false),
                new Application("Orkhan Samadzade", 500_000, false),
        };

        System.out.println(Arrays.stream(apps).filter(person -> person.willingToRelocate).collect(Collectors.toList())); // [Application{name='Jose Penso', expectedSalary=150000.0, willingToRelocate=true}, Application{name='Ostap Koziak', expectedSalary=155000.0, willingToRelocate=true}]

        System.out.println(Arrays.stream(apps).filter(person -> person.willingToRelocate).map(p -> p.name).collect(Collectors.toList())); // [Jose Penso, Ostap Koziak] --> //I want to map each person's name (who are willing to relocate). I want to filter each person's name. Yani I want to return the names

        System.out.println(Arrays.stream(apps).filter(Application::isWillingToRelocate).map(Application::getName).collect(Collectors.toList())); // [Jose Penso, Ostap Koziak] --> bir ustteki kod ile bu ayni -> line 22 and 24 are doing the same thing

        System.out.println(Arrays.stream(apps).filter(p -> p.expectedSalary <= 180_000).map(Application::getName).collect(Collectors.toList()));  // [Jose Penso, Ostap Koziak, Busra Yagiz]  --> expectedSalary'si 180_000'den az olanlari print ettik


    }
}

class Application {    //

    String name;
    double expectedSalary;
    boolean willingToRelocate;


    public Application(String name, double expectedSalary, boolean willingToRelocate) {
        this.name = name;
        this.expectedSalary = expectedSalary;
        this.willingToRelocate = willingToRelocate;
    }

    public String getName() {
        return name;
    }

    public double getExpectedSalary() {
        return expectedSalary;
    }

    public boolean isWillingToRelocate() {
        return willingToRelocate;
    }

        @Override
        public String toString() {
            return "Application{" +
                    "name='" + name + '\'' +
                    ", expectedSalary=" + expectedSalary +
                    ", willingToRelocate=" + willingToRelocate +
                    '}';

    }
}
