package day28_methods;

public class _05DayInWeek {

    public static void main(String[] args) {

        System.out.println(dayInWeek(4)); // Thur
        System.out.println(dayInWeek(7)); // Sun

        switch (dayInWeek(1)){  // buna 8 gibi index that does not exist olan bir index number yazarsam -> ArrayIndexOutOfBoundsException verir
            case "Mon":
            case "Fri":
                System.out.println("Have full day of java");
                break;
            case "Tue":
            case "Thur":
                System.out.println("Half java, half soft skills");
                break;
            case "Wed":
                System.out.println("Office Hours");
                break;
            case "Sat":
            case "Sun":
                System.out.println("Off");
        }                                               // Have full day of java is printed. --> Bundan sonra break var, kalanini yazdirmadi. Bu arada Saim gunleri de karisik sirayla yazdi bunda

    }   //  end of the main method


    public static String dayInWeek(int day){      // void yazmadik, bir datatype olan String yazdik onun yerine. Cunku sonucunda mesela 4 girip Thur elde etmek istiyoruz, String elde etmek icin void kullanmiyoruz
        String[] days = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};
        return days[day - 1];  // convert the number to index -->  if the user wants day 1, it means index 0. So we will need minus one (-1)
    }



} // end of the class
