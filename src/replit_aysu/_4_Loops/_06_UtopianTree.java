package replit_aysu._4_Loops;

public class _06_UtopianTree {

    /*
    Use a loop to track the growth of the Utopian Tree. The tree grows exactly 1 cm for the first three years, and then afterwards it grows by 2 cm every year. Show the growth of the tree each year up to year 10. See the example flow below.
          Use the format:
         year x - growth x cm
         tree size: x cm

        where the 'x' values are different values of year, the growth amount, and the total tree size up to that year

        Example Flow:

            year 1 - growth 1 cm
             tree size: 1 cm

            year 2 - growth 1 cm
            tree size: 2 cm

            year 3  - growth 1 cm
            tree size: 3 cm

            year 4 - growth 2 cm
            tree size: 5 cm

            year 5 - growth 2 cm
            tree size: 7 cm

            year 6 - growth 2 cm
            tree size: 9 cm

            ... until you reach year 10
     */

    public static void main(String[] args) {

        // Asli's solution:

        int year = 10;  // bu bitis noktasi olacak for loop'un. Cunku soruda siniri soyle vermis: Show the growth of the tree each year up to year 10.
        int growth = 0;

        for(int i = 1; i <= year; i++){
            if(i <= 3){  //The tree grows exactly 1 cm for the first three years
                growth++;  // burada artirma var
                System.out.println("year " + i + " - growth 1 cm" + "\ntree size: " + growth + " cm");
            } else {
                growth += 2; // then afterwards ((after first three years)) it grows by 2 cm every year
                System.out.println("year " + i + " - growth 2 cm" + "\ntree size: " + growth + " cm");
            }
        }












    }
}
