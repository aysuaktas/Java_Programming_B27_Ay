package practices_group_15;

public class _04DailyQuestion {

    public static void main(String[] args) {


    String name = "  chuck norris ";
    name = name.trim().toUpperCase();

    String firstName = name.substring(0, name.indexOf(" "));
    String lastName = name.substring(name.indexOf(" ") + 1);

        System.out.println(firstName.charAt(0) + "." + lastName.charAt(0) + ".");


        /* Gulbeyaz's solution. But not dynamic because did with 6,7 but it would be different for every word;

        String name = "  chuck norris ";
        name = name.trim();
        String initials = name.substring(0, 1).toUpperCase() + "." + name.substring(6, 7).toUpperCase() + ".";
        System.out.println(initials);
         */


    }
}
