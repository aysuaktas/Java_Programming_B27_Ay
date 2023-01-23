package replit_aysu._5_Arrays;

import java.util.Scanner;

public class _05AverageTemperature {

    /*
    Given a double [] temps that has the temperature values from the previous couple day, find and print the average temperature
        Note: The loop used in the given code is to dynamically create the double array. You don't need to fully understand this part yet, focus only on having access to an array and has some numbers.

        Ex:
        Input:
        [80, 88, 88, 84, 82, 78, 60, 68]

        Output:
         78.5
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        // Do not touch above. Use array temps

        // Note from Saim: please update to use a loop to have a different sized arrays

        double sum = 0;

        for(int i = 0; i < temps.length; i++){  // array length'inde () koymuyoruz length kelimesinden sonra, String method oldugunda koyuyoruz ama array'de parantez yok length'te
            sum += temps[i];   // bunda index[0]dan baslayip temps.length ne kadarsa hepsini geziyor, sonra bu degerleri sum'in icine ekleyip topluyor. Yani index[0]'in sonucu + index[1]'in sonucu gibi.
        }
        System.out.println(sum / (temps.length));   // index degerlerinin toplamini array uzunluguna boluyor ki ortalamalarini bulsun, basic mathematics.


        // for each loop ile de yapilabilir


    }
}
