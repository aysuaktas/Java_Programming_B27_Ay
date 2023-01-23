package day29_my_utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class _03EasyData {

    // day32'de yaptik bunu

    /*
    getDaysOfWeek will return an ArrayList of Strings with all the days of the week
     */

    public static ArrayList<String> getDaysOfWeek(){
        return new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
    }

    public static ArrayList<Integer> getRandomNumbers(int limit){
        Random random = new Random(); // Research about this class, look at documentation
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < limit; i++){
            list.add(random.nextInt(1000));  // 0 to 1000 -> koyulabilecek en buyuk rakam Saim'in hatirladigi kadariyla 1000mis. Bu 1000 yazdigimiz yeri bos birakirsak bu metodu cagirinca hem eksili hem artili milyonlu cok buyuk rakamlar cikiyor, int'in sinirlari kadar. Bunu yazinca duzeldi. Sanirim 1000'e kadar rakamlari yazdiriyor boyle olunca
        }
        return list;
    }
    // Saim, getRandomNumbers icin yazdigimiz bu ustteki kodu tamamen anlamamizi beklemiyor su an. Method'u nasil cagiracagimizi ogretmeye calisiyordu burada.


}
